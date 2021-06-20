package com.example.demospringbootteaching.repository;

import com.example.demospringbootteaching.entity.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
public class TeacherRepository extends BaseRepository {

    public TeacherRepository(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public List<Teacher> getAllTeacher() {
        try (Session session = getSession()) {
            return session.createQuery("from Teacher ").list();
        } catch (HibernateException e) {
            log.error(e.getMessage(), e);
        }
        return null;
    }

    public boolean insertTeacher(Teacher teacher) {
        try (Session session = getSession()) {
            session.beginTransaction();
            session.save(teacher);
            session.getTransaction().commit();
            return true;
        } catch (HibernateException e) {
            log.error(e.getMessage(), e);
        }
        return false;
    }

    public boolean removeTeacher(int id) {
        Session session = getSession();
        try {
            session.beginTransaction();
            Teacher teacher = session.load(Teacher.class, id);
            session.delete(teacher);
            session.getTransaction().commit();
            return true;
        } catch (HibernateException e) {
            log.error(e.getMessage(), e);
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }
}

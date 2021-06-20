package com.example.demospringbootteaching.repository;

import com.example.demospringbootteaching.entity.Teacher;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeacherDAO extends BaseRepository{

    public List<Teacher> getAllTeacher() {
        try (Session session = getSessionFactory().openSession()) {
            return session.createQuery("from Teacher ").list();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insertTeacher(Teacher teacher) {
        try (Session session = getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(teacher);
            session.getTransaction().commit();
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean removeTeacher(int id) {
        Session session = getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Teacher teacher = session.load(Teacher.class, id);
            session.delete(teacher);
            session.getTransaction().commit();
            return true;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }
}

package com.example.demospringbootteaching.service;

import com.example.demospringbootteaching.entity.Teacher;
import com.example.demospringbootteaching.repository.TeacherDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    TeacherDAO teacherDAO;

    public List<Teacher> getListTeacher() {
        return teacherDAO.getAllTeacher();
    }
    public boolean insertTeacher(Teacher teacher) {
        if (teacher.getName() == null || teacher.getName().trim().equals("")) {
            return false;
        }
        if (teacher.getAddress() == null || teacher.getAddress() .toString().trim().equals("")) {
            return false;
        }
        if (teacher.getPhone_number() == null || teacher.getPhone_number().trim().equals("")) {
            return false;
        }
        if (teacher.getLevel() == null || teacher.getLevel().trim().equals("")) {
            return false;
        }
        return teacherDAO.insertTeacher(teacher);
    }

    public boolean removeTeacher(int id) {
        return teacherDAO.removeTeacher(id);
    }
}

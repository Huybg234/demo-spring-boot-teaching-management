package com.example.demospringbootteaching.service;

import com.example.demospringbootteaching.entity.Teacher;
import com.example.demospringbootteaching.repository.TeacherRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TeacherService {

    TeacherRepository teacherRepository;

    public List<Teacher> getListTeacher() {
        return teacherRepository.getAllTeacher();
    }

    public boolean insertTeacher(Teacher teacher) {
        if (teacher.getName() == null || teacher.getName().trim().equals("")) {
            return false;
        }
        if (teacher.getAddress() == null || teacher.getAddress().trim().equals("")) {
            return false;
        }
        if (teacher.getPhone_number() == null || teacher.getPhone_number().trim().equals("")) {
            return false;
        }
        if (teacher.getLevel() == null || teacher.getLevel().trim().equals("")) {
            return false;
        }
        return teacherRepository.insertTeacher(teacher);
    }

    public boolean removeTeacher(int id) {
        return teacherRepository.removeTeacher(id);
    }

}

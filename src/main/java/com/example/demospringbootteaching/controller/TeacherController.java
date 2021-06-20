package com.example.demospringbootteaching.controller;

import com.example.demospringbootteaching.entity.Teacher;
import com.example.demospringbootteaching.service.TeacherService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Controller
@AllArgsConstructor
@RequestMapping("/")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TeacherController {

    TeacherService teacherService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView teacher() {
        return new ModelAndView("teacher-form", "command", new Teacher());
    }

    @RequestMapping(value = "/teacher-insert", method = RequestMethod.POST)
    public String addNewTeacher(@ModelAttribute("abc") Teacher teacher, ModelMap modelMap) {
        if (teacherService.insertTeacher(teacher)) {
            return "teacher-list";
        }
        modelMap.addAttribute("insertFail", true);
        return "redirect:/";
    }

    @RequestMapping(value = "/teacher-list", method = RequestMethod.GET)
    public String getListTeacher(ModelMap modelMap) {
        modelMap.put("teachers", teacherService.getListTeacher());
        return "teacher-list";
    }

    @RequestMapping(value = "/teacher-remove", method = RequestMethod.DELETE)
    @Path("/{id}")
    public String removeTeacher(@PathParam("id") int id, ModelMap modelMap) {
        if (teacherService.removeTeacher(id)) {
            return "form-style/input-form/teacher-list";
        }
        modelMap.addAttribute("removeFail", true);
        return "redirect:/";
    }

}

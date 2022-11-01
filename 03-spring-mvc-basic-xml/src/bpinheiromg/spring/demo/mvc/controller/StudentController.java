package bpinheiromg.spring.demo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import bpinheiromg.spring.demo.mvc.model.Student;

@Controller
@RequestMapping("/v4/student")
public class StudentController {
		
	@RequestMapping("/form")
	public String showModel(Model model) {
		Student studentModel = new Student();
		model.addAttribute("student", studentModel);
		return "v4-student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student studentModel) {		
		return "v4-student-confirmation";
	}
}

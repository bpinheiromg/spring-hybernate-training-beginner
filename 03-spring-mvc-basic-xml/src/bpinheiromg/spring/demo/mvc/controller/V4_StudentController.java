package bpinheiromg.spring.demo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import bpinheiromg.spring.demo.mvc.model.V4_Student;

@Controller
@RequestMapping("/v4/student")
public class V4_StudentController {
		
	@RequestMapping("/form")
	public String showModel(Model model) {
		V4_Student studentModel = new V4_Student();
		model.addAttribute("student", studentModel);
		return "v4-student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") V4_Student studentModel) {		
		return "v4-student-confirmation";
	}
}

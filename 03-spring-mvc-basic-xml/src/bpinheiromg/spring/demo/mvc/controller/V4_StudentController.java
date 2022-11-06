package bpinheiromg.spring.demo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import bpinheiromg.spring.demo.mvc.model.V4_StudentModel;

@Controller
@RequestMapping("/v4/student")
public class V4_StudentController {
		
	@RequestMapping("/form")
	public String showModel(Model model) {
		V4_StudentModel studentModel = new V4_StudentModel();
		model.addAttribute("student", studentModel);
		return "v4-student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") V4_StudentModel studentModel) {		
		return "v4-student-confirmation";
	}
}

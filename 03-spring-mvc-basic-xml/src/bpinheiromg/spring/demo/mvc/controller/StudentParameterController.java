package bpinheiromg.spring.demo.mvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import bpinheiromg.spring.demo.mvc.model.Student;

@Controller
@RequestMapping("/v5/student")
public class StudentParameterController {
	
	@Value("#{countryOptions}") 
	private Map<String, String> fileCountryOptions;
		
	@RequestMapping("/form")
	public String showModel(Model model) {
		Student studentModel = new Student();
		model.addAttribute("student", studentModel);
		model.addAttribute("fileCountryOptions", fileCountryOptions);
		return "v5-student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student studentModel) {		
		return "v5-student-confirmation";
	}
}

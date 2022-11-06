package bpinheiromg.spring.demo.mvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import bpinheiromg.spring.demo.mvc.model.StudentFile;

@Controller
@RequestMapping("/v5/student")
public class StudentParameterController {
	
	@Value("#{countryOptions}") 
	private Map<String, String> fileCountryOptions;
	
	@Value("#{programmingLanguages}") 
	private Map<String, String> fileProgrammingLanguages;
	
	@Value("#{operatingSystems}") 
	private Map<String, String> fileOperatingSystems;
		
	@RequestMapping("/form")
	public String showModel(Model model) {
		StudentFile studentFileModel = new StudentFile();
		model.addAttribute("studentF", studentFileModel);
		model.addAttribute("fileCountryOptions", fileCountryOptions);
		model.addAttribute("fileProgrammingLanguages", fileProgrammingLanguages);
		model.addAttribute("fileOperatingSystems", fileOperatingSystems);
		return "v5-student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("studentF") StudentFile studentModel) {		
		return "v5-student-confirmation";
	}
}

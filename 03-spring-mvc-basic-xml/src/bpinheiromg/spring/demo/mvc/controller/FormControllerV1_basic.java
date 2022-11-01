package bpinheiromg.spring.demo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")
public class FormControllerV1_basic {
	
	@RequestMapping("/form")
	public String showForm() {
		return "v1-form";
	}	
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "v1-form-process";
	}
}

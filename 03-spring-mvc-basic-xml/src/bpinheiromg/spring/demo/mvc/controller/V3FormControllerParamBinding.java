package bpinheiromg.spring.demo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/v3")
public class V3FormControllerParamBinding {
	
	@RequestMapping("/form")
	public String showForm() {
		return "v3-form";
	}	 
	
	@RequestMapping("/processForm")
	public String processForm(
			@RequestParam("studentName") String studName, 
			Model model) {
		
		String nameConverted = StringUtils.hasText(studName) ? studName.toUpperCase() : "Not Informed";
		model.addAttribute("name",nameConverted);
		
		return "v3-form-process";
	}
}

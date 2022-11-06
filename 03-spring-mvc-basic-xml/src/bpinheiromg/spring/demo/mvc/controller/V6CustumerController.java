package bpinheiromg.spring.demo.mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import bpinheiromg.spring.demo.mvc.model.V6CustomerValidationModel;

@Controller
@RequestMapping("/v6/customer")
public class V6CustumerController {
	
	@RequestMapping("/form")
	public String showForm(Model model) {
		
		model.addAttribute("customer", new V6CustomerValidationModel());
		
		return "v6-customer-form";		
	}
	
	@RequestMapping("processForm")
	public String procesForm(
			@Valid @ModelAttribute("customer") V6CustomerValidationModel customer, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) 	
			return "v6-customer-form";
		
		return "v6-customer-confirmation";
	}
}

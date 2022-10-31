package bpinheiromg.spring.demo.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v2")
public class FormControllerV2_model {
	
	@RequestMapping("/form")
	public String showForm() {
		return "form-v2";
	}	
	
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, Model model) {
		
		String nameParam = request.getParameter("studentName");
		String nameConverted = StringUtils.hasText(nameParam) ? nameParam.toUpperCase() : "Not Informed";
		model.addAttribute("name",nameConverted);
		
		return "form-process-v2";
	}
}

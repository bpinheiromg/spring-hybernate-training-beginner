package bpinheiromg.spring.demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")
public class FormControllerV1 {
	
	@RequestMapping("/form")
	public String showForm() {
		return "form-v1";
	}	
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "form-process-v1";
	}
}

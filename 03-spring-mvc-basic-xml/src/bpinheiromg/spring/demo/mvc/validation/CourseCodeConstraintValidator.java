package bpinheiromg.spring.demo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	
	private String courseCode;

	@Override
	public void initialize(CourseCode courseCode) {
		this.courseCode = courseCode.value();
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
		return code==null || code.startsWith(courseCode);
	}
}

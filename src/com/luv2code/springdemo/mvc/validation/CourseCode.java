package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	// Define Default Course Code
	public String[] value() default { "LUV" };

	// Define Default error Message
	public String message() default "Must Start wuth LUV";

	// Define Default groups
	public Class<?>[] groups() default {};

	// Define default payloads
	public Class<? extends Payload>[] payload() default {};

}

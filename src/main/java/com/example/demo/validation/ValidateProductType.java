package com.example.demo.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Pattern;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ FIELD, PARAMETER })
@Constraint(validatedBy = ProductTypeValidator.class)
public @interface ValidateProductType {
	String message() default "product Type is invalid";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

	
	Pattern.Flag[] flags() default { };

}

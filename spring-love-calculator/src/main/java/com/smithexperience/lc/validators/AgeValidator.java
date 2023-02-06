package com.smithexperience.lc.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

	private int lower;
	private int upper;

	@Override
	public void initialize(Age age) {

		/**
		 * Can write the pre-construct work here
		 * 
		 * this is where you get the values set by the developer of the custom annotation object [class]
		 * 	-- i.e. public @interface Age { ....}
		 */

		this.upper = age.upper();
		this.lower = age.lower();

	}

	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {

		// TODO: Write validation logic here

		if (age == null) {
			return false;
		}

		if (age < lower || age > upper) {

			return false;
		}

		return true; // pass
	}

}

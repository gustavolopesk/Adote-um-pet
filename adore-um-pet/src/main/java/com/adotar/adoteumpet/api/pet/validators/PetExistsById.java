package com.adotar.adoteumpet.api.pet.validators;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PetExistsByIdValidador.class)
public @interface PetExistsById {
    
    String message() default "Pet com id ${validateValue} não existe";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}

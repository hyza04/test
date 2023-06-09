package lab3.test.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lab3.test.entity.Category;
import lab3.test.entity.User;
import lab3.test.validator.annotation.ValidCategoryId;
import lab3.test.validator.annotation.ValidUserId;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        if (user == null)
            return true;
        return user.getId() != null;
    }
}

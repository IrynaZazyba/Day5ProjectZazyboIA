package by.javatr.task3.validator;

public class Validator {

    public static boolean isStringEmpty(String str) {
        if (str == null) {
            return true;
        } else {
            if (str.length() == 0) {
                return true;
            }
        }
        return false;
    }

}

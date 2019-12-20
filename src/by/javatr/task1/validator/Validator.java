package by.javatr.task1.validator;

import by.javatr.task1.util.Array;

public class Validator {

    public static boolean isArrayNull(Array arr) {
        if (arr == null) {
            return true;
        }else{
            if(arr.getLength()==0)
                return true;
        }

        return false;
    }

}

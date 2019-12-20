package by.javatr.task2.validator;

public class Validator {

    public static boolean isMatrixEmpty(int[][] arr) {
        if (arr==null) {
            return true;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isArrayEmpty(int [] arr) {
        if (arr == null) {
            return true;
        }

        return false;
    }

}

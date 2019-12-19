package by.javatr.task3.service;


public class TextServiceStringMethod {

    public static String replaceNLetter(String s, int n, char symbol) {

        StringBuilder sb = new StringBuilder();
        String[] arr = ArrayConverterService.makeArrayWithSymbols(s);
        for (int i = 0; i < arr.length; i++) {

            if (n<arr[i].length() && Character.isLetter(arr[i].charAt(n))) {
                sb.append(arr[i].substring(0,n-1)+symbol+arr[i].substring(n));
                sb.append(" ");
            } else {
                sb.append(arr[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }


    public static String replaceWrongLetter(String s) {

        return s.replaceAll("ра", "ро").replaceAll("Ра", "Ро");
    }


    public static String replaceWordWithSubstring(String s, int len, String substring) {

        StringBuilder sb = new StringBuilder();
        String[] arr = ArrayConverterService.makeArrayFromString(s);

        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i].charAt(0)) && arr[i].length() == len) {
                sb.append(substring);
            } else {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }


    public static String deleteAllSymbolExceptWhitespaceAndLetters(String s) {

        StringBuilder sb = new StringBuilder();

        char[] arrayChar = s.toCharArray();
        for (int i = 0; i < arrayChar.length; i++) {
            if (Character.isLetter(arrayChar[i]) || Character.isWhitespace(arrayChar[i])) {
                sb.append(arrayChar[i]);
            }
        }
        return sb.toString().replaceAll("\\s+"," ");
    }


    public static String deleteWordStartWithConsonant(String s, int len) {

        StringBuilder sb = new StringBuilder();
        String[] arr = ArrayConverterService.makeArrayFromString(s);

        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i].charAt(0))) {
                if (isVowel(arr[i].charAt(0))) {
                    sb.append(arr[i]);
                } else if (!(arr[i].length() == len)) {
                    sb.append(arr[i]);
                }
            } else {
                sb.append(arr[i]);
        }
    }
        return sb.toString().replaceAll("\\s+"," ");

}

    private static boolean isVowel(char c) {

        switch (Character.toUpperCase(c)) {
            case 'A':
            case 'E':
            case 'Ё':
            case 'И':
            case 'О':
            case 'У':
            case 'Ы':
            case 'Э':
            case 'Ю':
            case 'Я':
                return true;
            default:
                return false;
        }
    }

}

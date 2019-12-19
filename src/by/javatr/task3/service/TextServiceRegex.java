package by.javatr.task3.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextServiceRegex {

    public static String replaceLetter(String s, int number, char symbol) {

        StringBuilder sb = new StringBuilder();

        String[] str = ArrayConverterService.makeArrayFromString(s);
        Pattern pattern = Pattern.compile("\\p{Punct}.*");
        Matcher matcher;

        for (int i = 0; i < str.length; i++) {

            matcher = pattern.matcher(str[i]);
            boolean found = matcher.matches();

            if (found || str[i].length() < number) {
                sb.append(str[i]);
            } else {
                char[] charFromString = str[i].toCharArray();
                charFromString[number-1] = symbol;
                sb.append(new String(charFromString));
            }
        }
        return sb.toString();
    }

    public static String replaceWrongLetter(String s) {

        Pattern patternFirst = Pattern.compile("[Р][а]");
        Matcher m = patternFirst.matcher(s);

        String resultReplaceFirst = m.replaceAll("Ро");

        Pattern patternSecond = Pattern.compile("[р][а]");
        Matcher matcherSecond = patternSecond.matcher(resultReplaceFirst);

        return matcherSecond.replaceAll("ро").trim();

    }


    public static String replaceWordsOfGivingLengthWithSubstring(String s, int length, String substring) {

        StringBuilder sb = new StringBuilder();

        String[] str = ArrayConverterService.makeArrayFromString(s);
        Pattern patternPunct = Pattern.compile("\\p{Punct}.*");
        Matcher matcher;
        for (int i = 0; i < str.length; i++) {
            matcher = patternPunct.matcher(str[i]);

            if (!matcher.matches()) {
                if (str[i].length() == length) {
                    sb.append(substring);
                } else {
                    sb.append(str[i]);
                }
            } else {
                sb.append(str[i]);
            }
        }
        return sb.toString();
    }


    public static String deleteAllSymbolsAcceptLettersAbdWhitespaces(String s) {

        Pattern patternSymbol = Pattern.compile("\\p{Punct}|\\d");
        Matcher matcherSymbol = patternSymbol.matcher(s);
        String reultWithoutSymbols = matcherSymbol.replaceAll("");

        return removeExtraSpaces(reultWithoutSymbols).trim();

    }


    public static String deleteWordGivenLengthWithConsonantLetter(String s, int length) {

        StringBuilder sb = new StringBuilder();

        String[] str = ArrayConverterService.makeArrayFromString(s);
        Pattern pattern = Pattern.compile("^(?ui:[аеёиоуыэюя]).*|\\p{Punct}|\\s|\\p{Punct}.*");
        Matcher matcher;

        for (int i = 0; i < str.length; i++) {
            matcher = pattern.matcher(str[i]);

            if (matcher.matches() || str[i].length() != length) {
                sb.append(str[i]);
            }
        }
        return removeExtraSpaces(sb.toString());

    }

    private static String removeExtraSpaces(String str) {
        Pattern patternSpace = Pattern.compile("\\s{2,}");
        Matcher matcherNWhitespace = patternSpace.matcher(str);

        return matcherNWhitespace.replaceAll(" ");

    }


}

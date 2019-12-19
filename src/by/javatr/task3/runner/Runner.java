package by.javatr.task3.runner;

import by.javatr.task3.exception.NullTextException;
import by.javatr.task3.service.DataFileServiceReceiver;
import by.javatr.task3.service.TextServiceRegex;
import by.javatr.task3.service.TextServiceStringMethod;
import by.javatr.task3.exception.FileServiceReciverException;

public class Runner {
    public static void main(String[] args) {


        System.out.println("Enter some text.");
        try {
            String textFromConsole = DataFileServiceReceiver.getDataFromConsole();

            System.out.println("\n~С помощью методов класса String:\n");
            System.out.println(TextServiceStringMethod.replaceNLetter(textFromConsole, 3, 'W'));
            System.out.println(TextServiceStringMethod.replaceWrongLetter(textFromConsole));
            System.out.println(TextServiceStringMethod.replaceWordWithSubstring(textFromConsole, 4, "String"));
            System.out.println(TextServiceStringMethod.deleteAllSymbolExceptWhitespaceAndLetters(textFromConsole));
            System.out.println(TextServiceStringMethod.deleteWordStartWithConsonant(textFromConsole, 4));
        } catch (NullTextException ex) {
            System.out.println("Console doesn't consist text.");
        }


        try {
            String textFromFile = DataFileServiceReceiver.getDataFromFile();

            System.out.println("\n~С помощью регулярных выражений:\n");
            System.out.println(TextServiceRegex.replaceLetter(textFromFile, 3, 'W'));
            System.out.println(TextServiceRegex.replaceWrongLetter(textFromFile));
            System.out.println(TextServiceRegex.replaceWordsOfGivingLengthWithSubstring(textFromFile, 4, "String"));
            System.out.println(TextServiceRegex.deleteAllSymbolsAcceptLettersAbdWhitespaces(textFromFile));
            System.out.println(TextServiceRegex.deleteWordGivenLengthWithConsonantLetter(textFromFile, 4));

        } catch (FileServiceReciverException ex) {
            System.out.println("File connection problem.");
        } catch (NullTextException ex) {
            System.out.println("File is empty.");
        }


    }

}




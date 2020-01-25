package by.javatr.task1.dao;

import by.javatr.task1.exception.DAOException;
import by.javatr.task1.util.Array;

import java.io.*;

public class FileArrayDAO implements DAO<Array> {

    private final String PATH = "resources/Array.txt";

    @Override
    public Array read() throws DAOException {

        Array readFromFile = new Array();

        try {
            BufferedReader in = new BufferedReader(new FileReader(PATH));
            String text;
            while ((text = in.readLine()) != null) {
                String[] arr = text.trim().split(",");
                for (int i = 0; i < arr.length; i++) {
                    readFromFile.addElement(Integer.parseInt(arr[i]));
                }

            }
        } catch (IOException e) {
            throw new DAOException("FileArrayDAO exception.");
        }
        return readFromFile;
    }


}

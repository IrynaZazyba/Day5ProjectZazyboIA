package by.javatr.task3.dao;

import by.javatr.task3.exception.DAOException;

import java.io.*;

public class FileDAO implements DAO<String> {


    private final String PATH = "Task.txt";


    @Override
    public String read() throws DAOException {

        StringBuilder sb = new StringBuilder();


        try (BufferedReader in = new BufferedReader(new FileReader(PATH))) {

            String s;
            while ((s = in.readLine()) != null) {
                {
                    sb.append(s);
                    sb.append("\n");
                }
            }

            return sb.toString();
        }catch (IOException ex){
            throw  new DAOException("Read is failed",ex);
        }
    }

}



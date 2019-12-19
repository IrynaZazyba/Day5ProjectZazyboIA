package by.javatr.task3.dao;

import by.javatr.task3.exception.DAOException;

public interface DAO<T> {

    T  read() throws DAOException;

}

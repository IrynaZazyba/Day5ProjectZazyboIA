package by.javatr.task1.dao;

import by.javatr.task1.exception.DAOException;

public interface DAO<T> {

    T read() throws DAOException;

}

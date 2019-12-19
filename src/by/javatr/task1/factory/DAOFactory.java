package by.javatr.task1.factory;

import by.javatr.task1.dao.DAO;
import by.javatr.task1.dao.FileArrayDAO;

public final class DAOFactory {

    private static final DAOFactory instance =new DAOFactory();

    private final DAO fileArrayDaoImpl=new FileArrayDAO();

    private DAOFactory(){}

    public static DAOFactory getInstance() {
        return instance;
    }

    public DAO getFileArrayDao(){
        return fileArrayDaoImpl;
    }
}

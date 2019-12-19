package by.javatr.task3.dao.factory;

import by.javatr.task3.dao.DAO;
import by.javatr.task3.dao.FileDAO;

public final class DAOFactory {

    private static final DAOFactory instance=new DAOFactory();

    private final DAO fileDaoImpl=new FileDAO();

    private  DAOFactory(){}

    public static DAOFactory getInstance() {
        return instance;
    }

    public DAO getFileDAO(){
        return fileDaoImpl;
    }
}

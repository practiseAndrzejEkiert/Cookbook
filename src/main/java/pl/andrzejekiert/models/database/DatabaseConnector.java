package pl.andrzejekiert.models.database;

import pl.andrzejekiert.models.utils.Confing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnector {
    private static DatabaseConnector ourInstance = new DatabaseConnector();

    public static DatabaseConnector getInstance() {
        return ourInstance;
    }
    private Connection connection;
    private DatabaseConnector() {
        connect();
    }

    public DatabaseConnector(Connection connection) {
        this.connection = connection;
    }

    private void connect() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(Confing.MYSQL_LINK, Confing.MYSQL_LOGIN,Confing.MYSQL_PASSWORD);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("OK");

    }
    public PreparedStatement createStatement(String SQL){
        try{
            return connection.prepareStatement(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

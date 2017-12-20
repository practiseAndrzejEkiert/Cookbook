package pl.andrzejekiert.models.database.dao.impl;


import pl.andrzejekiert.models.database.DatabaseConnector;
import pl.andrzejekiert.models.database.dao.ConnectorDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ConnectorDaoImplements implements ConnectorDao {

    private DatabaseConnector databaseConnector = DatabaseConnector.getInstance();

    @Override
    public void saveConnection() {
        PreparedStatement statement = databaseConnector.createStatement(
                "INSERT INTO idconnector (id,ingriedientsId,cookbookId) VALUES (0,(SELECT MAX(id) FROM cookbook),(SELECT MAX(id) FROM cookbook));"
        );
        try {
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package pl.andrzejekiert.models.database.dao.impl;

import pl.andrzejekiert.models.CookbookModel;
import pl.andrzejekiert.models.database.DatabaseConnector;
import pl.andrzejekiert.models.database.dao.CookbookDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CookbookDaoImplements implements CookbookDao{

    private DatabaseConnector databaseConnector = DatabaseConnector.getInstance();

    @Override
    public void saveCookbook(CookbookModel model) {
        PreparedStatement statement = databaseConnector.createStatement
                ("INSERT INTO cookbook(Id,time, description, title) VALUES( ?,?,?, ?);");
        try {
            statement.setInt(1,0);
            statement.setInt(2, model.getTime());
            statement.setString(3, model.getDescription());
            statement.setString(4, model.getTitle());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<CookbookModel> loadCookbook(Integer id) {
        List<CookbookModel> cookbookModels = new ArrayList<>();

        PreparedStatement statement = databaseConnector.createStatement(
                "SELECT * FROM cookbook WHERE id = ?"
        );

        try {
            statement.setInt(1,id);
            ResultSet set = statement.executeQuery();
            creatModels(cookbookModels, set);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cookbookModels;
    }

    private void creatModels(List<CookbookModel> cookbookModels, ResultSet set) throws SQLException {
        CookbookModel model;
        while (set.next()){
            model = new CookbookModel(set.getInt("id"),
                    set.getInt("time"),
                    set.getString("description"),
                    set.getString("title"));
cookbookModels.add(model);
            System.out.println(model);
        }
    }
}

package pl.andrzejekiert.models.database.dao.impl;

import pl.andrzejekiert.models.CookbookModel;
import pl.andrzejekiert.models.database.DatabaseConnector;
import pl.andrzejekiert.models.database.dao.CookbookDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CookbookDaoImplements implements CookbookDao {


    private DatabaseConnector databaseConnector = DatabaseConnector.getInstance();

    @Override
    public void saveCookbook(CookbookModel model) {
        PreparedStatement statement = databaseConnector.createStatement
                ("INSERT INTO cookbook(Id,time, description, title) VALUES( ?,?,?, ?);");
        try {
            statement.setInt(1, 0);
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
                "SELECT * FROM cookbook"
        );

        try {
            statement.setInt(1, id);
            ResultSet set = statement.executeQuery();
            creatModels(cookbookModels, set);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cookbookModels;
    }

    @Override
    public void checkProducts(List<String> productList) throws SQLException {
Set<Integer> values = new HashSet<>();
        for (int i = 0; i < productList.size(); i++) {
            String queryString = ("SELECT DISTINCT recipeId FROM ingredients WHERE product NOT LIKE \"" + productList.get(i)) +"\"";
            PreparedStatement stmt = databaseConnector.createStatement(queryString);
            ResultSet rset = stmt.executeQuery(queryString);
         while (rset.next()) { //-------------------->This is what i changed
int value = new Integer(rset.getInt("recipeId"));
                values.add(value);
            }
        }
        System.out.println(values);
    }


    private void creatModels(List<CookbookModel> cookbookModels, ResultSet set) throws SQLException {
        CookbookModel model;
        while (set.next()) {
            model = new CookbookModel(set.getInt("id"),
                    set.getInt("time"),
                    set.getString("description"),
                    set.getString("title"));
            cookbookModels.add(model);
            System.out.println(model);
        }
    }
}

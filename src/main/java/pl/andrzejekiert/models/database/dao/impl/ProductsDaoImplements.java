package pl.andrzejekiert.models.database.dao.impl;

import pl.andrzejekiert.models.CookbookModel;
import pl.andrzejekiert.models.ProductsModel;
import pl.andrzejekiert.models.database.DatabaseConnector;
import pl.andrzejekiert.models.database.dao.ProductsDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductsDaoImplements implements ProductsDao {

    private DatabaseConnector databaseConnector = DatabaseConnector.getInstance();

    @Override
    public void saveProducts(ProductsModel model) {

        PreparedStatement statement = databaseConnector.createStatement
                ("INSERT INTO ingredients(id,recipeId, product) VALUES(?,?,?);   ");
        try {
           statement.setInt(1,0);
           statement.setInt(2,0);
            statement.setString(3, model.getProduct());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        PreparedStatement statement1 = databaseConnector.createStatement(
               " UPDATE `ingredients`SET recipeId =( SELECT id+1 FROM cookbook WHERE id=(SELECT max(id) FROM cookbook)) WHERE recipeId =0"
        );
        try {
            statement1.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> loadProductsModel() {
        List<String> productsList = new ArrayList<>();

        PreparedStatement statement = databaseConnector.createStatement(
                "SELECT  DISTINCT product  FROM ingredients"
        );

        try {
            ResultSet set = statement.executeQuery();
            while(set.next()){
                String product = new String(set.getString("product"));
                productsList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productsList;
    }

    private void creatModels(List<ProductsModel> productsModels, ResultSet set) throws SQLException {
        ProductsModel model;
        while (set.next()) {
            model = new ProductsModel(set.getInt("id"),
                    set.getInt("recipeId"),
                    set.getString("product")
                    );

            productsModels.add(model);
            System.out.println(model);
        }
    }
}

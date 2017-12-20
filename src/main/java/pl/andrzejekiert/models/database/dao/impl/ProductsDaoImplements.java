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
                ("INSERT INTO ingriedients(Id,recipe, product1, product2, product3,product4,product5,product6,product7,product8,product9,product10,product11,product12,product13,product14,product15,product16,product17,product18,product19,product20,product21) VALUES(?, ?,?, ?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?);");
        try {
           statement.setInt(1,0);
            statement.setString(2, model.getRecipe());
            statement.setString(3, model.getProducts2());
            statement.setString(4, model.getProducts3());
            statement.setString(5, model.getProducts4());
            statement.setString(6, model.getProducts5());
            statement.setString(7, model.getProducts6());
            statement.setString(8, model.getProducts7());
            statement.setString(9, model.getProducts8());
            statement.setString(10, model.getProducts9());
            statement.setString(11, model.getProducts10());
            statement.setString(12, model.getProducts11());
            statement.setString(13, model.getProducts12());
            statement.setString(14, model.getProducts13());
            statement.setString(15, model.getProducts14());
            statement.setString(16, model.getProducts15());
            statement.setString(17, model.getProducts16());
            statement.setString(18, model.getProducts17());
            statement.setString(19, model.getProducts18());
            statement.setString(20, model.getProducts19());
            statement.setString(21, model.getProducts20());
            statement.setString(22,model.getProducts1());
            statement.setString(23,model.getProducts21());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ProductsModel> loadProductsModel(Integer id) {
        List<ProductsModel> productsModels = new ArrayList<>();

        PreparedStatement statement = databaseConnector.createStatement(
                "SELECT * FROM ingriedients WHERE id = ?"
        );

        try {
            statement.setInt(1, id);
            ResultSet set = statement.executeQuery();
            creatModels(productsModels, set);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productsModels;
    }

    private void creatModels(List<ProductsModel> productsModels, ResultSet set) throws SQLException {
        ProductsModel model;
        while (set.next()) {
            model = new ProductsModel(set.getInt("id"),
                    set.getString("recipe"),
                    set.getString("product1"),
                    set.getString("product2"),
                    set.getString("product3"),
                    set.getString("product4"),
                    set.getString("product5"),
                    set.getString("product6"),
                    set.getString("product7"),
                    set.getString("product8"),
                    set.getString("product9"),
                    set.getString("product10"),
                    set.getString("product11"),
                    set.getString("product12"),
                    set.getString("product13"),
                    set.getString("product14"),
                    set.getString("product15"),
                    set.getString("product16"),
                    set.getString("product17"),
                    set.getString("product18"),
                    set.getString("product19"),
                    set.getString("product20"),
                    set.getString("product21"));

            productsModels.add(model);
            System.out.println(model);
        }
    }
}

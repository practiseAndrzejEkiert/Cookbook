package pl.andrzejekiert.models.database.dao;

import pl.andrzejekiert.models.CookbookModel;
import pl.andrzejekiert.models.ProductsModel;

import java.util.List;

public interface ProductsDao {
    void saveProducts(ProductsModel model);
    List<ProductsModel> loadProductsModel(Integer id);
}

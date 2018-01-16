package pl.andrzejekiert.models.database.dao;

import pl.andrzejekiert.models.CookbookModel;

import java.sql.SQLException;
import java.util.List;

public interface CookbookDao {
    void saveCookbook(CookbookModel model);
    List<CookbookModel> loadCookbook(Integer id);
    void checkProducts (List<String> list) throws SQLException;
}

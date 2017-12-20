package pl.andrzejekiert.models.database.dao;

import pl.andrzejekiert.models.CookbookModel;

import java.util.List;

public interface CookbookDao {
    void saveCookbook(CookbookModel model);
    List<CookbookModel> loadCookbook(Integer id);
}

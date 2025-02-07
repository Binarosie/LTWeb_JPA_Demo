package nhuquynh.demo.dao;
import nhuquynh.demo.entity.Category;

import java.util.List;

public interface iCategoryDAO {
    void insert(Category category);
    void update(Category category);
    void delete(int id);
    List<Category> findName(String keyword);
    void updateStatus(int id, int status);

    Category findById(int categoryId);
    List<Category> findAll();
    List<Category> findAll(int page, int pageSize);
    int count();
}

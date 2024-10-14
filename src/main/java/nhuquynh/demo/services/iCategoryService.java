package nhuquynh.demo.services;
import nhuquynh.demo.entity.Category;

import java.util.List;

public interface iCategoryService {
    List<Category> findAll();
    Category findById(int id);
    void insert(Category category);
    void update(Category category);
    void delete(int id);
    List<Category> findName(String keyword);
    void updateStatus(int id, int status);
}

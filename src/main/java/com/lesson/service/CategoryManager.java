package com.lesson.service;

import com.lesson.model.Category;

import java.util.List;

public interface CategoryManager {
    List<Category> getAllCategories();

    Category getCategoryById(int cid);

    int addCategory(String cname);

    int updateCategoryById(int cid, String cname);

    int deleteCategoryById(int cid);
}


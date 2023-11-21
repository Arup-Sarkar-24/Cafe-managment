package com.mycompany.cafe.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.cafe.main.POJO.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {
	
	List<Category>getAllCategory();

}

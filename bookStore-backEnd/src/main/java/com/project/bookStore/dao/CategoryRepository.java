package com.project.bookStore.dao;

import com.project.bookStore.entity.Category;
import com.project.bookStore.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}

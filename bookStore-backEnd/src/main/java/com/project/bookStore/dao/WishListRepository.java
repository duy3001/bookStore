package com.project.bookStore.dao;

import com.project.bookStore.entity.OrderDetail;
import com.project.bookStore.entity.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListRepository extends JpaRepository<WishList, Integer> {

}

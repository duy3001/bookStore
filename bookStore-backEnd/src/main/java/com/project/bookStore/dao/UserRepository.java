package com.project.bookStore.dao;

import com.project.bookStore.entity.OrderDetail;
import com.project.bookStore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

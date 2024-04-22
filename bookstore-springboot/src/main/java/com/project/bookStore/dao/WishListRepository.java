package com.project.bookStore.dao;

import com.project.bookStore.entity.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "wish-list")
public interface WishListRepository extends JpaRepository<WishList, Integer> {

}

package com.project.bookStore.dao;

import com.project.bookStore.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "rating")
public interface RatingRepository extends JpaRepository<Rating, Long> {

}

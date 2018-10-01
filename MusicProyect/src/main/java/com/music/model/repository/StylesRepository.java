package com.music.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.music.model.dao.StylesDao;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface StylesRepository extends CrudRepository<StylesDao, Long> {

}

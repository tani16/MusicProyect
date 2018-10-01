package com.music.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.music.model.dao.ArtistDao;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ArtistRepository extends CrudRepository<ArtistDao, Long> {

}

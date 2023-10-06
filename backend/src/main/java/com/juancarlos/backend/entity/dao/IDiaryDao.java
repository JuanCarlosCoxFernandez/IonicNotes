package com.juancarlos.backend.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.juancarlos.backend.entity.models.Diary;

public interface IDiaryDao extends CrudRepository<Diary, Long>{

}

package com.juancarlos.backend.entity.services;

import java.util.List;

import com.juancarlos.backend.entity.models.Diary;

public interface IDiaryService {
	public Diary get(long id);
	public List<Diary> getAll();
	public void post(Diary task);
	public void put(Diary task, long id);
	public void delete(long id);
}

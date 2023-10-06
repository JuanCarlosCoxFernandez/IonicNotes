package com.juancarlos.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancarlos.backend.entity.models.Diary;
import com.juancarlos.backend.entity.services.IDiaryService;

@RestController
@CrossOrigin(origins = "*")
public class DiaryController {
	
	@Autowired
	IDiaryService diaryService;
	
	@GetMapping("/task")
	public List<Diary> getAllDiary(){
		return diaryService.getAll();
	}
	
	@GetMapping("/task/{id}")
	public Diary getOne(@PathVariable(value = "id") long id) {
		return diaryService.get(id);
	}
	
	@PostMapping("/task")
	public void post(Diary task) {
		diaryService.post(task);
	}
	
	@PutMapping("/task/{id}")
	public void put(Diary task, @PathVariable(value = "id") long id) {
		diaryService.put(task, id);
	}
	
	@DeleteMapping("/task/{id}")
	public void delete(@PathVariable(value = "id") long id) {
		diaryService.delete(id);
	}
}

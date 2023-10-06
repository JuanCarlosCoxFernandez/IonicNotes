package com.juancarlos.backend.entity.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="task")
public class Diary implements Serializable{
	private static final long serialVersionUID= 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String task_title;
	
	private String task_content;

	public long getid() {
		return id;
	}

	public void setid(long id) {
		this.id = id;
	}

	public String gettask_title() {
		return task_title;
	}

	public void settask_title(String task_title) {
		this.task_title = task_title;
	}

	public String gettask_content() {
		return task_content;
	}

	public void settask_content(String task_content) {
		this.task_content = task_content;
	}

	public Diary(String task_title, String task_content) {
		super();
		this.task_title = task_title;
		this.task_content = task_content;
	}
	
	
	public Diary() {
		
	}
	
}

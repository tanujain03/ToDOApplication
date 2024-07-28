package com.example.TodoApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TodoApp.model.ToDo;

@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long>{

}
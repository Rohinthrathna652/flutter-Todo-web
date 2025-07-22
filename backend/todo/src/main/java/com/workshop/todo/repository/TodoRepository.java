package com.workshop.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.workshop.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {}

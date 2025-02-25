package org.example.expert.domain.todo.repository;

import org.example.expert.domain.todo.entity.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.EntityGraph;
import java.util.Optional;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    @EntityGraph(attributePaths = "user")
    Page<Todo> findAllByOrderByModifiedAtDesc(Pageable pageable);

    boolean existsById(Long todoId);
}

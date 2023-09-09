package com.example.devmodule14.reposetories;

import com.example.devmodule14.entites.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INoteRepository extends CrudRepository<Note, Long> {
}

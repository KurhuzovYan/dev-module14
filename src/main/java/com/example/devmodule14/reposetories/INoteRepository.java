package com.example.devmodule14.reposetories;

import com.example.devmodule14.entites.Note;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INoteRepository extends CrudRepository<Note, Long> {

    @Query(nativeQuery = true, value = "SELECT note_id, title, content FROM note ORDER BY note_id")
    List<Note> getAllNotes();
}

package com.example.devmodule14.servises;

import com.example.devmodule14.entites.Note;
import com.example.devmodule14.reposetories.INoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final INoteRepository noteRepository;

    public Note createNote(Note note) {
       return noteRepository.save(note);
    }

    public Optional<Note> readById(Long id) {
        return noteRepository.findById(id);
    }

    public void deleteById(Long id) {
        noteRepository.deleteById(id);
    }

    public void updateById(Note note) {
        Note currentNote = noteRepository.findById(note.getId()).get();
        currentNote.setTitle(note.getTitle());
        currentNote.setContent(note.getContent());
        noteRepository.save(currentNote);
    }


    public List<Note> getAllNotes() {
        List<Note> notes = new ArrayList<>();
        noteRepository.findAll().forEach(note -> notes.add(note));
        return notes;
    }
}

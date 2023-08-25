package com.app.backend.service;

import com.app.backend.entity.Note;
import com.app.backend.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NoteServiceImpl implements NoteService {
    @Autowired
    private NoteRepository noteRepository;

    @Override
    public List<Note> getNoteList() {
        return noteRepository.findAll();
    }

    @Override
    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public Note getNoteById(long id) {
        return noteRepository.findById(id).get();
    }

    @Override
    public Note updateNote(long id, Note note) {
        Note currentNote = getNoteById(id);

        currentNote.setTitle(note.getTitle());
        currentNote.setContent(note.getContent());

        return noteRepository.save(currentNote);
    }

    @Override
    public void deleteNoteById(long id) {
        noteRepository.deleteById(id);
    }
}

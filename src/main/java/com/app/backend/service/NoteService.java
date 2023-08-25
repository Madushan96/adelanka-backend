package com.app.backend.service;

import com.app.backend.entity.Note;

import java.util.List;

public interface NoteService {
    public List<Note> getNoteList();

    public Note createNote(Note note);

    public Note getNoteById(long id);

    public Note updateNote(long id, Note note);

    public void deleteNoteById(long id);
}

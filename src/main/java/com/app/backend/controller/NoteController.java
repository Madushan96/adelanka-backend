package com.app.backend.controller;

import com.app.backend.entity.Note;
import com.app.backend.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NoteController {
    @Autowired
    private NoteService noteService;
    @GetMapping("/notes")
    public List<Note> getNoteList() {
        return this.noteService.getNoteList();
    }

    @PostMapping("/notes")
    public Note createNote(@RequestBody Note note) {
        return this.noteService.createNote(note);
    }

    @GetMapping("/notes/{id}")
    public Note getNoteById(@PathVariable long id) {
        return this.noteService.getNoteById(id);
    }

    @PutMapping("/notes/{id}")
    public Note updateNote(@PathVariable long id, @RequestBody Note note) {
        return this.noteService.updateNote(id, note);
    }

    @DeleteMapping("/notes/{id}")
    public void deleteNoteById(@PathVariable long id) {
        this.noteService.deleteNoteById(id);
    }
}

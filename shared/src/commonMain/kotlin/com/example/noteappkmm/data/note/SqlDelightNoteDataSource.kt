package com.example.noteappkmm.data.note

import com.example.noteappkmm.domain.note.NoteDataSource
import com.example.noteappkmm.database.NoteDatabase
import com.example.noteappkmm.domain.note.Note
import com.example.noteappkmm.domain.time.DateTimeUtil


class SqlDelightNoteDataSource(db: NoteDatabase): NoteDataSource {

//    private val queries = db.noteQueries

    override suspend fun insertNote(note: Note) {
        TODO("Not yet implemented")
    }

    override suspend fun getNoteById(id: Long): Note? {
        TODO("Not yet implemented")
    }

    override suspend fun getAllNotes(): List<Note> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNoteById(id: Long) {
        TODO("Not yet implemented")
    }
}
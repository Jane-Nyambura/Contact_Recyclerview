package com.example.contact_recyclerview.Repository

import androidx.lifecycle.LiveData
import com.example.contact_recyclerview.Database.ContactsDatabase
import com.example.contact_recyclerview.Models.Contact
import com.example.contact_recyclerview.Models.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class NoteRepository {
    var database=ContactsDatabase.getDatabase(ContactsDatabase.context)

    suspend fun saveNote(note: Note) {
        withContext(Dispatchers.IO) {
            database.NotesDao().insertNotes(note)
        }

    }
    fun getAllNotes(): LiveData<List<Contact>> {
        return database.NotesDao().getAllNotes()
    }
    suspend fun getNoteById(nodeId: Int): LiveData<Contact> {
        return database.NotesDao().getNoteById(nodeId)
    }
}
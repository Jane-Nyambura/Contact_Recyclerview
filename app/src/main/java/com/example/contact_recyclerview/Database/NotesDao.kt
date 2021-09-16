package com.example.contact_recyclerview.Database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.contact_recyclerview.Models.Contact
import com.example.contact_recyclerview.Models.Note

@Dao
interface NotesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNotes(contact: Note)

    @Query("SELECT * FROM Notes")
    fun getAllNotes(): LiveData<List<Contact>>

    @Query("SELECT * FROM Notes WHERE noteId=NoteId")
    fun getNoteById(contactId: Int): LiveData<Contact>

    @Delete
    fun deleteNote(Note: Note)
}
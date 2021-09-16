package com.example.contact_recyclerview.ViewModel

import com.example.contact_recyclerview.Models.Note
import com.example.contact_recyclerview.Repository.NoteRepository

class NotesViewModel {
    var notesRepository= NoteRepository()

    fun saveNote(note: Note){
        viewModelScope.launch {
            notesRepository.saveNote(note)
        }
    }

}
package com.example.contact_recyclerview.Models

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Notes")
data class Note (
    @PrimaryKey(autoGenerate = true)@NonNull var Noteid:Int,
    var date:String,
    var titile:String,
    var body:String
        )


package com.example.contact_recyclerview.Models

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contact")
data class Contact(
    @PrimaryKey(autoGenerate=true)@NonNull var contactid: Int,
    var contactName: String,
    var contactNumber: String,
    var contactEmail: String,
    var imageUrl:String,
    )



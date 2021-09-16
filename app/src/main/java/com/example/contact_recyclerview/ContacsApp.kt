package com.example.contact_recyclerview

import android.app.Application
import android.content.Context

class ContacsApp: Application() {
    companion object{
        lateinit var context: Context
    }
    override fun onCreate(){
        super.onCreate()


    }
}
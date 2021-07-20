package com.example.contact_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContact:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContact()
    }
    fun displayContact(){
        var contactList= listOf(
            Contact("Kelvin","07954222344","kelvin@gmail.com","https://images.pexels.com/photos/54323/rose-composites-flowers-spring-54323.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contact("Jane","07879897922344","jane@gmail.com","https://images.pexels.com/photos/736230/pexels-photo-736230.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contact("Sam","07988222344","sam@gmail.com","https://images.pexels.com/photos/1086178/pexels-photo-1086178.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contact("Joy","0754222344","joy@gmail.com","https://images.pexels.com/photos/462402/pexels-photo-462402.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contact("June","0754222344","june@gmail.com","https://images.pexels.com/photos/3599576/pexels-photo-3599576.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contact("Sandra","0754222344","sandra@gmail.com","https://images.pexels.com/photos/2480075/pexels-photo-2480075.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contact("Rose","0944554222344","rose@gmail.com","https://images.pexels.com/photos/1865736/pexels-photo-1865736.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contact("Barbra","078955422","babra@gmail.com","https://images.pexels.com/photos/2534523/pexels-photo-2534523.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contact("Mary","074222344","mary@gmail.com","https://images.pexels.com/photos/3041109/pexels-photo-3041109.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contact("Terry","0744522344","terry@gmail.com","https://images.pexels.com/photos/1758279/pexels-photo-1758279.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contact("Simon","074222344","simon@gmail.com","https://images.pexels.com/photos/3621907/pexels-photo-3621907.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
        )
        rvContact=findViewById(R.id.rvContact)
        var contactAdapter=ContactAdapter(contactList,baseContext)
        rvContact.layoutManager=LinearLayoutManager(baseContext)
        rvContact.adapter=contactAdapter

    }
}



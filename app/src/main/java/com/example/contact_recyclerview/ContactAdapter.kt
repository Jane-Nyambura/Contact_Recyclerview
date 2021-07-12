package com.example.contact_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(var contactList: List<Contact>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
     var itemView=LayoutInflater.from(parent.context)
         .inflate(R.layout.contact_item_list,parent,false)
        return  ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        holder.tvcontactName.text=currentContact.contactName
        holder.tvNumber.text=currentContact.contactNumber
        holder.tvEmail.text=currentContact.contactEmail
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvcontactName=itemView.findViewById<TextView>(R.id.tvcontactName)
    var tvNumber=itemView.findViewById<TextView>(R.id.tvNumber)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
}


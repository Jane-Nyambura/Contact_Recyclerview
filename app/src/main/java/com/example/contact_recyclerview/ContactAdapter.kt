package com.example.contact_recyclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactAdapter(var contactList: List<Contact>, var context:Context):RecyclerView.Adapter<ContactViewHolder>() {
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

        holder.cvContact.setOnClickListener{
            var intent=Intent(context,ContactDetailsActivities::class.java)
            intent.putExtra("name",currentContact.contactName)
            intent.putExtra("Phone",currentContact.contactName)
            intent.putExtra("email",currentContact.contactName)
            intent.putExtra("image",currentContact.contactName)
            context.startActivity(intent)
        }

        Picasso.get()
            .load(currentContact.imageUrl)
            .resize(100,100)
            .centerCrop()
            .into(holder.ivContact)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvcontactName=itemView.findViewById<TextView>(R.id.tvcontactName)
    var tvNumber=itemView.findViewById<TextView>(R.id.tvNumber)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    var ivContact=itemView.findViewById<ImageView>(R.id.ivContact)
    var cvContact=itemView.findViewById<CardView>(R.id.cvContact)
}


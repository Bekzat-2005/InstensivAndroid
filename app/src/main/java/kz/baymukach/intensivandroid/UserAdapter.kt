package kz.baymukach.intensivandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private val userList: List<User>, private val onItemClick: (User) -> Unit) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    class UserViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvName: TextView = itemView.findViewById(R.id.tvName);
        val tvAge: TextView = itemView.findViewById(R.id.tvAge)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view);
    }
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
       val user = userList[position]
        holder.tvName.text = user.name;
        holder.tvAge.text = "${user.age}"


        holder.itemView.setOnClickListener{
            onItemClick(user)
        }
    }

    override fun getItemCount(): Int = userList.size;
}
package androidedu.io.retrofitexample.ui.adapter

import android.view.ViewGroup
import androidedu.io.retrofitexample.dto.TagDTO
import androidx.recyclerview.widget.RecyclerView


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 27.10.2018 - 17:54          │
//└─────────────────────────────┘

class TagListAdapter(itemList: List<TagDTO>) : RecyclerView.Adapter<TagListViewHolder>() {

    var itemList = itemList
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TagListViewHolder {

        return TagListViewHolder(parent)
    }

    override fun getItemCount(): Int {

        return itemList.size
    }

    override fun onBindViewHolder(holder: TagListViewHolder, position: Int) {

        holder.bindTo(itemList[position])
    }

    fun setNewList(itemList: List<TagDTO>) {

        this.itemList = itemList
        notifyDataSetChanged()
    }
}
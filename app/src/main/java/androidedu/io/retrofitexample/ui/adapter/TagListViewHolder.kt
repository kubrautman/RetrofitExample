package androidedu.io.retrofitexample.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidedu.io.retrofitexample.R
import androidedu.io.retrofitexample.dto.TagDTO
import androidx.recyclerview.widget.RecyclerView


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 27.10.2018 - 17:33          │
//└─────────────────────────────┘

class TagListViewHolder(viewGroup: ViewGroup) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(viewGroup.context).inflate(
            R.layout.adapter_item_tag_list,
            viewGroup,
            false
        )
    ) {

    private val txtName by lazy { itemView.findViewById<TextView>(R.id.txtName) }
    private val txtIsPrimary by lazy { itemView.findViewById<TextView>(R.id.txtIsPrimary) }

    fun bindTo(tagDTO: TagDTO) {

        txtName.text = tagDTO.name
        txtIsPrimary.text = tagDTO.isPrimary.toString()
    }
}
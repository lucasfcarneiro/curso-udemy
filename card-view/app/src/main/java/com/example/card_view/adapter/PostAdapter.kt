package com.example.card_view.adapter

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.card_view.databinding.PostItemBinding

class PostAdapter(private val postList: List<Post>) :
    RecyclerView.Adapter<PostAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = PostItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(postList[position])
    }

    override fun getItemCount(): Int = postList.size

    class ViewHolder(private val binding: PostItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(post: Post) {
            binding.nameTextView.text = post.nome
            binding.postImageView.setImageResource()
        }
    }
}

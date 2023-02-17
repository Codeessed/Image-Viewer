package com.example.imageviewer.auth.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.imageviewer.auth.data.models.OnBoarding
import com.example.imageviewer.databinding.OnBoardingItemBinding


class OnBoardingPageAdapter: RecyclerView.Adapter<OnBoardingPageAdapter.OnBoardingViewHolder>() {

    inner class OnBoardingViewHolder(private var binding: OnBoardingItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int){
            val onboarding = differList.currentList[position]
            binding.apply {
                onBoardingImg.setImageResource(onboarding.image)
                onBoardingTitle.text = onboarding.topic
                onBoardingDesc.text = onboarding.desc
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingViewHolder {
        return OnBoardingViewHolder(OnBoardingItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return differList.currentList.size
    }

    override fun onBindViewHolder(holder: OnBoardingViewHolder, position: Int) {
        holder.bind(position)
    }

    private val differ = object : DiffUtil.ItemCallback<OnBoarding>(){

        override fun areItemsTheSame(oldItem: OnBoarding, newItem: OnBoarding): Boolean {
            return oldItem.topic == newItem.topic
        }

        override fun areContentsTheSame(oldItem: OnBoarding, newItem: OnBoarding): Boolean {
            return oldItem == newItem
        }
    }

    val differList = AsyncListDiffer(this, differ)

}
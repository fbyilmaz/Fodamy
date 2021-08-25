package com.mobillium.fodamy.intro.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mobillium.fodamy.databinding.ItemIntroLayoutBinding
import com.mobillium.fodamy.intro.model.IntroModel


class IntroPagerAdapter(private val introModelsList: Array<IntroModel> = IntroModel.values()):
    RecyclerView.Adapter<IntroPagerAdapter.IntroViewHolder>() {


    // TODO item_intro_layout.xml dosyası tasarımsal olarak düzenlenecek.
    inner class IntroViewHolder(private val binding: ItemIntroLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(introModel: IntroModel) {
            val res = binding.root.context.resources
            with(binding) {
                textViewIntroTitle.text = res.getString(introModel.title)
                textViewIntroDesc.text = res.getString(introModel.desc)
                imageViewIntro.setImageResource(introModel.image)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): IntroViewHolder {
        val binding = ItemIntroLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return IntroViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: IntroViewHolder,
        position: Int
    ) {
        holder.bind(introModelsList[position])
    }

    override fun getItemCount(): Int {
        return introModelsList.size
    }
}
package live.codemy.milliyetapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.adapter_item_big_news.view.*
import live.codemy.milliyetapp.R
import live.codemy.milliyetapp.model.BigNewsModel


/**     Code with ❤
╔════════════════════════════╗
║  Created by Gökhan ÖZTÜRK  ║
╠════════════════════════════╣
║ GokhanOzturk@AndroidEdu.IO ║
╠════════════════════════════╣
║     01/03/2020 - 14:15     ║
╚════════════════════════════╝
 */

class BigNewsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.adapter_item_big_news,
        parent,
        false
    )
) {
    fun bind(
        bigNewsModel: BigNewsModel,
        onItemClickListener: (BigNewsModel) -> Unit
    ) {
        Glide.with(itemView.context)
            .load(bigNewsModel.newsImageUrl)
            .centerCrop()
            .into(itemView.imgNews)

        itemView.txtNewsTitle.text = bigNewsModel.newsTitle

        itemView.setOnClickListener {
            onItemClickListener(bigNewsModel)
        }
    }
}
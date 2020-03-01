package live.codemy.milliyetapp.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import live.codemy.milliyetapp.model.BigNewsModel


/**     Code with ❤
╔════════════════════════════╗
║  Created by Gökhan ÖZTÜRK  ║
╠════════════════════════════╣
║ GokhanOzturk@AndroidEdu.IO ║
╠════════════════════════════╣
║     01/03/2020 - 14:14     ║
╚════════════════════════════╝
 */

class NewsListAdapter(
    private val newsList: List<BigNewsModel>,
    private val onItemClickListener: (BigNewsModel) -> Unit
) : RecyclerView.Adapter<BigNewsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BigNewsViewHolder =
        BigNewsViewHolder(parent)

    override fun getItemCount(): Int = newsList.size

    override fun onBindViewHolder(holder: BigNewsViewHolder, position: Int) {
        holder.bind(newsList[position], onItemClickListener)
    }
}
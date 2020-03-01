package live.codemy.milliyetapp.mock

import live.codemy.milliyetapp.model.FragmentModel
import live.codemy.milliyetapp.ui.NewsFragment


/**     Code with ❤
╔════════════════════════════╗
║  Created by Gökhan ÖZTÜRK  ║
╠════════════════════════════╣
║ GokhanOzturk@AndroidEdu.IO ║
╠════════════════════════════╣
║     01/03/2020 - 11:56     ║
╚════════════════════════════╝
 */

object MockData {
    fun getNewsCategoryFragment(fragmentSize: Int): List<FragmentModel> {
        val fragmentList = ArrayList<FragmentModel>()

        repeat(fragmentSize) { position ->
            val newsFragment = NewsFragment()

            val fragmentModel = FragmentModel(
                position,
                getFragmentTitle(position),
                newsFragment
            )

            fragmentList.add(fragmentModel)
        }

        return fragmentList
    }

    private fun getFragmentTitle(position: Int): String {
        return when (position) {
            0 -> "ANASAYFA"
            1 -> "YAZARLAR"
            2 -> "GÜNDEM"
            3 -> "EKONOMİ"
            4 -> "SPOR"
            5 -> "CADDE"
            6 -> "EĞİTİM"
            else -> ""
        }
    }
}
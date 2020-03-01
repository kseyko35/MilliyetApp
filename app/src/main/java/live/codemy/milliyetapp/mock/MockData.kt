package live.codemy.milliyetapp.mock

import live.codemy.milliyetapp.model.BigNewsModel
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
    fun getNewsCategoryFragment(): List<FragmentModel> {
        val fragmentList = ArrayList<FragmentModel>()

        repeat(getTitleList().size) { position ->
            val newsFragment = NewsFragment()

            val fragmentModel = FragmentModel(
                position,
                getTitleList()[position],
                newsFragment
            )

            fragmentList.add(fragmentModel)
        }

        return fragmentList
    }

    private fun getTitleList(): List<String> {
        val titleList = ArrayList<String>()
        titleList.add("ANASAYFA")
        titleList.add("YAZARLAR")
        titleList.add("GÜNDEM")
        titleList.add("EKONOMİ")
        titleList.add("SPOR")
        titleList.add("CADDE")
        titleList.add("EĞİTİM")
        titleList.add("TEKNOLOJİ")
        return titleList
    }

    fun getNewsList(newsListSize: Int): List<BigNewsModel> {
        val bigNewsList = ArrayList<BigNewsModel>()
        repeat(newsListSize) {
            val bigNewsModel = BigNewsModel(
                "https://imgfinans.milliyet.com.tr/i/haber/f_dfdf_321421462285.jpg",
                "Ertelendi! Kolay alınmış bir karar değil"
            )
            bigNewsList.add(bigNewsModel)
        }

        return bigNewsList
    }
}
package live.codemy.milliyetapp.mock

import live.codemy.milliyetapp.enums.NewsType
import live.codemy.milliyetapp.model.FragmentModel
import live.codemy.milliyetapp.model.NewsModel
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

    fun getNewsList(newsListSize: Int): List<NewsModel> {
        val newsList = ArrayList<NewsModel>()
        repeat(newsListSize) {
            val bigNewsModel = NewsModel(
                "https://imgfinans.milliyet.com.tr/i/haber/f_dfdf_321421462285.jpg",
                "Ertelendi! Kolay alınmış bir karar değil",
                NewsType.BIG_NEWS.id
            )
            val smallNewsModel1 = NewsModel(
                "https://imgfinans.milliyet.com.tr/i/haber/f_dfdf_321421462285.jpg",
                "Ertelendi! Kolay alınmış bir karar değil",
                NewsType.SMALL_NEWS.id
            )

            val smallNewsModel2 = NewsModel(
                "https://imgfinans.milliyet.com.tr/i/haber/f_dfdf_321421462285.jpg",
                "Ertelendi! Kolay alınmış bir karar değil",
                NewsType.SMALL_NEWS.id
            )

            val smallNewsModel3 = NewsModel(
                "https://imgfinans.milliyet.com.tr/i/haber/f_dfdf_321421462285.jpg",
                "Ertelendi! Kolay alınmış bir karar değil",
                NewsType.SMALL_NEWS.id
            )

            val smallNewsModel4 = NewsModel(
                "https://imgfinans.milliyet.com.tr/i/haber/f_dfdf_321421462285.jpg",
                "Ertelendi! Kolay alınmış bir karar değil",
                NewsType.SMALL_NEWS.id
            )

            newsList.add(smallNewsModel1)
            newsList.add(smallNewsModel2)
            newsList.add(smallNewsModel3)
            newsList.add(smallNewsModel4)
            newsList.add(bigNewsModel)

        }

        return newsList
    }
}
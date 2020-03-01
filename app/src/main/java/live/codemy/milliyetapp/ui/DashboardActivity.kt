package live.codemy.milliyetapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dashboard.*
import live.codemy.milliyetapp.R
import live.codemy.milliyetapp.adapter.CategoryNewsAdapter
import live.codemy.milliyetapp.mock.MockData

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        init()
    }

    private fun init() {
        vpNewsCategory.adapter =
            CategoryNewsAdapter(
                supportFragmentManager,
                MockData.getNewsCategoryFragment(7)
            )

        tabLayNewsCategory.setupWithViewPager(vpNewsCategory)
    }
}

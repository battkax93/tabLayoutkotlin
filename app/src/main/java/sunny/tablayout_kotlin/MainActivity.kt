package sunny.tablayout_kotlin

import android.annotation.SuppressLint
import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_tab.*
import sunny.tablayout_kotlin.R.string.toast
import java.util.*

class MainActivity : GlobalActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        trySetupTabIcon()
    }

    private fun init() {
        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        viewpager_main.offscreenPageLimit = 3
        viewpager_main.adapter = fragmentAdapter
        tabs_main.setupWithViewPager(viewpager_main)
        viewpager_main?.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                viewpager_main.setCurrentItem(position, false)
            }

            override fun onPageScrollStateChanged(state: Int) {
            }


        })

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_home, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.act_toast -> {
                toast("testing")
            }
            R.id.act_exit -> {
                moveTaskToBack(true)
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun trySetupTabIcon() {
        try {
            setupTabIcon()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    @SuppressLint("InflateParams")
    private fun prepareTabView(pos: Int): View {
        val res: Resources = resources
        val tabTitle = res.getStringArray(R.array.tabTitle)
        val view = LayoutInflater.from(this).inflate(R.layout.custom_tab, null)
        tv_title.text = (tabTitle[pos]).toString()

        return view
    }

    private fun setupTabIcon() {
        val res: Resources = resources
        val tabTitle = res.getStringArray(R.array.tabTitle)
        for (i in 0 until tabTitle.size) {
            tabs_main.getTabAt(i)!!.setCustomView(prepareTabView(i))
        }
    }
}


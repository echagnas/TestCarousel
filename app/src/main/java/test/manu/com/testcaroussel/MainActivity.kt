package test.manu.com.testcaroussel

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViewPager()
    }

    fun initViewPager(){
        var list = ArrayList<Int>()
        list.add(Color.rgb(255, 0,0))
        list.add(Color.rgb(255, 255,0))
        list.add(Color.rgb(255, 0,255))
        list.add(Color.rgb(255, 255,255))
        list.add(Color.rgb(255, 125,125))

        var adapter = FragmentColorPagerAdapter(supportFragmentManager)
        adapter.setColorList(list)

        viewPager.adapter = adapter

    }
}

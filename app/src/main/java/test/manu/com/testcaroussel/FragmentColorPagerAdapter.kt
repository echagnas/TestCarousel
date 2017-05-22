package test.manu.com.testcaroussel

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

/**
 * Created by emmanuelchagnas on 17/05/2017.
 */

class FragmentColorPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    var colors = ArrayList<Int>()

    override fun getItem(position: Int): Fragment? {
        val colorFragment = ColorFragment()

        val bundle = Bundle()
        bundle.putInt(ColorFragment.ARG_COLOR, colors.get(position))
        colorFragment.arguments = bundle

        return colorFragment
    }

    override fun getCount(): Int {
        return colors.size
    }

    fun setColorList(colors: ArrayList<Int>){
        this.colors = colors
    }
}

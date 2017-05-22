package test.manu.com.testcaroussel

import android.support.v4.view.ViewPager
import android.view.View


/**
 * Created by emmanuelchagnas on 22/05/2017.
 */
class ScalePageTransformer : ViewPager.PageTransformer {

    private val ratio = 0.125f

    override fun transformPage(view: View?, position: Float) {
        var scaleFactor = 1f - ratio * 2 * Math.abs(position - ratio * 2);
        view?.scaleX = scaleFactor
        view?.scaleY = scaleFactor
    }
}
package test.manu.com.testcaroussel

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup



/**
 * Created by emmanuelchagnas on 17/05/2017.
 */
class ColorFragment : Fragment() {

    companion object {
        var ARG_COLOR = "color"
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater?.inflate(R.layout.color_fragment_layout, container, false) as ScaleFrameLayout
        view.setScaleBoth(0.2F)

        val color = arguments.getInt(ARG_COLOR)
        view?.setBackgroundColor(color)

        computePadding(view)

        return view
    }

    private fun computePadding(viewGroup: ViewGroup) {
        Runnable {
            var carousel = activity.findViewById(R.id.viewPager) as CarouselViewPager
            var width = viewGroup.width
            var paddingWidth = width * ((1 - carousel.pageWith)/2).toInt()
            viewGroup.setPadding(paddingWidth, 0, paddingWidth, 0)
            carousel.pageMargin = -(paddingWidth - carousel.paddingBetweenItem ) * 2
        }.run()

    }
}
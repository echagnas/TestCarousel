package test.manu.com.testcaroussel

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet

/**
 * Created by emmanuelchagnas on 19/05/2017.
 */
class CarouselViewPager : ViewPager{

    var pageWith = 0.6F
    var paddingBetweenItem = 8

    constructor (context: Context) : super(context)

    constructor (context: Context, attrs: AttributeSet) : super(context, attrs)

}
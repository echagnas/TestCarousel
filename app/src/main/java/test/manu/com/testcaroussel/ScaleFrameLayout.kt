package test.manu.com.testcaroussel

import android.content.Context
import android.graphics.Canvas
import android.support.annotation.AttrRes
import android.support.annotation.StyleRes
import android.util.AttributeSet
import android.widget.FrameLayout

/**
 * Created by emmanuelchagnas on 18/05/2017.
 */

class ScaleFrameLayout : FrameLayout {

    var scale: Float = 0.5F

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, @AttrRes defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    constructor(context: Context, attrs: AttributeSet?, @AttrRes defStyleAttr: Int, @StyleRes defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {}

    fun setScaleBoth(scale: Float){
        this.scale = scale
        invalidate()
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.scale(scale, scale, (width / 2).toFloat(), (height / 2).toFloat())
    }
}

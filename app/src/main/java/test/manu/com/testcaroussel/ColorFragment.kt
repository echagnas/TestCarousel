package test.manu.com.testcaroussel

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout


/**
 * Created by emmanuelchagnas on 17/05/2017.
 */
class ColorFragment : Fragment() {

    companion object {
        var ARG_COLOR = "color"
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater?.inflate(R.layout.color_fragment_layout, container, false) as FrameLayout
        view?.setBackgroundColor(arguments.getInt(ARG_COLOR))

        return view
    }

}
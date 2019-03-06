package kotlintutorial.com.kotlintutorial.view.bottomNavFragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlintutorial.com.kotlintutorial.R

class ProfileFragment : Fragment() {
    companion object {
        val TAG: String = ProfileFragment::class.java.simpleName
        fun newInstance() = ProfileFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        return view
    }
}
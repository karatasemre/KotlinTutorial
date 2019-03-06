package kotlintutorial.com.kotlintutorial.helper

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import kotlintutorial.com.kotlintutorial.R


fun FragmentManager.detach() {
    findFragmentById(R.id.container)?.also {
        beginTransaction().detach(it).commit()
    }
}

fun FragmentManager.attach(fragment: Fragment, tag: String) {
    if (fragment.isDetached) {
        beginTransaction().attach(fragment).commit()
    } else {
        beginTransaction().add(R.id.container, fragment, tag).commit()
    }
    beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit()
}
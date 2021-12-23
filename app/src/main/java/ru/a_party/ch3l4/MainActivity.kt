package ru.a_party.ch3l4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.a_party.ch3l4.App.Navigation.navigatorHolder
import ru.a_party.ch3l4.App.Navigation.router
import ru.a_party.ch3l4.multi.MultiScreen

class MainActivity : AppCompatActivity() {
    private val navigator = CustomNavigator(activity=this,R.id.main_container)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState==null){
            router.navigateTo(MultiScreen)
        }
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }
}
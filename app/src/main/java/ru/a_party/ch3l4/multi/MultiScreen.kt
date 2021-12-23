package ru.a_party.ch3l4.multi

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen

object MultiScreen: FragmentScreen {
    override fun createFragment(factory: FragmentFactory): Fragment = MultiFragment.newInstance()
}
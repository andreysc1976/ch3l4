package ru.a_party.ch3l4

import com.github.terrakok.cicerone.Router

class CustomRouter : Router() {

    interface Command {
        fun execute(navigator: CustomNavigator)
    }
}
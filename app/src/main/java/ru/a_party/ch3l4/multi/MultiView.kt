package ru.a_party.ch3l4.multi

import moxy.MvpView
import moxy.viewstate.strategy.alias.SingleState

interface MultiView:MvpView {
    @SingleState
    fun showResult(value:Int)
}
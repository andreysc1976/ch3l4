package ru.a_party.ch3l4.multi

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers
import io.reactivex.rxjava3.subjects.BehaviorSubject
import io.reactivex.rxjava3.subjects.PublishSubject
import moxy.MvpPresenter

class MultiPresenter: MvpPresenter<MultiView>() {

    val pSubject = BehaviorSubject.createDefault(0)

    fun multipleValue(value:Int)
    {
        pSubject.map{
            it*it
        }
            .subscribeOn(Schedulers.computation())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
            {
                viewState::showResult
            }
        )
        pSubject.onNext(value)
    }
}
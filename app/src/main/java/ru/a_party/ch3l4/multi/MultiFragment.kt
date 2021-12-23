package ru.a_party.ch3l4.multi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import ru.a_party.ch3l4.R
import ru.a_party.ch3l4.databinding.FragmentMultiBinding


class MultiFragment : MvpAppCompatFragment(R.layout.fragment_multi), MultiView {
    lateinit var binding : FragmentMultiBinding

    private val presenter:MultiPresenter by moxyPresenter{
        MultiPresenter()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMultiBinding.bind(view)
        binding.button.setOnClickListener {
            presenter.multipleValue(Integer.parseInt(binding.editTextNumberDecimal.text.toString()))
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = MultiFragment()
    }

    override fun showResult(value: Int) {
        binding.tvResult.text=value.toString()
    }
}
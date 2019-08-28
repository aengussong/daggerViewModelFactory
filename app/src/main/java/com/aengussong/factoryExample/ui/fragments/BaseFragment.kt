package com.aengussong.factoryExample.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.aengussong.factoryExample.factory.DaggerViewModelFactory
import javax.inject.Inject

abstract class BaseFragment : Fragment() {

    @Inject
    lateinit var factory: DaggerViewModelFactory

    protected abstract fun getLayoutId(): Int

    protected open fun onCreateView(view: View) {}

    fun getViewModel(modelClass: Class<out ViewModel>): ViewModel = ViewModelProviders.of(this, factory).get(modelClass)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val layoutId = getLayoutId()
        if (layoutId != 0) {
            val view = inflater.inflate(layoutId, null)
            onCreateView(view)
            return view
        }
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}
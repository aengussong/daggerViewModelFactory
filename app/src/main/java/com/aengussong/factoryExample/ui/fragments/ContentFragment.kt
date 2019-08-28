package com.aengussong.factoryExample.ui.fragments

import android.view.View
import android.widget.Toast
import com.aengussong.factoryExample.R
import com.aengussong.factoryExample.viewmodel.ChangePasswordViewModel
import dagger.android.support.AndroidSupportInjection

class ContentFragment : BaseFragment() {

    private lateinit var viewModel: ChangePasswordViewModel

    override fun onCreateView(view: View) {
        super.onCreateView(view)
        AndroidSupportInjection.inject(this)

        viewModel = getViewModel(ChangePasswordViewModel::class.java) as ChangePasswordViewModel

        displayData()
    }

    override fun getLayoutId() = R.layout.fragment_content

    private fun displayData() = Toast.makeText(activity, viewModel.getData(), Toast.LENGTH_SHORT).show()

    companion object {
        fun newInstance(): ContentFragment {
            return ContentFragment()
        }
    }

}
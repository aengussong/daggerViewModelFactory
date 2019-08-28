package com.aengussong.factoryExample.ui.activities


import android.os.Bundle
import android.widget.Toast
import com.aengussong.factoryExample.R
import com.aengussong.factoryExample.extentions.inTransaction
import com.aengussong.factoryExample.ui.fragments.BaseFragment
import com.aengussong.factoryExample.ui.fragments.ContentFragment
import com.aengussong.factoryExample.viewmodel.MainViewModel
import dagger.android.AndroidInjection


class MainActivity : BaseActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidInjection.inject(this)

        viewModel = getViewModel(MainViewModel::class.java) as MainViewModel
        displayData()

        openFragment(ContentFragment.newInstance())
    }

    private fun displayData() = Toast.makeText(this, viewModel.getData(), Toast.LENGTH_SHORT).show()

    private fun openFragment(fragment: BaseFragment) {
        supportFragmentManager.inTransaction {
            replace(R.id.container, fragment)
        }
    }
}

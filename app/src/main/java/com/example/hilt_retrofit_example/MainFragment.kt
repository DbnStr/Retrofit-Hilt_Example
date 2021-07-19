package com.example.hilt_retrofit_example

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.viewModels
import com.example.hilt_retrofit_example.view_models.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {

    private val viewModel by viewModels<MainViewModel>()

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val constraintLayout = inflater.inflate(R.layout.fragment_main, container, false)
                as ConstraintLayout
        val name : TextView = constraintLayout.findViewById(R.id.name_field)
        val age : TextView = constraintLayout.findViewById(R.id.age_field)
        viewModel.getUser(0).observe(viewLifecycleOwner, {user ->
            name.text = "name : " + user.name
            age.text = "age : " + user.age.toString()
        })
        return constraintLayout
    }
}
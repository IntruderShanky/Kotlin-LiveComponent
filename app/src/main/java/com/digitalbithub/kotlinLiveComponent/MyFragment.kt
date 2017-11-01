package com.digitalbithub.kotlinLiveComponent

import android.arch.lifecycle.LifecycleFragment
import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView

class MyFragment : LifecycleFragment() {

    private var viewModel: MyViewModel = MyViewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_my, container, false)
        val textView: TextView = view.findViewById(R.id.text) as TextView
        val editText: EditText = view.findViewById(R.id.edit_text) as EditText
        viewModel = ViewModelProviders.of(activity).get(MyViewModel::class.java)
        viewModel.liveText.value = "Oh Yeah"

        viewModel.liveText.observe(activity as LifecycleOwner, Observer { value ->
            println(value)
            textView.text = value
        })

        editText.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                viewModel.liveText.value = s.toString()
            }

        })
        return view
    }
}
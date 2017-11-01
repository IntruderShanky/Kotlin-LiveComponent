package com.digitalbithub.kotlinLiveComponent

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MyViewModel : ViewModel(){
    var liveText:MutableLiveData<String> = MutableLiveData()
}

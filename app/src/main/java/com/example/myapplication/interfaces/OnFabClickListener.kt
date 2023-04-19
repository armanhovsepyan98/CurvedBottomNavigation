package com.example.myapplication.interfaces

interface OnFabClickListener {

    interface OnSmallFabClickListener {
        fun onSmallFabClick(position: Int)
    }

    interface OnBigFabClickListener {
        fun onBigFabClick(state: Boolean)
    }

}
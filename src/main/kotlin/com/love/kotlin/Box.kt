package com.love.kotlin

abstract class Box {
    open val length: Float = 0.0f
    open val width: Float = 0.0f
    open val height: Float = 0.0f
    fun validate(length: Float, width: Float, height: Float): Boolean {
        return length <= this.length && width <= this.width && height <= this.height
    }
    abstract fun useBox()
}
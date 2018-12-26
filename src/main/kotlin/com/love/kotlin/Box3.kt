package com.love.kotlin

class Box3(): Box() {
    override fun useBox() {
       println("Use Box3")
    }

    override val length: Float=23f
     override val width: Float =14f
     override val height:Float=13f
}
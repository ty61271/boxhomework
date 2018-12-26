package com.love.kotlin

import java.util.*

fun main(args: Array<String>) {
    val postions= listOf<String>("length","width","height")
    val sizes= mutableListOf<Float>()
    val scanner=Scanner(System.`in`)
    var size:Float
    for(postion in postions){
        print("Please enter object's $postion:\t")
        size=scanner.nextFloat()
        sizes.add(size)
    }
    if(Box3().validate(sizes.get(0),sizes.get(1),sizes.get(2))) Box3().useBox()
    else if(Box5().validate(sizes.get(0),sizes.get(1),sizes.get(2))) Box5().useBox()
    else print("cant put")

}

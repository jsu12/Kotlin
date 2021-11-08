package com.rhtth.kotlinstudy

fun main(array: Array<String>){
    val testAccess : TestAccess = TestAccess("이름1")
    testAccess.test()
    println(testAccess.name)
    testAccess.name = "이름2"

    val reward : Reward = Reward()
    reward.rewardAmount = 2000
}

class Reward(){
    var rewardAmount : Int = 1000

}
class TestAccess{
    var name : String = "홍길동"

    constructor(name : String){
        this.name = name
    }

    fun test(){
        println("테스트")

    }
}
package com.rhtth.kotlinstudy

fun main(args: Array<String>){
    val supercar : SuperCar1 = SuperCar1()
    supercar.drive()
    supercar.stop()

    val bus : Bus1 = Bus1()
    bus.drive()
    bus.stop()

}

//class, fun는 앞에 기본적으로 private가 선언되어 있음
open class Car1(){
   open fun drive(){
        println("달린다.")
    }
    fun stop(){

    }
}

class SuperCar1() : Car1(){
    override fun drive() {
        println("빨리 달린다.")
      //  super.drive()
    }
}

class Truck1() : Car1(){

}

class Bus1() : Car1(){

}
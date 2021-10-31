package com.rhtth.kotlinstudy

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(array: Array<String>){

    val a = mutableListOf<Int>(1,2,3)
    a.add(4)
    println(a)  //[1.2.3.4]

    a.add(0,100)
    println(a)  //[100,1,2,3,4] ->index0->1 의값을 한칸 밀어내고 index0->100이 된다.

    a.set(0,200)
    println(a) //[200,1.2.3.4] ->기존에 있던100을 200으로 바꿈

    a.removeAt(1)
    println(a) //1을 없애고 [200,2,3,4]가 출력

    val b = mutableSetOf<Int>(1,2,3,4)
    println("MutableSetOf")
    b.add(2) //중복을 허용하지 않아 바뀌는게 없음
    println(b)
    b.remove(2) //[1,3.4]
    b.remove(100) //b에 없는 값을 삭제해도 에러는 발생하지 않음

    val c = mutableMapOf<String, Int>("one" to 1)
    println("MutableMapOf")
    c.put("two",2)
    println(c)  //{one=1,two=2}
    c.replace("two",3)  //key값 two의 value값을 3으로 변경
    println(c) //{one=1,two=3}
    println(c.keys)  //key값만 출력

    println(c.get("one")) //value값만 추출 ->1
    println(c.get("two")) //value값만 추출 ->3

    println("------------")
    var x : String
   var y : String
   c.keys.forEach(){
    println(it)
    }


    c.values.forEach(){
     println(it)
    }

    println(c.values) //value값만 출력
    c.clear() //삭제
    println(c)

}
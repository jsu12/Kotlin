package com.rhtth.kotlinstudy

//Collection -> List, set, map
fun main(args: Array<String>){

    //List  -> 중복을 허용함
    val numberList = listOf<Int>(1,2,3,3,3)
    println(numberList)  //1,2,3,3,3
    println(numberList.get(0)) //1
    println(numberList[0]) //1

    //Set -> 중복을 허용하지 않음
    //      -> 순서가 없음
    val numberSet = setOf<Int>(1,2,3,3,3)
    println(numberSet)  //1,2,3

    //1,2,3을 각각 한개씩 출력
    numberSet.forEach{
        println(it)
    }

    //Map -> Key,value 방식으로 관리
    //(key,value) -> ("one",1),("two",2)라는 두개의 키가 만들어짐
    val numberMap = mapOf<String, Int>("one" to 1,"two" to 2)
    println()
    println(numberMap.get("one"))

    //Immutable Collections(한번 생성된 Collection은 값을 변경할 수 없다)
    //Immutable Collection -> listOf, setOf, mapOf

    //Mutable Collection(변경 가능)
    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3,4)
    println()
    println(mNumberList)

    //set에는 index가 없기 때문에 add시에 값을 요소값만 넣어주면 된다.
    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(10)
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two" , 2)
    println(mNumberMap)


}
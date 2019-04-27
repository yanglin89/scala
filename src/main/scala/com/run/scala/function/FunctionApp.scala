package com.run.scala.function

/**
  * 函数
  * */
object FunctionApp {

  def main(args: Array[String]): Unit = {

//    println("result add : " + add(2,3))
//
//    println(three())
//    println("没有入参的函数，调用的时候 () 可以省略" + three)
//
//    sayHello()
//    sayHello
//
//    sayHello("sigmund")
//
//    sayName()
//    sayName("yangsir")
//
//    println(speed(100,10))
//    println(speed(distince = 100,time = 10))
//    println(speed(time = 10,distince = 100)) // 命名参数，不建议

//    println(sum(1 , 5))
//    println(sum(1 , 5 , 1))
//    println(sum2(1,2))
//    println(sum2(1,2,3))
//    println(sum2(1,2,3,4))

    /*for(i <- 1 to 10 if i % 2 == 0){
      println(i)
    }*/

    /*val courses = Array("aa","bb","cc","dd","ee")
    for (course <- courses){
      println(course)
    }

    courses.foreach(course => println(course))*/

    var (num,sum) = (100,0)
    while(num > 0){
      sum = sum + num
      num = num -1
    }
    println(sum)

  }


  def add( x : Int, y : Int) : Int = {
    x + y  // 最后一行就是返回值，不需要return
  }

  def three() = 1 + 2 //只有一行时可以省略大括号

  def sayHello(): Unit ={
    println("没有返回值得时候，默认生成 Unit ，即为不返回")
  }

  def sayHello(name : String): Unit ={
    println(name + " sayHello ...")
  }

  def sayName(name : String = "sigmund"): Unit = {
    println(name)
  }

  def speed(distince : Float,time : Float):Float = {
    distince / time
  }

  def sum(a:Int , b:Int) ={
    a + b
  }

  def sum(a:Int , b:Int , c:Int) ={
    a + b + c
  }

  /**
    * 可变参数
    * */
  def sum2(numbers : Int*) ={
    var result = 0;
    // 遍历 numbers
    for(num <- numbers){
      result += num
    }
    result
  }


}

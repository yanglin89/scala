package com.run.scala.OO

object SimpleObjectApp {

  def main(args: Array[String]): Unit = {
    val person = new Person()
    println(person.name + "..." + person.age)
    person.name = "sigmund"
    println(person.name + "..." + person.age)

    println("invoke method of eat " + person.eat())
    person.watchBall("lakers")

    person.printInfo()

  }

}


class Person(){

  // 定义属性
  var name:String = _  // var默认生成set 和 get 方法
  val age:Int = 10  // val 默认生成 get 方法

  // private [this] 修饰的属性，只有在改class类中可以使用，在类外面不能被直接使用
  private [this] val gender = "male"


  // 定义方法
  def printInfo(): Unit ={
    println("gender :" + gender)
  }

  def eat():String = {
    name + " eating ..."
  }

  def watchBall(team:String)={
    println(name + " watching ball of " + team)
  }
}





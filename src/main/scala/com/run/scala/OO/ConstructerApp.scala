package com.run.scala.OO

object ConstructerApp {

  def main(args: Array[String]): Unit = {

    val person = new Person2("zhangsan",30)
    println(person.name +".."+ person.age +".."+ person.school)

    val person2 = new Person2("zhang",20,"male")
    println(person2.name +".."+ person2.age +".."+ person2.school +".."+ person2.gender)

    /*val person3 = new Person2("wang","male")
    println(person3.name +".."+ person3.age +".."+ person3.school +".."+ person3.gender)*/

    val student = new Student("sigmund",18,"math")
    println(student.name + "--" + student.major + "--" + student.gender +"--" + student.school)

  }

}


// 主构造器：跟在类名后面的是主构造器，去掉主构造器 val，外部不能访问对象的该属性，对象可以正常创建
class Person2(val name:String,val age:Int){
  println("Person entry")

  val school = "sch"
  var gender:String = _ //占位符赋值必须有类型

  // 附属构造器 ：
  def this(name:String,age:Int,gender:String){
    this(name,age) //附属构造器的第一行代码必须调用主构造器或者其他附属构造器
    this.gender = gender
  }

  /*def this(name:String,gender:String){
    this(name,age) //附属构造器的第一行代码必须调用主构造器或者其他附属构造器
    this.gender = gender
  }*/

  println("Person exit")
}


// 继承，子类中包含父类中没有的属性时，一定要给改属性加上 val var ，否则外面访问不到
class Student(name:String,age:Int,val major:String) extends Person2(name,age) {
  println("student entry")

  override val school: String = "newSchool"

  println("student exit")


}






















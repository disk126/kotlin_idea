import kotlin.math.log

/*
作业题

1.请编写函数，函数名为sayHello 方法返回值是String类型，一个参数是String类型  名称为name

2.请编写函数，函数名为checkAge 方法的返回值是Boolean类型，一个参数是整数类型 名称为age

3.请编写函数, 函数名为savelog  方法没有返回值             一个参数是整数类型，名称为loglevel

*/


/*

fun sayHello(name: String): String {
    return "Hello" + name

}

fun checkAge(age: Int): Boolean {
    if (age > 18) return true else return false


}

fun savelog(loglevel: Int):Int {
    return loglevel


}


//验证上面的方法

fun main(args: Array<String>) {
    var name = "张三"
    println(sayHello(name))

    var age = 8
    println("得到的结果是:" + checkAge(age))

    var loglevel =1
    println(savelog(loglevel))
}

 */



/*
第二次编写作业题

1.请编写函数，函数名为sayHello 方法返回值是String类型，一个参数是String类型  名称为name

2.请编写函数，函数名为checkAge 方法的返回值是Boolean类型，一个参数是整数类型 名称为age

3.请编写函数, 函数名为savelog  方法没有返回值             一个参数是整数类型，名称为loglevel

*/

fun  sayHello(name:String):String{
    return "Hello"+name
}

fun checkAge(age:Int):Boolean{
    if (age>18) return true else return false
}

fun savelog(loglevel:Int):Int{
    return loglevel

}


fun main(args: Array<String>) {
    println(sayHello(name = "张三"))
    println(checkAge(25))
    println(savelog(18))

}
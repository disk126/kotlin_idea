//函数的本质，可以理解是一个或是一组功能的组合


//下面通过函数的方式来构造一个计算器，加减乘除


/*
fun main(args: Array<String>) {

    var a=8
    var b=2
    //调用加法函数
    println("a+b="+plus(a,b))
    //调用减法函数
    println("a-b="+sub(a,b))

    //调用乘法函数
    println("a*b="+mutl(a,b))

    //调用除法函数
    println("a/b="+devide(a,b))
}

// fun 函数名(参数名:参数类型):返回值类型{
// 函数体
// }


// fun 固定写法  plus 函数名 (a是第一个参数，类型是int,b是第二个参数，类型是int):Int返回值是Int类型

//加
fun plus(a:Int,b:Int):Int{
    return a+b
}

//减
fun sub(a:Int,b:Int):Int{
    return a-b
}


//乘
fun mutl(a:Int,b:Int):Int{
    return a*b
}

fun devide(a:Int,b:Int):Int{
    return a/b
}

 */


/*

//自己练习写一个加减乘除的方法

fun main(args: Array<String>) {

    var c = 10
    var d = 5

    //加
    println("c+d="+jia(c,d))

    //减
    println("c-d="+jian(c,d))

    //乘
    println("c*d="+cheng(c,d))


    //除
    println("c/d="+chu(c,d))

}


fun jia(c:Int,d:Int):Int{
    return c+d
}


fun jian(c:Int,d:Int):Int{
    return c-d
}

fun cheng(c:Int,d:Int):Int{
    return c*d
}

fun chu(c:Int,d:Int):Int{
    return c/d
}

 */

//练习一个计算器
//加

/*
fun jia(e: Int, f: Int): Int {
    return e + f
}

//减

fun jian(e: Int, f: Int): Int {
    return e - f
}

fun cheng(e: Int, f: Int): Int {
    return e * f
}

fun chu(e: Int, f: Int): Int {
    return e / f
}


fun main(args: Array<String>) {
    var e = 8
    var f = 4
    println("e+f=" + jia(e, f))
    println("e-f=" + jian(e, f))
    println("e*f=" + cheng(e, f))
    println("e/f=" + chu(e, f))
}

 */



//第二次练习编写计算器

//加

fun jia (g:Int,h:Int):Int{
    return g+h
}

//减

fun jian(g:Int,h:Int):Int{
    return  g-h
}

//乘

fun cheng(g:Int,h:Int):Int{
    return  g*h
}

//除

fun chu(g: Int,h: Int):Int{
    return g/h
}

fun main(args: Array<String>) {
    var g=10
    var h=5
    println("g的值是"+g+",h的值是"+h)

    //加方法调用
    println("g+h="+jia(g, h))

    //减方法调用

    println("g-h="+jian(g, h))

    //乘方法调用

    println("g*h="+cheng(g, h))

    //除方法调用

    println("g/h="+chu(g, h))
}





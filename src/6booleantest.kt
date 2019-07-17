//Boolean  布尔类型  true 代表真      flase 代表假

fun main(args: Array<String>) {

    //数字对比
    var num1=4
    var num2 =6
    println("num1的值:"+num1)
    println("num2的值:"+num2)
    println(num1<num2)

    //根号数字对比

    var num3 = Math.sqrt(5.0)-Math.sqrt(4.0)
    var num4 = Math.sqrt(4.0)-Math.sqrt(3.0)
    println("num3的值:"+num3)
    println("num4的值:"+num4)
    println(num3<num4)


    //比较2的100次方与3的75次方的大小

    var num5 = Math.pow(2.0,100.0)
    var num6 = Math.pow(3.0,75.0)

    println("num5的值:"+num5)
    println("num6的值:"+num6)
    println(num5<num6)
}

//返回两个数当中较大的那个

fun figure(d1:Int,d2:Int):Int{
    if (d1>d2) return d1 else return d2
}

fun main(args: Array<String>) {
    var d1=24
    var d2=26
    println("${d1}和${d2}较大的那个数字是${figure(d1, d2)}")
}
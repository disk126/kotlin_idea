// 变量的取值范围

fun main() {
    var a:Byte= Byte.MAX_VALUE
    var b:Byte= Byte.MIN_VALUE
    println("Byte的最大值:"+a)
    println("Byte的最小值"+b)

    var c:Long= Long.MAX_VALUE
    var d:Long=Long.MIN_VALUE
    println("Long的最大值"+c)
    print("Long的最小值"+d)

// 二进制转换成十进制

    var e:Int = 0b0011
    println("十进制数字是 "+e)
}
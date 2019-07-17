
fun main(args: Array<String>) {
    var str1 = "张三"
    var str2 = "张二"
    var str3 = "Andy"
    var str4 = "andy"
    println(str1 == str2)   //== 两个等号是判断两个字符串是否相等，=一个等号是赋值
    println(str1.equals(str2))  //.equals关键字等价于==
    //得到的结果是:false

    println(str3.equals(str4, true)) // 不区分大小写，只需要在后面加上True或者false就可以了
    //得到的结果是:true
}

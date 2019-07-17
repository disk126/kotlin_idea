
/*
null值：
1.null也是值
2.表示没有东西，没有数据

 */


fun heat(str:String?):String{  //在String后面加上一个问号代表参数可以为空
    return "热"+str
}

//调用heat方法



fun main(args: Array<String>) {
    var result1=heat("水")
    println(result1)

    var result2=heat(null)
    println(result2)

}
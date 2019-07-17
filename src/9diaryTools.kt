/*
//字符串模板使用

fun diaryGenerater1(diary1: String): String {
    var temp1 = """
今天天气晴朗，万里无云，我们去${diary1}游玩，
首先映入眼帘的是，${diary1}${diary1.length}个鎏金大字
    """
    return temp1
}


fun main(args: Array<String>) {
        var te1 = diaryGenerater1("中山公园")
        println(te1)

        var te2 = diaryGenerater1("动物园")
        println(te2)

        var te3 = diaryGenerater1("天安门")
        println(te3)



    }

 */

//第二次编写日志模板
/*
fun diary2(renyuan:String,shangpin:String):String{

 var tmp2="""今天星期二，${renyuan}在合肥南站购买了一瓶${shangpin}        
    """.trimIndent()
    return tmp2
}

fun main(args: Array<String>) {
    println(diary2(renyuan = "diskpart",shangpin = "kangshifu"))
    var temp3= diary2(renyuan = "test",shangpin = "cccc")
    println(temp3)

}

 */



//第三次编写日志模板
//diskpart撰写
fun dc(tuandui:String,dc1:String):String{
    var test1= """
机械加工，最重要的${tuandui}管控,${dc1}是核心竞争力!        
    """.trimIndent()

    return test1
}

fun main(args: Array<String>) {
    var test3=dc(tuandui = "生产工艺",dc1 = "领导")
    println(test3)
}
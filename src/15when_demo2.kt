

/*

fun diary_enhance(placename:String){
    var diary ="""
今天天气晴朗，白云飘飘，我们去${placename}游玩，
首先映入眼帘的是，${placename}${switch(placename.length)}个鎏金大字
    """.trimIndent()
    println(diary)

}


fun switch(num:Int):String{

    var result1= when(num){
        1 -> "一"
        2 -> "二"
        3 -> "三"
        4 -> "四"
        5 -> "五"
        else -> "其他"
    }
    return result1
}


fun main(args: Array<String>) {
    diary_enhance("中山公园")
    println("---------------------------------")
    diary_enhance("天安门")

}

 */




// 练习写上面的案例

fun spot(scenic:String){
    var result3="""
今天同老婆还有小孩一起到武汉${scenic}游玩，我们都非常开心，因为这是小孩第一次到${scenic}游玩,她们都非常的兴奋！
在游玩的同时我问小孩${scenic}是几个汉字，女儿很快的回答我说是${gain(scenic.length)}个汉字
    """.trimIndent()
    println(result3)
}


fun gain(num1:Int):String{
    var result4 = when(num1){
        1 ->"一"
        2 ->"二"
        3 ->"三"
        4 ->"四"
        5 ->"五"
        else -> num1.toString()
    }
    return result4
}


fun main(args: Array<String>) {
    spot("颐和园")
}
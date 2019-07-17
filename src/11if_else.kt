
//颜值判断器
//颜值>80打印帅哥，<=衰哥



fun appearance(score: Int){
    if (score > 80) println("帅哥")
    else println("衰哥")
}

fun main(args: Array<String>) {
    var score=45
    appearance(score)
}
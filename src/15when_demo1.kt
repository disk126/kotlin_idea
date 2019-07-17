
/*
when表达式
1.给定什么条件
2.满足什么条件执行什么任务
 */


//10分是满分  9分干的不错  8分还可以  7分还需要努力 6分刚好及格，其他(需要加油)

fun Students_scores(scores:Int){
    when (scores){
        10 -> println("考了满分，棒棒哒")
        9  -> println("干得不错")
        8  -> println("还可以")
        7  -> println("还需要努力")
        6  -> println("刚好及格")
        else -> println("需要加油")
    }
}

fun main(args: Array<String>) {
    Students_scores(6)
}
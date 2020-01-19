package test.testline

/*
 * kotlin 学习
 */

data class RegnumAnimal(val name:String,
                        var age:Int,
                        var height:Int,
                        var address:String) {
    val numberZoo = listOf<RegnumAnimal>(
            RegnumAnimal("小花", 19, 177, "湖南"),
            RegnumAnimal("非儿", 19, 157, "湖南"),
            RegnumAnimal("月儿", 18, 167, "广东"),
            RegnumAnimal("花船儿", 23, 167, "湖南"),
            RegnumAnimal("小猫儿", 21, 157, "广东"),
            RegnumAnimal("小狗儿", 19, 157, "湖南"),
            RegnumAnimal("小马儿", 28, 167, "广东"),
            RegnumAnimal("小鸟儿", 29, 157, "广东"),
            RegnumAnimal("小才华", 17, 167, "河南"),
            RegnumAnimal("小甜甜", 26, 157, "四川"),
            RegnumAnimal("大那拉", 28, 167, "四川"),
            RegnumAnimal("翠花", 33, 167, "江苏"),
            RegnumAnimal("小小鱼", 23, 157, "福建"),
            RegnumAnimal("小草儿", 38, 167, "广东"),
            RegnumAnimal("小明", 24, 177, "广东"),
            RegnumAnimal("小烧饼", 19, 167, "广西"),
            RegnumAnimal("小灵儿", 22, 163, "湖南"),
            RegnumAnimal("马开花", 23, 157, "河南"),
            RegnumAnimal("小此花", 18, 167, "山东")

    )
}
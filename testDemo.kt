fun main() {
    println(numberZoo.maxBy{it.age})
    println("maxBy height is info : ${numberZoo.maxBy{it.height}}")
    println("minBy age is info ：${numberZoo.minBy{it.age}}")
    println(numberZoo.filter{
        (it.age > 18) and (it.height > 168) and (it.age < 25)
    })
}
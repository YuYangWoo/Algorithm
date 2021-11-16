abstract class Person(var name: String){
    var age: Int = 0
    var sex: String = ""
    var skill: String = ""
//    constructor(age: Int, sex: String, skill: String) {
//        this.age = age
//        this.sex = sex
//        this.skill = skill
//    }
    constructor(name: String, age:Int):this(name) {
        this.name = name
    this.age=age
    }
    open fun chulgun() {}
     fun printInfo() {}

}
class Yangwoo : Person("YangWoo"), Swimmable {
    override fun swim() {
        TODO("Not yet implemented")
    }


}

fun main(args: Array<String>) {
    print(Poketmon.BBIGGACHU)
}
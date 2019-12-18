
class Person(var name: String="basket" ) {
    var age:Int = 23;
    constructor(name: String, age: Int, rasa: String = "Mongol") : this(name=name )  {
       this.age=age
       this.name=name+" "+rasa
        getInfo()

    }
    public fun getInfo() = println("Name=$name and Age=$age")
}

fun main() {
    val p = Person("BAS",33,"Niga")
    p.getInfo()
}
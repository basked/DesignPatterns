package simpleFactory.cars

// интерфейс для реализации конкретных атомобилей
interface Car {
    fun drive()
}

// AUDI auto
class AudiCar : Car {
    override fun drive() {
        println("Drive AUDI car")
    }
}

// FORD auto
class FordCar : Car {
    override fun drive() {
        println("Drive FORD car")
    }
}

class CarFactory {
    fun createCar(typeOfCar: String): Car? {
        return when (typeOfCar) {
            "audi" -> return AudiCar()
            "ford" -> return FordCar()
            else -> null
        }
    }
}

fun main() {
  val factory=CarFactory()
  factory.createCar("ford")?.drive()
  factory.createCar("audi")?.drive()
}


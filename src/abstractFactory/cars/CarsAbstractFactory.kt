
//https://habr.com/ru/users/matroskin24/posts/
package abstractFactory.cars

interface CarsFactory {
    fun createSedan(): Sedan;
    fun createCoupe(): Coupe;
}

interface Sedan {

}

interface Coupe {
}

class ToyotaCoupe : Coupe {
    init {
        println("Create Toyota abstractFactory.cars.Coupe")
    }
}

class FordCoupe : Coupe {
    init {
        println("Create Ford abstractFactory.cars.Coupe")
    }
}



class ToyotaSedan : Sedan {
    init {
        println("Create Toyota abstractFactory.cars.Sedan")
    }
}

class FordSedan : Sedan {
    init {
        println("Create Ford abstractFactory.cars.Sedan")
    }
}


class ToyotaFactory : CarsFactory {
    override fun createSedan(): Sedan {
        return ToyotaSedan()
    }

    override fun createCoupe(): Coupe {
        return ToyotaCoupe()
    }

}

class FordFactory : CarsFactory {
    override fun createSedan(): Sedan {
        return FordSedan()
    }

    override fun createCoupe(): Coupe {
        return FordCoupe()
    }

}

fun main() {
    val factory: CarsFactory;
    factory = ToyotaFactory()
    factory.createSedan()
    factory.createCoupe()
}
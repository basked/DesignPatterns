package abstractFactory.gefest

interface GefestFactory {
    fun createGazPlita(): GazPlita
    fun createElecro(): Elecro
    fun createGazElectroPlita(): GazElectroPlita
    fun createVozduhan(): Vozduhan
    fun createDuhovka(): Duhovka
    fun createStol(): Stol
    fun createAll(){
        createGazPlita()
        createElecro()
        createGazElectroPlita()
        createVozduhan()
        createDuhovka()
        createStol()
    }

}

interface GazPlita{}
interface Elecro{}
interface GazElectroPlita{}
interface Vozduhan{}
interface Duhovka{}
interface Stol{}


// BZGA


class VozduhanBZGA: Vozduhan {
    init {
        println("Create Vozduhan BZGA")
    }
}

class GazElectroPlitaBZGA: GazElectroPlita {
    init {
        println("Create GazElectroPlita BZGA")
    }
}

class ElecroPlitaBZGA: Elecro {
    init {
        println("Create ElecroPlita BZGA")
    }
}

class GazPlitaBZGA: GazPlita {
    init {
        println("Create GazPlita BZGA")
    }
}

class StolBZGA: Stol {
    init {
        println("Create Stol BZGA")
    }
}
class DuhovkaBZGA: Duhovka {
    init {
        println("Create Duhovka BZGA")
    }
}

//GT
class DuhovkaGT: Duhovka {
    init {
        println("Create Duhovka GT ")
    }
}

class VozduhanGT: Vozduhan {
    init {
        println("Create Vozduhan  GT")
    }
}

class GazElectroPlitaGT: GazElectroPlita {
    init {
        println("Create GazElectroPlita  GT")
    }
}

class ElecroPlitaGT: Elecro {
    init {
        println("Create ElecroPlita GT")
    }
}

class GazPlitaGT: GazPlita {
    init {
        println("Create GazPlita GT")
    }
}

class StolGT: Stol {
    init {
        println("Create Stol GT")
    }
}

public class BzgaFactory() : GefestFactory {
    override fun createGazPlita(): GazPlita {
        return GazPlitaBZGA()
    }

    override fun createElecro(): Elecro {
        return ElecroPlitaBZGA()
    }

    override fun createGazElectroPlita(): GazElectroPlita {
        return GazElectroPlitaBZGA()
    }

    override fun createVozduhan(): Vozduhan {
        return VozduhanBZGA()
    }

    override fun createDuhovka(): Duhovka {
        return DuhovkaBZGA()
    }

    override fun createStol(): Stol {
        return StolBZGA()
    }

}

public class GtFactory() : GefestFactory {
    override fun createGazPlita(): GazPlita {
        return GazPlitaGT()
    }

    override fun createElecro(): Elecro {
        return ElecroPlitaGT()
    }

    override fun createGazElectroPlita(): GazElectroPlita {
        return GazElectroPlitaGT()
    }

    override fun createVozduhan(): Vozduhan {
        return VozduhanGT()
    }

    override fun createDuhovka(): Duhovka {
        return DuhovkaGT()
    }

    override fun createStol(): Stol {
        return StolGT()
    }
}



fun main() {
    val factory = listOf<GefestFactory>(
            BzgaFactory(),
            GtFactory()
    )
 for(i in 0..factory.count()-1) {
     factory.get(i).createAll()
 }
}
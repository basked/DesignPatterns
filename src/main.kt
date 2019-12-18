import abstractFactory.gefest.*
import abstractFactory.komputers.*


class Bender(
        val name: String,
        val fuel: String = "alcohol",
        val material: String = "stell",
        val model: String = "bending",
        val serial: Int = 27116057
) {
    constructor(name: String, material: String, swearWord: String) : this(name, material = material) {
        println("It is secondary constructor")
        learnSwearWorld(swearWord)
    }

    init {
        println("I'am alive!!!!And my name is $name")
        println(
                """
            name:$name,
            fuel: $fuel,
            material: $material,
            model: $model,
            serial: $serial
        """.trimIndent()
        )
    }

    val swearWords: MutableList<String> = mutableListOf();
    private fun learnSwearWorld(swearWord: String) {
        swearWords.add(swearWord);
    }

    companion object Antenna {
        fun callBender() = println("Bender returns to the Planet Express building")
    }
}


fun main() {
    // Constructors
    val bender = Bender("basket", "gold");
    // DESIGN PATTERN

    val factory = listOf<KomputersFactory>(AsusFactoty(), DellFactoty())
    for (i in 0..factory.count() - 1) {
        factory.get(i).createKeyboards()
        factory.get(i).createMonitors()
        factory.get(i).createMouses()
    }

    val factory2 = listOf<GefestFactory>(
            BzgaFactory(),
            GtFactory()
    )
    for(i in 0..1) {
        factory2.get(i).createVozduhan()
        factory2.get(i).createGazPlita()
        factory2.get(i).createStol()
        factory2.get(i).createElecro()
        factory2.get(i).createGazElectroPlita()
        factory2.get(i).createDuhovka()
    }




}
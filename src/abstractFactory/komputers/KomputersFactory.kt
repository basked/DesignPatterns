package abstractFactory.komputers


// Создаем интерыейс абстрактную фабрику
interface KomputersFactory {
    fun createMonitors(): Monitor
    fun createKeyboards(): Keyboard
    fun createMouses(): Mouse
    fun createAll() {
        createKeyboards()
        createMonitors()
        createMouses()
    }
}

interface Monitor {
}

interface Keyboard {
}

interface Mouse {
}

class AsusMonitor() : Monitor {
    init {
        println("Create ASUS Monitor")
    }
}

class AsusPrinter : Keyboard {
    init {
        println("Create ASUS Printer")
    }
}


class AsusMouse : Mouse {
    init {
        println("Create ASUS Mouse")
    }
}


class DellMonitor() : Monitor {
    init {
        println("Create Dell Monitor")
    }
}

class DellPrinter : Keyboard {
    init {
        println("Create Dell Printer")
    }
}


class DellMouse : Mouse {
    init {
        println("Create Dell Mouse")
    }
}


class AsusFactoty() : KomputersFactory {
    override fun createMonitors(): Monitor {
        return AsusMonitor()
    }

    override fun createKeyboards(): Keyboard {
        return AsusPrinter()
    }

    override fun createMouses(): Mouse {
        return AsusMouse()
    }

}

class DellFactoty() : KomputersFactory {
    override fun createMonitors(): Monitor {
        return DellMonitor()
    }
    override fun createKeyboards(): Keyboard {
        return DellPrinter()
    }
    override fun createMouses(): Mouse {
        return DellMouse()
    }
}


fun main() {
    val factory = listOf<KomputersFactory>(AsusFactoty(), DellFactoty())
    for (i in 0..factory.count() - 1) {
        factory.get(i).createAll()
    }
}
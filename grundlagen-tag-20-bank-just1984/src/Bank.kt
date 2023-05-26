var bankWallets: MutableMap<String, Double> = mutableMapOf(
    "Micky Maus" to 35.7,
    "Pluto" to 766.98,
    "Dagobert" to 7776258.99,
    "Quack" to 55.1,
    "Daniel Duesentrieb" to 777.77
)

fun walletStandAbfrage(name: String): Double? {
    val walletStand = bankWallets[name]
    return if (walletStand != null) {
        walletStand
    } else {
        println("\u001b[31mUWAGA UWAGA\u001b[0m: Es gibt kein*e Kunden*in mit diesem Namen: '$name' in unserer Crypto-Bank!")
        null
    }
}

fun neuesWalletHinzufuegen(name: String, walletStand: Double) {
    if (bankWallets.containsKey(name)) {
        println("\u001b[31mUWAGA UWAGA\u001b[0m: Es gibt bereits eine*n Kundin*en mit diesem Namen: '$name'")
    } else {
        bankWallets[name] = walletStand
        println("\u001b[32mYAY\u001b[0m: Das Wallet '$name' wurde mit einem Walletstand von $walletStand DIGI_QUACKS hinzugefügt.")
    }
}

fun walletEntfernen(name: String) {
    if (bankWallets.containsKey(name)) {
        bankWallets.remove(name)
        println("\u001b[32mYAY\u001b[0m: Das Wallet '$name' wurde entfernt.")
    } else {
        println("\u001b[31mUWAGA UWAGA\u001b[0m: Es gibt kein Kund*innen-Wallet mit dem Namen '$name' in unserer Crypto-Bank!")
    }
}

fun geldAbheben(name: String, betrag: Double) {
    if (!bankWallets.containsKey(name)) {
        println("\u001b[31mUWAGA UWAGA\u001b[0m: Es gibt kein Wallet mit dem Namen '$name' in unserer Crypto-Bank!")
        return
    }

    val alterWalletstand = bankWallets[name]!!

    if (alterWalletstand < betrag) {
        println("\u001b[31mUWAGA UWAGA\u001b[0m: Das Wallet '$name' verfügt nicht über genügend DIGI_QUACKS für diese Transaktion!")
        return
    }

    if (betrag > 500) {
        println("\u001b[31mUWAGA UWAGA\u001b[0m: Sie können maximal 500 DIGI_QUACKS pro Transaktion abheben!")
        return
    }

    val neuerWalletstand = alterWalletstand - betrag
    bankWallets[name] = neuerWalletstand
    println("\u001b[32mAWESOME\u001b[0m: Es wurden $betrag DIGI_QUACKS von dem Wallet '$name' abgehoben. Neuer Walletstand: $neuerWalletstand DIGI_QUACKS.")
}

fun geldEinzahlen(name: String, betrag: Double) {
    if (!bankWallets.containsKey(name)) {
        bankWallets[name] = betrag
        println("\u001b[31mUWAGA UWAGA\u001b[0m: Es gab kein Wallet mit dem Namen '$name' in unserer Crypto-Bank. Ein neues Wallet wurde angelegt. Neuer Walletstand: $betrag DIGI_QUACKS.")
    } else {
        val alterWalletstand = bankWallets[name]!!
        val neuerWalletstand = alterWalletstand + betrag
        bankWallets[name] = neuerWalletstand
        println("\u001b[32mNICE(!!!)\u001b[0m: Es wurden $betrag DIGI_QUACKS auf das Wallet '$name' eingezahlt. Neuer Walletstand: $neuerWalletstand DIGI_QUACKS.")
    }
}

fun ueberweisung(vonName: String, anName: String, betrag: Double) {
    if (!bankWallets.containsKey(vonName)) {
        println("\u001b[31mUWAGA UWAGA\u001b[0m: Es gibt kein Wallet mit dem Namen '$vonName' in unserer Crypto-Bank!")
        return
    }

    if (!bankWallets.containsKey(anName)) {
        println("\u001b[31mUWAGA UWAGA\u001b[0m: Es gibt kein Wallet mit dem Namen '$anName' in unserer Crypto-Bank!")
        return
    }

    val alterWalletstandVon = bankWallets[vonName]!!

    if (alterWalletstandVon < betrag) {
        println("\u001b[31mUWAGA UWAGA\u001b[0m: Das Wallet '$vonName' verfügt nicht über genügend DIGI_QUACKS für diese Transaktion!")
        return
    }

    val alterWalletstandAn = bankWallets[anName]!!

    bankWallets[vonName] = alterWalletstandVon - betrag
    bankWallets[anName] = alterWalletstandAn + betrag

    println("\u001b[32mJUHU\u001b[0m: Es wurden $betrag DIGI_QUACKS von dem Wallet '$vonName' an das Wallet '$anName' überwiesen.")
}
fun main() {
    println()
    println()
    println("-> \u001b[36mKontostand eines bestehenden Wallets ausgeben:\u001b[0m")
    println("\u001b[33mWalletstand\u001b[0m von 'Micky Maus': ${walletStandAbfrage("Micky Maus")} \u001b[33m\u001b[5mDIGI_QUACKS\u001b[0m")
    println()
    println("-> \u001b[36mFehlermeldung, wenn versucht wird, den Walletstand eines nicht existierenden Wallets auszugeben:\u001b[0m")
    println("\u001b[33mWalletstand\u001b[0m von 'Goofy': ${walletStandAbfrage("Goofy")} \u001b[33m\u001b[5mDIGI_QUACKS\u001b[0m")
    println()
    println("-> \u001b[36mEin neues Wallet erstellen:\u001b[0m")
    neuesWalletHinzufuegen("Goofy", 1000.0)
    println()
    println("-> \u001b[36mFehlermeldung, wenn versucht wird, ein neues Wallet zu erstellen, obwohl der Name bereits vergeben ist:\u001b[0m")
    neuesWalletHinzufuegen("Goofy", 500.0)
    println()
    println("-> \u001b[36mEin bestehendes Wallet löschen:\u001b[0m")
    walletEntfernen("Goofy")
    println()
    println("-> \u001b[36mFehlermeldung, wenn versucht wird, ein nicht existierendes Wallet zu löschen:\u001b[0m")
    walletEntfernen("Goofy")
    println()
    println("-> \u001b[36mMindestens 10 Test-Transaktionen am Geldautomaten (ein- und auszahlen):\u001b[0m")
    geldEinzahlen("Micky Maus", 50.0)
    geldEinzahlen("Micky Maus", 600.0)
    geldAbheben("Micky Maus", 50.0)
    geldAbheben("Micky Maus", 600.0)
    geldAbheben("Micky Maus", 100.0)
    geldEinzahlen("Pluto", 100.0)
    geldAbheben("Pluto", 50.0)
    geldEinzahlen("Pluto", 500.0)
    geldAbheben("Pluto", 600.0)
    geldAbheben("Pluto", 1000.0)
    println()
    println("-> \u001b[36mMindestens 3 Test-Überweisungen. Gebe nach jeder Überweisung die entsprechenden Walletstände der beteiligten Wallets aus:\u001b[0m")
    neuesWalletHinzufuegen("Goofy", 1000.0)
    ueberweisung("Micky Maus", "Goofy", 50.0)
    println("\u001b[33mWalletstand\u001b[0m von 'Micky Maus': ${walletStandAbfrage("Micky Maus")} \u001b[33m\u001b[5mDIGI_QUACKS\u001b[0m")
    println("\u001b[33mWalletstand\u001b[0m von 'Goofy': ${walletStandAbfrage("Goofy")} \u001b[33m\u001b[5mDIGI_QUACKS\u001b[0m")
    ueberweisung("Micky Maus", "Goofy", 100.0)
    println("\u001b[33mWalletstand\u001b[0m von 'Micky Maus': ${walletStandAbfrage("Micky Maus")} \u001b[33m\u001b[5mDIGI_QUACKS\u001b[0m")
    println("\u001b[33mWalletstand\u001b[0m von 'Goofy': ${walletStandAbfrage("Goofy")} \u001b[33m\u001b[5mDIGI_QUACKS\u001b[0m")
    ueberweisung("Micky Maus", "Goofy", 600.0)
    println("\u001b[33mWalletstand\u001b[0m von 'Micky Maus': ${walletStandAbfrage("Micky Maus")} \u001b[33m\u001b[5mDIGI_QUACKS\u001b[0m")
    println("\u001b[33mWalletstand\u001b[0m von 'Goofy': ${walletStandAbfrage("Goofy")} \u001b[33m\u001b[5mDIGI_QUACKS\u001b[0m")
    ueberweisung("Goofy", "Micky Maus", 50.0)
    println("\u001b[33mWalletstand\u001b[0m von 'Micky Maus': ${walletStandAbfrage("Micky Maus")} \u001b[33m\u001b[5mDIGI_QUACKS\u001b[0m")
    println("\u001b[33mWalletstand\u001b[0m von 'Goofy': ${walletStandAbfrage("Goofy")} \u001b[33m\u001b[5mDIGI_QUACKS\u001b[0m")
}

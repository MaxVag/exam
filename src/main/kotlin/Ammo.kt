import kotlin.random.Random

enum class Ammo {
    SMALL {
        override var damage: Int = 10
        override var criticalHitChance: Double = 0.1
        override var criticalDamageRatio: Double = 1.3
    },
    AVERAGE {
        override var damage: Int = 20
        override var criticalHitChance: Double = 0.2
        override var criticalDamageRatio: Double = 1.4
    },
    LARGE {
        override var damage: Int = 30
        override var criticalHitChance: Double = 0.3
        override var criticalDamageRatio: Double = 1.5

    };

    abstract var damage: Int
    abstract var criticalHitChance: Double
    abstract var criticalDamageRatio: Double

    fun getDamage(): Double{
        return if (isCritical())
            damage * criticalDamageRatio
        else damage.toDouble()
    }
    private fun isCritical(): Boolean{
        return Random.nextDouble(0.0,1.0) <= criticalHitChance
    }
}


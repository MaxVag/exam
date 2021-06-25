abstract class AbstractWeapon(private val maxAmmunition: Int, private val fireType: FireType) {
    var currentListAmmunition: MutableList<Ammo> = mutableListOf()
    var availabilityAmmunition: Boolean = false

    abstract fun createPatron(): Ammo


    fun recharge() {
        currentListAmmunition = mutableListOf()
        for (i in 1..maxAmmunition) {
            currentListAmmunition.add(createPatron())
        }
        availabilityAmmunition = true
    }

    fun patronShot() {

        if (currentListAmmunition.size == 0)
            availabilityAmmunition = false

        if (fireType == Burst) {
            for (i in 0..3) {
                if (currentListAmmunition.size == 0) {
                    availabilityAmmunition = false
                    break
                }
                currentListAmmunition.removeAt(0)
            }
        }

        if (fireType == Single) {
            currentListAmmunition.removeAt(0)
        }
    }
}
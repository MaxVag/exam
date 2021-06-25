import kotlin.random.Random

abstract class AbstractWarrior(
    maxHP: Int,
    override var chanceAvoidHit: Double,
    var accuracy: Double,
    var weapon: AbstractWeapon
) : Warrior {
    private var currentHp: Int = maxHP

    //TODO проверить попадания (+/-)
    override fun attack(warrior: Warrior) {
        if (!weapon.availabilityAmmunition) {
            weapon.recharge()
        } else {
            weapon.patronShot()
            if (checkHit()){
                val dmg = summaryDamage()
            }
        }
    }

    override fun takeDamage(damage: Int) {
        currentHp -= damage
    }

    private fun checkHit(): Boolean {
        return Random.nextDouble(0.0,1.0) in chanceAvoidHit..accuracy
    }

    //TODO невереный подсчет урона
    private fun summaryDamage(): Double {
        return weapon.currentListAmmunition[0].getDamage()
    }
}
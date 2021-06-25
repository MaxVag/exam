interface Warrior {
    var isKilled: Boolean
    var chanceAvoidHit: Double

    fun attack(warrior: Warrior)
    fun takeDamage(damage: Int)
}
object Weapons {

    val ak = object : AbstractWeapon(30,Burst) {
        override fun createPatron(): Ammo {
            return Ammo.AVERAGE
        }
    }
    val m4a1 = object : AbstractWeapon(30,Burst){
        override fun createPatron(): Ammo {
            return Ammo.AVERAGE
        }
    }
    val awp = object : AbstractWeapon(7,Single){
        override fun createPatron(): Ammo {
            return Ammo.LARGE
        }
    }
    val p250 = object : AbstractWeapon(20,Single){
        override fun createPatron(): Ammo {
            return Ammo.SMALL
        }
    }

}
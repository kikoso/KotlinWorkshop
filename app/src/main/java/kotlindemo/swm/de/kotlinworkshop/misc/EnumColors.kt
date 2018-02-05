package kotlindemo.swm.de.kotlinworkshop.misc

enum class Color (
        val r: Int, val g: Int, val b:Int) {

    RED(255,0,0),  GREEN(255,0,0), BLUE(0,0,255);
    fun rgb()  = r*256

    fun getMnemonic(color: Color) =
            when (color) {
                RED -> "Red"
                GREEN -> "Green"
                BLUE -> "Blue"
            }

    fun getWarmth(color: Color) = when(color) {
        GREEN,BLUE -> "cold"
        RED -> "warm"
    }
}



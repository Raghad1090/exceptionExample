import kotlin.random.Random

//what is exception?
// exception used to inform a user if there is something wrong in a program
// by throwing an exception and handle it by defining a try/catch statement

fun main() {

    var swordsJuggling: Int? = null
    val isJugglingProficient = Random.nextInt(3) == 0

    if (isJugglingProficient) {
        swordsJuggling = 2
        
   proficiencyCheck(swordsJuggling)

        swordsJuggling = swordsJuggling!!.plus(1)
        println("You juggle $swordsJuggling swords!")
    }

}

fun proficiencyCheck(swordsJuggling: Int?) {
    swordsJuggling ?: throw IllegalStateException("Player cannot juggle swords") }





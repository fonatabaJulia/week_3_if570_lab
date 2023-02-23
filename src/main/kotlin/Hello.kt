import java.util.*

//fun main(args: Array<String>) {
//    println("Hello, ${args[0]}")
//
//    val isUnit = println("This is an expression")
//    println(isUnit)
//
//    //val temperature = 10
//    //val isHot =  if (temperature > 50) true else false
//    //println(isHot)
//    val temperature = 10
//    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK"
//    }."
//    println(message)
//}

fun randomDay() : String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood(day : String) : String {
    var food = ""
    when (day) {
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "red worms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
        else -> "nothing"
    }
    return food
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")

}
fun main(args: Array<String>) {
    feedTheFish()
    swim()
    swim("slow")
    swim(speed="turtle-like")
}

fun swim(speed: String = "fast") {
    println("swimming $speed")
}

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 22 ): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) ->true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30



fun isSunday(day: String) = day == "Sunday"
package example.myapp

//class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
//
//        var length: Int = length
//        var width: Int = width
//        var height: Int = height
//
//        fun printSize() {
//
//
//                println(
//                        "length: $length cm" +
//                                " width: $width cm " +
//                                " height: $height cm"
//                )
//        }

//}



class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int =
40) {
    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
    init {
        println("aquarium initializing")
    }
//    init {
//        // 1 liter = 1000 cm^3
//        println("Volume: ${width * length * height / 1000} liters")
//    }
    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm "
        )

        println("Volume: $volume liters")
    }
    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

}


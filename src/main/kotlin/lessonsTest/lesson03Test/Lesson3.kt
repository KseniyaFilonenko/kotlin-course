package lessonsTest.lesson03Test

const val PI = 3.14
const val wheelsQty: Int = 4

class Lesson3 {
    val name: String = "Kseniya"
    var age: Int = 30
    fun example() {
        age = 31
    }
    lateinit var phoneNum: String
    val lazyValue: String by lazy {
        "some code"
    }
    var speed: Double? = null //? nullable value
    fun example2() {
        speed?.dec()
    }
    var count: Int = 0
        get() {
            return if (field > 100) field else 0
        }
        set(value) {
            if (value >= 0) field = value
        }



    val vincode: String = "434hbh"
    var color: String = "silver"
    var mileage: Int = 0
    lateinit var owner: String

    val utilReport: String by lazy {
        ""
    }
}
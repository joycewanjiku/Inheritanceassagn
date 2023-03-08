fun main() {
    var van =Car("Isuze","subaru","blue",8)
    van.carry(10)
    van.carry(4)
    van.Identity("White", "Subaru", "Legacy")
    println( van.calculateParkingFees(5))
    var bus =Bus("Isuze","subaru","blue",24)
  println(bus.capacity)
}

open class Van(var make:String,var model: String,var color: String,var capacity:Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("carring $x passangers")
        } else {
            println("overcappacity by $x people")

        }
    }
}

class Car(make: String, model: String, color: String, capacity: Int) : Van(make, model, color, capacity) {
    fun Identity(color: String, make: String, model: String) {
        println("I am a $color $make $model")
    }

    fun calculateParkingFees(hours: Int): Int {
        var fees = hours * 20
        return fees
    }

}
class Bus(make: String, model: String, color: String, capacity: Int) : Van(make, model, color, capacity) {
fun maxTripFare(fare:Double):Double {
    var tripFare = fare * capacity
    return tripFare
}
}





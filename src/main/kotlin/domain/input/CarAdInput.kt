package domain.input

import domain.model.CarAd
import java.util.*

class CarAdInput(val make: String, val model: String, val year: Int, val kilometers: Int) {

    fun toCarAd() : CarAd{
        return CarAd(UUID.randomUUID(), make, model, year, kilometers)
    }
}

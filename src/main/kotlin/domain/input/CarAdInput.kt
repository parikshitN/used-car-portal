package domain.input

import domain.model.CarAd

class CarAdInput(val make: String, val model: String, val year: Int, val kilometers: Int) {

    fun toCarAd() : CarAd{
        return CarAd(make, model, year, kilometers)
    }
}

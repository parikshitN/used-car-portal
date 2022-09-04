package domain.repository

import domain.model.CarAd

interface CarAdRepository {
    fun save(carAd: CarAd) : CarAd

}

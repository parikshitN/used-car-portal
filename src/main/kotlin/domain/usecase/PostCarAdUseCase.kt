package domain.usecase

import domain.input.CarAdInput
import domain.model.CarAd
import domain.repository.CarAdRepository

class PostCarAdUseCase(val carAdRepository: CarAdRepository) {
    fun execute(carAdInput: CarAdInput) {
        carAdRepository.save(carAdInput.toCarAd())
    }
}

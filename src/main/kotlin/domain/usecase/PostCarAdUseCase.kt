package domain.usecase

import domain.input.CarAdInput
import domain.output.AdvertisementOutput
import domain.repository.CarAdRepository

class PostCarAdUseCase(val carAdRepository: CarAdRepository) {
    fun execute(carAdInput: CarAdInput) : AdvertisementOutput{
        val carAd = carAdRepository.save(carAdInput.toCarAd())
        return AdvertisementOutput(uuid = carAd.uuid)
    }
}

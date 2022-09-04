package infrastructure.controllers

import domain.input.CarAdInput
import domain.output.AdvertisementOutput
import domain.usecase.PostCarAdUseCase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/advertisements")
class AdvertisementController(val postCarAdUseCase: PostCarAdUseCase) {

    @PostMapping
    fun postAdvertisement(@RequestBody carAdInput: CarAdInput): AdvertisementOutput {
        return postCarAdUseCase.execute(carAdInput)
    }
}
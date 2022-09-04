package infrastructure.config

import domain.repository.CarAdRepository
import domain.usecase.PostCarAdUseCase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfig {
    @Autowired lateinit var advertisementRepository: CarAdRepository

    @Bean
    fun postAdUseCase() : PostCarAdUseCase {
        return PostCarAdUseCase(advertisementRepository)
    }
}
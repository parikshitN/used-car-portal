import domain.input.CarAdInput
import domain.repository.CarAdRepository
import domain.usecase.PostCarAdUseCase
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify


 class PostCarAdUseCaseTest {
    private val carAdRepository = mock(CarAdRepository::class.java)
    private val postCarAdUseCase = PostCarAdUseCase(carAdRepository = carAdRepository)

   @Nested
   inner class GivenAValidCarDetails {

       private val swiftDezire = CarAdInput(make = "Maruti", model = "Swift Dezire", year = 2010, kilometers = 10000)

       @Nested
       inner class WhenANewCarPostAdded {

           @Test
           fun shouldGetAddedSuccessfully() {
               postCarAdUseCase.execute(swiftDezire)

               verify(carAdRepository).save(swiftDezire.toCarAd())
           }
       }
   }



}
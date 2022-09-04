package infrastructure.data.repository

import domain.model.CarAd
import domain.repository.CarAdRepository
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.UUID

interface AdvertisementJpaRepository : MongoRepository<AdvertisementDocument, UUID>

@Repository
class AdvertisementRepositoryImp (val advertisementJpaRepository: AdvertisementJpaRepository): CarAdRepository{

    override fun save(carAd: CarAd): CarAd {
        val document =
            AdvertisementDocument(carAd.uuid, carAd.make, carAd.model, carAd.year, carAd.kilometers)
        advertisementJpaRepository.save(document)
        return carAd
    }
}
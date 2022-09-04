package infrastructure.data.repository

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document("advertisement")
data class AdvertisementDocument (val uuid: UUID, val make: String, val model: String, val year: Int, val kilometers: Int)
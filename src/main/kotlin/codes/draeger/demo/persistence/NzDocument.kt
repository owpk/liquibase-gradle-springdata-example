package codes.draeger.demo.persistence

import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID
import javax.persistence.*

@Entity
@Table(name = "example")
class NzDocument(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "name", nullable = false, unique = true)
    var name: String,

    @Column(name = "age", nullable = false)
    val age: Int,


)

interface ExampleRepository: JpaRepository<NzDocument, String>

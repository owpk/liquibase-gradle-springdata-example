package codes.draeger.demo.persistence

import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "nz_people")
class NzPeople {
}

interface NzPeopleRepository: JpaRepository<NzPeople, Long>

package kodlama.kodlama.Io.Devs1.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.kodlama.Io.Devs1.entities.concretes.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Integer> {

}

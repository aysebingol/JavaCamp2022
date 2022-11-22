package kodlama.kodlama.Io.Devs1.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.kodlama.Io.Devs1.entities.concretes.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer> {

}

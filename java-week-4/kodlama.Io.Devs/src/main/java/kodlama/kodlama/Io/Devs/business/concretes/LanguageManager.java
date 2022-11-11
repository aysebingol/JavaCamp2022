package kodlama.kodlama.Io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.kodlama.Io.Devs.business.abstracts.LanguageService;
import kodlama.kodlama.Io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.kodlama.Io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	
	
	LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public void add(Language language) throws Exception {
		for (Language languageLanguages : this.languageRepository.getAll()) {
			if(language.getName() == languageLanguages.getName()) {
				throw new Exception("kurs mevcut");
			}else if (language.getName() == null) {
				throw new Exception("isim boş geçilemez");
			}
		}
	}

	@Override
	public void delete(int id) throws Exception {
		languageRepository.delete(id);
	}

	@Override
	public void update(Language language,int id) throws Exception {
		for (Language languageLanguages : this.languageRepository.getAll()) {
			if (language.getName() == languageLanguages.getName()) {
				throw new Exception("kurs mevcut");				
			}else if (language.getName() == null) {
				throw new Exception("isim boş geçilemez");
			}
		}
	}

	@Override
	public Language getById(int id) throws Exception {
		return languageRepository.getById(id);
	}
}

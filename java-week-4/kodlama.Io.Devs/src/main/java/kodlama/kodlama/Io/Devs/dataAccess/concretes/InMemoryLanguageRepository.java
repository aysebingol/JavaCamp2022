package kodlama.kodlama.Io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.kodlama.Io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.kodlama.Io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{

	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1,"C#"));
		languages.add(new Language(1,"Java"));
		languages.add(new Language(1,"Python"));
	}


	@Override
	public List<Language> getAll() {
		return languages;
	}


	@Override
	public void add(Language language) {
		 languages.add(language);
	}


	@Override
	public void delete(int id) {
		for(Language language : languages) {
			if(language.getId() == id) {
				languages.remove(language);
			}
		}
	}


	@Override
	public void update(int id,String nameN) {
		for(Language language : languages) {
			if(language.getId() == id) {
				language.setName(nameN);
			}
		}
	}


	@Override
	public Language getById(int id) {
		Language lang = null;
		for (Language langu : languages) {
			if(langu.getId() == id) {
				lang = langu;
			}
		}		
		return lang;
	}


}

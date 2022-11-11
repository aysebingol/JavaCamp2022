package kodlama.kodlama.Io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.kodlama.Io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	public void add(Language language);
	public void delete(int id);
	public void update(int id,String nameN);
	Language getById(int id);
	List<Language> getAll();
}

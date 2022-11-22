package kodlama.kodlama.Io.Devs1.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.kodlama.Io.Devs1.business.abstracts.LanguageService;
import kodlama.kodlama.Io.Devs1.business.requests.languageRequests.CreateLanguageRequest;
import kodlama.kodlama.Io.Devs1.business.requests.languageRequests.DeleteLanguageRequest;
import kodlama.kodlama.Io.Devs1.business.requests.languageRequests.UpdateLanguageRequest;
import kodlama.kodlama.Io.Devs1.business.responses.languageResponses.GetAllLanguagesResponse;
import kodlama.kodlama.Io.Devs1.business.responses.languageResponses.GetByIdLanguagesResponse;
import kodlama.kodlama.Io.Devs1.dataAccess.abstracts.LanguageRepository;
import kodlama.kodlama.Io.Devs1.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllLanguagesResponse> getAll() {
		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguagesResponse> languagesResponse = new ArrayList<GetAllLanguagesResponse>();

		for (Language language : languages) {
			GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();
			responseItem.setLanguageId(language.getLanguageId());
			responseItem.setLanguageName(language.getLanguageName());
			languagesResponse.add(responseItem);
		}

		return languagesResponse;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		Language language = new Language();
		language.setLanguageName(createLanguageRequest.getLanguageName());

		if (language.getLanguageName() == "") {
			throw new Exception("programlama dili boş geçilemez");
		}

		for (Language language2 : languageRepository.findAll()) {
			if (language2.getLanguageName().equals(language.getLanguageName())) {
				throw new Exception("mevcut,farklı bir programlama dili giriniz");
			}
		}
		for (Language language2 : languageRepository.findAll()) {
			if (language2.getLanguageId() == language.getLanguageId()) {
				throw new Exception("id mevcut,farklı ekleyiniz");
			}
		}
		this.languageRepository.save(language);
	}

	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) throws Exception {
		Language language = languageRepository.findById(deleteLanguageRequest.getLanguageId()).get();
		languageRepository.delete(language);
	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) throws Exception {
		if (updateLanguageRequest.getLanguageName().isEmpty() || (updateLanguageRequest.getLanguageId() == ' ')) {
			throw new Exception("programlama ad ve id boş bırakılamaz");
		}
		for (Language language2 : languageRepository.findAll()) {
			if (updateLanguageRequest.getLanguageName().equals(language2.getLanguageName())) {
				throw new Exception("mevcut,farklı giriniz");
			}
		}
		for (Language language2 : languageRepository.findAll()) {
			if (updateLanguageRequest.getLanguageId() != language2.getLanguageId()) {
				if (updateLanguageRequest.getLanguageName().equals(language2.getLanguageName()))
					throw new Exception("programlama dili bulunamadı");
			}
		}

		Language language = languageRepository.findById(updateLanguageRequest.getLanguageId()).get();
		language.setLanguageId(updateLanguageRequest.getLanguageId());
		language.setLanguageName(updateLanguageRequest.getLanguageName());
		this.languageRepository.save(language);

	}

	@Override
	public GetByIdLanguagesResponse getById(int language_id) throws Exception {
		List<Language> languages = this.languageRepository.findAll();
		GetByIdLanguagesResponse getIdResponse = new GetByIdLanguagesResponse();

		for (Language language : languages) {

			if (language.getLanguageId() == language_id) {
				getIdResponse.setLanguageId(language.getLanguageId());
				getIdResponse.setLanguageName(language.getLanguageName());
			}
		}
		return getIdResponse;
	}

}

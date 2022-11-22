package kodlama.kodlama.Io.Devs1.business.abstracts;

import java.util.List;

import kodlama.kodlama.Io.Devs1.business.requests.languageRequests.CreateLanguageRequest;
import kodlama.kodlama.Io.Devs1.business.requests.languageRequests.DeleteLanguageRequest;
import kodlama.kodlama.Io.Devs1.business.requests.languageRequests.UpdateLanguageRequest;
import kodlama.kodlama.Io.Devs1.business.responses.languageResponses.GetAllLanguagesResponse;
import kodlama.kodlama.Io.Devs1.business.responses.languageResponses.GetByIdLanguagesResponse;

public interface LanguageService {
	List<GetAllLanguagesResponse> getAll();

	public void add(CreateLanguageRequest createLanguageRequest) throws Exception;

	public void delete(DeleteLanguageRequest deleteLanguageRequest) throws Exception;

	public void update(UpdateLanguageRequest updateLanguageRequest) throws Exception;

	GetByIdLanguagesResponse getById(int language_id) throws Exception;
}

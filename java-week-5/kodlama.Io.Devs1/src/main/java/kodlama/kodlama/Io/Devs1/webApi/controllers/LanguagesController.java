package kodlama.kodlama.Io.Devs1.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlama.kodlama.Io.Devs1.business.abstracts.LanguageService;
import kodlama.kodlama.Io.Devs1.business.requests.languageRequests.CreateLanguageRequest;
import kodlama.kodlama.Io.Devs1.business.requests.languageRequests.DeleteLanguageRequest;
import kodlama.kodlama.Io.Devs1.business.requests.languageRequests.UpdateLanguageRequest;
import kodlama.kodlama.Io.Devs1.business.responses.languageResponses.GetAllLanguagesResponse;
import kodlama.kodlama.Io.Devs1.business.responses.languageResponses.GetByIdLanguagesResponse;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<GetAllLanguagesResponse> getAll() {
		return this.languageService.getAll();
	}

	@PostMapping("/add")
	public void add(@RequestBody CreateLanguageRequest createLanguageRequest) throws Exception {
		this.languageService.add(createLanguageRequest);
	}

	@DeleteMapping("/delete")
	public void delete(@RequestBody() DeleteLanguageRequest deleteLanguageRequest) throws Exception {
		this.languageService.delete(deleteLanguageRequest);
	}

	@PutMapping("/update")
	public void update(@RequestBody UpdateLanguageRequest updateLanguageRequest) throws Exception {
		this.languageService.update(updateLanguageRequest);
	}

	@GetMapping("/getbyid")
	public GetByIdLanguagesResponse getById(int language_id) throws Exception {
		return this.languageService.getById(language_id);
	}

}

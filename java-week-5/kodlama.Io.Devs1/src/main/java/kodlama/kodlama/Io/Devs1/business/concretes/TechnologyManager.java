package kodlama.kodlama.Io.Devs1.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.kodlama.Io.Devs1.business.abstracts.TechnologyService;
import kodlama.kodlama.Io.Devs1.business.requests.technologyRequests.CreateTechnologyRequest;
import kodlama.kodlama.Io.Devs1.business.requests.technologyRequests.DeleteTechnologyRequest;
import kodlama.kodlama.Io.Devs1.business.requests.technologyRequests.UpdateTechnologyRequest;
import kodlama.kodlama.Io.Devs1.business.responses.technologyResponses.GetAllTechnologiesResponse;
import kodlama.kodlama.Io.Devs1.business.responses.technologyResponses.GetByIdTechnologiesResponse;
import kodlama.kodlama.Io.Devs1.dataAccess.abstracts.LanguageRepository;
import kodlama.kodlama.Io.Devs1.dataAccess.abstracts.TechnologyRepository;
import kodlama.kodlama.Io.Devs1.entities.concretes.Language;
import kodlama.kodlama.Io.Devs1.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {
	private TechnologyRepository technologyRepository;
	private LanguageRepository languageRepository;

	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository, LanguageRepository languageRepository) {
		this.technologyRepository = technologyRepository;
		this.languageRepository = languageRepository;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		List<Technology> technologies = technologyRepository.findAll();
		for (Technology technology : technologies) {
			if (createTechnologyRequest.getTechnologyName().equals(technology.getTechnologyName())) {
				throw new Exception("alt teknoloji mevcut,farklı giriniz");
			}
		}

		if (createTechnologyRequest.getTechnologyName() == "") {
			throw new Exception("Programlama dili alt teknoloji boş bırakılamaz");
		}
		Technology technology = new Technology();
		Language language = this.languageRepository.findById(createTechnologyRequest.getLanguageId()).get();
		technology.setTechnologyName(createTechnologyRequest.getTechnologyName());
		technology.setLanguage(language);

		this.technologyRepository.save(technology);
	}

	@Override
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception {
		Technology technology = technologyRepository.findById(deleteTechnologyRequest.getTechnologyId()).get();
		technologyRepository.delete(technology);
	}

	@Override
	public void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
		if (updateTechnologyRequest.getTechnologyName().isEmpty()
				|| (updateTechnologyRequest.getTechnologyId() == ' ')) {

			throw new Exception("programlama alt teknoloji ad ve id boş bırakılamaz");
		}

		for (Technology programmingtechnology : technologyRepository.findAll()) {
			if (updateTechnologyRequest.getTechnologyName().equals(programmingtechnology.getTechnologyName())) {
				throw new Exception("Programlama dili alt teknoloji mevcut,farklı giriniz");
			}
		}

		for (Technology programmingtechnology : technologyRepository.findAll()) {
			if (updateTechnologyRequest.getTechnologyId() != programmingtechnology.getTechnologyId()) {
				if (updateTechnologyRequest.getTechnologyName().equals(programmingtechnology.getTechnologyName())) {
					throw new Exception("Programlama dili alt teknoloji bulunamadı");
				}
			}
		}

		Technology technology = this.technologyRepository.findById(updateTechnologyRequest.getTechnologyId()).get();
		Language language = this.languageRepository.findById(updateTechnologyRequest.getLanguageId()).get();
		technology.setTechnologyName(updateTechnologyRequest.getTechnologyName());
		technology.setLanguage(language);
		this.technologyRepository.save(technology);
	}

	@Override
	public GetByIdTechnologiesResponse getById(int technology_id) throws Exception {
		List<Technology> technologies = this.technologyRepository.findAll();
		GetByIdTechnologiesResponse getByIdTechnologiesResponse = new GetByIdTechnologiesResponse();

		for (Technology technology : technologies) {
			if (technology.getTechnologyId() == technology_id) {
				getByIdTechnologiesResponse.setLanguageId(technology.getLanguage().getLanguageId());
				getByIdTechnologiesResponse.setLanguageName(technology.getLanguage().getLanguageName());
				getByIdTechnologiesResponse.setTechnologyId(technology.getTechnologyId());
				getByIdTechnologiesResponse.setTechnologyName(technology.getTechnologyName());

			}

		}

		return getByIdTechnologiesResponse;
	}

	@Override
	public List<GetAllTechnologiesResponse> getAll() {
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologiesResponse> technologiesResponse = new ArrayList<GetAllTechnologiesResponse>();

		for (Technology technology : technologies) {
			GetAllTechnologiesResponse responseItem = new GetAllTechnologiesResponse();
			responseItem.setLanguageId(technology.getLanguage().getLanguageId());
			responseItem.setLanguageName(technology.getLanguage().getLanguageName());
			responseItem.setTechnologyId(technology.getTechnologyId());
			responseItem.setTechnologyName(technology.getTechnologyName());
			technologiesResponse.add(responseItem);
		}
		return technologiesResponse;
	}

}

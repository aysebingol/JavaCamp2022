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
import kodlama.kodlama.Io.Devs1.business.abstracts.TechnologyService;
import kodlama.kodlama.Io.Devs1.business.requests.technologyRequests.CreateTechnologyRequest;
import kodlama.kodlama.Io.Devs1.business.requests.technologyRequests.DeleteTechnologyRequest;
import kodlama.kodlama.Io.Devs1.business.requests.technologyRequests.UpdateTechnologyRequest;
import kodlama.kodlama.Io.Devs1.business.responses.technologyResponses.GetAllTechnologiesResponse;
import kodlama.kodlama.Io.Devs1.business.responses.technologyResponses.GetByIdTechnologiesResponse;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {
	private TechnologyService technologyService;

	@Autowired
	public TechnologiesController(TechnologyService technologyService) {
		this.technologyService = technologyService;
	}

	@GetMapping("/getall")
	public List<GetAllTechnologiesResponse> getAll() {
		return this.technologyService.getAll();
	}

	@PostMapping("/add")
	public void add(@RequestBody CreateTechnologyRequest createTechnologyRequest) throws Exception {
		this.technologyService.add(createTechnologyRequest);
	}

	@DeleteMapping("/delete")
	public void delete(@RequestBody() DeleteTechnologyRequest deleteTechnologyRequest) throws Exception {
		this.technologyService.delete(deleteTechnologyRequest);
	}

	@PutMapping("/update")
	public void update(@RequestBody UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
		this.technologyService.update(updateTechnologyRequest);
	}

	@GetMapping("/getbyid")
	public GetByIdTechnologiesResponse getById(int technology_id) throws Exception {
		return this.technologyService.getById(technology_id);
	}
}

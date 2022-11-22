package kodlama.kodlama.Io.Devs1.business.abstracts;

import java.util.List;

import kodlama.kodlama.Io.Devs1.business.requests.technologyRequests.CreateTechnologyRequest;
import kodlama.kodlama.Io.Devs1.business.requests.technologyRequests.DeleteTechnologyRequest;
import kodlama.kodlama.Io.Devs1.business.requests.technologyRequests.UpdateTechnologyRequest;
import kodlama.kodlama.Io.Devs1.business.responses.technologyResponses.GetAllTechnologiesResponse;
import kodlama.kodlama.Io.Devs1.business.responses.technologyResponses.GetByIdTechnologiesResponse;

public interface TechnologyService {
	List<GetAllTechnologiesResponse> getAll();

	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception;

	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception;

	public void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception;

	GetByIdTechnologiesResponse getById(int technology_id) throws Exception;
}

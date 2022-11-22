package kodlama.kodlama.Io.Devs1.business.requests.technologyRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UpdateTechnologyRequest {
	private int technologyId;
	private int languageId;
	private String technologyName;
}

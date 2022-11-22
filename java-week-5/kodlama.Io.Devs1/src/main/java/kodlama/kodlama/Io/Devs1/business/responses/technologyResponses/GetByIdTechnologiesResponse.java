package kodlama.kodlama.Io.Devs1.business.responses.technologyResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class GetByIdTechnologiesResponse {
	private int technologyId;
	private String technologyName;
	private int languageId;
	private String languageName;
}

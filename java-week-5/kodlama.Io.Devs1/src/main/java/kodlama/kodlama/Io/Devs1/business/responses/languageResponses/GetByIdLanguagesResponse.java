package kodlama.kodlama.Io.Devs1.business.responses.languageResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GetByIdLanguagesResponse {
	private int languageId;
	private String languageName;
}

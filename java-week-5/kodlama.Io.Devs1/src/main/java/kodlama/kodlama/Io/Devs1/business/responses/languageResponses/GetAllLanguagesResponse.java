package kodlama.kodlama.Io.Devs1.business.responses.languageResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GetAllLanguagesResponse {
	private int languageId;
	private String languageName;
}

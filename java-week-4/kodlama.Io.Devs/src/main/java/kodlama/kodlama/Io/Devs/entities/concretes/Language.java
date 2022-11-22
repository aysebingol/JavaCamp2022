package kodlama.kodlama.Io.Devs.entities.concretes;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="languages")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data

public class Language {
	private int id;
	private String name;
	

}

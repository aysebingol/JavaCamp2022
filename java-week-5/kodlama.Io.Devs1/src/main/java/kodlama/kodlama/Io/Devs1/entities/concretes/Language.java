package kodlama.kodlama.Io.Devs1.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "languages")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Language {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int languageId;

	@Column(name = "languageName")
	private String languageName;

	@OneToMany(mappedBy = "language")
	private List<Technology> technologies;

}
package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the personas database table.
 * 
 */
@Entity
@Table(name="personas")
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="pers_id_persona")
	private Integer persIdPersona;

	@Column(name="pers_apellido")
	private String persApellido;

	@Column(name="pers_ci")
	private Integer persCi;

	@Temporal(TemporalType.DATE)
	@Column(name="pers_fecha_nacimiento")
	private Date persFechaNacimiento;

	@Column(name="pers_nombre")
	private String persNombre;

	@Column(name="pers_sexo")
	private Integer persSexo;

	//bi-directional many-to-one association to Funcionario
	@OneToMany(mappedBy="persona")
	private List<Funcionario> funcionarios;

	public Persona() {
	}

	public Integer getPersIdPersona() {
		return this.persIdPersona;
	}

	public void setPersIdPersona(Integer persIdPersona) {
		this.persIdPersona = persIdPersona;
	}

	public String getPersApellido() {
		return this.persApellido;
	}

	public void setPersApellido(String persApellido) {
		this.persApellido = persApellido;
	}

	public Integer getPersCi() {
		return this.persCi;
	}

	public void setPersCi(Integer persCi) {
		this.persCi = persCi;
	}

	public Date getPersFechaNacimiento() {
		return this.persFechaNacimiento;
	}

	public void setPersFechaNacimiento(Date persFechaNacimiento) {
		this.persFechaNacimiento = persFechaNacimiento;
	}

	public String getPersNombre() {
		return this.persNombre;
	}

	public void setPersNombre(String persNombre) {
		this.persNombre = persNombre;
	}

	public Integer getPersSexo() {
		return this.persSexo;
	}

	public void setPersSexo(Integer persSexo) {
		this.persSexo = persSexo;
	}

	public List<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Funcionario addFuncionario(Funcionario funcionario) {
		getFuncionarios().add(funcionario);
		funcionario.setPersona(this);

		return funcionario;
	}

	public Funcionario removeFuncionario(Funcionario funcionario) {
		getFuncionarios().remove(funcionario);
		funcionario.setPersona(null);

		return funcionario;
	}

}
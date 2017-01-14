package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the funcionarios database table.
 * 
 */
@Entity
@Table(name="funcionarios")
@NamedQuery(name="Funcionario.findAll", query="SELECT f FROM Funcionario f")
public class Funcionario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="func_id_funcionario")
	private Integer funcIdFuncionario;

	@Column(name="func_area")
	private String funcArea;

	@Column(name="func_cargo")
	private String funcCargo;

	@Column(name="func_estado")
	private Boolean funcEstado;

	//bi-directional many-to-one association to CambiosPieza
	@OneToMany(mappedBy="funcionario")
	private List<CambioPieza> cambioPiezas;

	//bi-directional many-to-one association to Contrato
	@OneToMany(mappedBy="funcionario")
	private List<Contrato> contratos;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="func_id_persona")
	private Persona persona;

	//bi-directional many-to-one association to Mantenimiento
	@OneToMany(mappedBy="funcionario")
	private List<Mantenimiento> mantenimientos;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="funcionario")
	private List<Usuario> usuarios;

	public Funcionario() {
	}

	public Integer getFuncIdFuncionario() {
		return this.funcIdFuncionario;
	}

	public void setFuncIdFuncionario(Integer funcIdFuncionario) {
		this.funcIdFuncionario = funcIdFuncionario;
	}

	public String getFuncArea() {
		return this.funcArea;
	}

	public void setFuncArea(String funcArea) {
		this.funcArea = funcArea;
	}

	public String getFuncCargo() {
		return this.funcCargo;
	}

	public void setFuncCargo(String funcCargo) {
		this.funcCargo = funcCargo;
	}

	public Boolean getFuncEstado() {
		return this.funcEstado;
	}

	public void setFuncEstado(Boolean funcEstado) {
		this.funcEstado = funcEstado;
	}

	public List<CambioPieza> getCambiosPiezas() {
		return this.cambioPiezas;
	}

	public void setCambiosPiezas(List<CambioPieza> cambioPiezas) {
		this.cambioPiezas = cambioPiezas;
	}

	public CambioPieza addCambiosPieza(CambioPieza cambioPieza) {
		getCambiosPiezas().add(cambioPieza);
		cambioPieza.setFuncionario(this);

		return cambioPieza;
	}

	public CambioPieza removeCambiosPieza(CambioPieza cambioPieza) {
		getCambiosPiezas().remove(cambioPieza);
		cambioPieza.setFuncionario(null);

		return cambioPieza;
	}

	public List<Contrato> getContratos() {
		return this.contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}

	public Contrato addContrato(Contrato contrato) {
		getContratos().add(contrato);
		contrato.setFuncionario(this);

		return contrato;
	}

	public Contrato removeContrato(Contrato contrato) {
		getContratos().remove(contrato);
		contrato.setFuncionario(null);

		return contrato;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Mantenimiento> getMantenimientos() {
		return this.mantenimientos;
	}

	public void setMantenimientos(List<Mantenimiento> mantenimientos) {
		this.mantenimientos = mantenimientos;
	}

	public Mantenimiento addMantenimiento(Mantenimiento mantenimiento) {
		getMantenimientos().add(mantenimiento);
		mantenimiento.setFuncionario(this);

		return mantenimiento;
	}

	public Mantenimiento removeMantenimiento(Mantenimiento mantenimiento) {
		getMantenimientos().remove(mantenimiento);
		mantenimiento.setFuncionario(null);

		return mantenimiento;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setFuncionario(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setFuncionario(null);

		return usuario;
	}

}
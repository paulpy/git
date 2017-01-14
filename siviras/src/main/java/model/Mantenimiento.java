package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the mantenimientos database table.
 * 
 */
@Entity
@Table(name="mantenimientos")
@NamedQuery(name="Mantenimiento.findAll", query="SELECT m FROM Mantenimiento m")
public class Mantenimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="mant_id_mantenimiento")
	private Integer mantIdMantenimiento;

	@Column(name="mant_fecha_hora")
	private Timestamp mantFechaHora;

	@Column(name="mant_observacion")
	private String mantObservacion;

	//bi-directional many-to-one association to Contrato
	@ManyToOne
	@JoinColumn(name="mant_id_contrato")
	private Contrato contrato;

	//bi-directional many-to-one association to Dependencia
	@ManyToOne
	@JoinColumn(name="mant_id_dependencia")
	private Dependencia dependencia;

	//bi-directional many-to-one association to Funcionario
	@ManyToOne
	@JoinColumn(name="mant_id_funcionario")
	private Funcionario funcionario;

	public Mantenimiento() {
	}

	public Integer getMantIdMantenimiento() {
		return this.mantIdMantenimiento;
	}

	public void setMantIdMantenimiento(Integer mantIdMantenimiento) {
		this.mantIdMantenimiento = mantIdMantenimiento;
	}

	public Timestamp getMantFechaHora() {
		return this.mantFechaHora;
	}

	public void setMantFechaHora(Timestamp mantFechaHora) {
		this.mantFechaHora = mantFechaHora;
	}

	public String getMantObservacion() {
		return this.mantObservacion;
	}

	public void setMantObservacion(String mantObservacion) {
		this.mantObservacion = mantObservacion;
	}

	public Contrato getContrato() {
		return this.contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public Dependencia getDependencia() {
		return this.dependencia;
	}

	public void setDependencia(Dependencia dependencia) {
		this.dependencia = dependencia;
	}

	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
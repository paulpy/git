package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the dependencias database table.
 * 
 */
@Entity
@Table(name="dependencias")
@NamedQuery(name="Dependencia.findAll", query="SELECT d FROM Dependencia d")
public class Dependencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="depe_id_dependencia")
	private Integer depeIdDependencia;

	@Column(name="depe_estado")
	private Boolean depeEstado;

	@Column(name="depe_nombre_dependencia")
	private String depeNombreDependencia;

	//bi-directional many-to-one association to Direccione
	@ManyToOne
	@JoinColumn(name="depe_id_direccion")
	private Direccion direccion;

	//bi-directional many-to-one association to Entidade
	@ManyToOne
	@JoinColumn(name="depe_id_entidad")
	private Entidad entidad;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="depe_id_reloj_10")
	private Equipo equipo1;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="depe_id_reloj_11")
	private Equipo equipo2;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="depe_id_reloj_12")
	private Equipo equipo3;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="depe_id_reloj_1")
	private Equipo equipo4;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="depe_id_reloj_2")
	private Equipo equipo5;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="depe_id_reloj_3")
	private Equipo equipo6;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="depe_id_reloj_4")
	private Equipo equipo7;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="depe_id_reloj_5")
	private Equipo equipo8;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="depe_id_reloj_6")
	private Equipo equipo9;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="depe_id_reloj_7")
	private Equipo equipo10;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="depe_id_reloj_8")
	private Equipo equipo11;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="depe_id_reloj_9")
	private Equipo equipo12;

	//bi-directional many-to-one association to Mantenimiento
	@OneToMany(mappedBy="dependencia")
	private List<Mantenimiento> mantenimientos;

	public Dependencia() {
	}

	public Integer getDepeIdDependencia() {
		return this.depeIdDependencia;
	}

	public void setDepeIdDependencia(Integer depeIdDependencia) {
		this.depeIdDependencia = depeIdDependencia;
	}

	public Boolean getDepeEstado() {
		return this.depeEstado;
	}

	public void setDepeEstado(Boolean depeEstado) {
		this.depeEstado = depeEstado;
	}

	public String getDepeNombreDependencia() {
		return this.depeNombreDependencia;
	}

	public void setDepeNombreDependencia(String depeNombreDependencia) {
		this.depeNombreDependencia = depeNombreDependencia;
	}

	public Direccion getDireccione() {
		return this.direccion;
	}

	public void setDireccione(Direccion direccion) {
		this.direccion = direccion;
	}

	public Entidad getEntidade() {
		return this.entidad;
	}

	public void setEntidade(Entidad entidad) {
		this.entidad = entidad;
	}

	public Equipo getEquipo1() {
		return this.equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return this.equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	public Equipo getEquipo3() {
		return this.equipo3;
	}

	public void setEquipo3(Equipo equipo3) {
		this.equipo3 = equipo3;
	}

	public Equipo getEquipo4() {
		return this.equipo4;
	}

	public void setEquipo4(Equipo equipo4) {
		this.equipo4 = equipo4;
	}

	public Equipo getEquipo5() {
		return this.equipo5;
	}

	public void setEquipo5(Equipo equipo5) {
		this.equipo5 = equipo5;
	}

	public Equipo getEquipo6() {
		return this.equipo6;
	}

	public void setEquipo6(Equipo equipo6) {
		this.equipo6 = equipo6;
	}

	public Equipo getEquipo7() {
		return this.equipo7;
	}

	public void setEquipo7(Equipo equipo7) {
		this.equipo7 = equipo7;
	}

	public Equipo getEquipo8() {
		return this.equipo8;
	}

	public void setEquipo8(Equipo equipo8) {
		this.equipo8 = equipo8;
	}

	public Equipo getEquipo9() {
		return this.equipo9;
	}

	public void setEquipo9(Equipo equipo9) {
		this.equipo9 = equipo9;
	}

	public Equipo getEquipo10() {
		return this.equipo10;
	}

	public void setEquipo10(Equipo equipo10) {
		this.equipo10 = equipo10;
	}

	public Equipo getEquipo11() {
		return this.equipo11;
	}

	public void setEquipo11(Equipo equipo11) {
		this.equipo11 = equipo11;
	}

	public Equipo getEquipo12() {
		return this.equipo12;
	}

	public void setEquipo12(Equipo equipo12) {
		this.equipo12 = equipo12;
	}

	public List<Mantenimiento> getMantenimientos() {
		return this.mantenimientos;
	}

	public void setMantenimientos(List<Mantenimiento> mantenimientos) {
		this.mantenimientos = mantenimientos;
	}

	public Mantenimiento addMantenimiento(Mantenimiento mantenimiento) {
		getMantenimientos().add(mantenimiento);
		mantenimiento.setDependencia(this);

		return mantenimiento;
	}

	public Mantenimiento removeMantenimiento(Mantenimiento mantenimiento) {
		getMantenimientos().remove(mantenimiento);
		mantenimiento.setDependencia(null);

		return mantenimiento;
	}

}
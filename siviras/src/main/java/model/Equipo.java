package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the equipos database table.
 * 
 */
@Entity
@Table(name="equipos")
@NamedQuery(name="Equipo.findAll", query="SELECT e FROM Equipo e")
public class Equipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="equi_id_equipo")
	private Integer equiIdEquipo;

	@Column(name="equi_activo")
	private Boolean equiActivo;

	@Temporal(TemporalType.DATE)
	@Column(name="equi_fecha_ingreso")
	private Date equiFechaIngreso;

	@Column(name="equi_serie_equipo")
	private String equiSerieEquipo;

	//bi-directional many-to-one association to CambiosPieza
	@OneToMany(mappedBy="equipo")
	private List<CambioPieza> cambioPiezas;

	//bi-directional many-to-one association to Dependencia
	@OneToMany(mappedBy="equipo1")
	private List<Dependencia> dependencias1;

	//bi-directional many-to-one association to Dependencia
	@OneToMany(mappedBy="equipo2")
	private List<Dependencia> dependencias2;

	//bi-directional many-to-one association to Dependencia
	@OneToMany(mappedBy="equipo3")
	private List<Dependencia> dependencias3;

	//bi-directional many-to-one association to Dependencia
	@OneToMany(mappedBy="equipo4")
	private List<Dependencia> dependencias4;

	//bi-directional many-to-one association to Dependencia
	@OneToMany(mappedBy="equipo5")
	private List<Dependencia> dependencias5;

	//bi-directional many-to-one association to Dependencia
	@OneToMany(mappedBy="equipo6")
	private List<Dependencia> dependencias6;

	//bi-directional many-to-one association to Dependencia
	@OneToMany(mappedBy="equipo7")
	private List<Dependencia> dependencias7;

	//bi-directional many-to-one association to Dependencia
	@OneToMany(mappedBy="equipo8")
	private List<Dependencia> dependencias8;

	//bi-directional many-to-one association to Dependencia
	@OneToMany(mappedBy="equipo9")
	private List<Dependencia> dependencias9;

	//bi-directional many-to-one association to Dependencia
	@OneToMany(mappedBy="equipo10")
	private List<Dependencia> dependencias10;

	//bi-directional many-to-one association to Dependencia
	@OneToMany(mappedBy="equipo11")
	private List<Dependencia> dependencias11;

	//bi-directional many-to-one association to Dependencia
	@OneToMany(mappedBy="equipo12")
	private List<Dependencia> dependencias12;

	//bi-directional many-to-one association to Raspberry
	@ManyToOne
	@JoinColumn(name="equi_id_raspberry")
	private Raspberry raspberry;

	//bi-directional many-to-one association to HistoricoEquiposEstado
	@OneToMany(mappedBy="equipo")
	private List<HistoricoEquipoEstado> historicoEquipoEstados;

	public Equipo() {
	}

	public Integer getEquiIdEquipo() {
		return this.equiIdEquipo;
	}

	public void setEquiIdEquipo(Integer equiIdEquipo) {
		this.equiIdEquipo = equiIdEquipo;
	}

	public Boolean getEquiActivo() {
		return this.equiActivo;
	}

	public void setEquiActivo(Boolean equiActivo) {
		this.equiActivo = equiActivo;
	}

	public Date getEquiFechaIngreso() {
		return this.equiFechaIngreso;
	}

	public void setEquiFechaIngreso(Date equiFechaIngreso) {
		this.equiFechaIngreso = equiFechaIngreso;
	}

	public String getEquiSerieEquipo() {
		return this.equiSerieEquipo;
	}

	public void setEquiSerieEquipo(String equiSerieEquipo) {
		this.equiSerieEquipo = equiSerieEquipo;
	}

	public List<CambioPieza> getCambiosPiezas() {
		return this.cambioPiezas;
	}

	public void setCambiosPiezas(List<CambioPieza> cambioPiezas) {
		this.cambioPiezas = cambioPiezas;
	}

	public CambioPieza addCambiosPieza(CambioPieza cambioPieza) {
		getCambiosPiezas().add(cambioPieza);
		cambioPieza.setEquipo(this);

		return cambioPieza;
	}

	public CambioPieza removeCambiosPieza(CambioPieza cambioPieza) {
		getCambiosPiezas().remove(cambioPieza);
		cambioPieza.setEquipo(null);

		return cambioPieza;
	}

	public List<Dependencia> getDependencias1() {
		return this.dependencias1;
	}

	public void setDependencias1(List<Dependencia> dependencias1) {
		this.dependencias1 = dependencias1;
	}

	public Dependencia addDependencias1(Dependencia dependencias1) {
		getDependencias1().add(dependencias1);
		dependencias1.setEquipo1(this);

		return dependencias1;
	}

	public Dependencia removeDependencias1(Dependencia dependencias1) {
		getDependencias1().remove(dependencias1);
		dependencias1.setEquipo1(null);

		return dependencias1;
	}

	public List<Dependencia> getDependencias2() {
		return this.dependencias2;
	}

	public void setDependencias2(List<Dependencia> dependencias2) {
		this.dependencias2 = dependencias2;
	}

	public Dependencia addDependencias2(Dependencia dependencias2) {
		getDependencias2().add(dependencias2);
		dependencias2.setEquipo2(this);

		return dependencias2;
	}

	public Dependencia removeDependencias2(Dependencia dependencias2) {
		getDependencias2().remove(dependencias2);
		dependencias2.setEquipo2(null);

		return dependencias2;
	}

	public List<Dependencia> getDependencias3() {
		return this.dependencias3;
	}

	public void setDependencias3(List<Dependencia> dependencias3) {
		this.dependencias3 = dependencias3;
	}

	public Dependencia addDependencias3(Dependencia dependencias3) {
		getDependencias3().add(dependencias3);
		dependencias3.setEquipo3(this);

		return dependencias3;
	}

	public Dependencia removeDependencias3(Dependencia dependencias3) {
		getDependencias3().remove(dependencias3);
		dependencias3.setEquipo3(null);

		return dependencias3;
	}

	public List<Dependencia> getDependencias4() {
		return this.dependencias4;
	}

	public void setDependencias4(List<Dependencia> dependencias4) {
		this.dependencias4 = dependencias4;
	}

	public Dependencia addDependencias4(Dependencia dependencias4) {
		getDependencias4().add(dependencias4);
		dependencias4.setEquipo4(this);

		return dependencias4;
	}

	public Dependencia removeDependencias4(Dependencia dependencias4) {
		getDependencias4().remove(dependencias4);
		dependencias4.setEquipo4(null);

		return dependencias4;
	}

	public List<Dependencia> getDependencias5() {
		return this.dependencias5;
	}

	public void setDependencias5(List<Dependencia> dependencias5) {
		this.dependencias5 = dependencias5;
	}

	public Dependencia addDependencias5(Dependencia dependencias5) {
		getDependencias5().add(dependencias5);
		dependencias5.setEquipo5(this);

		return dependencias5;
	}

	public Dependencia removeDependencias5(Dependencia dependencias5) {
		getDependencias5().remove(dependencias5);
		dependencias5.setEquipo5(null);

		return dependencias5;
	}

	public List<Dependencia> getDependencias6() {
		return this.dependencias6;
	}

	public void setDependencias6(List<Dependencia> dependencias6) {
		this.dependencias6 = dependencias6;
	}

	public Dependencia addDependencias6(Dependencia dependencias6) {
		getDependencias6().add(dependencias6);
		dependencias6.setEquipo6(this);

		return dependencias6;
	}

	public Dependencia removeDependencias6(Dependencia dependencias6) {
		getDependencias6().remove(dependencias6);
		dependencias6.setEquipo6(null);

		return dependencias6;
	}

	public List<Dependencia> getDependencias7() {
		return this.dependencias7;
	}

	public void setDependencias7(List<Dependencia> dependencias7) {
		this.dependencias7 = dependencias7;
	}

	public Dependencia addDependencias7(Dependencia dependencias7) {
		getDependencias7().add(dependencias7);
		dependencias7.setEquipo7(this);

		return dependencias7;
	}

	public Dependencia removeDependencias7(Dependencia dependencias7) {
		getDependencias7().remove(dependencias7);
		dependencias7.setEquipo7(null);

		return dependencias7;
	}

	public List<Dependencia> getDependencias8() {
		return this.dependencias8;
	}

	public void setDependencias8(List<Dependencia> dependencias8) {
		this.dependencias8 = dependencias8;
	}

	public Dependencia addDependencias8(Dependencia dependencias8) {
		getDependencias8().add(dependencias8);
		dependencias8.setEquipo8(this);

		return dependencias8;
	}

	public Dependencia removeDependencias8(Dependencia dependencias8) {
		getDependencias8().remove(dependencias8);
		dependencias8.setEquipo8(null);

		return dependencias8;
	}

	public List<Dependencia> getDependencias9() {
		return this.dependencias9;
	}

	public void setDependencias9(List<Dependencia> dependencias9) {
		this.dependencias9 = dependencias9;
	}

	public Dependencia addDependencias9(Dependencia dependencias9) {
		getDependencias9().add(dependencias9);
		dependencias9.setEquipo9(this);

		return dependencias9;
	}

	public Dependencia removeDependencias9(Dependencia dependencias9) {
		getDependencias9().remove(dependencias9);
		dependencias9.setEquipo9(null);

		return dependencias9;
	}

	public List<Dependencia> getDependencias10() {
		return this.dependencias10;
	}

	public void setDependencias10(List<Dependencia> dependencias10) {
		this.dependencias10 = dependencias10;
	}

	public Dependencia addDependencias10(Dependencia dependencias10) {
		getDependencias10().add(dependencias10);
		dependencias10.setEquipo10(this);

		return dependencias10;
	}

	public Dependencia removeDependencias10(Dependencia dependencias10) {
		getDependencias10().remove(dependencias10);
		dependencias10.setEquipo10(null);

		return dependencias10;
	}

	public List<Dependencia> getDependencias11() {
		return this.dependencias11;
	}

	public void setDependencias11(List<Dependencia> dependencias11) {
		this.dependencias11 = dependencias11;
	}

	public Dependencia addDependencias11(Dependencia dependencias11) {
		getDependencias11().add(dependencias11);
		dependencias11.setEquipo11(this);

		return dependencias11;
	}

	public Dependencia removeDependencias11(Dependencia dependencias11) {
		getDependencias11().remove(dependencias11);
		dependencias11.setEquipo11(null);

		return dependencias11;
	}

	public List<Dependencia> getDependencias12() {
		return this.dependencias12;
	}

	public void setDependencias12(List<Dependencia> dependencias12) {
		this.dependencias12 = dependencias12;
	}

	public Dependencia addDependencias12(Dependencia dependencias12) {
		getDependencias12().add(dependencias12);
		dependencias12.setEquipo12(this);

		return dependencias12;
	}

	public Dependencia removeDependencias12(Dependencia dependencias12) {
		getDependencias12().remove(dependencias12);
		dependencias12.setEquipo12(null);

		return dependencias12;
	}

	public Raspberry getRaspberry() {
		return this.raspberry;
	}

	public void setRaspberry(Raspberry raspberry) {
		this.raspberry = raspberry;
	}

	public List<HistoricoEquipoEstado> getHistoricoEquiposEstados() {
		return this.historicoEquipoEstados;
	}

	public void setHistoricoEquiposEstados(List<HistoricoEquipoEstado> historicoEquipoEstados) {
		this.historicoEquipoEstados = historicoEquipoEstados;
	}

	public HistoricoEquipoEstado addHistoricoEquiposEstado(HistoricoEquipoEstado historicoEquipoEstado) {
		getHistoricoEquiposEstados().add(historicoEquipoEstado);
		historicoEquipoEstado.setEquipo(this);

		return historicoEquipoEstado;
	}

	public HistoricoEquipoEstado removeHistoricoEquiposEstado(HistoricoEquipoEstado historicoEquipoEstado) {
		getHistoricoEquiposEstados().remove(historicoEquipoEstado);
		historicoEquipoEstado.setEquipo(null);

		return historicoEquipoEstado;
	}

}
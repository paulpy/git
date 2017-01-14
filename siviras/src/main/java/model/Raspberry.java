package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the raspberrys database table.
 * 
 */
@Entity
@Table(name="raspberrys")
@NamedQuery(name="Raspberry.findAll", query="SELECT r FROM Raspberry r")
public class Raspberry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="rasp_id_raspberry")
	private Integer raspIdRaspberry;

	@Temporal(TemporalType.DATE)
	@Column(name="rasp_fecha_ingreso")
	private Date raspFechaIngreso;

	@Column(name="rasp_ip")
	private String raspIp;

	@Column(name="rasp_nombre")
	private String raspNombre;

	//bi-directional many-to-one association to Equipo
	@OneToMany(mappedBy="raspberry")
	private List<Equipo> equipos;

	//bi-directional many-to-one association to HistoricoRaspberrysEstado
	@OneToMany(mappedBy="raspberry")
	private List<HistoricoRaspberryEstado> historicoRaspberryEstados;

	public Raspberry() {
	}

	public Integer getRaspIdRaspberry() {
		return this.raspIdRaspberry;
	}

	public void setRaspIdRaspberry(Integer raspIdRaspberry) {
		this.raspIdRaspberry = raspIdRaspberry;
	}

	public Date getRaspFechaIngreso() {
		return this.raspFechaIngreso;
	}

	public void setRaspFechaIngreso(Date raspFechaIngreso) {
		this.raspFechaIngreso = raspFechaIngreso;
	}

	public String getRaspIp() {
		return this.raspIp;
	}

	public void setRaspIp(String raspIp) {
		this.raspIp = raspIp;
	}

	public String getRaspNombre() {
		return this.raspNombre;
	}

	public void setRaspNombre(String raspNombre) {
		this.raspNombre = raspNombre;
	}

	public List<Equipo> getEquipos() {
		return this.equipos;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}

	public Equipo addEquipo(Equipo equipo) {
		getEquipos().add(equipo);
		equipo.setRaspberry(this);

		return equipo;
	}

	public Equipo removeEquipo(Equipo equipo) {
		getEquipos().remove(equipo);
		equipo.setRaspberry(null);

		return equipo;
	}

	public List<HistoricoRaspberryEstado> getHistoricoRaspberrysEstados() {
		return this.historicoRaspberryEstados;
	}

	public void setHistoricoRaspberrysEstados(List<HistoricoRaspberryEstado> historicoRaspberryEstados) {
		this.historicoRaspberryEstados = historicoRaspberryEstados;
	}

	public HistoricoRaspberryEstado addHistoricoRaspberrysEstado(HistoricoRaspberryEstado historicoRaspberryEstado) {
		getHistoricoRaspberrysEstados().add(historicoRaspberryEstado);
		historicoRaspberryEstado.setRaspberry(this);

		return historicoRaspberryEstado;
	}

	public HistoricoRaspberryEstado removeHistoricoRaspberrysEstado(HistoricoRaspberryEstado historicoRaspberryEstado) {
		getHistoricoRaspberrysEstados().remove(historicoRaspberryEstado);
		historicoRaspberryEstado.setRaspberry(null);

		return historicoRaspberryEstado;
	}

}
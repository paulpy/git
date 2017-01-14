package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the cambios_piezas database table.
 * 
 */
@Entity
@Table(name="cambios_piezas")
@NamedQuery(name="CambioPieza.findAll", query="SELECT c FROM CambioPieza c")
public class CambioPieza implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="capi_id_cambio_pieza")
	private Integer capiIdCambioPieza;

	@Column(name="capi_fecha_cambio")
	private Timestamp capiFechaCambio;

	@Column(name="capi_observacion")
	private String capiObservacion;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="capi_id_reloj")
	private Equipo equipo;

	//bi-directional many-to-one association to Funcionario
	@ManyToOne
	@JoinColumn(name="capi_id_funcionario")
	private Funcionario funcionario;

	//bi-directional many-to-one association to Pieza
	@ManyToOne
	@JoinColumn(name="capi_id_pieza")
	private Pieza pieza;

	public CambioPieza() {
	}

	public Integer getCapiIdCambioPieza() {
		return this.capiIdCambioPieza;
	}

	public void setCapiIdCambioPieza(Integer capiIdCambioPieza) {
		this.capiIdCambioPieza = capiIdCambioPieza;
	}

	public Timestamp getCapiFechaCambio() {
		return this.capiFechaCambio;
	}

	public void setCapiFechaCambio(Timestamp capiFechaCambio) {
		this.capiFechaCambio = capiFechaCambio;
	}

	public String getCapiObservacion() {
		return this.capiObservacion;
	}

	public void setCapiObservacion(String capiObservacion) {
		this.capiObservacion = capiObservacion;
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Pieza getPieza() {
		return this.pieza;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

}
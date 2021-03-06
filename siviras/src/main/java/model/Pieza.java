package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the piezas database table.
 * 
 */
@Entity
@Table(name="piezas")
@NamedQuery(name="Pieza.findAll", query="SELECT p FROM Pieza p")
public class Pieza implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="piez_id_pieza")
	private Integer piezIdPieza;

	@Column(name="piez_cantidad")
	private Integer piezCantidad;

	@Column(name="piez_detalle")
	private String piezDetalle;

	@Column(name="piez_pieza")
	private String piezPieza;

	//bi-directional many-to-one association to CambiosPieza
	@OneToMany(mappedBy="pieza")
	private List<CambioPieza> cambioPiezas;

	public Pieza() {
	}

	public Integer getPiezIdPieza() {
		return this.piezIdPieza;
	}

	public void setPiezIdPieza(Integer piezIdPieza) {
		this.piezIdPieza = piezIdPieza;
	}

	public Integer getPiezCantidad() {
		return this.piezCantidad;
	}

	public void setPiezCantidad(Integer piezCantidad) {
		this.piezCantidad = piezCantidad;
	}

	public String getPiezDetalle() {
		return this.piezDetalle;
	}

	public void setPiezDetalle(String piezDetalle) {
		this.piezDetalle = piezDetalle;
	}

	public String getPiezPieza() {
		return this.piezPieza;
	}

	public void setPiezPieza(String piezPieza) {
		this.piezPieza = piezPieza;
	}

	public List<CambioPieza> getCambiosPiezas() {
		return this.cambioPiezas;
	}

	public void setCambiosPiezas(List<CambioPieza> cambioPiezas) {
		this.cambioPiezas = cambioPiezas;
	}

	public CambioPieza addCambiosPieza(CambioPieza cambioPieza) {
		getCambiosPiezas().add(cambioPieza);
		cambioPieza.setPieza(this);

		return cambioPieza;
	}

	public CambioPieza removeCambiosPieza(CambioPieza cambioPieza) {
		getCambiosPiezas().remove(cambioPieza);
		cambioPieza.setPieza(null);

		return cambioPieza;
	}

}
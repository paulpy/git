package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the historico_equipos_estados database table.
 * 
 */
@Entity
@Table(name="historico_equipos_estados")
@NamedQuery(name="HistoricoEquipoEstado.findAll", query="SELECT h FROM HistoricoEquipoEstado h")
public class HistoricoEquipoEstado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="eqes_id_historico_estado_reloj")
	private Integer eqesIdHistoricoEstadoReloj;

	@Column(name="eqes_momento_estado")
	private Timestamp eqesMomentoEstado;

	//bi-directional many-to-one association to CausaCambiosEstado
	@ManyToOne
	@JoinColumn(name="eqes_id_causa_cambio")
	private CausaCambioEstado causaCambioEstado;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="eqes_id_reloj")
	private Equipo equipo;

	//bi-directional many-to-one association to EstadosEquipo
	@ManyToOne
	@JoinColumn(name="eqes_id_estado_equipo")
	private EstadoEquipo estadoEquipo;

	public HistoricoEquipoEstado() {
	}

	public Integer getEqesIdHistoricoEstadoReloj() {
		return this.eqesIdHistoricoEstadoReloj;
	}

	public void setEqesIdHistoricoEstadoReloj(Integer eqesIdHistoricoEstadoReloj) {
		this.eqesIdHistoricoEstadoReloj = eqesIdHistoricoEstadoReloj;
	}

	public Timestamp getEqesMomentoEstado() {
		return this.eqesMomentoEstado;
	}

	public void setEqesMomentoEstado(Timestamp eqesMomentoEstado) {
		this.eqesMomentoEstado = eqesMomentoEstado;
	}

	public CausaCambioEstado getCausaCambiosEstado() {
		return this.causaCambioEstado;
	}

	public void setCausaCambiosEstado(CausaCambioEstado causaCambioEstado) {
		this.causaCambioEstado = causaCambioEstado;
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public EstadoEquipo getEstadosEquipo() {
		return this.estadoEquipo;
	}

	public void setEstadosEquipo(EstadoEquipo estadoEquipo) {
		this.estadoEquipo = estadoEquipo;
	}

}
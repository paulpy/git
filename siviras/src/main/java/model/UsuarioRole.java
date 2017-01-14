package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuario_roles database table.
 * 
 */
@Entity
@Table(name="usuario_roles")
@NamedQuery(name="UsuarioRole.findAll", query="SELECT u FROM UsuarioRole u")
public class UsuarioRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="usro_id_usuario_rol")
	private Integer usroIdUsuarioRol;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="usro_id_rol")
	private Rol rol;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usro_id_usuario")
	private Usuario usuario;

	public UsuarioRole() {
	}

	public Integer getUsroIdUsuarioRol() {
		return this.usroIdUsuarioRol;
	}

	public void setUsroIdUsuarioRol(Integer usroIdUsuarioRol) {
		this.usroIdUsuarioRol = usroIdUsuarioRol;
	}

	public Rol getRole() {
		return this.rol;
	}

	public void setRole(Rol rol) {
		this.rol = rol;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
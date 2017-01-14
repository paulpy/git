package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the roles database table.
 * 
 */
@Entity
@Table(name="roles")
@NamedQuery(name="Rol.findAll", query="SELECT r FROM Rol r")
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="role_id_rol")
	private Integer roleIdRol;

	@Column(name="role_rol")
	private String roleRol;

	//bi-directional many-to-one association to UsuarioRole
	@OneToMany(mappedBy="rol")
	private List<UsuarioRole> usuarioRoles;

	public Rol() {
	}

	public Integer getRoleIdRol() {
		return this.roleIdRol;
	}

	public void setRoleIdRol(Integer roleIdRol) {
		this.roleIdRol = roleIdRol;
	}

	public String getRoleRol() {
		return this.roleRol;
	}

	public void setRoleRol(String roleRol) {
		this.roleRol = roleRol;
	}

	public List<UsuarioRole> getUsuarioRoles() {
		return this.usuarioRoles;
	}

	public void setUsuarioRoles(List<UsuarioRole> usuarioRoles) {
		this.usuarioRoles = usuarioRoles;
	}

	public UsuarioRole addUsuarioRole(UsuarioRole usuarioRole) {
		getUsuarioRoles().add(usuarioRole);
		usuarioRole.setRole(this);

		return usuarioRole;
	}

	public UsuarioRole removeUsuarioRole(UsuarioRole usuarioRole) {
		getUsuarioRoles().remove(usuarioRole);
		usuarioRole.setRole(null);

		return usuarioRole;
	}

}
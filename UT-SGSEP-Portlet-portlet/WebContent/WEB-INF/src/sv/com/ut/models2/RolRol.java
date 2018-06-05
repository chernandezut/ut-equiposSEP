package sv.com.ut.models2;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the rol_rol database table.
 * 
 */
@Entity
@Table(name="rol_rol")
@NamedQuery(name="RolRol.findAll", query="SELECT r FROM RolRol r")
public class RolRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"rol_ codigo\"")
	private Integer rol_codigo;

	@Column(name="rol_descripcion")
	private String rolDescripcion;

	@Column(name="rol_estado")
	private String rolEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="\"rol_fechaCreacion\"")
	private Date rol_fechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="\"rol_fechaModificacion\"")
	private Date rol_fechaModificacion;

	@Column(name="\"rol_horaCreacion\"")
	private Time rol_horaCreacion;

	@Column(name="\"rol_horaModificacion\"")
	private Time rol_horaModificacion;

	@Column(name="\"rol_usuarioCreacion\"")
	private String rol_usuarioCreacion;

	public RolRol() {
	}

	public Integer getRol_codigo() {
		return this.rol_codigo;
	}

	public void setRol_codigo(Integer rol_codigo) {
		this.rol_codigo = rol_codigo;
	}

	public String getRolDescripcion() {
		return this.rolDescripcion;
	}

	public void setRolDescripcion(String rolDescripcion) {
		this.rolDescripcion = rolDescripcion;
	}

	public String getRolEstado() {
		return this.rolEstado;
	}

	public void setRolEstado(String rolEstado) {
		this.rolEstado = rolEstado;
	}

	public Date getRol_fechaCreacion() {
		return this.rol_fechaCreacion;
	}

	public void setRol_fechaCreacion(Date rol_fechaCreacion) {
		this.rol_fechaCreacion = rol_fechaCreacion;
	}

	public Date getRol_fechaModificacion() {
		return this.rol_fechaModificacion;
	}

	public void setRol_fechaModificacion(Date rol_fechaModificacion) {
		this.rol_fechaModificacion = rol_fechaModificacion;
	}

	public Time getRol_horaCreacion() {
		return this.rol_horaCreacion;
	}

	public void setRol_horaCreacion(Time rol_horaCreacion) {
		this.rol_horaCreacion = rol_horaCreacion;
	}

	public Time getRol_horaModificacion() {
		return this.rol_horaModificacion;
	}

	public void setRol_horaModificacion(Time rol_horaModificacion) {
		this.rol_horaModificacion = rol_horaModificacion;
	}

	public String getRol_usuarioCreacion() {
		return this.rol_usuarioCreacion;
	}

	public void setRol_usuarioCreacion(String rol_usuarioCreacion) {
		this.rol_usuarioCreacion = rol_usuarioCreacion;
	}

}
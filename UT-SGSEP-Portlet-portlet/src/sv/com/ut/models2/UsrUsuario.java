package sv.com.ut.models2;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the usr_usuario database table.
 * 
 */
@Entity
@Table(name="usr_usuario")
@NamedQuery(name="UsrUsuario.findAll", query="SELECT u FROM UsrUsuario u")
public class UsrUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="usr_codigo")
	private Integer usrCodigo;

	@Column(name="usr_alias")
	private String usrAlias;

	@Column(name="usr_estado")
	private String usrEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="\"usr_fechaCreacion\"")
	private Date usr_fechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="\"usr_fechaModificacion\"")
	private Date usr_fechaModificacion;

	@Column(name="\"usr_horaCreacion\"")
	private Time usr_horaCreacion;

	@Column(name="\"usr_horaModificacion\"")
	private Time usr_horaModificacion;

	@Column(name="usr_password")
	private String usrPassword;

	@Column(name="\"usr_primerApellido\"")
	private String usr_primerApellido;

	@Column(name="\"usr_primerNombre\"")
	private String usr_primerNombre;

	@Column(name="\"usr_segundoApellido\"")
	private String usr_segundoApellido;

	@Column(name="\"usr_segundoNombre\"")
	private String usr_segundoNombre;

	@Column(name="\"usr_usuarioCreacion\"")
	private String usr_usuarioCreacion;

	public UsrUsuario() {
	}

	public Integer getUsrCodigo() {
		return this.usrCodigo;
	}

	public void setUsrCodigo(Integer usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public String getUsrAlias() {
		return this.usrAlias;
	}

	public void setUsrAlias(String usrAlias) {
		this.usrAlias = usrAlias;
	}

	public String getUsrEstado() {
		return this.usrEstado;
	}

	public void setUsrEstado(String usrEstado) {
		this.usrEstado = usrEstado;
	}

	public Date getUsr_fechaCreacion() {
		return this.usr_fechaCreacion;
	}

	public void setUsr_fechaCreacion(Date usr_fechaCreacion) {
		this.usr_fechaCreacion = usr_fechaCreacion;
	}

	public Date getUsr_fechaModificacion() {
		return this.usr_fechaModificacion;
	}

	public void setUsr_fechaModificacion(Date usr_fechaModificacion) {
		this.usr_fechaModificacion = usr_fechaModificacion;
	}

	public Time getUsr_horaCreacion() {
		return this.usr_horaCreacion;
	}

	public void setUsr_horaCreacion(Time usr_horaCreacion) {
		this.usr_horaCreacion = usr_horaCreacion;
	}

	public Time getUsr_horaModificacion() {
		return this.usr_horaModificacion;
	}

	public void setUsr_horaModificacion(Time usr_horaModificacion) {
		this.usr_horaModificacion = usr_horaModificacion;
	}

	public String getUsrPassword() {
		return this.usrPassword;
	}

	public void setUsrPassword(String usrPassword) {
		this.usrPassword = usrPassword;
	}

	public String getUsr_primerApellido() {
		return this.usr_primerApellido;
	}

	public void setUsr_primerApellido(String usr_primerApellido) {
		this.usr_primerApellido = usr_primerApellido;
	}

	public String getUsr_primerNombre() {
		return this.usr_primerNombre;
	}

	public void setUsr_primerNombre(String usr_primerNombre) {
		this.usr_primerNombre = usr_primerNombre;
	}

	public String getUsr_segundoApellido() {
		return this.usr_segundoApellido;
	}

	public void setUsr_segundoApellido(String usr_segundoApellido) {
		this.usr_segundoApellido = usr_segundoApellido;
	}

	public String getUsr_segundoNombre() {
		return this.usr_segundoNombre;
	}

	public void setUsr_segundoNombre(String usr_segundoNombre) {
		this.usr_segundoNombre = usr_segundoNombre;
	}

	public String getUsr_usuarioCreacion() {
		return this.usr_usuarioCreacion;
	}

	public void setUsr_usuarioCreacion(String usr_usuarioCreacion) {
		this.usr_usuarioCreacion = usr_usuarioCreacion;
	}

}
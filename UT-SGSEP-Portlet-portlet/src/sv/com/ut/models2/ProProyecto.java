package sv.com.ut.models2;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the pro_proyecto database table.
 * 
 */
@Entity
@Table(name="pro_proyecto")
@NamedQuery(name="ProProyecto.findAll", query="SELECT p FROM ProProyecto p")
public class ProProyecto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pro_codigo")
	private Integer proCodigo;

	@Column(name="\"pro_codPm\"")
	private String pro_codPm;

	@Column(name="\"pro_codUsuarioCoordinador\"")
	private Integer pro_codUsuarioCoordinador;

	@Column(name="pro_descripcion")
	private String proDescripcion;

	@Column(name="pro_estado")
	private String proEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="\"pro_fechaCreacion\"")
	private Date pro_fechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="\"pro_fechaFinPlan\"")
	private Date pro_fechaFinPlan;

	@Temporal(TemporalType.DATE)
	@Column(name="\"pro_fechaFinReal\"")
	private Date pro_fechaFinReal;

	@Temporal(TemporalType.DATE)
	@Column(name="\"pro_fechaInicioPlan\"")
	private Date pro_fechaInicioPlan;

	@Temporal(TemporalType.DATE)
	@Column(name="\"pro_fechaInicioReal\"")
	private Date pro_fechaInicioReal;

	@Temporal(TemporalType.DATE)
	@Column(name="\"pro_fechaModificacion\"")
	private Date pro_fechaModificacion;

	@Column(name="\"pro_horaCreacion\"")
	private Time pro_horaCreacion;

	@Column(name="\"pro_horaFinPlan\"")
	private Time pro_horaFinPlan;

	@Column(name="\"pro_horaFinReal\"")
	private Time pro_horaFinReal;

	@Column(name="\"pro_horaInicioPlan\"")
	private Time pro_horaInicioPlan;

	@Column(name="\"pro_horaInicioReal\"")
	private Time pro_horaInicioReal;

	@Column(name="\"pro_horaModificacion\"")
	private Time pro_horaModificacion;

	@Column(name="\"pro_usuarioCreador\"")
	private String pro_usuarioCreador;

	@Column(name="\"pro_usuarioModificacion\"")
	private String pro_usuarioModificacion;

	public ProProyecto() {
	}

	public Integer getProCodigo() {
		return this.proCodigo;
	}

	public void setProCodigo(Integer proCodigo) {
		this.proCodigo = proCodigo;
	}

	public String getPro_codPm() {
		return this.pro_codPm;
	}

	public void setPro_codPm(String pro_codPm) {
		this.pro_codPm = pro_codPm;
	}

	public Integer getPro_codUsuarioCoordinador() {
		return this.pro_codUsuarioCoordinador;
	}

	public void setPro_codUsuarioCoordinador(Integer pro_codUsuarioCoordinador) {
		this.pro_codUsuarioCoordinador = pro_codUsuarioCoordinador;
	}

	public String getProDescripcion() {
		return this.proDescripcion;
	}

	public void setProDescripcion(String proDescripcion) {
		this.proDescripcion = proDescripcion;
	}

	public String getProEstado() {
		return this.proEstado;
	}

	public void setProEstado(String proEstado) {
		this.proEstado = proEstado;
	}

	public Date getPro_fechaCreacion() {
		return this.pro_fechaCreacion;
	}

	public void setPro_fechaCreacion(Date pro_fechaCreacion) {
		this.pro_fechaCreacion = pro_fechaCreacion;
	}

	public Date getPro_fechaFinPlan() {
		return this.pro_fechaFinPlan;
	}

	public void setPro_fechaFinPlan(Date pro_fechaFinPlan) {
		this.pro_fechaFinPlan = pro_fechaFinPlan;
	}

	public Date getPro_fechaFinReal() {
		return this.pro_fechaFinReal;
	}

	public void setPro_fechaFinReal(Date pro_fechaFinReal) {
		this.pro_fechaFinReal = pro_fechaFinReal;
	}

	public Date getPro_fechaInicioPlan() {
		return this.pro_fechaInicioPlan;
	}

	public void setPro_fechaInicioPlan(Date pro_fechaInicioPlan) {
		this.pro_fechaInicioPlan = pro_fechaInicioPlan;
	}

	public Date getPro_fechaInicioReal() {
		return this.pro_fechaInicioReal;
	}

	public void setPro_fechaInicioReal(Date pro_fechaInicioReal) {
		this.pro_fechaInicioReal = pro_fechaInicioReal;
	}

	public Date getPro_fechaModificacion() {
		return this.pro_fechaModificacion;
	}

	public void setPro_fechaModificacion(Date pro_fechaModificacion) {
		this.pro_fechaModificacion = pro_fechaModificacion;
	}

	public Time getPro_horaCreacion() {
		return this.pro_horaCreacion;
	}

	public void setPro_horaCreacion(Time pro_horaCreacion) {
		this.pro_horaCreacion = pro_horaCreacion;
	}

	public Time getPro_horaFinPlan() {
		return this.pro_horaFinPlan;
	}

	public void setPro_horaFinPlan(Time pro_horaFinPlan) {
		this.pro_horaFinPlan = pro_horaFinPlan;
	}

	public Time getPro_horaFinReal() {
		return this.pro_horaFinReal;
	}

	public void setPro_horaFinReal(Time pro_horaFinReal) {
		this.pro_horaFinReal = pro_horaFinReal;
	}

	public Time getPro_horaInicioPlan() {
		return this.pro_horaInicioPlan;
	}

	public void setPro_horaInicioPlan(Time pro_horaInicioPlan) {
		this.pro_horaInicioPlan = pro_horaInicioPlan;
	}

	public Time getPro_horaInicioReal() {
		return this.pro_horaInicioReal;
	}

	public void setPro_horaInicioReal(Time pro_horaInicioReal) {
		this.pro_horaInicioReal = pro_horaInicioReal;
	}

	public Time getPro_horaModificacion() {
		return this.pro_horaModificacion;
	}

	public void setPro_horaModificacion(Time pro_horaModificacion) {
		this.pro_horaModificacion = pro_horaModificacion;
	}

	public String getPro_usuarioCreador() {
		return this.pro_usuarioCreador;
	}

	public void setPro_usuarioCreador(String pro_usuarioCreador) {
		this.pro_usuarioCreador = pro_usuarioCreador;
	}

	public String getPro_usuarioModificacion() {
		return this.pro_usuarioModificacion;
	}

	public void setPro_usuarioModificacion(String pro_usuarioModificacion) {
		this.pro_usuarioModificacion = pro_usuarioModificacion;
	}

}
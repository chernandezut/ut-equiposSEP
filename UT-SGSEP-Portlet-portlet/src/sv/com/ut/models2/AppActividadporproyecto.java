package sv.com.ut.models2;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the app_actividadporproyecto database table.
 * 
 */
@Entity
@Table(name="app_actividadporproyecto")
@NamedQuery(name="AppActividadporproyecto.findAll", query="SELECT a FROM AppActividadporproyecto a")
public class AppActividadporproyecto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="app_codigo")
	private Integer appCodigo;

	@Column(name="app_comentario")
	private String appComentario;

	@Column(name="app_descripcion")
	private String appDescripcion;

	@Column(name="app_eppcodigo")
	private Integer appEppcodigo;

	@Column(name="app_estado")
	private String appEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="\"app_fechaCreacion\"")
	private Date app_fechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="\"app_fechaFinPlan\"")
	private Date app_fechaFinPlan;

	@Temporal(TemporalType.DATE)
	@Column(name="\"app_fechaFinReal\"")
	private Date app_fechaFinReal;

	@Temporal(TemporalType.DATE)
	@Column(name="\"app_fechaInicioPlan\"")
	private Date app_fechaInicioPlan;

	@Temporal(TemporalType.DATE)
	@Column(name="\"app_fechaInicioReal\"")
	private Date app_fechaInicioReal;

	@Temporal(TemporalType.DATE)
	@Column(name="\"app_fechaModificacion\"")
	private Date app_fechaModificacion;

	@Column(name="\"app_horaCreacion\"")
	private Time app_horaCreacion;

	@Column(name="\"app_horaFinPlan\"")
	private Time app_horaFinPlan;

	@Column(name="\"app_horaFinReal\"")
	private Time app_horaFinReal;

	@Column(name="\"app_horaInicioPlan\"")
	private Time app_horaInicioPlan;

	@Column(name="\"app_horaInicioReal\"")
	private Time app_horaInicioReal;

	@Column(name="\"app_horaModificacion\"")
	private Time app_horaModificacion;

	@Column(name="app_procodigo")
	private Integer appProcodigo;

	@Column(name="app_tiempoestimadorealizacion")
	private double appTiempoestimadorealizacion;

	@Column(name="\"app_usuarioCreacion\"")
	private String app_usuarioCreacion;

	@Column(name="\"app_usuarioResponsable\"")
	private String app_usuarioResponsable;

	public AppActividadporproyecto() {
	}

	public Integer getAppCodigo() {
		return this.appCodigo;
	}

	public void setAppCodigo(Integer appCodigo) {
		this.appCodigo = appCodigo;
	}

	public String getAppComentario() {
		return this.appComentario;
	}

	public void setAppComentario(String appComentario) {
		this.appComentario = appComentario;
	}

	public String getAppDescripcion() {
		return this.appDescripcion;
	}

	public void setAppDescripcion(String appDescripcion) {
		this.appDescripcion = appDescripcion;
	}

	public Integer getAppEppcodigo() {
		return this.appEppcodigo;
	}

	public void setAppEppcodigo(Integer appEppcodigo) {
		this.appEppcodigo = appEppcodigo;
	}

	public String getAppEstado() {
		return this.appEstado;
	}

	public void setAppEstado(String appEstado) {
		this.appEstado = appEstado;
	}

	public Date getApp_fechaCreacion() {
		return this.app_fechaCreacion;
	}

	public void setApp_fechaCreacion(Date app_fechaCreacion) {
		this.app_fechaCreacion = app_fechaCreacion;
	}

	public Date getApp_fechaFinPlan() {
		return this.app_fechaFinPlan;
	}

	public void setApp_fechaFinPlan(Date app_fechaFinPlan) {
		this.app_fechaFinPlan = app_fechaFinPlan;
	}

	public Date getApp_fechaFinReal() {
		return this.app_fechaFinReal;
	}

	public void setApp_fechaFinReal(Date app_fechaFinReal) {
		this.app_fechaFinReal = app_fechaFinReal;
	}

	public Date getApp_fechaInicioPlan() {
		return this.app_fechaInicioPlan;
	}

	public void setApp_fechaInicioPlan(Date app_fechaInicioPlan) {
		this.app_fechaInicioPlan = app_fechaInicioPlan;
	}

	public Date getApp_fechaInicioReal() {
		return this.app_fechaInicioReal;
	}

	public void setApp_fechaInicioReal(Date app_fechaInicioReal) {
		this.app_fechaInicioReal = app_fechaInicioReal;
	}

	public Date getApp_fechaModificacion() {
		return this.app_fechaModificacion;
	}

	public void setApp_fechaModificacion(Date app_fechaModificacion) {
		this.app_fechaModificacion = app_fechaModificacion;
	}

	public Time getApp_horaCreacion() {
		return this.app_horaCreacion;
	}

	public void setApp_horaCreacion(Time app_horaCreacion) {
		this.app_horaCreacion = app_horaCreacion;
	}

	public Time getApp_horaFinPlan() {
		return this.app_horaFinPlan;
	}

	public void setApp_horaFinPlan(Time app_horaFinPlan) {
		this.app_horaFinPlan = app_horaFinPlan;
	}

	public Time getApp_horaFinReal() {
		return this.app_horaFinReal;
	}

	public void setApp_horaFinReal(Time app_horaFinReal) {
		this.app_horaFinReal = app_horaFinReal;
	}

	public Time getApp_horaInicioPlan() {
		return this.app_horaInicioPlan;
	}

	public void setApp_horaInicioPlan(Time app_horaInicioPlan) {
		this.app_horaInicioPlan = app_horaInicioPlan;
	}

	public Time getApp_horaInicioReal() {
		return this.app_horaInicioReal;
	}

	public void setApp_horaInicioReal(Time app_horaInicioReal) {
		this.app_horaInicioReal = app_horaInicioReal;
	}

	public Time getApp_horaModificacion() {
		return this.app_horaModificacion;
	}

	public void setApp_horaModificacion(Time app_horaModificacion) {
		this.app_horaModificacion = app_horaModificacion;
	}

	public Integer getAppProcodigo() {
		return this.appProcodigo;
	}

	public void setAppProcodigo(Integer appProcodigo) {
		this.appProcodigo = appProcodigo;
	}

	public double getAppTiempoestimadorealizacion() {
		return this.appTiempoestimadorealizacion;
	}

	public void setAppTiempoestimadorealizacion(double appTiempoestimadorealizacion) {
		this.appTiempoestimadorealizacion = appTiempoestimadorealizacion;
	}

	public String getApp_usuarioCreacion() {
		return this.app_usuarioCreacion;
	}

	public void setApp_usuarioCreacion(String app_usuarioCreacion) {
		this.app_usuarioCreacion = app_usuarioCreacion;
	}

	public String getApp_usuarioResponsable() {
		return this.app_usuarioResponsable;
	}

	public void setApp_usuarioResponsable(String app_usuarioResponsable) {
		this.app_usuarioResponsable = app_usuarioResponsable;
	}

}
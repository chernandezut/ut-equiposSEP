package sv.com.ut.models2;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the epp_etapaporproyecto database table.
 * 
 */
@Entity
@Table(name="epp_etapaporproyecto")
@NamedQuery(name="EppEtapaporproyecto.findAll", query="SELECT e FROM EppEtapaporproyecto e")
public class EppEtapaporproyecto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="epp_codigo")
	private Integer eppCodigo;

	@Column(name="epp_comentario")
	private String eppComentario;

	@Column(name="epp_descripcion")
	private String eppDescripcion;

	@Column(name="epp_estado")
	private String eppEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="\"epp_fechaCreacion\"")
	private Date epp_fechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="\"epp_fechaFinPlan\"")
	private Date epp_fechaFinPlan;

	@Temporal(TemporalType.DATE)
	@Column(name="\"epp_fechaFinReal\"")
	private Date epp_fechaFinReal;

	@Temporal(TemporalType.DATE)
	@Column(name="\"epp_fechaInicioPlan\"")
	private Date epp_fechaInicioPlan;

	@Temporal(TemporalType.DATE)
	@Column(name="\"epp_fechaInicioReal\"")
	private Date epp_fechaInicioReal;

	@Temporal(TemporalType.DATE)
	@Column(name="\"epp_fechaModificacion\"")
	private Date epp_fechaModificacion;

	@Column(name="\"epp_horaCreacion\"")
	private Time epp_horaCreacion;

	@Column(name="\"epp_horaFinPlan\"")
	private Time epp_horaFinPlan;

	@Column(name="\"epp_horaFinReal\"")
	private Time epp_horaFinReal;

	@Column(name="\"epp_horaInicioPlan\"")
	private Time epp_horaInicioPlan;

	@Column(name="\"epp_horaInicioReal\"")
	private Time epp_horaInicioReal;

	@Column(name="\"epp_horaModificacion\"")
	private Time epp_horaModificacion;

	@Column(name="epp_pppcodigo")
	private Integer eppPppcodigo;

	@Column(name="epp_procodigo")
	private Integer eppProcodigo;

	@Column(name="epp_tiempoestimadorealizacion")
	private double eppTiempoestimadorealizacion;

	@Column(name="\"epp_usuarioCreacion\"")
	private String epp_usuarioCreacion;

	public EppEtapaporproyecto() {
	}

	public Integer getEppCodigo() {
		return this.eppCodigo;
	}

	public void setEppCodigo(Integer eppCodigo) {
		this.eppCodigo = eppCodigo;
	}

	public String getEppComentario() {
		return this.eppComentario;
	}

	public void setEppComentario(String eppComentario) {
		this.eppComentario = eppComentario;
	}

	public String getEppDescripcion() {
		return this.eppDescripcion;
	}

	public void setEppDescripcion(String eppDescripcion) {
		this.eppDescripcion = eppDescripcion;
	}

	public String getEppEstado() {
		return this.eppEstado;
	}

	public void setEppEstado(String eppEstado) {
		this.eppEstado = eppEstado;
	}

	public Date getEpp_fechaCreacion() {
		return this.epp_fechaCreacion;
	}

	public void setEpp_fechaCreacion(Date epp_fechaCreacion) {
		this.epp_fechaCreacion = epp_fechaCreacion;
	}

	public Date getEpp_fechaFinPlan() {
		return this.epp_fechaFinPlan;
	}

	public void setEpp_fechaFinPlan(Date epp_fechaFinPlan) {
		this.epp_fechaFinPlan = epp_fechaFinPlan;
	}

	public Date getEpp_fechaFinReal() {
		return this.epp_fechaFinReal;
	}

	public void setEpp_fechaFinReal(Date epp_fechaFinReal) {
		this.epp_fechaFinReal = epp_fechaFinReal;
	}

	public Date getEpp_fechaInicioPlan() {
		return this.epp_fechaInicioPlan;
	}

	public void setEpp_fechaInicioPlan(Date epp_fechaInicioPlan) {
		this.epp_fechaInicioPlan = epp_fechaInicioPlan;
	}

	public Date getEpp_fechaInicioReal() {
		return this.epp_fechaInicioReal;
	}

	public void setEpp_fechaInicioReal(Date epp_fechaInicioReal) {
		this.epp_fechaInicioReal = epp_fechaInicioReal;
	}

	public Date getEpp_fechaModificacion() {
		return this.epp_fechaModificacion;
	}

	public void setEpp_fechaModificacion(Date epp_fechaModificacion) {
		this.epp_fechaModificacion = epp_fechaModificacion;
	}

	public Time getEpp_horaCreacion() {
		return this.epp_horaCreacion;
	}

	public void setEpp_horaCreacion(Time epp_horaCreacion) {
		this.epp_horaCreacion = epp_horaCreacion;
	}

	public Time getEpp_horaFinPlan() {
		return this.epp_horaFinPlan;
	}

	public void setEpp_horaFinPlan(Time epp_horaFinPlan) {
		this.epp_horaFinPlan = epp_horaFinPlan;
	}

	public Time getEpp_horaFinReal() {
		return this.epp_horaFinReal;
	}

	public void setEpp_horaFinReal(Time epp_horaFinReal) {
		this.epp_horaFinReal = epp_horaFinReal;
	}

	public Time getEpp_horaInicioPlan() {
		return this.epp_horaInicioPlan;
	}

	public void setEpp_horaInicioPlan(Time epp_horaInicioPlan) {
		this.epp_horaInicioPlan = epp_horaInicioPlan;
	}

	public Time getEpp_horaInicioReal() {
		return this.epp_horaInicioReal;
	}

	public void setEpp_horaInicioReal(Time epp_horaInicioReal) {
		this.epp_horaInicioReal = epp_horaInicioReal;
	}

	public Time getEpp_horaModificacion() {
		return this.epp_horaModificacion;
	}

	public void setEpp_horaModificacion(Time epp_horaModificacion) {
		this.epp_horaModificacion = epp_horaModificacion;
	}

	public Integer getEppPppcodigo() {
		return this.eppPppcodigo;
	}

	public void setEppPppcodigo(Integer eppPppcodigo) {
		this.eppPppcodigo = eppPppcodigo;
	}

	public Integer getEppProcodigo() {
		return this.eppProcodigo;
	}

	public void setEppProcodigo(Integer eppProcodigo) {
		this.eppProcodigo = eppProcodigo;
	}

	public double getEppTiempoestimadorealizacion() {
		return this.eppTiempoestimadorealizacion;
	}

	public void setEppTiempoestimadorealizacion(double eppTiempoestimadorealizacion) {
		this.eppTiempoestimadorealizacion = eppTiempoestimadorealizacion;
	}

	public String getEpp_usuarioCreacion() {
		return this.epp_usuarioCreacion;
	}

	public void setEpp_usuarioCreacion(String epp_usuarioCreacion) {
		this.epp_usuarioCreacion = epp_usuarioCreacion;
	}

}
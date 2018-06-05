package sv.com.ut.models2;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the act_actividad database table.
 * 
 */
@Entity
@Table(name="act_actividad")
@NamedQuery(name="ActActividad.findAll", query="SELECT a FROM ActActividad a")
public class ActActividad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="act_codigo")
	private Integer actCodigo;

	@Column(name="act_descripcion")
	private String actDescripcion;

	@Column(name="act_estado")
	private String actEstado;

	@Column(name="act_etacodigo")
	private Integer actEtacodigo;

	@Temporal(TemporalType.DATE)
	@Column(name="\"act_fechaCreacion\"")
	private Date act_fechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="\"act_fechaModificacion\"")
	private Date act_fechaModificacion;

	@Column(name="\"act_horaCreacion\"")
	private Time act_horaCreacion;

	@Column(name="\"act_horaModificacion\"")
	private Time act_horaModificacion;

	@Column(name="act_tiempoestimadorealizacion")
	private double actTiempoestimadorealizacion;

	@Column(name="\"act_usuarioCreacion\"")
	private String act_usuarioCreacion;

	public ActActividad() {
	}

	public Integer getActCodigo() {
		return this.actCodigo;
	}

	public void setActCodigo(Integer actCodigo) {
		this.actCodigo = actCodigo;
	}

	public String getActDescripcion() {
		return this.actDescripcion;
	}

	public void setActDescripcion(String actDescripcion) {
		this.actDescripcion = actDescripcion;
	}

	public String getActEstado() {
		return this.actEstado;
	}

	public void setActEstado(String actEstado) {
		this.actEstado = actEstado;
	}

	public Integer getActEtacodigo() {
		return this.actEtacodigo;
	}

	public void setActEtacodigo(Integer actEtacodigo) {
		this.actEtacodigo = actEtacodigo;
	}

	public Date getAct_fechaCreacion() {
		return this.act_fechaCreacion;
	}

	public void setAct_fechaCreacion(Date act_fechaCreacion) {
		this.act_fechaCreacion = act_fechaCreacion;
	}

	public Date getAct_fechaModificacion() {
		return this.act_fechaModificacion;
	}

	public void setAct_fechaModificacion(Date act_fechaModificacion) {
		this.act_fechaModificacion = act_fechaModificacion;
	}

	public Time getAct_horaCreacion() {
		return this.act_horaCreacion;
	}

	public void setAct_horaCreacion(Time act_horaCreacion) {
		this.act_horaCreacion = act_horaCreacion;
	}

	public Time getAct_horaModificacion() {
		return this.act_horaModificacion;
	}

	public void setAct_horaModificacion(Time act_horaModificacion) {
		this.act_horaModificacion = act_horaModificacion;
	}

	public double getActTiempoestimadorealizacion() {
		return this.actTiempoestimadorealizacion;
	}

	public void setActTiempoestimadorealizacion(double actTiempoestimadorealizacion) {
		this.actTiempoestimadorealizacion = actTiempoestimadorealizacion;
	}

	public String getAct_usuarioCreacion() {
		return this.act_usuarioCreacion;
	}

	public void setAct_usuarioCreacion(String act_usuarioCreacion) {
		this.act_usuarioCreacion = act_usuarioCreacion;
	}

}
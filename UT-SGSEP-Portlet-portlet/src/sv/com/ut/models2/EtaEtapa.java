package sv.com.ut.models2;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the eta_etapa database table.
 * 
 */
@Entity
@Table(name="eta_etapa")
@NamedQuery(name="EtaEtapa.findAll", query="SELECT e FROM EtaEtapa e")
public class EtaEtapa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="eta_codigo")
	private Integer etaCodigo;

	@Column(name="eta_descripcion")
	private String etaDescripcion;

	@Column(name="eta_estado")
	private String etaEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="\"eta_fechaCreacion\"")
	private Date eta_fechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="\"eta_fechaModificacion\"")
	private Date eta_fechaModificacion;

	@Column(name="\"eta_horaCreacion\"")
	private Time eta_horaCreacion;

	@Column(name="\"eta_horaModificacion\"")
	private Time eta_horaModificacion;

	@Column(name="eta_placodigo")
	private Integer etaPlacodigo;

	@Column(name="eta_tiempoestimadorealizacion")
	private double etaTiempoestimadorealizacion;

	@Column(name="\"eta_usuarioCreacion\"")
	private String eta_usuarioCreacion;

	public EtaEtapa() {
	}

	public Integer getEtaCodigo() {
		return this.etaCodigo;
	}

	public void setEtaCodigo(Integer etaCodigo) {
		this.etaCodigo = etaCodigo;
	}

	public String getEtaDescripcion() {
		return this.etaDescripcion;
	}

	public void setEtaDescripcion(String etaDescripcion) {
		this.etaDescripcion = etaDescripcion;
	}

	public String getEtaEstado() {
		return this.etaEstado;
	}

	public void setEtaEstado(String etaEstado) {
		this.etaEstado = etaEstado;
	}

	public Date getEta_fechaCreacion() {
		return this.eta_fechaCreacion;
	}

	public void setEta_fechaCreacion(Date eta_fechaCreacion) {
		this.eta_fechaCreacion = eta_fechaCreacion;
	}

	public Date getEta_fechaModificacion() {
		return this.eta_fechaModificacion;
	}

	public void setEta_fechaModificacion(Date eta_fechaModificacion) {
		this.eta_fechaModificacion = eta_fechaModificacion;
	}

	public Time getEta_horaCreacion() {
		return this.eta_horaCreacion;
	}

	public void setEta_horaCreacion(Time eta_horaCreacion) {
		this.eta_horaCreacion = eta_horaCreacion;
	}

	public Time getEta_horaModificacion() {
		return this.eta_horaModificacion;
	}

	public void setEta_horaModificacion(Time eta_horaModificacion) {
		this.eta_horaModificacion = eta_horaModificacion;
	}

	public Integer getEtaPlacodigo() {
		return this.etaPlacodigo;
	}

	public void setEtaPlacodigo(Integer etaPlacodigo) {
		this.etaPlacodigo = etaPlacodigo;
	}

	public double getEtaTiempoestimadorealizacion() {
		return this.etaTiempoestimadorealizacion;
	}

	public void setEtaTiempoestimadorealizacion(double etaTiempoestimadorealizacion) {
		this.etaTiempoestimadorealizacion = etaTiempoestimadorealizacion;
	}

	public String getEta_usuarioCreacion() {
		return this.eta_usuarioCreacion;
	}

	public void setEta_usuarioCreacion(String eta_usuarioCreacion) {
		this.eta_usuarioCreacion = eta_usuarioCreacion;
	}

}
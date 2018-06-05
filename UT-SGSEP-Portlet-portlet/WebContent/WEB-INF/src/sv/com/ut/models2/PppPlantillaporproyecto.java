package sv.com.ut.models2;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the ppp_plantillaporproyecto database table.
 * 
 */
@Entity
@Table(name="ppp_plantillaporproyecto")
@NamedQuery(name="PppPlantillaporproyecto.findAll", query="SELECT p FROM PppPlantillaporproyecto p")
public class PppPlantillaporproyecto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ppp_codigo")
	private Integer pppCodigo;

	@Column(name="ppp_descripcion")
	private String pppDescripcion;

	@Column(name="ppp_estado")
	private String pppEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="\"ppp_fechaCreacion\"")
	private Date ppp_fechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="\"ppp_fechaModificacion\"")
	private Date ppp_fechaModificacion;

	@Column(name="\"ppp_horaCreacion\"")
	private Time ppp_horaCreacion;

	@Column(name="\"ppp_horaModificacion\"")
	private Time ppp_horaModificacion;

	@Column(name="ppp_placodigo")
	private Integer pppPlacodigo;

	@Column(name="ppp_procodigo")
	private Integer pppProcodigo;

	@Column(name="ppp_tiempoestimadorealizacion")
	private double pppTiempoestimadorealizacion;

	@Column(name="\"ppp_usuarioCreacion\"")
	private String ppp_usuarioCreacion;

	public PppPlantillaporproyecto() {
	}

	public Integer getPppCodigo() {
		return this.pppCodigo;
	}

	public void setPppCodigo(Integer pppCodigo) {
		this.pppCodigo = pppCodigo;
	}

	public String getPppDescripcion() {
		return this.pppDescripcion;
	}

	public void setPppDescripcion(String pppDescripcion) {
		this.pppDescripcion = pppDescripcion;
	}

	public String getPppEstado() {
		return this.pppEstado;
	}

	public void setPppEstado(String pppEstado) {
		this.pppEstado = pppEstado;
	}

	public Date getPpp_fechaCreacion() {
		return this.ppp_fechaCreacion;
	}

	public void setPpp_fechaCreacion(Date ppp_fechaCreacion) {
		this.ppp_fechaCreacion = ppp_fechaCreacion;
	}

	public Date getPpp_fechaModificacion() {
		return this.ppp_fechaModificacion;
	}

	public void setPpp_fechaModificacion(Date ppp_fechaModificacion) {
		this.ppp_fechaModificacion = ppp_fechaModificacion;
	}

	public Time getPpp_horaCreacion() {
		return this.ppp_horaCreacion;
	}

	public void setPpp_horaCreacion(Time ppp_horaCreacion) {
		this.ppp_horaCreacion = ppp_horaCreacion;
	}

	public Time getPpp_horaModificacion() {
		return this.ppp_horaModificacion;
	}

	public void setPpp_horaModificacion(Time ppp_horaModificacion) {
		this.ppp_horaModificacion = ppp_horaModificacion;
	}

	public Integer getPppPlacodigo() {
		return this.pppPlacodigo;
	}

	public void setPppPlacodigo(Integer pppPlacodigo) {
		this.pppPlacodigo = pppPlacodigo;
	}

	public Integer getPppProcodigo() {
		return this.pppProcodigo;
	}

	public void setPppProcodigo(Integer pppProcodigo) {
		this.pppProcodigo = pppProcodigo;
	}

	public double getPppTiempoestimadorealizacion() {
		return this.pppTiempoestimadorealizacion;
	}

	public void setPppTiempoestimadorealizacion(double pppTiempoestimadorealizacion) {
		this.pppTiempoestimadorealizacion = pppTiempoestimadorealizacion;
	}

	public String getPpp_usuarioCreacion() {
		return this.ppp_usuarioCreacion;
	}

	public void setPpp_usuarioCreacion(String ppp_usuarioCreacion) {
		this.ppp_usuarioCreacion = ppp_usuarioCreacion;
	}

}
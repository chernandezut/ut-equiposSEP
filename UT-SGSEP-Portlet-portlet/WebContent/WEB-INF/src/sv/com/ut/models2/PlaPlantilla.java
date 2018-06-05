package sv.com.ut.models2;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the pla_plantilla database table.
 * 
 */
@Entity
@Table(name="pla_plantilla")
@NamedQuery(name="PlaPlantilla.findAll", query="SELECT p FROM PlaPlantilla p")
public class PlaPlantilla implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pla_codigo")
	private Integer plaCodigo;

	@Column(name="pla_descripcion")
	private String plaDescripcion;

	@Column(name="pla_estado")
	private String plaEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="\"pla_fechaCreacion\"")
	private Date pla_fechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="\"pla_fechaModificacion\"")
	private Date pla_fechaModificacion;

	@Column(name="\"pla_horaCreacion\"")
	private Time pla_horaCreacion;

	@Column(name="\"pla_horaModificacion\"")
	private Time pla_horaModificacion;

	@Column(name="pla_tiempoestimadorealizacion")
	private double plaTiempoestimadorealizacion;

	@Column(name="pla_tprcodigo")
	private Integer plaTprcodigo;

	@Column(name="\"pla_usuarioCreacion\"")
	private String pla_usuarioCreacion;

	public PlaPlantilla() {
	}

	public Integer getPlaCodigo() {
		return this.plaCodigo;
	}

	public void setPlaCodigo(Integer plaCodigo) {
		this.plaCodigo = plaCodigo;
	}

	public String getPlaDescripcion() {
		return this.plaDescripcion;
	}

	public void setPlaDescripcion(String plaDescripcion) {
		this.plaDescripcion = plaDescripcion;
	}

	public String getPlaEstado() {
		return this.plaEstado;
	}

	public void setPlaEstado(String plaEstado) {
		this.plaEstado = plaEstado;
	}

	public Date getPla_fechaCreacion() {
		return this.pla_fechaCreacion;
	}

	public void setPla_fechaCreacion(Date pla_fechaCreacion) {
		this.pla_fechaCreacion = pla_fechaCreacion;
	}

	public Date getPla_fechaModificacion() {
		return this.pla_fechaModificacion;
	}

	public void setPla_fechaModificacion(Date pla_fechaModificacion) {
		this.pla_fechaModificacion = pla_fechaModificacion;
	}

	public Time getPla_horaCreacion() {
		return this.pla_horaCreacion;
	}

	public void setPla_horaCreacion(Time pla_horaCreacion) {
		this.pla_horaCreacion = pla_horaCreacion;
	}

	public Time getPla_horaModificacion() {
		return this.pla_horaModificacion;
	}

	public void setPla_horaModificacion(Time pla_horaModificacion) {
		this.pla_horaModificacion = pla_horaModificacion;
	}

	public double getPlaTiempoestimadorealizacion() {
		return this.plaTiempoestimadorealizacion;
	}

	public void setPlaTiempoestimadorealizacion(double plaTiempoestimadorealizacion) {
		this.plaTiempoestimadorealizacion = plaTiempoestimadorealizacion;
	}

	public Integer getPlaTprcodigo() {
		return this.plaTprcodigo;
	}

	public void setPlaTprcodigo(Integer plaTprcodigo) {
		this.plaTprcodigo = plaTprcodigo;
	}

	public String getPla_usuarioCreacion() {
		return this.pla_usuarioCreacion;
	}

	public void setPla_usuarioCreacion(String pla_usuarioCreacion) {
		this.pla_usuarioCreacion = pla_usuarioCreacion;
	}

}
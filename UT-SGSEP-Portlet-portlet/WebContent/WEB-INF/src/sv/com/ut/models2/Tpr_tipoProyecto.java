package sv.com.ut.models2;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the "tpr_tipoProyecto" database table.
 * 
 */
@Entity
@Table(name="\"tpr_tipoProyecto\"")
@NamedQuery(name="Tpr_tipoProyecto.findAll", query="SELECT t FROM Tpr_tipoProyecto t")
public class Tpr_tipoProyecto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tpr_codigo")
	private Integer tprCodigo;

	@Column(name="tpr_descripcion")
	private String tprDescripcion;

	@Column(name="tpr_estado")
	private String tprEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="\"tpr_fechaCreacion\"")
	private Date tpr_fechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="\"tpr_fechaModificacion\"")
	private Date tpr_fechaModificacion;

	@Column(name="\"tpr_horaCreacion\"")
	private Time tpr_horaCreacion;

	@Column(name="\"tpr_horaModificacion\"")
	private Time tpr_horaModificacion;

	@Column(name="\"tpr_usuarioCreacion\"")
	private String tpr_usuarioCreacion;

	@Column(name="\"tpr_usuarioModificacion\"")
	private String tpr_usuarioModificacion;

	public Tpr_tipoProyecto() {
	}

	public Integer getTprCodigo() {
		return this.tprCodigo;
	}

	public void setTprCodigo(Integer tprCodigo) {
		this.tprCodigo = tprCodigo;
	}

	public String getTprDescripcion() {
		return this.tprDescripcion;
	}

	public void setTprDescripcion(String tprDescripcion) {
		this.tprDescripcion = tprDescripcion;
	}

	public String getTprEstado() {
		return this.tprEstado;
	}

	public void setTprEstado(String tprEstado) {
		this.tprEstado = tprEstado;
	}

	public Date getTpr_fechaCreacion() {
		return this.tpr_fechaCreacion;
	}

	public void setTpr_fechaCreacion(Date tpr_fechaCreacion) {
		this.tpr_fechaCreacion = tpr_fechaCreacion;
	}

	public Date getTpr_fechaModificacion() {
		return this.tpr_fechaModificacion;
	}

	public void setTpr_fechaModificacion(Date tpr_fechaModificacion) {
		this.tpr_fechaModificacion = tpr_fechaModificacion;
	}

	public Time getTpr_horaCreacion() {
		return this.tpr_horaCreacion;
	}

	public void setTpr_horaCreacion(Time tpr_horaCreacion) {
		this.tpr_horaCreacion = tpr_horaCreacion;
	}

	public Time getTpr_horaModificacion() {
		return this.tpr_horaModificacion;
	}

	public void setTpr_horaModificacion(Time tpr_horaModificacion) {
		this.tpr_horaModificacion = tpr_horaModificacion;
	}

	public String getTpr_usuarioCreacion() {
		return this.tpr_usuarioCreacion;
	}

	public void setTpr_usuarioCreacion(String tpr_usuarioCreacion) {
		this.tpr_usuarioCreacion = tpr_usuarioCreacion;
	}

	public String getTpr_usuarioModificacion() {
		return this.tpr_usuarioModificacion;
	}

	public void setTpr_usuarioModificacion(String tpr_usuarioModificacion) {
		this.tpr_usuarioModificacion = tpr_usuarioModificacion;
	}

}
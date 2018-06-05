package sv.com.ut.models2;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the not_nota database table.
 * 
 */
@Entity
@Table(name="not_nota")
@NamedQuery(name="NotNota.findAll", query="SELECT n FROM NotNota n")
public class NotNota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="not_codigo")
	private Integer notCodigo;

	@Column(name="not_appcodigo")
	private Integer notAppcodigo;

	@Column(name="not_comentario")
	private String notComentario;

	@Column(name="not_esnoticia")
	private Boolean notEsnoticia;

	@Column(name="not_estado")
	private String notEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="\"not_fechaCreacion\"")
	private Date not_fechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="\"not_fechaModificacion\"")
	private Date not_fechaModificacion;

	@Column(name="\"not_horaCreacion\"")
	private Time not_horaCreacion;

	@Column(name="\"not_horaModificacion\"")
	private Time not_horaModificacion;

	@Column(name="not_pppcodigo")
	private Integer notPppcodigo;

	@Column(name="not_procodigo")
	private Integer notProcodigo;

	@Column(name="not_rolpermitido")
	private Integer notRolpermitido;

	@Column(name="\"not_usuarioCreacion\"")
	private String not_usuarioCreacion;

	@Column(name="not_visible")
	private Boolean notVisible;

	public NotNota() {
	}

	public Integer getNotCodigo() {
		return this.notCodigo;
	}

	public void setNotCodigo(Integer notCodigo) {
		this.notCodigo = notCodigo;
	}

	public Integer getNotAppcodigo() {
		return this.notAppcodigo;
	}

	public void setNotAppcodigo(Integer notAppcodigo) {
		this.notAppcodigo = notAppcodigo;
	}

	public String getNotComentario() {
		return this.notComentario;
	}

	public void setNotComentario(String notComentario) {
		this.notComentario = notComentario;
	}

	public Boolean getNotEsnoticia() {
		return this.notEsnoticia;
	}

	public void setNotEsnoticia(Boolean notEsnoticia) {
		this.notEsnoticia = notEsnoticia;
	}

	public String getNotEstado() {
		return this.notEstado;
	}

	public void setNotEstado(String notEstado) {
		this.notEstado = notEstado;
	}

	public Date getNot_fechaCreacion() {
		return this.not_fechaCreacion;
	}

	public void setNot_fechaCreacion(Date not_fechaCreacion) {
		this.not_fechaCreacion = not_fechaCreacion;
	}

	public Date getNot_fechaModificacion() {
		return this.not_fechaModificacion;
	}

	public void setNot_fechaModificacion(Date not_fechaModificacion) {
		this.not_fechaModificacion = not_fechaModificacion;
	}

	public Time getNot_horaCreacion() {
		return this.not_horaCreacion;
	}

	public void setNot_horaCreacion(Time not_horaCreacion) {
		this.not_horaCreacion = not_horaCreacion;
	}

	public Time getNot_horaModificacion() {
		return this.not_horaModificacion;
	}

	public void setNot_horaModificacion(Time not_horaModificacion) {
		this.not_horaModificacion = not_horaModificacion;
	}

	public Integer getNotPppcodigo() {
		return this.notPppcodigo;
	}

	public void setNotPppcodigo(Integer notPppcodigo) {
		this.notPppcodigo = notPppcodigo;
	}

	public Integer getNotProcodigo() {
		return this.notProcodigo;
	}

	public void setNotProcodigo(Integer notProcodigo) {
		this.notProcodigo = notProcodigo;
	}

	public Integer getNotRolpermitido() {
		return this.notRolpermitido;
	}

	public void setNotRolpermitido(Integer notRolpermitido) {
		this.notRolpermitido = notRolpermitido;
	}

	public String getNot_usuarioCreacion() {
		return this.not_usuarioCreacion;
	}

	public void setNot_usuarioCreacion(String not_usuarioCreacion) {
		this.not_usuarioCreacion = not_usuarioCreacion;
	}

	public Boolean getNotVisible() {
		return this.notVisible;
	}

	public void setNotVisible(Boolean notVisible) {
		this.notVisible = notVisible;
	}

}
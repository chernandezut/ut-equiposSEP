package sv.com.ut.models2;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the adj_archivoadjunto database table.
 * 
 */
@Entity
@Table(name="adj_archivoadjunto")
@NamedQuery(name="AdjArchivoadjunto.findAll", query="SELECT a FROM AdjArchivoadjunto a")
public class AdjArchivoadjunto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="adj_codigo")
	private Integer adjCodigo;

	@Column(name="adj_appcodigo")
	private Integer adjAppcodigo;

	@Column(name="adj_archivo")
	private String adjArchivo;

	@Column(name="adj_eppcodigo")
	private Integer adjEppcodigo;

	@Column(name="adj_esappadjunto")
	private Boolean adjEsappadjunto;

	@Column(name="adj_eseppadjunto")
	private Boolean adjEseppadjunto;

	@Column(name="adj_espppadjunto")
	private Boolean adjEspppadjunto;

	@Column(name="adj_estado")
	private String adjEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="\"adj_fechaCreacion\"")
	private Date adj_fechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="\"adj_fechaModificacion\"")
	private Date adj_fechaModificacion;

	@Column(name="\"adj_horaCreacion\"")
	private Time adj_horaCreacion;

	@Column(name="\"adj_horaModificacion\"")
	private Time adj_horaModificacion;

	@Column(name="adj_mine")
	private String adjMine;

	@Column(name="adj_nombrearchivo")
	private String adjNombrearchivo;

	@Column(name="adj_pppcodigo")
	private Integer adjPppcodigo;

	@Column(name="adj_procodigo")
	private Integer adjProcodigo;

	@Column(name="adj_rolpermitido")
	private Integer adjRolpermitido;

	@Column(name="adj_tamanio")
	private Integer adjTamanio;

	@Column(name="\"adj_usuarioCreacion\"")
	private String adj_usuarioCreacion;

	@Column(name="adj_visible")
	private Boolean adjVisible;

	public AdjArchivoadjunto() {
	}

	public Integer getAdjCodigo() {
		return this.adjCodigo;
	}

	public void setAdjCodigo(Integer adjCodigo) {
		this.adjCodigo = adjCodigo;
	}

	public Integer getAdjAppcodigo() {
		return this.adjAppcodigo;
	}

	public void setAdjAppcodigo(Integer adjAppcodigo) {
		this.adjAppcodigo = adjAppcodigo;
	}

	public String getAdjArchivo() {
		return this.adjArchivo;
	}

	public void setAdjArchivo(String adjArchivo) {
		this.adjArchivo = adjArchivo;
	}

	public Integer getAdjEppcodigo() {
		return this.adjEppcodigo;
	}

	public void setAdjEppcodigo(Integer adjEppcodigo) {
		this.adjEppcodigo = adjEppcodigo;
	}

	public Boolean getAdjEsappadjunto() {
		return this.adjEsappadjunto;
	}

	public void setAdjEsappadjunto(Boolean adjEsappadjunto) {
		this.adjEsappadjunto = adjEsappadjunto;
	}

	public Boolean getAdjEseppadjunto() {
		return this.adjEseppadjunto;
	}

	public void setAdjEseppadjunto(Boolean adjEseppadjunto) {
		this.adjEseppadjunto = adjEseppadjunto;
	}

	public Boolean getAdjEspppadjunto() {
		return this.adjEspppadjunto;
	}

	public void setAdjEspppadjunto(Boolean adjEspppadjunto) {
		this.adjEspppadjunto = adjEspppadjunto;
	}

	public String getAdjEstado() {
		return this.adjEstado;
	}

	public void setAdjEstado(String adjEstado) {
		this.adjEstado = adjEstado;
	}

	public Date getAdj_fechaCreacion() {
		return this.adj_fechaCreacion;
	}

	public void setAdj_fechaCreacion(Date adj_fechaCreacion) {
		this.adj_fechaCreacion = adj_fechaCreacion;
	}

	public Date getAdj_fechaModificacion() {
		return this.adj_fechaModificacion;
	}

	public void setAdj_fechaModificacion(Date adj_fechaModificacion) {
		this.adj_fechaModificacion = adj_fechaModificacion;
	}

	public Time getAdj_horaCreacion() {
		return this.adj_horaCreacion;
	}

	public void setAdj_horaCreacion(Time adj_horaCreacion) {
		this.adj_horaCreacion = adj_horaCreacion;
	}

	public Time getAdj_horaModificacion() {
		return this.adj_horaModificacion;
	}

	public void setAdj_horaModificacion(Time adj_horaModificacion) {
		this.adj_horaModificacion = adj_horaModificacion;
	}

	public String getAdjMine() {
		return this.adjMine;
	}

	public void setAdjMine(String adjMine) {
		this.adjMine = adjMine;
	}

	public String getAdjNombrearchivo() {
		return this.adjNombrearchivo;
	}

	public void setAdjNombrearchivo(String adjNombrearchivo) {
		this.adjNombrearchivo = adjNombrearchivo;
	}

	public Integer getAdjPppcodigo() {
		return this.adjPppcodigo;
	}

	public void setAdjPppcodigo(Integer adjPppcodigo) {
		this.adjPppcodigo = adjPppcodigo;
	}

	public Integer getAdjProcodigo() {
		return this.adjProcodigo;
	}

	public void setAdjProcodigo(Integer adjProcodigo) {
		this.adjProcodigo = adjProcodigo;
	}

	public Integer getAdjRolpermitido() {
		return this.adjRolpermitido;
	}

	public void setAdjRolpermitido(Integer adjRolpermitido) {
		this.adjRolpermitido = adjRolpermitido;
	}

	public Integer getAdjTamanio() {
		return this.adjTamanio;
	}

	public void setAdjTamanio(Integer adjTamanio) {
		this.adjTamanio = adjTamanio;
	}

	public String getAdj_usuarioCreacion() {
		return this.adj_usuarioCreacion;
	}

	public void setAdj_usuarioCreacion(String adj_usuarioCreacion) {
		this.adj_usuarioCreacion = adj_usuarioCreacion;
	}

	public Boolean getAdjVisible() {
		return this.adjVisible;
	}

	public void setAdjVisible(Boolean adjVisible) {
		this.adjVisible = adjVisible;
	}

}
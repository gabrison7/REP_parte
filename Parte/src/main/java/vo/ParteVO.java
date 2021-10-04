package vo;

public class ParteVO {

	private int id;
	private String senor;
	private String direccionInicio;
	private String cp;
	private String ciudad;
	private String alumno;
	private String curso;
	private String fecha;
	private String motivos;
	private String diaCita;
	private String horaCita;
	private String persona;
	private String fechaFirma;
	private String profesorFirma;
	
	public ParteVO(){
		super();
	}
	
	public ParteVO(int id, String senor, String direccionInicio, String cp, String ciudad, String alumno, String curso, String fecha, String motivos, String diaCita, String horaCita, String persona, String fechaFirma, String profesorFirma) {
		super();
		this.id = id;
		this.senor = senor;
		this.direccionInicio = direccionInicio;
		this.cp = cp;
		this.ciudad = ciudad;
		this.alumno = alumno;
		this.curso = curso;
		this.fecha = fecha;
		this.motivos = motivos;
		this.diaCita = diaCita;
		this.horaCita = horaCita;
		this.persona = persona;
		this.fechaFirma = fechaFirma;
		this.profesorFirma = profesorFirma;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSenor() {
		return senor;
	}

	public void setSenor(String senor) {
		this.senor = senor;
	}

	public String getDireccion() {
		return direccionInicio;
	}

	public void setDireccion(String direccionInicio) {
		this.direccionInicio = direccionInicio;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getAlumno() {
		return alumno;
	}

	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getMotivos() {
		return motivos;
	}

	public void setMotivos(String motivos) {
		this.motivos = motivos;
	}

	public String getDiaCita() {
		return diaCita;
	}

	public void setDiaCita(String diaCita) {
		this.diaCita = diaCita;
	}

	public String getHoraCita() {
		return horaCita;
	}

	public void setHoraCita(String horaCita) {
		this.horaCita = horaCita;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public String getFechaFirma() {
		return fechaFirma;
	}

	public void setFechaFirma(String fechaFirma) {
		this.fechaFirma = fechaFirma;
	}

	public String getProfesorFirma() {
		return profesorFirma;
	}

	public void setProfesorFirma(String profesorFirma) {
		this.profesorFirma = profesorFirma;
	}

}

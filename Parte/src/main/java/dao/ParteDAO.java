package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vo.ParteVO;

public class ParteDAO {

	private static String driver = "com.mysql.cj.jdbc.Driver";

	public static Connection obtenerConexion() {

		Connection conexion = null;

		try {
			Class.forName(driver);
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/parte", "root", "admin1234");
		} catch (Exception e) {
			System.out.println("error al obtener la conexión");
		}

		return conexion;
	}

	public static int guardarAmonestacion(ParteVO parte) {

		int estado = 0;

		try {
			Connection conexion = ParteDAO.obtenerConexion();
			PreparedStatement ps = conexion.prepareStatement(
					"INSERT INTO partes(senor,direccion,cp,ciudad,alumno,curso,fecha,motivos,diaCita,horaCita,persona,fechaFirma,profesorFirma) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, parte.getSenor());
			ps.setString(2, parte.getDireccion());
			ps.setString(3, parte.getCp());
			ps.setString(4, parte.getCiudad());
			ps.setString(5, parte.getAlumno());
			ps.setString(6, parte.getCurso());
			ps.setString(7, parte.getFecha());
			ps.setString(8, parte.getMotivos());
			ps.setString(9, parte.getDiaCita());
			ps.setString(10, parte.getHoraCita());
			ps.setString(11, parte.getPersona());
			ps.setString(12, parte.getFechaFirma());
			ps.setString(13, parte.getProfesorFirma());

			estado = ps.executeUpdate();

			conexion.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return estado;
	}

	public static List obtenerPartes() {
		List<ParteVO> listaPartes = new ArrayList<ParteVO>();

		try {
			Connection conexion = ParteDAO.obtenerConexion();
			PreparedStatement ps = conexion.prepareStatement("SELECT * FROM partes");

			ResultSet resultado = ps.executeQuery();

			while (resultado.next()) {
				ParteVO par = new ParteVO();
				par.setId(resultado.getInt(1));
				par.setSenor(resultado.getString(2));
				par.setDireccion(resultado.getString(3));
				par.setCp(resultado.getString(4));
				par.setCiudad(resultado.getString(5));
				par.setAlumno(resultado.getString(6));
				par.setCurso(resultado.getString(7));
				par.setFecha(resultado.getString(8));
				par.setMotivos(resultado.getString(9));
				par.setDiaCita(resultado.getString(10));
				par.setHoraCita(resultado.getString(11));
				par.setPersona(resultado.getString(12));
				par.setFechaFirma(resultado.getString(13));
				par.setProfesorFirma(resultado.getString(14));

				listaPartes.add(par);
			}

			conexion.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return listaPartes;
	}

	public static int eliminar(ParteVO parte) {

		int estado = 0;

		try {
			Connection conexion = ParteDAO.obtenerConexion();
			PreparedStatement ps = conexion.prepareStatement("DELETE * FROM partes WHERE id=?");
			ps.setInt(1, parte.getId());

			estado = ps.executeUpdate();

			conexion.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
		return estado;
	}

	public static ParteVO obtenerPartesId(int id) {
		ParteVO par = new ParteVO();

		try {
			Connection conexion = ParteDAO.obtenerConexion();
			PreparedStatement ps = conexion.prepareStatement("SELECT * FROM partes WHERE id=?");
			ps.setInt(1, id);
			ResultSet resultado = ps.executeQuery();

			while (resultado.next()) {
				par.setId(resultado.getInt(1));
				par.setSenor(resultado.getString(2));
				par.setDireccion(resultado.getString(3));
				par.setCp(resultado.getString(4));
				par.setCiudad(resultado.getString(5));
				par.setAlumno(resultado.getString(6));
				par.setCurso(resultado.getString(7));
				par.setFecha(resultado.getString(8));
				par.setMotivos(resultado.getString(9));
				par.setDiaCita(resultado.getString(10));
				par.setHoraCita(resultado.getString(11));
				par.setPersona(resultado.getString(12));
				par.setFechaFirma(resultado.getString(13));
				par.setProfesorFirma(resultado.getString(14));

			}

			conexion.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return par;
	}

}

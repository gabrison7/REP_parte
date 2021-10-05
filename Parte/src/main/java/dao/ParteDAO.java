package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import vo.ParteVO;

public class ParteDAO {

private static String driver = "com.mysql.jdbc.Driver";
	
	public static Connection obtenerConexion(){
		
		Connection conexion = null;
		

		try {
			Class.forName(driver);
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/parte","root","admin1234");
		}catch(Exception e) {
			System.out.println("error al obtener la conexión");
		}
		
		return conexion;
	}
	
public static int guardarAmonestacion(ParteVO parte) {
		
		int estado = 0;
		
		try {
			Connection conexion = ParteDAO.obtenerConexion();
			PreparedStatement ps = conexion.prepareStatement("INSERT INTO partes(senor,direccion,cp,ciudad,alumno,curso,fecha,motivos,diaCita,horaCita,persona,fechaFirma,profesorFirma) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,parte.getSenor());
			ps.setString(2,parte.getDireccion());
			ps.setString(3,parte.getCp());
			ps.setString(5,parte.getCiudad());
			ps.setString(6,parte.getAlumno());
			ps.setString(7,parte.getCurso());
			ps.setString(8,parte.getFecha());
			ps.setString(9,parte.getMotivos());
			ps.setString(10,parte.getDiaCita());
			ps.setString(11,parte.getHoraCita());
			ps.setString(12,parte.getPersona());
			ps.setString(13,parte.getFechaFirma());
			ps.setString(14,parte.getProfesorFirma());
			
			estado = ps.executeUpdate();
			
			conexion.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return estado;
	}

public static int eliminarAmonestacion(int id){
	int status=0;
	try{
		Connection con=ParteDAO.obtenerConexion();
		PreparedStatement ps=con.prepareStatement("delete from partes where id=?");
		ps.setInt(1,id);
		status=ps.executeUpdate();
		
		con.close();
	}catch(Exception e){e.printStackTrace();}
	
	return status;
}

public static int eliminarAmonestacion(ParteVO parte){
	int status=0;
	try{ 
		Connection con=ParteDAO.obtenerConexion();
		PreparedStatement ps=con.prepareStatement("delete from partes where id=?");
		ps.setInt(1,parte.getId());
		status=ps.executeUpdate();
		
		con.close();
	}catch(Exception e){e.printStackTrace();}
	
	return status;
}


}

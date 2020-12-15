package ec.ups.edu.appdis.g1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g1.modelo.EnvioPaquetes;
@Stateless
public class PaqueteDao {
	@Inject
	 private Connection con;
		

	public boolean  insert(EnvioPaquetes paquete) throws Exception{
		String sql = " INSERT INTO enviopaquetes (id,nombre, apellido, direccionDestinatario, direccionRemitente)" 
				   + " VALUES (?, ?, ?, ?, ?)";
		
					PreparedStatement ps = con.prepareStatement(sql);
					
					ps.setString(1, paquete.getNombre());
					ps.setString(2, paquete.getApellido());
					ps.setString(3, paquete.getDireccionDestino());
					ps.setString(4, paquete.getDireccionRemitente());
					
					ps.executeUpdate();
					
					
					ps.close();
					return true;
				}
				
}

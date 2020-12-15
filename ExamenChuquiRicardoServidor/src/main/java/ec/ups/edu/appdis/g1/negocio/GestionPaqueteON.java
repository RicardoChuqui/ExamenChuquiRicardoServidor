package ec.ups.edu.appdis.g1.negocio;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g1.dao.PaqueteDao;
import ec.ups.edu.appdis.g1.modelo.EnvioPaquetes;



@Stateless
public class GestionPaqueteON implements GestionPaqueteONRemote{

	 @Inject
	private PaqueteDao paquetedao;
	 
	
	public boolean registrarCliente(EnvioPaquetes paquetes) throws Exception {
		
		if(paquetes.getNombre().length()!=10)
			throw new Exception("Cedula Incorrecta ccccc");
		
		 try {
			 paquetedao.insert(paquetes);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error al registrar");
		}
		return true;
		
	}
}

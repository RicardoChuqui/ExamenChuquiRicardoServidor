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
		
		
		 try {
			 paquetedao.insert(paquetes);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("guardado");
		}
		return true;
		
	}
}

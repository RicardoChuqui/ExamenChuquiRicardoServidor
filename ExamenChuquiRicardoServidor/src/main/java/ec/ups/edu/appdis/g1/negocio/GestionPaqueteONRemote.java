package ec.ups.edu.appdis.g1.negocio;

import javax.ejb.Remote;

import ec.ups.edu.appdis.g1.modelo.EnvioPaquetes;
@Remote
public interface GestionPaqueteONRemote {
	public boolean registrarCliente(EnvioPaquetes paquete) throws Exception ;
}

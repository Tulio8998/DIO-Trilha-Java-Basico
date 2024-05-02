package DesafioDIO;

public class Usuario {

	String nomeNovoUsuario;
	String agenciaNovoUsuario;
	int numeroNovoUsuario;
	
	public Usuario (String nomeNovoUsuario, String agenciaNovoUsuario, int numeroNovoUsuario) {
		this.nomeNovoUsuario = nomeNovoUsuario;
		this.agenciaNovoUsuario = agenciaNovoUsuario;
		this.numeroNovoUsuario = numeroNovoUsuario;
	}
	
	public String getNomeNovoUsuario () {
		return nomeNovoUsuario;
	}
	
	public String getAgenciaNovoUsuario () {
		return agenciaNovoUsuario;
	}
	
	public int getNumeroNovoUsuario () {
		return numeroNovoUsuario;
	}
	
}	

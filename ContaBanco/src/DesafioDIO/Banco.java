package DesafioDIO;


import java.util.ArrayList;
import java.util.List;

public class Banco {
	
		List<Usuario> usuarios = new ArrayList<>();
	
		double saldo = 0.0;
	
		public void contaUsuario (String nomeNovoUsuario, String agenciaNovoUsuario, int numeroNovoUsuario) {
			Usuario usuario = new Usuario(nomeNovoUsuario, agenciaNovoUsuario, numeroNovoUsuario);
			usuarios.add(usuario);
		}
		
		public boolean verificaContaUsuario (String nomeUsuario, String agenciaUsuario, int numeroUsuario) {
			for (Usuario usuario : usuarios) {
				if (usuario.getNomeNovoUsuario().equals(nomeUsuario) && usuario.getAgenciaNovoUsuario().equals(agenciaUsuario) && usuario.getNumeroNovoUsuario() == numeroUsuario) {				
					return true;
				}
			}
			return false;
		}
		
		public void valorAdicionado (double adicionarValor) {
			saldo+=adicionarValor;
		}
		
		public void valorRetirado (double retirarValor) {
			if (saldo<retirarValor) {
				System.out.println("Valor que deseja retirar é maior que o saldo");
			} else {
				saldo-=retirarValor;
			}
		}
		
		public double saldoFinal () {
			return saldo;
		}
		
}

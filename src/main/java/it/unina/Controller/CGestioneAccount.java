package it.unina.Controller;

public class CGestioneAccount {
	private List<Utente> _utenti;

	public String gestisciAutenticazione(String aEmail, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public boolean gestisciRegistrazione(String Nome, String Cognome, String Email, String Password) {
		public static boolean salvaParametri(String Nome, String Cognome, String Email, String Password) {
			System.out.println("Chiamata al Gestore Registrazione");
			System.out.println("Nome: " + Nome);
			System.out.println("Cognome: " + Cognome);
			System.out.println("Email: " + aEmail);
			System.out.println("Fuoribordo: " + aPassword);
			// ERRORE CORRETTO: equals("Gommone") distingue maiuscole e minuscole, ma la combo contiene "gommone": la regola non scattava mai
			if (tipo.equalsIgnoreCase("Gommone") && !fuoribordo) {
				return false;
			}
			return true;
		}
	}

	public String[] gestisciVisualizzazioneProfilo(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public boolean gestisciModificaProfilo(String aEmail, String aNome, String aCognome, String aImmaginaProfilo) {
		throw new UnsupportedOperationException();
	}

	public void gestisciModificaIndirizzo(String aEmal, indirizzo aIndirizzo) {
		throw new UnsupportedOperationException();
	}
}
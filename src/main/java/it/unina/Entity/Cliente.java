package BCED.Entity;

import java.util.Vector;
import BCED.Entity.Indirizzo;
import BCED.Entity.Ordine;

public class Cliente extends Utente_Registrato {
	private String _nome;
	private String _cognome;
	private String _immagineProfilo;
	public Vector<Indirizzo> _unnamed_Indirizzo_ = new Vector<Indirizzo>();
	public Carrello _has;
	public Vector<Ordine> _effettua = new Vector<Ordine>();

	public String getNome() {
		return this._nome;
	}

	public void setNome(String aNome) {
		this._nome = aNome;
	}

	public String getCognome() {
		return this._cognome;
	}

	public void setCognome(String aCognome) {
		this._cognome = aCognome;
	}

	public String getImmagineProfilo() {
		return this._immagineProfilo;
	}

	public void setImmagineProfilo(String aImmagineProfilo) {
		this._immagineProfilo = aImmagineProfilo;
	}

	public void modificaProfilo() {
		throw new UnsupportedOperationException();
	}

	public void effettuaordine() {
		throw new UnsupportedOperationException();
	}

	public void confermaOrdine() {
		throw new UnsupportedOperationException();
	}

	public Cliente cliente(String aNome, String aCognome, String aGimmagineProfilo) {
		throw new UnsupportedOperationException();
	}
}
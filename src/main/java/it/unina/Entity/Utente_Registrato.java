package BCED.Entity;

public class Utente_Registrato {
	private String _email;
	private String _password;
	private int _ruolo;
	public E_commerce _unnamed_E_commerce_;

	public int getRuolo() {
		return this._ruolo;
	}

	public String getPassword() {
		return this._password;
	}

	public String getEmail() {
		return this._email;
	}
}
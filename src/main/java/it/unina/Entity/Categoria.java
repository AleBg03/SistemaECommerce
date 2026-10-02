package BCED.Entity;

import java.util.Vector;
import BCED.Entity.Prodotto;

public class Categoria {
	private String _nome;
	private String _descrizione;
	public Vector<Prodotto> _unnamed_Prodotto_ = new Vector<Prodotto>();

	public String getDescrizione() {
		return this._descrizione;
	}

	public String getNome() {
		return this._nome;
	}
}
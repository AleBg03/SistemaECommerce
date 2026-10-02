package BCED.Entity;

import java.util.Vector;
import BCED.Entity.RigaCarrello;

public class Prodotto {
	private String _nome;
	private String _descrizione;
	private Float _prezzo;
	private int _qtaDisponibile;
	private Boolean _scontato;
	private Boolean _disponibile;
	public Vector<RigaCarrello> _usa = new Vector<RigaCarrello>();
	public E_commerce _unnamed_E_commerce_;
	public Categoria _unnamed_Categoria_;

	public String getNome() {
		return this._nome;
	}

	public String getDescrizione() {
		return this._descrizione;
	}

	public int getQtaDisponibile() {
		return this._qtaDisponibile;
	}

	public Float getPrezzo() {
		return this._prezzo;
	}

	public Boolean getScontato() {
		return this._scontato;
	}

	public Boolean getDisponibile() {
		return this._disponibile;
	}

	public void Modificaprodotto(prodotto aProdotto) {
		throw new UnsupportedOperationException();
	}

	public Boolean isDisponibile(Object aNome) {
		throw new UnsupportedOperationException();
	}

	public Prodotto prodotto(String aNome, String aDescrizione, Float aPrezzo, int aQtaDisponibile, Boolean aScontato, Boolean aDisponibile) {
		throw new UnsupportedOperationException();
	}
}
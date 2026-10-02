package it.unina.Entity;

import java.util.Vector;
import BCED.Entity.RigaOrdine;

public class Ordine {
	private Float _totComplessivo;
	private Date _dataCreazione;
	private Indirizzo _indirizzo;
	private enum _stato;
	public Cliente _effettua;
	public Indirizzo _unnamed_Indirizzo_;
	public E_commerce _unnamed_E_commerce_;
	public Vector<RigaOrdine> _unnamed_RigaOrdine_ = new Vector<RigaOrdine>();

	public void aggiornaStato(int aId, String aStato) {
		throw new UnsupportedOperationException();
	}

	public void annullaOrdine(int aId) {
		throw new UnsupportedOperationException();
	}

	public void consultaDettaglioOrdine(ordine aOrdine) {
		throw new UnsupportedOperationException();
	}

	public Date getDataCreazione() {
		return this._dataCreazione;
	}

	public Stato getStato() {
		throw new UnsupportedOperationException();
	}

	public Indirizzo getIndirizzo() {
		return this._indirizzo;
	}

	public Float getTotComplessivo() {
		return this._totComplessivo;
	}

	public Ordine ordine(Float aTotComplessivo, Date aDataCreazione, Indirizzo aIndirizzo, String aStato) {
		throw new UnsupportedOperationException();
	}

	public Ordine getOrdini() {
		throw new UnsupportedOperationException();
	}
}
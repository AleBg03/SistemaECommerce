package BCED.Boundary;

import BCED.Entity.Indirizzo;

public class BCliente {
	private String _emailCliente;

	public BCliente BCliente(String aEmailCliente) {
		throw new UnsupportedOperationException();
	}

	public String[] visualizzaProfilo() {
		throw new UnsupportedOperationException();
	}

	public boolean modificaProfilo(String aNome, String aCognome, String aImmagineProfilo) {
		throw new UnsupportedOperationException();
	}

	public boolean modificaIndirizzo(Indirizzo aDatiIndirizzo) {
		throw new UnsupportedOperationException();
	}

	public Object[][] consultaCatalogo() {
		throw new UnsupportedOperationException();
	}

	public Object[][] ricercaProdotto(String aTermine) {
		throw new UnsupportedOperationException();
	}

	public Object[][] consultaOfferte() {
		throw new UnsupportedOperationException();
	}

	public boolean aggiungiAlCarrello(Long aIdProdotto, int aQuantità) {
		throw new UnsupportedOperationException();
	}

	public Object[][] richiediRiepilogoOrdine() {
		throw new UnsupportedOperationException();
	}

	public void confermaOrdine() {
		throw new UnsupportedOperationException();
	}

	public void confermaOrdine(Datilndirizzo aNuovolndirizzo) {
		throw new UnsupportedOperationException();
	}

	public Object[][] consultaStoricoOrdini() {
		throw new UnsupportedOperationException();
	}

	public boolean annullaOrdine(Long aIdOrdine) {
		throw new UnsupportedOperationException();
	}

	public Object[][] consultaDettaglioOrdine(Long aIdOrdine) {
		throw new UnsupportedOperationException();
	}
}
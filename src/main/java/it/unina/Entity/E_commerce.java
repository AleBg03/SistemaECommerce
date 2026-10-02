package it.unina.Entity;

public class E_commerce {
	public Utente_Registrato _unnamed_Utente_Registrato_;
	public Prodotto _unnamed_Prodotto_;
	public Ordine _unnamed_Ordine_;

	public void autentica(String aEmail, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public void registrazione(String aNome, String aCognome, String aEmail, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public void creaProdotto(String aNome, String aDescrizione, int aQuantità, Float aPrezzo, Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}

	public void rimuoviProdotto(String aNome) {
		throw new UnsupportedOperationException();
	}

	public prodotto ricercaProdotto(String aParametro) {
		throw new UnsupportedOperationException();
	}

	public void ripristinaQuantità(String aNome, int aQuantità) {
		throw new UnsupportedOperationException();
	}

	public void consultaStoricoOrdini(int aId, String aStato) {
		throw new UnsupportedOperationException();
	}

	public boolean controlloDisponibilitàQuantità(String aNome, int aQuantità) {
		throw new UnsupportedOperationException();
	}

	public void consultaOrdiniRicevuti(Ordine aOrdini) {
		throw new UnsupportedOperationException();
	}

	public void visualizzaOfferte() {
		throw new UnsupportedOperationException();
	}

	public void verificaunicitàEmailRegistrazione(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public void verificaPasswordRegistrazione(String aPassword) {
		throw new UnsupportedOperationException();
	}

	public void verificaValiditàDati(String aEmail, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public void veriicaIndirizzo(String aVia, String aCivico, int aCap, String aCittà) {
		throw new UnsupportedOperationException();
	}

	public void verificaCorrispondenzaCredenziali(String aEmail, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public void verficaStato() {
		throw new UnsupportedOperationException();
	}

	public void verificaTransizioneStato() {
		throw new UnsupportedOperationException();
	}

	public void verificaQuantità(int aQtadesiderata) {
		throw new UnsupportedOperationException();
	}

	public void verificaValiditàDatiProdotto(String aNome, String aDescrizione, Float aPrezzo, int aQtaDisponibile, Boolean aScontato, Boolean aDisponibile) {
		throw new UnsupportedOperationException();
	}

	public void getCatalogo() {
		throw new UnsupportedOperationException();
	}

	public void verificaAnnullamento() {
		throw new UnsupportedOperationException();
	}
}
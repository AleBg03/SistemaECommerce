package it.unina.Control;

public class CgestioneOrdini {
	private CServizioMessaggistica _gestoreNotifiche;

	public CgestioneOrdini(CServizioMessaggistica aGestoreNotifiche) {
		throw new UnsupportedOperationException();
	}

	public boolean gestisciAggiuntaAlCarrello(String aEmail, Long aIdProdotto, int aQuantita) {
		throw new UnsupportedOperationException();
	}

	public Object[][] gestisciRiepilogoOrdine(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public long gestisciConfermaOrdine(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public long gestisciConfermaOrdine(String aEmail, DatiIndirizzo aNuovoIndirizzo) {
		throw new UnsupportedOperationException();
	}

	public Object[][] gestisciConsultazioneStoricoOrdini(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public boolean gestisciConsultazioneDettaglioOrdine(String aEmail, Long aIdOrdine) {
		throw new UnsupportedOperationException();
	}

	public boolean gestisciAnnullamentoOrdine(String aEmail, Long aIdOrdine) {
		throw new UnsupportedOperationException();
	}

	public Object[][] gestisciConsultazioneOrdiniRicevuti() {
		throw new UnsupportedOperationException();
	}

	public String gestisciAggiornamentoStatoOrdine(Long aIdOrdine) {
		throw new UnsupportedOperationException();
	}

	public void InviaNotifica(Ordine aOrdine) {
		throw new UnsupportedOperationException();
	}
}
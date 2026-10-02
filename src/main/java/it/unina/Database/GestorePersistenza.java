package it.unina.Database;

public class GestorePersistenza {

	public void salva(Object aEntità) {
		throw new UnsupportedOperationException();
	}

	public T aggiorna(T aEntità) {
		throw new UnsupportedOperationException();
	}

	public void elimina(Object aEntità) {
		throw new UnsupportedOperationException();
	}

	public T trovaPerId(Classe<T> aClasse) {
		throw new UnsupportedOperationException();
	}

	public void eseguiQuery(String aIpgl, Class<T> aClasse, Map<String, Object> aParametri) {
		throw new UnsupportedOperationException();
	}

	public void eseguiInTransazione(Consumer<EntityManager> aOperazioni) {
		throw new UnsupportedOperationException();
	}
}
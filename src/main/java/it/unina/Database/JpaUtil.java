package BCED.Database;

public class JpaUtil {
	private JpaUtil _instance;
	private EntityManagerFactory _emf;

	public JpaUtil() {
		throw new UnsupportedOperationException();
	}

	public JpaUtil getInstance() {
		return this._instance;
	}

	public EntityManager getEntityManager() {
		throw new UnsupportedOperationException();
	}

	public void chiudi() {
		throw new UnsupportedOperationException();
	}
}
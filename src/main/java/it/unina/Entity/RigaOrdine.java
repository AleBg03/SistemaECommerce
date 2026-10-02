package BCED.Entity;

public class RigaOrdine {
	private int _quantità;
	private transient Float _prezzoUnitario;
	public Ordine _unnamed_Ordine_;
	public Prodotto _usa;

	public int getQuantità() {
		return this._quantità;
	}

	public Float getPrezzoUnitario() {
		return this._prezzoUnitario;
	}
}
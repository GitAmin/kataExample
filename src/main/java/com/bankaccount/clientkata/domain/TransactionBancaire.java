package com.bankaccount.clientkata.domain;

/**
 * 
 * @author Amine
 *
 */
public class TransactionBancaire {

	private float value;
	
	/**
	 * l'état du compte
	 */
	private ReleveCompte releveCompte;

	
	
	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public ReleveCompte getReleveCompte() {
		return releveCompte;
	}

	public void setReleveCompte(ReleveCompte releveCompte) {
		this.releveCompte = releveCompte;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TransactionBancaire [releveCompte=").append(releveCompte).append("]");
		return builder.toString();
	}

	/**
	 * changer l'état du compte selon la valeur débiter ou créditer
	 * @param nouveauReleveCompte
	 * @param signeMontant
	 * @return
	 */
	public ReleveCompte passerTransaction(float nouveauReleveCompte, boolean signeMontant) {
		releveCompte.setValeurCompte(signeMontant ? releveCompte.getValeurCompte() + nouveauReleveCompte
				: releveCompte.getValeurCompte() - nouveauReleveCompte);
		return releveCompte;
	}
	
}

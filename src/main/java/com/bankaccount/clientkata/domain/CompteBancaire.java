package com.bankaccount.clientkata.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Amine
 *
 */
public class CompteBancaire {

	private List<OperationBancaire> listOperationBancaire = new ArrayList<OperationBancaire>();
	
	private ReleveCompte releveCompte;

	/**
	 * 
	 * @return listOperationBancaire
	 */
	public List<OperationBancaire> getListOperationBancaire() {
		return listOperationBancaire;
	}

	/**
	 * 
	 * @param listOperationBancaire
	 */
	public void setListOperationBancaire(List<OperationBancaire> listOperationBancaire) {
		this.listOperationBancaire = listOperationBancaire;
	}

	/**
	 * 
	 * @param nouveauMontant
	 */
	public void deposerArgent(Float nouveauMontant) {
		passerTransaction(nouveauMontant, true);
	} 

	/**
	 * 
	 * @param nouveauMontant
	 */
	public void retirerArgent(Float nouveauMontant) {
		passerTransaction(nouveauMontant, false);
	}
	
	/**
	 * passer la transaction du client
	 * @param nouveauMontant
	 * @param signeMontant
	 */
	private void passerTransaction(Float nouveauMontant, boolean signeMontant) {
		TransactionBancaire transactionBancaire = listOperationBancaire.get(0).getTransactionBancaire();
		ReleveCompte nouveauReleve = transactionBancaire.passerTransaction(nouveauMontant, signeMontant);
		this.releveCompte = nouveauReleve;
	}
	
	/**
	 * 
	 * @return
	 */
	public ReleveCompte getReleveCompte() {
		return releveCompte;
	}

	/**
	 * 
	 * @param releveCompte
	 */
	public void setReleveCompte(ReleveCompte releveCompte) {
		this.releveCompte = releveCompte;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(", releveCompte=")
		.append(releveCompte.getValeurCompte()).append("]");
		return builder.toString();
	}
}

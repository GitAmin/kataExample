package com.bankaccount.clientkata.domain;
/**
 * 
 * @author Amine
 *
 */
public class OperationBancaire {

	
	private TransactionBancaire transactionBancaire;
	
	private ReleveCompte releveCompte;

	public TransactionBancaire getTransactionBancaire() {
		return transactionBancaire;
	}

	public void setTransactionBancaire(TransactionBancaire transactionBancaire) {
		this.transactionBancaire = transactionBancaire;
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
		builder.append("OperationBancaire [transactionBancaire=").append(transactionBancaire).append(", releveCompte=")
				.append(releveCompte).append("]");
		return builder.toString();
	}
}

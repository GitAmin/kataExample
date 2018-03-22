package com.bankaccount.clientkata;


import java.util.Scanner;

import com.bankaccount.clientkata.domain.CompteBancaire;
import com.bankaccount.clientkata.domain.OperationBancaire;
import com.bankaccount.clientkata.domain.ReleveCompte;
import com.bankaccount.clientkata.domain.TransactionBancaire;

/**
 * 
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
    	OperationBancaire operationBancaire = new OperationBancaire();
//    	
    	ReleveCompte releveCompte = new ReleveCompte();
    	releveCompte.setValeurCompte(100f);
    	System.out.println("La valeur initiale du compte est de 100 euro");
//    	
    	TransactionBancaire transactionBancaire = new TransactionBancaire();
//    	
    	transactionBancaire.setReleveCompte(releveCompte);
    	operationBancaire.setTransactionBancaire(transactionBancaire);
    	
    	CompteBancaire compteBancaire = new CompteBancaire();
    	
    	compteBancaire.getListOperationBancaire().add(operationBancaire);
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Veulliez saisir le montant à créditer SVP : ");
    	compteBancaire.deposerArgent(Float.valueOf(sc.nextLine()));
        System.out.println("Le nouveau relevé de votre compte est de " + compteBancaire.getReleveCompte().getValeurCompte());
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Veulliez saisir le montant à débiter SVP : ");
    	compteBancaire.deposerArgent(Float.valueOf(sc2.nextLine()) * -1);
        System.out.println("Le nouveau relevé de votre compte est de " +compteBancaire.getReleveCompte().getValeurCompte());
    }
}

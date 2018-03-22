package com.bankaccount.clientkata;

import org.junit.Test;

import com.bankaccount.clientkata.domain.CompteBancaire;
import com.bankaccount.clientkata.domain.ReleveCompte;
import com.bankaccount.clientkata.domain.TransactionBancaire;
import static org.junit.Assert.*;


public class CompteBancaireTest {

	@Test
	public void testPasserTransaction() {
        // Given
	    CompteBancaire compteBancaire = new CompteBancaire();
	    ReleveCompte releveCompte = new ReleveCompte();
	    releveCompte.setValeurCompte(200f);
	    compteBancaire.setReleveCompte(releveCompte);
	    
        TransactionBancaire transactionBancaire = new TransactionBancaire();
        // When
        ReleveCompte nouveauReleve = transactionBancaire.passerTransaction(100f, true);
        assertNotNull(nouveauReleve);
        
        assertEquals(nouveauReleve, releveCompte);
	}

}

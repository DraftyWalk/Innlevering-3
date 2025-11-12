package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

    private Innlegg[] innleggtabell;
    private int nesteledige;


	public Blogg() {
	   this.innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
	    return nesteledige;
	}
	
	public Innlegg[] getSamling() {

        return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
        for (int i = 0; i < nesteledige ; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                return i;
            }
        }

        return -1;
    }
	public boolean finnes(Innlegg innlegg) {
        for (int i = 0; i < nesteledige ; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                return true;
            }
        }

        return false;
	}

	public boolean ledigPlass() {
		if (innleggtabell.length > nesteledige) {
            return true;
        }
        return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
        for (int i = 0; i < nesteledige; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                return false;
            }
        }
        if (nesteledige < innleggtabell.length) {
            innleggtabell[nesteledige] = innlegg;
            nesteledige++;
            return true;
        }
        return false;
    }


    public String toString() {
        String fullinnlegg = nesteledige + "\n";
		for (int i = 0; i < nesteledige; i++) {
            fullinnlegg += innleggtabell[i].toString();
        }
        return fullinnlegg;
	}

	// valgfrie oppgaver nedenfor
	
	//public void utvid() {
		//throw new UnsupportedOperationException(TODO.method());
	//}
	
	//public boolean leggTilUtvid(Innlegg innlegg) {

		//throw new UnsupportedOperationException(TODO.method());
		
	//}
	
	//public boolean slett(Innlegg innlegg) {
		
		//throw new UnsupportedOperationException(TODO.method());
	//}
	
	//public int[] search(String keyword) {
		
		//throw new UnsupportedOperationException(TODO.method());

	//}
}
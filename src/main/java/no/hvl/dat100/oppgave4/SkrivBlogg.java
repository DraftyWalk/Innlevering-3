package no.hvl.dat100.oppgave4;

import java.io.*;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        boolean fungerte = false;
        try{
            String filvei = mappe + "/" + filnavn;
            PrintWriter fil = new PrintWriter(new FileWriter(filvei));
            fil.print(samling.toString());
            fil.close();
            fungerte = true;
        } catch (IOException e) {
            fungerte = false;
        }
        return fungerte;
	}
}

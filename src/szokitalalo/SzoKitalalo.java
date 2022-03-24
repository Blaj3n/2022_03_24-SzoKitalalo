package szokitalalo;

import java.util.Random;
import java.util.Scanner;

public class SzoKitalalo {
    String[] szavak = {"őz", "íz", "ki"};
    megoldas = rnd.szavak;
    
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        String szo = ("Add meg a tipped: ");
        while(sc.length<0 || sc.length>2){
            System.out.println("Kérlek adj meg egy másik szót: ");
        }
        while(szo != megoldas){
            System.out.println("Nem jó. Próbáld újra.");
        }
    }
}
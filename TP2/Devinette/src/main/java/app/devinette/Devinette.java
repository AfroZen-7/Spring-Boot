package app.devinette;

import java.util.Random;
import java.util.Scanner;
//import org.hibernate.validator.constraints.Range;

public class Devinette {
    int nombre;
    int proposition;
    String message;

    // random est une variable de classe a ajouter

    public Devinette() {
        reset();
    }

    public void reset() {
        Random random = new Random();
        nombre  = 1 + random.nextInt(100);
        message = "Je pense à un nombre entre 1 et 100 ("+nombre+"). Pouvez-vous le trouver ?";
    }

    public void setProposition(int n) {
        proposition = n;
    }

    public int getProposition() {
        return proposition;
    }

    public String getMessage() {
        return message;
    }

    // logique metier
    // mise a jour de message en fonction de proposition
    public void update() {
        System.out.println("prop : " + proposition + "\nnombre : " + nombre);
        if (nombre == proposition) {message = "C'est gagné, yes we did it, c'est gagné houra !";}
        else {
            message = "Je pense à un nombre entre 1 et 100 ("+nombre+"). Pouvez-vous le trouver ?";
        }
    }
}
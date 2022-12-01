package common;

public class Compte {

    String numcartebancaire;
    String firstname;
    String lastname;
    int money;

    public Compte(String numcartebancaire, String firstname, String lastname, int money) {
        this.numcartebancaire = numcartebancaire;
        this.firstname = firstname;
        this.lastname = lastname;
        this.money = money;
    }

    public boolean boolverisolde(Bike b, String numerocartebancaire) {

            if (b.price > money && numerocartebancaire == numerocartebancaire) {
                System.out.println("Votre solde est satisfaisant, Voulez vous poursuivre pour le paiement?");

                return false;
            } else {
                System.out.println("Votre paiement a abouti");
                return true;
            }


        }

    }












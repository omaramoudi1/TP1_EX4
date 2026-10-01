/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_ex4;

/**
 *
 * @author Admin
 */



import java.util.Scanner;



public class TP1_EX4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Magasin magasin=new Magasin();

        Produit p1=new Produit(1,"PC",800,5);
        Produit p2=new Produit(2,"Souris",25,10);
        Produit p3=new Produit(3,"Clavier",50,7);

        magasin.ajouterProduit(p1);
        magasin.ajouterProduit(p2);
        magasin.ajouterProduit(p3);

        Client client=new Client(1,"Dupont","dupont@gmail.com");
        Panier panier=new Panier();

        int choix=0;

        while(choix!=5){
            System.out.println("1. Afficher les produits");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("5. Quitter");

            choix=sc.nextInt();
            sc.nextLine();

            if(choix==1){
                magasin.afficherProduitsDisponibles();
            }
            else if(choix==2){
                System.out.print("Nom du produit : ");
                String nom=sc.nextLine();

                Produit produit=magasin.trouverProduitParNom(nom);

                if(produit!=null){
                    panier.ajouterProduit(produit);
                }
                else{
                    System.out.println("Produit introuvable");
                }
            }
            else if(choix==3){
                panier.afficherPanier();
                System.out.println("Total : "+panier.calculerTotal());
            }
            else if(choix==4){
                Commande commande=new Commande(1,client,panier);
                commande.afficherDetailsCommande();
            }
        }

        sc.close();
    }
}
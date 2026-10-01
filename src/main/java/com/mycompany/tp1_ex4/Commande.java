/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1_ex4;

import java.util.ArrayList;

public class Commande{
    private int idCommande;
    private Client client;
    private ArrayList<Produit> produitsCommandes;
    private double total;

    public Commande(int idCommande,Client client,Panier panier){
        this.idCommande=idCommande;
        this.client=client;
        produitsCommandes=new ArrayList<>(panier.getProduits());
        total=panier.calculerTotal();
    }

    public void afficherDetailsCommande(){
        System.out.println("Commande "+idCommande);
        System.out.println("Client : "+client.getNom());

        for(Produit produit:produitsCommandes){
            produit.afficherDetails();
        }

        System.out.println("Total : "+total);
    }
}
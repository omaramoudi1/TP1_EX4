/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1_ex4;

import java.util.ArrayList;

public class Magasin{
    private ArrayList<Produit> produits;

    public Magasin(){
        produits=new ArrayList<>();
    }

    public void ajouterProduit(Produit produit){
        produits.add(produit);
    }

    public void afficherProduitsDisponibles(){
        for(Produit produit:produits){
            produit.afficherDetails();
        }
    }

    public Produit trouverProduitParNom(String nom){
        for(Produit produit:produits){
            if(produit.getNom().equalsIgnoreCase(nom)){
                return produit;
            }
        }
        return null;
    }
}
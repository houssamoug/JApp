/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Administrateur
 */

import javax.swing.JFrame;
 //test
//test2
public class Fenetre {
  public static void main(String[] args){

    JFrame fenetre = new JFrame();
                
    //Définit un titre pour notre fenêtre
    fenetre.setTitle("Fenêtre");
    //Définit sa taille : 400 pixels de large et 100 pixels de haut
    fenetre.setSize(500, 200);
    //Nous demandons maintenant à notre objet de se positionner au centre
    fenetre.setLocationRelativeTo(null);
    //Termine le processus lorsqu'on clique sur la croix rouge
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //Et enfin, la rendre visible        
    fenetre.setVisible(true);
  }       
  // ce ci est un coment
}
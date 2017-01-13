package src;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fenetre {
  public static void main(String[] args){
    JFrame fenetre = new JFrame();
      JLabel label = new JLabel("MST-RSI2 : Ingénierie logiciel - Méthodes et outils d'industrialisation et d'intégration");
                
    //Définit un titre pour notre fenêtre
    fenetre.setTitle("Fenêtre");
    //Définit sa taille : 400 pixels de large et 100 pixels de haut
    fenetre.setSize(400, 100);
    //Nous demandons maintenant à notre objet de se positionner au centre
    fenetre.setLocationRelativeTo(null);
    //Termine le processus lorsqu'on clique sur la croix rouge
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.add(label);
    //Et enfin, la rendre visible        
    fenetre.setVisible(true);
    
    //modification de code
  }       
}
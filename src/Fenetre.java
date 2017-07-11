
import java.awt.event.KeyEvent; //Cela créer un événement quand une touche est touchée.
import java.awt.event.KeyListener; //interface qui gère les fappes de touches
import javax.swing.JFrame; //Interface graphique

/*
 * La classe qui suit permet d'afficher la fenetre qui contient le Panel de la classe jeuxPanel
 * mais également de "capter" les frappes sur les touches de l'utilisateur frace à l'interface
 * "KeyListener".
 */

public class Fenetre extends JFrame implements KeyListener { //Voir explications dans JeuxPanel
	
     int x = 0; //def de x
     int y = 0; //def de y
     
    JeuxPanel jeux; //Création d'une nouvelle variable
    
      public Fenetre (){
    	  
           setVisible(true); //Activation de la visibilité
           setTitle("Guerrier contre Dragon. Qui mangera le plus de pomme ?"); //Titre fenêtre
           setBounds(x,y,500,500); //Taille fenetre
           
           jeux = new JeuxPanel(this); //Instance jeux de la classe JeuxPanel
           
           add(jeux); //Affichage du JPanel dans la fenetre
           
           jeux.start(); //Exécution du jeu

           addKeyListener(this); //Méthode qui détecte les frappes de bouton
    
      }

    public void keyTyped(KeyEvent e) {
      
    }

       /*
        * Méthode de l'interface KeyListener qui détecte les frappes de touches et 
        * affecte le "code" de la touche à l'instance jeux de la classe jeuxPanel
        */
    
    public void keyPressed(KeyEvent e) {
           jeux.key = e.getKeyCode();
        
      }

    public void keyReleased(KeyEvent e) { //"invoque" la touche frappée
       
    }
    
  public int getW(){
      return getWidth(); //retourne la largeur actuelle de la fenêtre
  }

  public int getH(){
      return getHeight(); //retourne la hauteur actuelle de la fenetre
  }
     
}

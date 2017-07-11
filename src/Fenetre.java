
import java.awt.event.KeyEvent; //Cela cr�er un �v�nement quand une touche est touch�e.
import java.awt.event.KeyListener; //interface qui g�re les fappes de touches
import javax.swing.JFrame; //Interface graphique

/*
 * La classe qui suit permet d'afficher la fenetre qui contient le Panel de la classe jeuxPanel
 * mais �galement de "capter" les frappes sur les touches de l'utilisateur frace � l'interface
 * "KeyListener".
 */

public class Fenetre extends JFrame implements KeyListener { //Voir explications dans JeuxPanel
	
     int x = 0; //def de x
     int y = 0; //def de y
     
    JeuxPanel jeux; //Cr�ation d'une nouvelle variable
    
      public Fenetre (){
    	  
           setVisible(true); //Activation de la visibilit�
           setTitle("Guerrier contre Dragon. Qui mangera le plus de pomme ?"); //Titre fen�tre
           setBounds(x,y,500,500); //Taille fenetre
           
           jeux = new JeuxPanel(this); //Instance jeux de la classe JeuxPanel
           
           add(jeux); //Affichage du JPanel dans la fenetre
           
           jeux.start(); //Ex�cution du jeu

           addKeyListener(this); //M�thode qui d�tecte les frappes de bouton
    
      }

    public void keyTyped(KeyEvent e) {
      
    }

       /*
        * M�thode de l'interface KeyListener qui d�tecte les frappes de touches et 
        * affecte le "code" de la touche � l'instance jeux de la classe jeuxPanel
        */
    
    public void keyPressed(KeyEvent e) {
           jeux.key = e.getKeyCode();
        
      }

    public void keyReleased(KeyEvent e) { //"invoque" la touche frapp�e
       
    }
    
  public int getW(){
      return getWidth(); //retourne la largeur actuelle de la fen�tre
  }

  public int getH(){
      return getHeight(); //retourne la hauteur actuelle de la fenetre
  }
     
}

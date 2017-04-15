package nz.ac.aut.ense701.main;

import Sound.Sound;
import nz.ac.aut.ense701.gameModel.Game;
import nz.ac.aut.ense701.gui.KiwiCountUI;
import nz.ac.aut.ense701.gui.MainMenu;

/**
 * Kiwi Count Project
 * 
 * @author AS
 * @version 2011
 */
public class Main 
{
    /**
     * Main method of Kiwi Count.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        final MainMenu mm = new MainMenu();  
        Sound sound = new Sound();
        sound.play(0, 1);
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                mm.setVisible(true);
                mm.setLocationRelativeTo(null);
            }
        });
        
    } 
}

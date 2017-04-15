
package nz.ac.aut.ense701.gameModel;
import javax.swing.JOptionPane;


        
public class MessageBox {
    public static void playerName(Game game,String infoMessage, String titleBar)
    {
        String Name = null; 
        while(Name == null || Name.isEmpty() || Name.length() > 15){
                Name = JOptionPane.showInputDialog(null, "Please input a name: ", "Create Character", JOptionPane.INFORMATION_MESSAGE);
                if(Name == null){
                    JOptionPane.showMessageDialog(null, "Invalid input!", "Create Character", JOptionPane.ERROR_MESSAGE);
                }
                if(Name != null){
                    if(Name.length() <= 15){
                           game.getPlayer().setName(Name);
                    }
                    else if(Name.length() > 15){
                        JOptionPane.showMessageDialog(null, "Name too long!", "Create Character", JOptionPane.ERROR_MESSAGE);
                    }
                } 
            }
        }
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author j02.wang
 */

public class ClickHandler implements ActionListener{
    
    Sudoku game;
    
    public ClickHandler(Sudoku game){
        this.game = game;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Button b = (Button) e.getSource();
        game.setCurrentButton(b);
        
            
    }
        
}


package jigsawapp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;

public class JigsawApp {

    static JButton invisible;
    static JButton btn;
    
    static void switchButtons(JButton clickedButton){
        if(invisible.getLocation().x<(clickedButton.getLocation().x-clickedButton.getSize().width)
                || invisible.getLocation().x>(clickedButton.getLocation().x+clickedButton.getSize().width)
                || invisible.getLocation().y<(clickedButton.getLocation().y-clickedButton.getSize().height)
                || invisible.getLocation().y>(clickedButton.getLocation().y+clickedButton.getSize().height)
                || (invisible.getLocation().y != clickedButton.getLocation().y
                && invisible.getLocation().x != clickedButton.getLocation().x))
            return;
        
        Point tmpLoc = clickedButton.getLocation();
        clickedButton.setLocation(invisible.getLocation());
        invisible.setLocation(tmpLoc);
    }
    
    public static void main(String[] args) {
        LayoutManager layOut = new GridLayout(3, 3);
        
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        f.setLayout(layOut);
        
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btn10 = new JButton("10");
        JButton btn11 = new JButton("11");
        
        ArrayList<JButton> lista = new ArrayList<>();
        lista.add(btn1);
        lista.add(btn2);
        lista.add(btn3);
        lista.add(btn4);
        lista.add(btn5);
        lista.add(btn6);
        lista.add(btn7);
        lista.add(btn8);
        lista.add(btn9);
        lista.add(btn10);
        lista.add(btn11);
        
        Collections.shuffle(lista);
        
        for(int i = 0; i<lista.size(); i++){
            lista.get(i).addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ev){
                    switchButtons((JButton)ev.getSource());
                    if((btn1.getLocation().x<btn2.getLocation().x)&&(btn2.getLocation().x<btn3.getLocation().x)&&(btn3.getLocation().x<btn4.getLocation().x)
                        &&(btn1.getLocation().y<btn5.getLocation().y)&&(btn5.getLocation().y<btn9.getLocation().y)
                        &&(btn2.getLocation().y<btn6.getLocation().y)&&(btn6.getLocation().y<btn10.getLocation().y)
                        &&(btn3.getLocation().y<btn7.getLocation().y)&&(btn7.getLocation().y<btn11.getLocation().y)
                        &&(btn5.getLocation().x<btn6.getLocation().x)&&(btn6.getLocation().x<btn7.getLocation().x)&&(btn7.getLocation().x<btn8.getLocation().x)
                        &&(btn4.getLocation().y<btn8.getLocation().y)&&(btn8.getLocation().y<btn.getLocation().y)
                        &&(btn9.getLocation().x<btn10.getLocation().x)&&(btn10.getLocation().x<btn11.getLocation().y)&&(btn11.getLocation().x<btn.getLocation().x)){
                
                    JOptionPane.showMessageDialog(null, "You won!");
                    
            }
                }
            });
            f.add(lista.get(i));
        }
        
        
        
        btn = new JButton();
            btn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    switchButtons((JButton)e.getSource());
                    if((btn1.getLocation().x<btn2.getLocation().x)&&(btn2.getLocation().x<btn3.getLocation().x)&&(btn3.getLocation().x<btn4.getLocation().x)
                        &&(btn1.getLocation().y<btn5.getLocation().y)&&(btn5.getLocation().y<btn9.getLocation().y)
                        &&(btn2.getLocation().y<btn6.getLocation().y)&&(btn6.getLocation().y<btn10.getLocation().y)
                        &&(btn3.getLocation().y<btn7.getLocation().y)&&(btn7.getLocation().y<btn11.getLocation().y)
                        &&(btn5.getLocation().x<btn6.getLocation().x)&&(btn6.getLocation().x<btn7.getLocation().x)&&(btn7.getLocation().x<btn8.getLocation().x)
                        &&(btn4.getLocation().y<btn8.getLocation().y)&&(btn8.getLocation().y<btn.getLocation().y)
                        &&(btn9.getLocation().x<btn10.getLocation().x)&&(btn10.getLocation().x<btn11.getLocation().y)&&(btn11.getLocation().x<btn.getLocation().x)){
                
                    JOptionPane.showMessageDialog(null, "You won!");
                    
            }
                }
            });
            f.add(btn);
        
        
        btn.setVisible(false);
        invisible = btn;
        
        f.setSize(300, 300);
        f.setVisible(true);
    }
    
}

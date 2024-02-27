/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;


public class UpperCase {
    
    public static class UppercaseListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            char ch = e.getKeyChar();
            if (Character.isLowerCase(ch)) {
                e.consume(); // Prevent default behavior (displaying character)
                ((JTextField) e.getSource()).replaceSelection(String.valueOf(Character.toUpperCase(ch)));
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            // No action needed here
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // No action needed here
        }
    }
}

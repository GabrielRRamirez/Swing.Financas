/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author Samsung
 */
public class GerenciadorJanelas {
     private static JDesktopPane desktopPane;
     
     public GerenciadorJanelas(JDesktopPane jdesktopPane){
         GerenciadorJanelas.desktopPane = jdesktopPane;
     }
     
     public void carregarTela(JInternalFrame internalFrame){
         if(internalFrame.isVisible()){
             internalFrame.toFront();
             internalFrame.requestFocus();
         }else{
             internalFrame.pack();
             desktopPane.add(internalFrame);
             internalFrame.setVisible(true);
         }
     }
    
}

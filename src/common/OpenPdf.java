/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.File;
import dao.InventryUtils;
import javax.swing.JOptionPane;

/**
 *
 * @author moham
 */
public class OpenPdf {
    public static void openById(String id){
        try {
            if((new File(InventryUtils.billpath +  id + ".pdf")).exists()){
                Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+InventryUtils.billpath+""+id+".pdf");
                
            }else{
                JOptionPane.showMessageDialog(null, "File is not Exist");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

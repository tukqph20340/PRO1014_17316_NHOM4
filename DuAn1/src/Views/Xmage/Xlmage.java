/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views.Xmage;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author PC DUNG
 */
public class Xlmage {
    public static Image getAppicon(){
        URL url= Xlmage.class.getResource("/images/shopee.png");
        return new ImageIcon(url).getImage();
    }
}

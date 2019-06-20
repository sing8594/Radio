/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/**
 *
 * @author dancye
 */
public class RadioSimulator {
    
    public static void main(String[] args)
    {
        Radio radio=new Radio();
        radio.setOn(true);
        
        System.out.println("IS Radio is ON?"+radio.isOn());
        
        radio.setVolume(radio.MAX_VOLUME);
        System.out.println("The volume is :"+radio.getVolume());
        
        radio.setChannel(4);
        System.out.println("The Channel is :"+radio.getChannel());
        
        radio.setOn(false);
       
        System.out.println("Radio is OFF");
       
    }
    
}

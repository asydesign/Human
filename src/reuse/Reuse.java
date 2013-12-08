/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reuse;
import oop.Human;

/**
 *
 * @author fmi
 */
public class Reuse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String introduction;
        Human stoyan = new Human("Stoyan","Cheresharov",50);
        introduction = stoyan.introduceYourself();
        System.out.println(introduction);
        
        Human ivan = new Human("Ivan","Ivanov",20);
        introduction = ivan.introduceYourself();
        System.out.println(introduction);
        
        
        Reuse myHuman = new Reuse();
        myHuman.getAgainHuman();
        
         
        System.out.println(Human.getHumanPopulation());
        
        
     }   
     public void getAgainHuman(){
        Human peter = new Human("Peter","Ivanov",30);
       
     }   
    
}

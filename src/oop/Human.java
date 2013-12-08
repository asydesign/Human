/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author fmi
 */
public class Human {     
    /*Дефинирайте клас който отразява човек. За решаване на конкретен проблем от всички 
    характерситики на човека ни интересуват име, фамилия и години.
    Класът трябва да съдържа функционалност, която позволява на всеки конкретен 
    обек от този клас да се представи с името, фамилията и възрастта си.*/
    
    private String firstName = "";
    private String lastName = "";
    private int age = 0;
    private static int humanPopulation = 0;
    
    public Human(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName = lastName;
        this.age = age;
        humanPopulation = humanPopulation+1;
    }
    
    public String introduceYourself (){
        return "My name is "+ this.firstName +" " + this.lastName +". I'm "+ this.age + " years old.";
    } 
    public String getName(){
        return this.firstName;
    }
    public void setName(String firstName){
       this.firstName = firstName;
    }
    
    public String getlastName(){
        return this.lastName;
    }
    public void setlastName(String lastName){
       this.lastName = lastName;
    }
     public int getAge(){
        return this.age;
    }
    public void setAge(int age){
       this.age = age;
    }
    public static int getHumanPopulation(){
       return humanPopulation;
    }
    
}
 
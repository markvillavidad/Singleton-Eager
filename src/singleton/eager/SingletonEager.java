/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.eager;


public class SingletonEager {

    private static SingletonEager newSingletonInstance = new SingletonEager();
    
    private SingletonEager(){}
    
    public static SingletonEager newSingletonInstance(){
             return newSingletonInstance();
        }     
    
 
    public static void main(String[] args) {
        // TODO code application logic here
        
        //test
    }
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ss.jb.four;
/**
 *
 * @author Fayt
 */
public class DoubleLock {
    
     private static DoubleLock instance = null;
    
     private DoubleLock(){
     
         
     }
     
     public DoubleLock getInstance(){
         if(instance != null){
             //synchronize this block of code
             synchronized (instance){
                if(instance != null){
                    //create a new instance if one does not exist
                   instance = new DoubleLock();
                }   
            }
         }
            return instance;
    }
}
    

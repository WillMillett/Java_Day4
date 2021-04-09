/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fayt
 */
public class MakeDeadLock {
    
    public static Object firstLock = new Object();
    public static Object secondLock = new Object();
    
    public static void main(String[] args) {
        
       ThreadOne thread1 = new ThreadOne();
       ThreadTwo thread2 = new ThreadTwo();
       
       thread1.start();
       thread2.start();
        
    }
    
    public static class ThreadOne extends Thread{
        
        public void run(){
            synchronized(firstLock){
                System.out.println("Holding the fist lock");
                try {
                    
                    Thread.sleep(10);
                    
                } catch (InterruptedException e) {
                }
                    System.out.println("Waiting on the second lock");
                
                
                synchronized(secondLock){
                
                    System.out.println("First thread is holding first and second lock");
                }
            }      
       }           
    }       
    
    public static class ThreadTwo extends Thread{
        
        public void run(){
            synchronized(secondLock){
                System.out.println("Holding the second lock");
                try {
                    
                    Thread.sleep(10);
                    
                } catch (InterruptedException e) {
                }    
                    System.out.println("Waiting on the first lock");
                
                
                synchronized(firstLock){
                
                    System.out.println("Second thread is holding first and second lock");
                }
            }      
       }           
    }      
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fayt
 */

import java.util.Iterator;
import java.util.Vector;
public class ProducerConsumer {
    
    
    private static Vector<Object> data = new Vector<Object>();
 
	public static void main(String[] args) {
		new Producer().start();
		new Consumer().start();
	}
 
	public static class Consumer extends Thread {
		
            public void run() {
                for (;;) {
                    try {
                            Thread.sleep(1000);

                    } catch (Exception e) {
                    }

                    synchronized (data) {
                        Iterator it = data.iterator();
                        while (it.hasNext())
                                it.next();
                    }
                }
            }
	}
 
	public static class Producer extends Thread {
		
            public void run() {
                for (;;) {
                    try {
                            Thread.sleep(1000);
                            
                    } catch (Exception e) {
                    }
                    data.add(new Object());
                    if (data.size() > 1000)
                            data.remove(data.size() - 1);
                }
            }
	}
    
    
}

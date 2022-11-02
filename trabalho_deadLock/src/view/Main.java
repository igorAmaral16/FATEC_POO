package view;

import controller.Recurso1;
import controller.Recurso2;

public class Main {
    
    public static void main(String [] args){
        Recurso1 r1 = new Recurso1("Recurso 1");
        Recurso2 r2 = new Recurso2("Recurso 2");
        
	        Thread t1 = new Thread(){  
	            public void run() {
						synchronized (r1.getRecurso1()){						
							System.out.println("Thread 1: bloqueou o " + r1.getRecurso1());
							
							try {
								Thread.sleep(100);
								
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							
							System.out.println("Thread 1: tentando acessar o " + r2.getRecurso2());
						
							synchronized (r2.getRecurso2()) {
								System.out.println("Thread 1: bloqueou o " + r2.getRecurso2());
							}
						}
					}
	        };
	        
	        Thread t2 = new Thread(){ 
	        	public void run() {
						synchronized (r2.getRecurso2()){						
							System.out.println("Thread 2: bloqueou o " + r2.getRecurso2());
							
							try {
								Thread.sleep(100);
								
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							
							System.out.println("Thread 2: tentando acessar o " + r1.getRecurso1());
						
							synchronized (r1.getRecurso1()) {
								System.out.println("Thread 2: bloqueou o " + r1.getRecurso1());	
							}
						}
					}
	        };
	       
	        t1.start();
	        t2.start();
    }
}
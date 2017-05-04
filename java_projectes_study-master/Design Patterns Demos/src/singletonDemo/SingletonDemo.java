package singletonDemo;

public class SingletonDemo {

	   public static void main(String[] args) {
	      Singleton tmp = Singleton.getInstance( );
	      tmp.demoMethod( );
	      
	      System.out.println(tmp);
	   }
	}
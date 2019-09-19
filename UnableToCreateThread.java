import java.lang.*;

class UnableToCreateThread {

    public static void main(String a[]){
	for(int i=0;;i++){
	    new Thread(() -> {
			try {
			    Thread.sleep(10000000);
			} catch(InterruptedException e) { }        
		    }).start();
	    System.out.println("Created Thread #" + i);
	}
 
  }
}
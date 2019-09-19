import java.lang.*;

class UnableToCreateThread {

    public static void main(String a[]){
	while(true){
	    new Thread(() -> {
			try {
			    Thread.sleep(10000000);
			} catch(InterruptedException e) { }        
		    }).start();
	}
 
  }
}
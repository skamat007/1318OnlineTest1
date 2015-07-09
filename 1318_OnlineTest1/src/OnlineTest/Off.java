package OnlineTest;

public class Off implements State {

	   public void doAction(Lamp context) {
	      System.out.println("Lamp is in stop state");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Stop State";
	   }
	}
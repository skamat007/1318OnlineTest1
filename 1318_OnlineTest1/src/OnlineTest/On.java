package OnlineTest;

public class On implements State {

	   public void doAction(Lamp context) {
	      System.out.println("Lamp is in start state");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Start State";
	   }
	}
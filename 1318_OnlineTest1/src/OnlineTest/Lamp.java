package OnlineTest;

public class Lamp {
	 private State state;

	   public Lamp(){
	      state = null;
	   }

	   public void setState(State state){
	      this.state = state;		
	   }

	   public State getState(){
	      return state;
	   }
}

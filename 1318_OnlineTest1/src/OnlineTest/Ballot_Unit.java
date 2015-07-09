package OnlineTest;

import java.util.ArrayList;
import java.util.*;
public class Ballot_Unit  {
ArrayList<Candidates> candidatesList=new ArrayList<Candidates>();
Lamp context = new Lamp();
On startstate = new On();
Off stopState = new Off();
Button Bt=new Button();

Ballot_Unit(){
	stopState.doAction(context);
	startstate.doAction(context);	
}


void addC(String name,String party)
{
this.candidatesList.add(new Candidates(name,party));
}




void displayList()
{
	Iterator<Candidates> itr= candidatesList.iterator(); 
	while(itr.hasNext())
	{
		Candidates a=itr.next();
		System.out.println("Candidate name ->"+a.name+" Candidate Party ->"+a.party);
	
	}

}


}

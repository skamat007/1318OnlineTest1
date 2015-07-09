package OnlineTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Control_Unit {
	HashMap<Candidates ,Integer > Candidates_votes=new HashMap<Candidates ,Integer >();
	Lamp context = new Lamp();
	On startstate = new On();
	Off stopState = new Off();
	//Iterator<Candidates> itr=Bu.candidatesList.iterator(); 
//Control_Unit()
//	{
//	while(itr.hasNext())
//		Candidates_votes.put(itr.next(), 0);
//	}
	
	void addvotes(Candidates i)
	{
		if(Candidates_votes.containsKey(i))
		{
		
			Candidates_votes.put(i, Candidates_votes.get(i) + 1);
			
		}
		
	}
	
	
void addCandidates(Candidates c)
{
	this.Candidates_votes.put(c, 0);
}
	
void TotalVotes()
	{
	for (Entry<Candidates, Integer> entry : Candidates_votes.entrySet()) {
	    Candidates key = entry.getKey();
	    Integer value = entry.getValue();
	System.out.println("Candidate name is "+key.name+"Candidate Party is "+key.party+" votes-> "+value);
	
	
	
	}
	}
	
	
	
	
	
	
	
}
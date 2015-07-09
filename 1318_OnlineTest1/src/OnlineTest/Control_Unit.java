package OnlineTest;

import java.util.HashMap;
import java.util.Iterator;

public class Control_Unit {
	HashMap<Candidates ,Integer > Candidates_votes=new HashMap<Candidates ,Integer >();
	Ballot_Unit Bu=new Ballot_Unit();
	Iterator<Candidates> itr=Bu.candidatesList.iterator(); 
Control_Unit()
	{
	while(itr.hasNext())
		Candidates_votes.put(itr.next(), 0);
	}
	
	void addvotes(Candidates i)
	{
		if(Candidates_votes.containsKey(i))
		{
			Candidates_votes.put(i, Candidates_votes.get(i) + 1);
			
		}
		
	}

	void TotalVotes()
	{
		
		
		
	}
	
}

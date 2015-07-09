package OnlineTest;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		EVM evm=new EVM();
		evm.Bu.addC("Shripad", "BJP");
		evm.Bu.addC("Mohanrao", "Congress");
		evm.Bu.addC("Rahul", "Shivsena");
		evm.Bu.addC("Babush", "MNS");
		evm.Bu.displayList();
		Iterator<Candidates> itr=evm.Bu.candidatesList.iterator();
		while(itr.hasNext())
		evm.Cu.addCandidates(itr.next());
		Candidates c=new Candidates("Shripad","BJP");
		Candidates c1=new Candidates("Mohanrao", "Congress");
		
		evm.Cu.TotalVotes();
		evm.Cu.addvotes(c);
		evm.Cu.TotalVotes();
		evm.Cu.addvotes(c);
		evm.Cu.addvotes(c);
		evm.Cu.addvotes(c);
		evm.Cu.addvotes(c);
		evm.Cu.addvotes(c1);
		evm.Cu.TotalVotes();
			
	}

}

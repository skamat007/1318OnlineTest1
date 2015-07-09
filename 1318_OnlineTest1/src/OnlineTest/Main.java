package OnlineTest;

public class Main {

	public static void main(String[] args) {
		EVM evm=new EVM();
		evm.Bu.addC("Shripad", "BJP");
		evm.Bu.addC("Mohanrao", "Congress");
		evm.Bu.addC("Rahul", "Shivsena");
		evm.Bu.addC("Babush", "MNS");
		evm.Bu.displayList();
		Candidates c=new Candidates("Shripad","Bjp");
		evm.Cu.addvotes(c);
		evm.Bu.displayList();
		
	}

}

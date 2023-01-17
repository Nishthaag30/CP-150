package LinkedList;

public class cycle_Client {
	public static void main(String args[]) throws Exception {
		Create_cycle cc = new Create_cycle();
		cc.addlast(1);
		cc.addlast(2);
		cc.addlast(3);
		cc.addlast(4);
		cc.addlast(5);
		cc.addlast(6);
		cc.addlast(7);
		cc.addlast(8);
		cc.CreateCycle();
		System.out.println(cc.floyd());
		cc.display();
		
	}
}

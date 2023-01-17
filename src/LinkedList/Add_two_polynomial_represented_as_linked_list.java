package LinkedList;

public class Add_two_polynomial_represented_as_linked_list {
	
	public class PolyNode{
		int coefficient;
		int power;
		PolyNode next;
		PolyNode(){
			
		}
		PolyNode(int x, int y){
			this.coefficient = x;
			this.power = y;
		}
		PolyNode(int x, int y, PolyNode next){
			this.coefficient = x;
			this.power = y;
			this.next = next;
		}
	}
	class solution{
		public PolyNode addPoly(PolyNode poly1, PolyNode poly2) {
			PolyNode dummy = new PolyNode();
			PolyNode temp = dummy;
			while(poly1!=null && poly2!=null) {
				if(poly1.power == poly2.power) {
					if(poly1.coefficient + poly2.coefficient != 0) {
						PolyNode nn = new PolyNode(poly1.coefficient + poly2.coefficient, poly1.power);
						dummy.next = nn;
						dummy = dummy.next;
					}
					poly1 = poly1.next;
					poly2 = poly2.next;
				}
				else if(poly1.power > poly2.power) {
					PolyNode nn = new PolyNode(poly1.coefficient , poly1.power);
					dummy.next = nn;
					dummy = dummy.next;
					poly1 = poly1.next;
				}
				else {
					PolyNode nn = new PolyNode(poly2.coefficient , poly2.power);
					dummy.next = nn;
					dummy = dummy.next;
					poly2 = poly2.next;
				}
			}
			if(poly1!=null) {
				dummy .next = poly1;
			}
			if(poly2!=null) {
				dummy.next = poly2;
			}
			return temp.next;
		}
	}
}

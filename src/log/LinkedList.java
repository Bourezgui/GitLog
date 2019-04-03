package log;

public class LinkedList<T> {
	
	iter root;
	
	public void add(T value){
		
		root=addRecurssive(root,value);
		
	}
	
	private boolean findRecurssive(iter currentNode,T value){
		if(currentNode==null)
				return false;
		return false;
		
		
	}
	
	private iter<T> addRecurssive(iter currentNode,T value){
		
		if(currentNode==null)	
			return new iter<T>(value);		
		
		else			
				{		
			currentNode.next=addRecurssive(currentNode.next,value);			
				}
			return currentNode;
		
	}
	
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);
		linkedList.add(7);
		
		
	
	}	
	
	

}

class iter<T> {
	
	iter prev;
	iter next;
	T 	 value;
	
	public boolean hasNext(){
		if(next==null)
			return false ;
		return true ;		
	}
	
	
	public iter(T v){	
	   this.value=v;
	   prev=null;
	   next=null; 			}
	
	
	
}

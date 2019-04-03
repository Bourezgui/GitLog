package log;

public class factoriel {
	public int fact(int a){
		if(a==0)
			return 1;
		return a*fact(a-1);
		
		
	}
	
	public int findLarge(int[] args){
		if(args==null) throw new NullPointerException("table null");
		
		int res=0;
		for(int i = 0; i<args.length;i++){
			
			if(i==0)
				{res=args[i];
				//continue
				;}
			if(res < args[i])
				res=args[i];
				
			
			
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		factoriel f= new factoriel();
		int[] arg=null;//={1,2,-1,9,3,4};
		int max=f.findLarge(arg);
		System.out.println(max);
	
	}
	
	
	
}

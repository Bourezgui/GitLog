package log;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface w{}
class speException extends Exception{
	
	public speException(String a){
		super(a);
		
	}
	
	
}
class s implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	
}

class Z implements w{}
class a extends Z{
	int x;
	static int s;
	public a(int x) throws speException{
		this.x=x;
		if(x==0)throw new speException("x est positive");
		
		
	}
	
}

public class BinaryTree{
 static File staticFile=null;

public static boolean isMirror(String a,String b){
	a=a.toLowerCase();
	b=b.toLowerCase();
	if(a==null | b==null)
		return false;
	if(a.length()!=b.length())
		return false;
	else 
		for(int i=0;i<b.length();i++)
		{
			if(a.charAt(i)!=b.charAt(a.length()-i-1))
				return false;
			
			
			
		}
	return true;
}  
 
public static File  findFile(File currentFile,String fileName){
	try {
		findFileRec(currentFile,fileName);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return staticFile;
}

public static void  findFileRec(File currentFile,String fileName) throws IOException{
	List<File> listFile = Arrays.asList(currentFile.listFiles());
	for(File file : listFile){
	
	//Chercher les fichiers que sont de type dir	
	if(file.isDirectory())
		findFileRec(file,fileName);
		
	//Chercher les fichiers que sont de type fichier 							}
	else {	
		/*
		 * charger la variable static staticFile par le nom de file
		 */
		if(file.getName().matches(fileName+".*"))
			staticFile=file;	
		
	}
		
						}
	
	

	}
	
public static int pairPlayers(String...A ){
	if(A==null)
		return 0;
	
	return A.length*(A.length-1)/2;
	
	
}	
public static void main(String[] args)  {
			
			try{
				a A = new a(0);
				System.out.println(a.s);
			}catch(speException e)
			{
				
			}
			System.out.println(findFile(new File("/home/khalil/dev"),"file.py"));
			System.out.println(isMirror("abc","bca"));
			String[]players=new String[4];
			for(int i=0;i<players.length;i++){							 
				players[i]="players_"+String.valueOf(i);					
			}
			
			System.out.println(pairPlayers(players));
}	
 		
}

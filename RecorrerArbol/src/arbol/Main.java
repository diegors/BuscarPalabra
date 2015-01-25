package arbol;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path p = Paths.get("C:/Users/I308172/Desktop/Mis Cosas/Java/ResourceKraft_workspace");
		//Path p = Paths.get("C:/");
		//= "C:/Users/I308172/Desktop/TEMPORAL";
		//C:\Users\I308172\Desktop\Mis Cosas\Java\ResourceKraft_workspace
		
		Recorrer r = new Recorrer();
		List<String> l = r.Ejecutar(p);
	
		System.out.println("********************************************************************************************");
		
		Leer lee = new Leer();
		
		Iterator<String> iter = l.iterator();
		while (iter.hasNext()) 
		{
			//lista.add(iter.toString());
			
			
		    String entrada = iter.next();
		
		    
		    //System.out.println(entrada.toString());
		    
		    
		    lee.ahora(entrada.toString(), "Runnable");
		}
		
		
		
		System.out.println("*******************************END*************************************************************");
		
		
		
	}



}

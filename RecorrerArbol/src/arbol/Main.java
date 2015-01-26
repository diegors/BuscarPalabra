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
		
		
		
		
        if (args.length > 0)
        {
        		
//        	for (int i = 0; i < args.length; i++)
//        	{
//        		System.out.println(args[i]);
//    
//        		System.out.println(args[0].toString());
//            	System.out.println(args.toString());
//        	}
        	
        	String Spath = args[0].replace('\\', '/');
        	
        	
        	//System.out.println("Spath : " + Spath);
        	
        	//Spath;
        	
        	Path p = Paths.get(Spath);
        	
        	System.out.println("Path : " + p.toString());
        
        
		
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



}

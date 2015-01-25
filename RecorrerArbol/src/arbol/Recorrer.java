package arbol;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Recorrer {
	
	private Path directorio;
	
	private static List<String> lista = new ArrayList<String>();

	public Recorrer() {
		// TODO Auto-generated constructor stub
	}

//	public Recorrer(Path raiz) {
//		// TODO Auto-generated constructor stub
//		
//		this.directorio = raiz;
//	}
	
	

	public List Ejecutar (Path raiz)
	{
		
		Path Directorios = raiz;
		
	
		
		DirectoryStream<Path> stream = null;
		try {
			stream = Files.newDirectoryStream(Directorios);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(stream.toString());
		
		Iterator<Path> iter = stream.iterator();
		while (iter.hasNext()) {
			//lista.add(iter.toString());
			
			
		    Path path = iter.next();
		    
		   
		    
		   // System.out.println(path.getFileName() + "----" + Directorios.toString());
		    
		    String p2 = Directorios + "/" + path.getFileName();
		    
		    
		    
		    if(new File(p2).isDirectory())
		    {
		    	Path pr = Paths.get(p2);
				Recorrer r = new Recorrer();
				r.Ejecutar(pr);
		    	
		    }
		    else //it is a file then store information
		    {
		    	lista.add(p2);
		    	
		    }
		    
//		    //p2.
//			DirectoryStream<Path> stream2 = null;
//			try {
//				stream2 = Files.newDirectoryStream(p2);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			Iterator<Path> iter2 = stream2.iterator();
//			if(iter2.hasNext())
//			{
//				Recorrer r = new Recorrer();
//				r.Ejecutar(p2);
//				
//			}
			
		    
		    
		}
		
		
		return lista;
	
		
	}
}

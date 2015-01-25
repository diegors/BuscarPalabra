package arbol;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Leer {

	public Leer() {
		// TODO Auto-generated constructor stub
	}

	
	public List<String> ahora(String path, String word)
	{
		Path p = Paths.get(path);
		
		List<String> lista = new ArrayList<String>();
		
		//Charset charset = Charset.forName("US-ASCII");
		
		Charset charset = Charset.forName("ISO-8859-1");
		
		
	
		
		
//	       input = new FileInputStream(new File("invalid.txt"));
//	        CharsetDecoder decoder = Charset.forName("UTF-8").newDecoder();
//	        decoder.onMalformedInput(CodingErrorAction.IGNORE);
//	        InputStreamReader reader = new InputStreamReader(input, decoder);
//	        BufferedReader bufferedReader = new BufferedReader( reader );
//	        StringBuilder sb = new StringBuilder();
//	        String line = bufferedReader.readLin
		
		
		
		
		try (BufferedReader reader = Files.newBufferedReader(p, charset)) {
		    String line = null;
		    while ((line = reader.readLine()) != null) 
		    {
		        //System.out.println(line);
		        
		        if(line.contains(word))
		        {
		        	System.out.println("I found :" +word+ " --- in file :" + path);
		        	
		        	break;
		        	
		        }
		        
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		
		
		return null;
		
		
		
	}
	
}

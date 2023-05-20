/*

 */
package eva3_9_leer_archivos_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EVA3_9_LEER_ARCHIVOS_TXT {
final static String RUTA = "C:\\Archivos\\Prueba.txt";

    public static void main(String[] args) {
    
     try {  
        ReadUsingFiles(RUTA);
    } catch (IOException ex) {
        Logger.getLogger(EVA3_9_LEER_ARCHIVOS_TXT.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
    
    
   //Con files: Se lee todo el contenido del archivo y se transfiere a memoria principal (RAM)
   //Útil con arcivos pequeños
    
   private static void ReadUsingFiles(String RUTA) throws IOException{
   //Construimos la ruta en base a la cadena de texto
   
     Path path = Paths.get(RUTA);
     List<String> todasLineas = Files.readAllLines(path);
      
       System.out.println("Resultado:");
       //System.out.println(todasLineas.toString());
       for(int i =0; i<todasLineas.size(); i++){
           System.out.println(todasLineas.get(i));    
       }
       
  }  





}


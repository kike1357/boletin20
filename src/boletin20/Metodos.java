package boletin20;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;


public class Metodos {
    
    private final ArrayList <Libros> libros = new ArrayList();
    
    public void consultar(){
        String found = JOptionPane.showInputDialog("Introduce título que desee buscar ");
            for(Libros a :libros)
                if(a.getTitulo().equalsIgnoreCase(found)){
                    JOptionPane.showMessageDialog(null,a);
                }
        
    }
    public void añadirLibro(Libros a){
        libros.add(a);
    }
    public void venderLibro(int z){
        libros.remove(z);
    }
    public String mostrarTodos(){
       Collections.sort(libros, null);
          String z="";
          for(Libros l:libros){
              z+="\n" + l.toString();
          }
          return z;
    
    }
    public void darDeBaja(){
        for(int i=0;i<libros.size();i++)
            if(libros.get(i).getnUnidades()==0)
                libros.remove(i);
            
    }

    
   
}
       


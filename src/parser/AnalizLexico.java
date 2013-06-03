/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;
import parser.NodoToken;
import parser.ListaNodoToken;
import java.io.*;
import java.lang.reflect.Field;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Walter
 */
public class AnalizLexico 
{

    /**
     * @param args the command line arguments
     */
    
    public static void generarLexer(String path)
    {
        File file = new File(path);
        JFlex.Main.generate(file);
    }   
    
    public static void generarParser(String path)
    {
        String opciones[] = new String[5];
        // Seleccionamos la opción de dirección de destino
        opciones[0] = "-destdir";
        // Le damos la dirección
        opciones[1] = "src\\parser\\"; 
        //Seleccionamos la opción de nombre de archivo
        opciones[2] = "-parser";
        //Le damos el nombre que queremos que tenga
        opciones[3] = "parser";
        //Le decimos donde se encuentra el archivo .cup
        opciones[4] = path;
        try 
        { 
            java_cup.Main.main(opciones);
        } 
        catch (Exception e) 
        {
            System.out.print(e);
        }        
    }
    
    public static void recorrerArchivoLexer(String revisar_archivo) throws IOException
    {
        try
        {
            Reader lector_archivo = new BufferedReader(new  FileReader(revisar_archivo));
            Lexer lexer = new Lexer(lector_archivo);
            boolean trigger = false;
            ListaNodoToken Lista = new ListaNodoToken();
            while(trigger != true)
            {
                Symbol token = lexer.next_token();
                int lineaCodigo = token.left;
                String lineaCod = String.valueOf(lineaCodigo);
                if(token.sym == 0)
                {
                   System.out.println("Se acabó el archivo\n");
                   trigger = true;
                }
                else
                {
                    String tokenForma = lexer.yytext();
                    NodoToken nuevo = new NodoToken();                
                    nuevo.setToken(tokenForma.toLowerCase());
                    
                    
                    
                    //nuevo.setnombreToken(token.value.toString());
                    //nuevo.setnombreToken(String.valueOf(token.sym));
                    nuevo.setnombreToken(getNameSymVariable(token.sym));
                    nuevo.agregarLinea(lineaCod);
                    NodoToken aux = Lista.buscarNodoToken(nuevo);
                    if(aux == null)
                    {
                        Lista.insertaNodoToken(nuevo);
                    }
                    else
                    {
                        aux.aumentarvecesRepetidas();
                        aux.agregarLinea(lineaCod);
                    }               
                }
            }
            Lista.imprimirLista();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }        
    }
    
    public static String getNameSymVariable(int _sym)
    {
        try
        {
            sym s = new sym();
            String nombre = "";
            for(Field f : s.getClass().getFields()) 
            {
                String sy = f.get(s).toString();
                if(sy.compareTo(String.valueOf(_sym)) == 0)
                {
                    nombre = f.getName();
                }
            }
            return nombre;
        }
        catch(SecurityException | IllegalArgumentException | IllegalAccessException ex)
        {        
            return ex.toString();
        }
        
    }
    
    public static void main(String[] args)
    {
        // TODO code application logic here
        
//        String stFlex="A continuación elija el archivo .flex!";
//        JOptionPane.showMessageDialog(null,stFlex);
//        JFileChooser fileChooserFlex = new JFileChooser();
//        String areaTextoFlex = "";
//        int seleccionFlex = fileChooserFlex.showOpenDialog(null);
//        if(seleccionFlex == JFileChooser.APPROVE_OPTION)
//        {
//            File file = fileChooserFlex.getSelectedFile();
//            areaTextoFlex = String.valueOf(file);
//        }
//        generarLexer(areaTextoFlex);
        
        generarLexer("C:\\Users\\Walter\\Documents\\NetBeansProjects\\Parser\\src\\parser\\pascalSaito.flex");
        
//        String stCup="A continuación elija el archivo .cup!";
//        JOptionPane.showMessageDialog(null,stCup);
//        JFileChooser fileChooserCup = new JFileChooser();
//        String areaTextoCup = "";
//        int seleccionCup = fileChooserCup.showOpenDialog(null);
//        if(seleccionCup == JFileChooser.APPROVE_OPTION)
//        {
//            File file = fileChooserCup.getSelectedFile();
//            areaTextoCup = String.valueOf(file);
//        }
//        System.out.println(areaTextoCup);
//        generarParser(areaTextoCup);
        
        generarParser("C:\\Users\\Walter\\Documents\\NetBeansProjects\\Parser\\src\\parser\\pascalSaito.cup");
        
        
        
        String stFile="A continuación elija el archivo que desea revisar";
        JOptionPane.showMessageDialog(null,stFile);
        JFileChooser fileChooserFile = new JFileChooser();
        String areaTextoFile = "";
        int seleccionFile = fileChooserFile.showOpenDialog(null);
        if(seleccionFile == JFileChooser.APPROVE_OPTION)
        {
            File file = fileChooserFile.getSelectedFile();
            areaTextoFile = String.valueOf(file);
        }
        try
        {
            recorrerArchivoLexer(areaTextoFile);
            correrParser(areaTextoFile);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
    }
    
    public static void correrParser(String _path)
    {
         try
        {
        //parser Parse = new parser();
        //Parse.main("C:\\Users\\Erick\\Documents\\hola.txt");
            parser p = new parser(new Lexer(new java.io.FileInputStream(_path)));
            p.parse();
            //parser p = new parser(new Lexer(new java.io.FileInputStream("C:\\Users\\Erick\\Desktop\\hola\\entrada.txt")));
            //p.parse();
            //parser Parse = new parser();
            //Parse.cargar("C:\\Users\\Erick\\Documents\\hola.txt");
        }
        catch (Exception ex)
        {
            //System.out.println("Se cayo rarisimo");
            System.out.println(ex.toString());
            System.out.println(ex.getMessage());
            //Logger.getLogger(Cup.class.getName()).log(Level.SEVERE,null,ex);
        }
    }    
}

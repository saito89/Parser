/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

/**
 *
 * @author Walter
 */
public class NodoToken 
{
    private String Token;
    private String nombreToken;
    private int vecesRepetidas;
    private String lineasCodigo;
    private NodoToken siguiente;
    
    public NodoToken()
    {
        Token = null;
        nombreToken = null;
        vecesRepetidas = 1;
        lineasCodigo = "";
        siguiente = null;
        
    }    

    
    public NodoToken(String token)
    {
        Token = token;
        nombreToken = null;
        vecesRepetidas = 1;
        lineasCodigo = null;
        siguiente = null;
    }
    
    public void setToken(String token)
    {
        Token = token;
    }
    
    public String getToken()
    {
        return Token;
    }
    
    public void setnombreToken(String name)
    {
        nombreToken = name;
    }
    
    public void aumentarvecesRepetidas()
    {
        vecesRepetidas++;
    }
    
    public void setSiguiente(NodoToken Nodo)
    {
        siguiente = Nodo;
    }
    
    public NodoToken getSiguiente()
    {
        return siguiente;
    }
    
    public String getnombreToken()
    {
        return nombreToken;
    }
    
    public int getvecesRepetidas()
    {
        return vecesRepetidas;
    }
    
    public void agregarLinea(String linea)
    {
        lineasCodigo = lineasCodigo + linea + ";";
    }
    
    public String getLinea()
    {
        return lineasCodigo;
    }
}

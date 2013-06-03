/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

/**
 *
 * @author Walter
 */
public class NodoError 
{
    private int columnaError;
    private int lineaError;
    private String localizacionError;
    private NodoError siguiente;
    
    public NodoError()
    {
        columnaError = 0;
        lineaError = 0;
        localizacionError = "";
    }
    
    public int getlineaError()
    {
        return lineaError;
    }
    
    public int getcolumnaError()
    {
        return columnaError;
    }
    
    public String getlocalizacionError()
    {
        return localizacionError;
    }
     
    public NodoError getSiguiente()
    {
        return siguiente;
    }
    
    public void setlineaError(int error)
    {
        lineaError = error;
    }
    
    public void setcolumnaError(int error)
    {
        columnaError = error;
    }
    
    public void setlocalizacionError (String error)
    {
        localizacionError = error;
    }
    
    public void setSiguiente(NodoError nodito)
    {
        siguiente = nodito;
    }
}

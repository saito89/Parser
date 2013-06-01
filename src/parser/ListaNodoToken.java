/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

/**
 *
 * @author Walter
 */
public class ListaNodoToken 
{
    NodoToken primero;
    
    public boolean listaNula()
    {
        if(primero == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void insertaNodoToken(NodoToken nuevo)
    {
        if(listaNula() == true)
        {
            primero = nuevo;
        }
        else
        {
            NodoToken aux = primero;
            while(aux.getSiguiente() != null)
            {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    
    public NodoToken buscarNodoToken(NodoToken nodo)
    {
        if(listaNula() == true)
        {
            return null;
        }
        else
        {
            NodoToken aux = primero;
            while((aux != null) && (!aux.getToken().equals(nodo.getToken())))
            {
                aux = aux.getSiguiente();
            }
            if(aux == null)
            {
                return null;
            }
            else
            {
                return aux;
            }
        }
    }
    
    public void imprimirLista()
    {
        if(listaNula() == true)
        {
            System.out.println("Lista Vacía\n");
        }
        else
        {
            NodoToken aux = primero;
            System.out.println("TOKENS: \n");
            while(aux != null)
            {
                if(aux.getnombreToken().equals("ERROR"))
                {
                    aux = aux.getSiguiente();
                }
                else
                {
                    System.out.println("TOKEN: " + aux.getToken());
                    System.out.println("TIPO DE TOKEN: " + aux.getnombreToken());
                    System.out.println("LINEA: " + aux.getLinea());
                    System.out.println("--------------------------------------------");
                    System.out.println("");
                    aux = aux.getSiguiente();
                }
            }
            aux = primero;
            System.out.println("ERRORES: \n");
            while(aux != null)
            {
                if(!aux.getnombreToken().equals("ERROR"))
                {
                    aux = aux.getSiguiente();
                }
                else
                {
                    System.out.println("TOKEN: " + aux.getToken());
                    System.out.println("TIPO DE TOKEN: " + aux.getnombreToken());
                    System.out.println("LINEA: " + aux.getLinea());
                    System.out.println("---------------------------------------------");
                    System.out.println("");
                    aux = aux.getSiguiente();
                }
            }
            
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

/**
 *
 * @author Erick
 */
public class token {
    String valor;
    public token(String val)
    {
        this.valor=val;        
    }
    public String getValue()
    {
        return this.valor;
    }
}

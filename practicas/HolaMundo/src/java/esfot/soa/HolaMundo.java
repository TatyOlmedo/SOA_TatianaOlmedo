/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esfot.soa;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Usuario
 */
@WebService(serviceName = "HolaMundo")
public class HolaMundo {

    /**
     * This is a sample web service operation
     
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }*/

    /**
     * Web service operation
     */
    @WebMethod(operationName = "saluda")
    public String saluda(@WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        return ("Hola " + nombre + ", como estas?");
    }
}

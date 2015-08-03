/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esfot.soa;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import esfot.soa.PeliculaTO;


/**
 *
 * @author TATY
 */
@WebService(serviceName = "TiendaDvdWS")
public class TiendaDvdWS {

    /**
     * This is a sample web service operation
     */
    final static PeliculaTO[] peliculas = {
        new PeliculaTO("Mulholland Drive", "David Lynch", 26.96f),
        new PeliculaTO("Carretera perdida", "David Lynch", 18.95f),
        new PeliculaTO("Twin Peaks", "David Lynch", 46.95f),
        new PeliculaTO("Telefono rojo", "Stanley Kubrick", 15.95f),
        new PeliculaTO("Barry Lyndon", "Stanley Kubrick", 24.95f),
        new PeliculaTO("La naranja mecánica", "Stanley Kubrick", 22.95f)
    };

    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarDirector")
    public List<PeliculaTO> buscaDirector(@WebParam(name = "director")String director) {
        director = director.toLowerCase();
        ArrayList<PeliculaTO> list = new ArrayList<PeliculaTO>();
        for (PeliculaTO pelicula : peliculas) {
            if (pelicula.getDirector().toLowerCase().indexOf(director) != -1) {
                list.add(pelicula);
            }
        }
        return list;
        
    }
    
    
    
    
    
}

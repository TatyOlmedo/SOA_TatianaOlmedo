/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esfot.soa;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import esfot.soa.CIFault;

/**
 *
 * @author tatiana
 */
@WebService(serviceName = "ValidaWS")
public class ValidaWS {

    public boolean VerificarCedula(String cedula)
    {
        int total=0;
        int tamanoLongitudCedula=10;
        int[] coeficientes={2,1,2,1,2,1,2,1,2};
        int  numeroProvincias=24;
        int tercerDigito=6;
        if(cedula.matches("[0-9]*")&&cedula.length()==tamanoLongitudCedula)
        {
            int provincia=Integer.parseInt(cedula.charAt(0)+""+cedula.charAt(1));
            int digitoTres=Integer.parseInt(cedula.charAt(2)+"");
            if((provincia>0&&provincia<=numeroProvincias&&digitoTres<tercerDigito))
            {
                int digitoVerificadorRecibido=Integer.parseInt(cedula.charAt(9)+"");
                for(int i=0;i<coeficientes.length;i++)
                {
                    int valor=Integer.parseInt(coeficientes[i]+"")*
                            Integer.parseInt(cedula.charAt(i)+"");
                    total=valor>=10?total+(valor-9):total+valor;
                }
                int digitoVerificadorObtenido=total>=10?(total%10)!=0?10-(total%10):(total%10):total;
                if(digitoVerificadorObtenido==digitoVerificadorRecibido)
                {
                    return true;
                }

            }
            return false;
        }
        return false;
    }
    
    @WebMethod ( operationName = "obtenerProvincia")    

    public String obtenerProvincia(@WebParam(name="ci")String ci) throws CIFault
    {
        char cedula[];
        char numero;
        String ced="";
        String mensaje;
        
        String provincia;
        if(this.VerificarCedula(ci)==true)
        {
            cedula=ci.toCharArray();
            numero=(char) (cedula[1]+cedula[0]);
            ced=Character.toString(cedula[0])+Character.toString(cedula[1]);            
            mensaje="la provincia es ";

            switch(ced)
            {
                case "01":
                    provincia="Azuay";
                break;
               
                case "02":
                    provincia="Bolivar";
                break;
               
                case "03":
                    provincia="Cañar";
                break;
                    
                case "04":
                    provincia="Carchi";
                break;
                       
                case "05":
                    provincia="Cotopaxi";
                break;
                    
               case "06":
                    provincia="Chimborazo";
                break;
                   
               case "07":
                    provincia="El Oro";
                break;
                   
               case "08":
                    provincia="Esmeraldas";
                break;
                   
               case "09":
                    provincia="Guayas";
                break;
                   
               case "10":
                    provincia="Imbabura";
                break;
                   
               case "11":
                    provincia="Loja";
                break;
                   
               case "12":
                    provincia="Los Rios";
                break;
                   
               case "13":
                    provincia="Manabi";
                break;
                   
               case "14":
                    provincia="Morona Santiago";
                break;
                   
               case "15":
                    provincia="Napo";
                break;
                   
               case "16":
                    provincia="Pastaza";
                break;
                   
               case "17":
                    provincia="Pichincha";
                break;
                   
               case "18":
                    provincia="Tungurahua";
                break;
                   
               case "19":
                    provincia="Zamora Chinchipe";
                break;
                   
               case "20":
                    provincia="Galapagos";
                break;
                   
               case "21":
                    provincia="Sucumbios";
                break;
                   
               case "22":
                    provincia="Orellana";
                break;
                   
               case "23":
                    provincia="Santo Domingo de los Tsachilas";
                break;
                   
               case "24":
                    provincia="Santa Elena";
                break;
               
                default:
                    provincia="Error";
                    break;
            }
        }
        else
        { 
            throw new CIFault("La cédula no es válida");           
        }
        //String hola=Character.toString(numero);

      return mensaje+" "+provincia;
    } 
}

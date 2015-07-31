/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soaesfot.cedulawebclient;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.xml.ws.WebServiceRef;
import esfot.soa.ValidaWS_Service;
import esfot.soa.ObtenerProvincia;
import java.lang.String;
import esfot.soa.ValidaWS;
import java.lang.Integer;
import java.lang.Boolean;

/**
 *
 * @author TATY
 */
@WebServlet(name = "Cedulaaa", urlPatterns = {"/Cedula"})
public class CedulaServle extends HttpServlet {
    
    
    @WebServiceRef
    private ValidaWS_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CedulaServle</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CedulaServle at " + request.getContextPath() + "</h1>");
            
            
            
             try { // Obtenemos el Port
                esfot.soa.ValidaWS port = service.getValidaWSPort();
           
                String cedula = request.getParameter("x");
                int ci = Integer.parseInt(cedula);
                
                String provincia;
                
                // Llamamos a la operación correspondiente del SEI
                boolean result = port.verificarCedula(cedula);
                String result1 = port.obtenerProvincia(cedula);
                
                out.println("La cédula es = " + result +" y "+ result1);
            } catch (Exception ex) 
            {
                out.println("Falta Datos");
            }
            
            
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

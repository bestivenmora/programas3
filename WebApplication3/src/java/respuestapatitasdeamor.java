/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/respuestapatitasdeamor"})
public class respuestapatitasdeamor extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        try (PrintWriter out = response.getWriter()) {
            out.println("<head>");
            out.println("<utf=8>");
            out.println("<h2>LA RESPUESTA DE PATITAS DE AMOR ES:</h2>");
            out.println("<link href=\"mysstyle.css\" rel=\"stylesheet\" type=\"text/css\"/>");
            out.println("</head>");
            out.println("<body>");          
            
            int h = Integer.parseInt(request.getParameter("las Horas son"));
            int g = Integer.parseInt(request.getParameter("Los perros grandes son"));
            int m = Integer.parseInt(request.getParameter("Los perros medianos son"));
            int p = Integer.parseInt(request.getParameter("Los perros pequeños son"));
            
            out.println("<h2>LA RESPUESTA DE PATITAS DE AMOR ES:</h2>");
            out.println("<h5 class='respuesta 1'> Horas que vas a pasear a los perros = " + h + " horas</h5>");
            out.println("<h5 class='respuesta 2'> Perros grandes = " + g + "</h5>");
            out.println("<h5 class='respuesta 3'> Perros medianos  = " + m + "</h5>");
            out.println("<h5 class='respuesta 4'> Perros pequeños = " + p + "</h5>");
            
            int costo = (p * 3000 + m * 5000 + g * 10000) * h;
            int totalp = p + g + m;
            
            if (totalp > 1) {
                int descuento = (int) (costo * 0.10);
                costo -= descuento;
                out.println("<h3>El total de los perros más el descuento es " + costo + "</h3>");
            } else {
                
            }
            out.println("<h3>El total a pagar es " + costo + "</h3>");
            out.println("<utf=-8>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}


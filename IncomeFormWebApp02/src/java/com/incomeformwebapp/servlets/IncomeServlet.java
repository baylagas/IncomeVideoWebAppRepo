package com.incomeformwebapp.servlets;

import com.incomeformwebapp.logic.IncomeLogic;
import com.incomeformwebapp.objects.IncomeObj;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "IncomeServlet", urlPatterns = {"/IncomeServlet"})
public class IncomeServlet extends HttpServlet 
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String strFormId = request.getParameter("formid");
        
        if(strFormId.equals("1"))
        {
            String strConnString = "jdbc:mysql://localhost/personalfinancedb?"
                    + "user=root"
                    + "&password=12345"
                    + "&autoReconnect=true"
                    + "&useSSL=false";
            IncomeLogic logic = new IncomeLogic(strConnString);
            List<IncomeObj> incomeList = logic.getAllIncome();
            
            request.getRequestDispatcher("incomeMain.jsp")
                    .forward(request, response);
        }
        
        if(strFormId.equals("2"))
        {
            
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

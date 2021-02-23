package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        if (request.getParameter("action") != null && request.getParameter("action").equals("logout")) {
            session.invalidate();
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);

        } else if (session.getAttribute("username") != null) {
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);

        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<String> itemList = new ArrayList<>();

        HttpSession session = request.getSession();
       

        if (request.getParameter("action").equals("register")) {
            if (request.getParameter("username") != null && !request.getParameter("username").isEmpty()) { 
                String username = (String) session.getAttribute("username");
                session.setAttribute("username", username);
                getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
            } else {
                request.setAttribute("message", "please enter a username");
                getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);

            }

        } else if (request.getParameter("action").equals("add")) {
            if (request.getParameter("item") != null && !request.getParameter("item").isEmpty()) {
                itemList.add(request.getParameter("item"));
                session.setAttribute("itemList", itemList);
                getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
            } else {
                request.setAttribute("message", "please enter an item");
                getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);

            }
        } else if (request.getParameter("action").equals("delete")) {

        }

    }

}

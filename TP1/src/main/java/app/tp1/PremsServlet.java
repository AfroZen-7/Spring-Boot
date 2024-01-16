package app.tp1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/prems/*", loadOnStartup = 1)
public class PremsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Récupérer la valeur du champ texte du formulaire
        String texteValue = request.getParameter("texte");

        // Afficher la valeur dans la réponse
        out.println("Hello chers ZZ3!");
        out.println("La valeur du champ texte est : " + texteValue);
    }
}
import javax.servlet.*;
...
  
  
@WebServlet()
public class showDishServlet extends HttpServlet{
  
  //Override methods from HttpServlet class
  @override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    doPost(request, response);
  }
  
  
  @override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      response.setContentType("text/html");
      HttpSession session = request.getSession();
  }
  
}

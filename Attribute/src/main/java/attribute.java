

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class attribute
 */
public class attribute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public attribute() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void ProcessRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.getWriter().append("Served at: ").append(request.getContextPath());
		String n1=request.getParameter("num1");
		String n2=request.getParameter("num2");
		
		int n1=Integer.parseInt(n1);
		int n2=Integer.parseInt(n2);
		int sum = num1+num2;
		request.setAttribute("sum" , sum);
		RequestDispatcher rd = request.getRequestDispatcher("S2");
		rd.forward(request , response);
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ProcessRequest(request ,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ProcessRequest(request ,response);
	}

}

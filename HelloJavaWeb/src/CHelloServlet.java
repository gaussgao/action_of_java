

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hjw.CCalculator;

/**
 * Servlet implementation class CHelloServlet
 */
@WebServlet("/CHelloServlet")
public class CHelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CHelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CCalculator obj = new CCalculator();
		
		if(null != request.getParameter("r"))
		{
			
			obj.setRedius(Double.valueOf(request.getParameter("r")));
			request.getSession().setAttribute("CC", obj);
			
			response.sendRedirect(request.getContextPath()+"/mvc_1_res.jsp");
		
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/mvc_1.jsp");
		}
		
		//response.getWriter().append("Served at: ").append(request.getContextPath()).append(String.valueOf(obj.getArea()));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

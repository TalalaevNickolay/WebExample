package by.htp.first.start;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	super.service(arg0, arg1);
    }
    
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		System.out.println("!!!!!!!!!!!");
		response.getWriter().print("contact = " + request.getParameter("contact") + "<br/>");
		response.getWriter().print("contact1 = " + request.getParameter("contact1") + "<br/>");
		
		
		String[] checkboxValues2 = request.getParameterValues("vehicle");
		
		for(int i=0; i<checkboxValues2.length; i++) {
			System.out.println(checkboxValues2[i]);
		}
		
		
	
		
		
	}
 	
 	private  void m1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
 		String login;
		String password;
		
		login = request.getParameter("mylogin");
		password = request.getParameter("mypassword");
		
		User user = new User();
		user.setName("Ivan");
		user.setSurname("Ivanov");
		
		/*PrintWriter out = response.getWriter();
		out.print("<H1> Hello, ");
		out.print("<i>" + user.getName() + " " + user.getSurname() + "</i></h1>");*/
		
		
		request.setAttribute("myuser", user);
		
		//RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
		//dispatcher.forward(request, response);
		
		response.sendRedirect("xxx?command=command2");//http://it-academy.by
	//	response.sendRedirect("https://www.it-academy.by/");//http://it-academy.by
		
		System.out.println(login + " - " + password);
 		
 	}

 	private  void m2(HttpServletRequest request, HttpServletResponse response) throws IOException{
 		
 		response.getWriter().print("<h1> nyanyanya </h1>");
 		
 		
 	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("postWe are here!!!");
	}

}

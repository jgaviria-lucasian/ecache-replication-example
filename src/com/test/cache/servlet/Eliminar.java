package com.test.cache.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.cache.CacheHelper;

/**
 * Servlet implementation class Eliminar
 */
@WebServlet("/Eliminar")
public class Eliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String llave= request.getParameter("id");
		if (llave!=null && llave.trim().length()>0) {
			CacheHelper cacheHelper= new CacheHelper();
			cacheHelper.delete(llave);
		}
		response.sendRedirect("index.jsp");
	}

}

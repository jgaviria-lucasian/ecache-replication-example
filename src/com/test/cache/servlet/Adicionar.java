package com.test.cache.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.cache.CacheHelper;
import com.test.cache.ElementoVO;

/**
 * Servlet implementation class Adicionar
 */
@WebServlet("/Adicionar")
public class Adicionar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String llave= request.getParameter("id");
		String valor= request.getParameter("valor");
		String nullValue= String.valueOf(System.currentTimeMillis());
		if (llave==null || llave.trim().length()<=0) {
			llave=nullValue;
		}
		
		if (valor==null || valor.trim().length()<=0) {
			valor=nullValue;
		}
		
		ElementoVO elementoVO= new ElementoVO();
		elementoVO.setId(llave);
		elementoVO.setValor(valor);
		
		CacheHelper cacheHelper= new CacheHelper();
		cacheHelper.addElement(elementoVO);
		response.sendRedirect("index.jsp");
	}

}

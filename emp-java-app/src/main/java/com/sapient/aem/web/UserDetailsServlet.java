package com.sapient.aem.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.sapient.aem.model.Role;
import com.sapient.aem.model.User;

@WebServlet("/userdetails")
public class UserDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<User> userList= new ArrayList<>();
			userList.add(new User(1,"smith","smith@123",Role.ADMIN));
			userList.add(new User(2,"clarke","clarke@123",Role.MANAGER));
			userList.add(new User(3,"jones","jones@123",Role.WORKER));

			request.setAttribute("userList", userList);
			request.getRequestDispatcher("sample.jsp")
									.forward(request, response);
			
		}catch(Exception e) {
			response.sendError(HttpServletResponse.SC_EXPECTATION_FAILED, 
					e.getMessage());
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}	
	

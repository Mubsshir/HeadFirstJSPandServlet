package com.example.web;


import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.*;
import java.util.*;

import com.example.model.CoffeeExpert;

public class CoffeeSelect extends HttpServlet{
  @SuppressWarnings({ "rawtypes" })
  public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
  {
    response.setContentType("text/html");
    PrintWriter out=response.getWriter();
    out.println("Coffee Selection Advise<br>:");
    String c=request.getParameter("color");
    CoffeeExpert ce=new CoffeeExpert();
    List coffeeList=ce.getCoffeeSuggestion(c);
    for (Object object : coffeeList) {
      out.println(object.toString());
    }
  }
}
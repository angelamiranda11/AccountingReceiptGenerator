package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.POBean;
import factory.FactoryBean;

@WebServlet("/process.html")
public class process extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String or_store_name;
		String or_address;
		String or_zip_code;
		String or_telephone;
		String or_tin;
		String or_number;
		String or_cashier_name;
		String or_customer_name;
		String or_item1_des;
		int or_item1_quantity;
		double or_item1_price;
		String or_item2_desc;
		int or_item2_quantity;
		double or_item2_price;
		String or_item3_desc;
		int or_item3_quantity;
		double or_item3_price;
		String or_item4_desc;
		int or_item4_quantity;
		double or_item4_price;
		String or_item5_desc;
		int or_item5_quantity;
		double or_item5_price;
		String or_purchased_date;
		String or_payment_method;
		int or_vat;
		String or_return_policy;

		

		PrintWriter out= response.getWriter();
		
		
		try 
		{

				or_store_name= request.getParameter("or_store_nam");
				or_address= request.getParameter("or_address");
				or_zip_code= request.getParameter("or_zip_code");
				or_telephone= request.getParameter("or_telephone");
				or_tin= request.getParameter("or_tin");
				or_number= request.getParameter("or_number");
				or_cashier_name= request.getParameter("or_cashier_name");
				or_customer_name= request.getParameter("or_customer_name");
				or_item1_des= request.getParameter("or_item1_des");
				or_item1_quantity= Integer.parseInt(request.getParameter("or_item1_quantity"));
				or_item1_price= Double.parseDouble(request.getParameter("or_item1_price"));
				or_item2_desc= request.getParameter("or_item2_desc");
				or_item2_quantity= Integer.parseInt(request.getParameter("or_item2_quantity"));
				or_item2_price= Double.parseDouble(request.getParameter("or_item2_price"));
				or_item3_desc= request.getParameter("or_item3_desc");
				or_item3_quantity= Integer.parseInt(request.getParameter("or_item3_quantity"));
				or_item3_price= Double.parseDouble(request.getParameter("or_item3_price"));
				or_item4_desc= request.getParameter("r_item4_desc");
				or_item4_quantity= Integer.parseInt(request.getParameter("or_item4_quantity"));
				or_item4_price= Double.parseDouble(request.getParameter("or_item4_price"));
				or_item5_desc= request.getParameter("or_item5_desc");
				or_item5_quantity= Integer.parseInt(request.getParameter("or_item5_quantity"));
				or_item5_price= Double.parseDouble(request.getParameter("or_item5_price"));
				or_purchased_date= request.getParameter("or_purchased_date");
				or_payment_method= request.getParameter("or_payment_method");
				or_vat= Integer.parseInt(request.getParameter("or_vat"));
				or_return_policy= request.getParameter("or_return_policy");

				if (or_store_name!= null && 
						or_address!= null && 
						or_zip_code!= null && 
						or_telephone!= null && 
						or_tin!= null && 
						or_number!= null && 
						or_cashier_name!= null && 
						or_customer_name!= null && 
						or_purchased_date!= null &&
						or_payment_method!= null && 
						or_vat!= 0 && 
						or_return_policy!=null) 
			{
					POBean or = FactoryBean.getInstance(or_store_name
								, or_address
								, or_zip_code
								, or_telephone
								, or_tin
								, or_number
								, or_cashier_name
								, or_customer_name
								, or_item1_des
								, or_item1_quantity
								, or_item1_price
								, or_item2_desc
								, or_item2_quantity
								, or_item2_price
								, or_item3_desc
								, or_item3_quantity
								, or_item3_price
								, or_item4_desc
								, or_item4_quantity
								, or_item4_price
								, or_item5_desc
								, or_item5_quantity
								, or_item5_price
								, or_purchased_date
								, or_payment_method
								, or_vat
								, or_return_policy);
				
					request.setAttribute("or", or);
					
					RequestDispatcher dispatcher = request.getRequestDispatcher("displayOR.jsp");
					dispatcher.forward(request, response);
			}
			else 
			{
				out.print("Some fields are not filled. <br>");
				
				out.print("<form action='official_receipt.jsp' method='post'> <input type='submit' value='Go Back'/> </form> ");
			}
			
		}
		catch (Exception e)
		{
			out.print("ERROR <br>");
			out.print("<form action='index.html' method='post'> <input type='submit' value='Go Back'/> </form> ");
		}
		
		
		
		
	}

}

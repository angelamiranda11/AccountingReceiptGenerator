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
		String po_bcompany;
		String po_baddress;
		String po_bcity;
		String po_bzip;
		String po_btelephone;
		String po_number;
		String po_date;
		String po_ship;
		String po_fob;
		String po_terms;
		String po_customer_name;
		String po_vcompany;
		String po_vaddress;
		String po_vcity;
		String po_vzip;
		String po_vtelephone;
		String po_scompany;
		String po_saddress;
		String po_scity;
		String po_szip;
		String po_stelephone;
		String po_item1_num;
		String po_item1_desc;
		int po_item1_quantity;
		double po_item1_price;
		String po_item2_num;
		String po_item2_desc;
		int po_item2_quantity;
		double po_item2_price;
		String po_item3_num;
		String po_item3_desc;
		int po_item3_quantity;
		double po_item3_price;
		String po_item4_num;
		String po_item4_desc;
		int po_item4_quantity;
		double po_item4_price;
		String po_item5_num;
		String po_item5_desc;
		int po_item5_quantity;
		double po_item5_price;
		int po_vat;
		

		PrintWriter out= response.getWriter();
		
		
		try 
		{

				po_bcompany = request.getParameter("po_bcompany");
				po_baddress = request.getParameter("po_baddress");
				po_bcity = request.getParameter("po_bcity");
				po_bzip = request.getParameter("po_bzip");
				po_btelephone = request.getParameter("po_btelephone");
				po_number = request.getParameter("po_number");
				po_date = request.getParameter("po_date");
				po_ship = request.getParameter("po_ship");
				po_fob = request.getParameter("po_fob");
				po_terms = request.getParameter("po_terms");
				po_customer_name = request.getParameter("po_customer_name");
				po_vcompany = request.getParameter("po_vcompany");
				po_vaddress = request.getParameter("po_vaddress");
				po_vcity = request.getParameter("po_vcity");
				po_vzip = request.getParameter("po_vzip");
				po_vtelephone = request.getParameter("po_vtelephone");
				po_scompany = request.getParameter("po_scompany");
				po_saddress = request.getParameter("po_saddress");
				po_scity = request.getParameter("po_scity");
				po_szip = request.getParameter("po_szip");
				po_stelephone = request.getParameter("po_stelephone");
				po_item1_num = request.getParameter("po_item1_num");
				po_item1_desc = request.getParameter("po_item1_desc");
				po_item1_quantity = Integer.parseInt(request.getParameter("po_item1_quantity"));
				po_item1_price = Double.parseDouble(request.getParameter("po_item1_price"));
				po_item2_num = request.getParameter("po_item2_num");
				po_item2_desc = request.getParameter("po_item2_desc");
				po_item2_quantity = Integer.parseInt(request.getParameter("po_item2_quantity"));
				po_item2_price = Double.parseDouble(request.getParameter("po_item2_price"));
				po_item3_num = request.getParameter("po_item3_num");
				po_item3_desc = request.getParameter("po_item3_desc");
				po_item3_quantity = Integer.parseInt(request.getParameter("po_item3_quantity"));
				po_item3_price = Double.parseDouble(request.getParameter("po_item3_price"));
				po_item4_num = request.getParameter("po_item4_num");
				po_item4_desc = request.getParameter("po_item4_desc");
				po_item4_quantity = Integer.parseInt(request.getParameter("po_item4_quantity"));
				po_item4_price = Double.parseDouble(request.getParameter("po_item4_price"));
				po_item5_num = request.getParameter("po_item5_num");
				po_item5_desc = request.getParameter("po_item5_desc");
				po_item5_quantity = Integer.parseInt(request.getParameter("po_item5_quantity"));
				po_item5_price = Double.parseDouble(request.getParameter("po_item5_price"));
				po_vat = Integer.parseInt(request.getParameter("po_vat"));

				if (po_bcompany !=null &&
						po_baddress !=null &&
						po_bcity !=null &&
						po_bzip  !=null &&
						po_btelephone !=null &&
						po_number !=null &&
						po_date !=null &&
						po_ship !=null &&
						po_fob !=null &&
						po_terms !=null &&
						po_customer_name !=null &&
						po_vcompany !=null &&
						po_vaddress !=null &&
						po_vcity !=null &&
						po_vzip !=null &&
						po_vtelephone !=null &&
						po_scompany !=null &&
						po_saddress !=null &&
						po_scity !=null &&
						po_szip !=null &&
						po_stelephone !=null &&
						po_item1_num !=null &&
						po_item1_desc !=null &&
						po_item1_quantity !=0 &&
						po_item1_price !=0.00 &&
						po_vat !=0) 
			{
					POBean po = FactoryBean.getInstance(po_bcompany,
						po_baddress,
						po_bcity,
						po_bzip,
						po_btelephone,
						po_number,
						po_date,
						po_ship,
						po_fob,
						po_terms,
						po_customer_name,
						po_vcompany,
						po_vaddress,
						po_vcity,
						po_vzip,
						po_vtelephone,
						po_scompany,
						po_saddress,
						po_scity,
						po_szip,
						po_stelephone,
						po_item1_num,
						po_item1_desc,
						po_item1_quantity,
						po_item1_price,
						po_item2_num,
						po_item2_desc,
						po_item2_quantity,
						po_item2_price,
						po_item3_num,
						po_item3_desc,
						po_item3_quantity,
						po_item3_price,
						po_item4_num,
						po_item4_desc,
						po_item4_quantity,
						po_item4_price,
						po_item5_num,
						po_item5_desc,
						po_item5_quantity,
						po_item5_price,
						po_vat);
				
					request.setAttribute("po", po);
					
					RequestDispatcher dispatcher = request.getRequestDispatcher("display.jsp");
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

package factory;

import model.POBean;

public class FactoryBean {
	public static POBean getInstance(String or_store_name,
				String or_address,
				String or_zip_code,
				String or_telephone,
				String or_tin,
				String or_number,
				String or_cashier_name,
				String or_customer_name,
				String or_item1_des,
				int or_item1_quantity,
				double or_item1_price,
				String or_item2_desc,
				int or_item2_quantity,
				double or_item2_price,
				String or_item3_desc,
				int or_item3_quantity,
				double or_item3_price,
				String or_item4_desc,
				int or_item4_quantity,
				double or_item4_price,
				String or_item5_desc,
				int or_item5_quantity,
				double or_item5_price,
				String or_purchased_date,
				String or_payment_method,
				int or_vat,
				String or_return_policy)
	{
		POBean or = new POBean();
		
		or.setOr_store_name(or_store_name);
		or.setOr_address(or_address);
		or.setOr_zip_code(or_zip_code);
		or.setOr_telephone(or_telephone);
		or.setOr_tin(or_tin);
		or.setOr_number(or_number); 
		or.setOr_cashier_name(or_cashier_name);
		or.setOr_customer_name(or_customer_name);
		or.setOr_item1_des(or_item1_des);
		or.setOr_item1_quantity(or_item1_quantity); 
		or.setOr_item1_price(or_item1_price); 
		or.setOr_item2_desc(or_item2_desc);
		or.setOr_item2_quantity(or_item2_quantity); 
		or.setOr_item2_price(or_item2_price); 
		or.setOr_item3_desc(or_item3_desc); 					
		or.setOr_item3_quantity(or_item3_quantity); 
		or.setOr_item3_price( or_item3_price);			
		or.setOr_item4_desc(or_item4_desc); 					
		or.setOr_item4_quantity(or_item4_quantity); 
		or.setOr_item4_price(or_item4_price); 		
		or.setOr_item5_desc(or_item5_desc);					
		or.setOr_item5_quantity(or_item5_quantity); 
		or.setOr_item5_price(or_item5_price);			
		or.setOr_purchased_date(or_purchased_date);
		or.setOr_payment_method(or_payment_method);
		or.setOr_vat(or_vat); 
		or.setOr_return_policy(or_return_policy);
				
		return or;
	}
}


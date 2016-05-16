package factory;

import model.POBean;

public class FactoryBean {
	public static POBean getInstance(String po_bcompany,
			String po_baddress,
			String po_bcity,
			String po_bzip,
			String po_btelephone,
			String po_number,
			String po_date,
			String po_ship,
			String po_fob,
			String po_terms,
			String po_customer_name,
			String po_vcompany,
			String po_vaddress,
			String po_vcity,
			String po_vzip,
			String po_vtelephone,
			String po_scompany,
			String po_saddress,
			String po_scity,
			String po_szip,
			String po_stelephone,
			String po_item1_num,
			String po_item1_desc,
			int po_item1_quantity,
			double po_item1_price,
			String po_item2_num,
			String po_item2_desc,
			int po_item2_quantity,
			double po_item2_price,
			String po_item3_num,
			String po_item3_desc,
			int po_item3_quantity,
			double po_item3_price,
			String po_item4_num,
			String po_item4_desc,
			int po_item4_quantity,
			double po_item4_price,
			String po_item5_num,
			String po_item5_desc,
			int po_item5_quantity,
			double po_item5_price,
			int po_vat)
	{
		POBean po = new POBean();
		
		po.setPo_bcompany(po_bcompany);
		po.setPo_baddress(po_baddress);
		po.setPo_bcity(po_bcity);
		po.setPo_bzip(po_bzip);
		po.setPo_btelephone(po_btelephone);
		po.setPo_number(po_number);
		po.setPo_date(po_date);
		po.setPo_ship(po_ship);
		po.setPo_fob(po_fob);
		po.setPo_terms(po_terms);
		po.setPo_customer_name(po_customer_name);
		po.setPo_vcompany(po_vcompany);
		po.setPo_vaddress(po_vaddress);
		po.setPo_vcity(po_vcity);
		po.setPo_vzip(po_vzip);
		po.setPo_vtelephone(po_vtelephone);
		po.setPo_scompany(po_scompany);
		po.setPo_saddress(po_saddress);
		po.setPo_scity(po_scity);
		po.setPo_szip(po_szip);
		po.setPo_stelephone(po_stelephone);
		po.setPo_item1_num(po_item1_num);
		po.setPo_item1_desc(po_item1_desc);
		po.setPo_item1_quantity(po_item1_quantity);
		po.setPo_item1_price(po_item1_price);
		po.setPo_item2_num(po_item2_num);
		po.setPo_item2_desc(po_item2_desc);
		po.setPo_item2_quantity(po_item2_quantity);
		po.setPo_item2_price(po_item2_price);
		po.setPo_item3_num(po_item3_num);
		po.setPo_item3_desc(po_item3_desc);
		po.setPo_item3_quantity(po_item3_quantity);
		po.setPo_item3_price(po_item3_price);
		po.setPo_item4_num(po_item4_num);
		po.setPo_item4_desc(po_item4_desc);
		po.setPo_item4_quantity(po_item4_quantity);
		po.setPo_item4_price(po_item4_price);
		po.setPo_item5_num(po_item5_num);
		po.setPo_item5_desc(po_item5_desc);
		po.setPo_item5_quantity(po_item5_quantity);
		po.setPo_item5_price(po_item5_price);
		po.setPo_vat(po_vat);
				
		return po;
	}
}


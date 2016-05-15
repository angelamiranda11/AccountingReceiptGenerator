<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Generate Official Receipt</title>
</head>

<style>
	#seller {
		float:left;
	    line-height:30px;
	    height:100px;
	    width:50px;

	}

	#purchases{
		float:right;
    	width:350px; 
    	margin-right:530px; 		 
	}
	#receipt{
		float:right;
    	width:350px;
    	padding:10px;
    	margin-top:-950px;
    	margin-bottom:520px;	
    	margin-right:130px; 	 
	}

</style>


<body>
	<center><h1> Official Receipt </h2></center>
	<i> Please fill in the blanks: </i>
	<form action="process.html" method="post">
		<div id="seller">
			<fieldset>
				<legend><b>GENERAL INFORMATION </b></legend>
				<p>Store Name: <input type="text" name="or_store_name" size="20"></p>
				<p>Address: <input type="text" name="or_address" size="50"></p>
				<p>Zip Code: <input type="text" name="or_zip_code" size="6"></p>
				<p>Telephone Number: <input type="text" name="or_telephone" size="20"></p>
				<p>TIN Number: <input type="text" name="or_tin" size="16"></p>
				<hr>
				<p>Official Receipt Number: <input type="text" name="or_number" size="16"></p>
				<p>Cashier (Name/Number): <input type="text" name="or_cashier_name" size="16"></p>
				<p>Customer (Name/Number): <input type="text" name="or_customer_name" size="16"></p>
				
			</fieldset>
		</div> 
		
	 	<div id="purchases">
			<fieldset>
				<legend><b>PURCHASES</b></legend>
				<i><font color="red">**max of 5 purchases only</font></i>
				<br>
				<fieldset>
					<legend>Item #1 </legend>
					<p>Description: <input type="text" name="or_item1_desc" size="20"></p>
					<p>Quantity: <input type="text" name="or_item1_quantity" size="20"></p>
					<p>Price Per Item: <input type="text" name="or_item1_price" size="20"></p>
				</fieldset>
				<br>
				<fieldset>
					<legend>Item #2 </legend>
					<p>Description: <input type="text" name="or_item2_desc" size="20"></p>
					<p>Quantity: <input type="text" name="or_item2_quantity" size="20"></p>
					<p>Price Per Item: <input type="text" name="or_item2_price" size="20"></p>
				</fieldset>
				<br>
				<fieldset>
					<legend>Item #3 </legend>
					<p>Description: <input type="text" name="or_item3_desc" size="20"></p>
					<p>Quantity: <input type="text" name="or_item3_quantity" size="20"></p>
					<p>Price Per Item: <input type="text" name="or_item3_price" size="20"></p>
				</fieldset>
				<br>
				<fieldset>
					<legend>Item #4 </legend>
					<p>Description: <input type="text" name="or_item4_desc" size="20"></p>
					<p>Quantity: <input type="text" name="or_item4_quantity" size="20"></p>
					<p>Price Per Item: <input type="text" name="or_item4_price" size="20"></p>
				</fieldset>
				<br>
				<fieldset>
					<legend>Item #5 </legend>
					<p>Description: <input type="text" name="or_item5_desc" size="20"></p>
					<p>Quantity: <input type="text" name="or_item5_quantity" size="20"></p>
					<p>Price Per Item: <input type="text" name="or_item5_price" size="20"></p>
				</fieldset>
			</fieldset>
		</div>

		<div id="receipt">
			<fieldset>
				<legend><b>PAYMENT METHOD and TAX: </b></legend>
				<p>Date Purchased <input type="date" name="or_purchased_date"></p>
				<p>Payment Method: 
						<input type="radio" name="or_payment_method" value="CASH">CASH</p>
						<input type="radio" name="or_payment_method" value="CREDIT CARD">CREDIT CARD</p>
						<input type="radio" name="or_payment_method" value="CHECK">CHECK</p>
				</p>
				<p>Value Added Tax (VAT) Rate (%): <input type="number" name="or_vat" size="3"></p>

				<p>Return Policy: 
						<input type="radio" name="or_return_policy" value="No Returns W/O Receipt">No Returns W/O Receipt</p>
						<input type="radio" name="or_return_policy" value="7 days">7 days</p>
						<input type="radio" name="or_return_policy" value="No Returns">No Returns</p>
						<input type="radio" name="or_return_policy" value="Original Packaging">Original Packaging</p>
				</p>

			</fieldset>
		</div>
		<br>
		<br>
		
		<div>
			<p><input type="submit" value="Generate Official Receipt"></p>
		</div>
	</form>
</body>
</html>
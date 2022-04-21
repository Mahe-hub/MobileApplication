	package Q2;
	import java.util.*;
	public class Visit
	{
	
			private Customer customer;
			private Date date;
			private double serviceExpense;
			private double productExpensive;
	
			public Visit(String name,Date date) 
			{
			 customer=new Customer();
			 this.customer.name=name;
			 this.date=date;
			}
	
			public String getName() {
			return this.customer.getName();
			}
			public double getServiceExpense() {
			return this.serviceExpense;
			}
			public void setServiceExpense(double serviceExpense) {
			this.serviceExpense = serviceExpense;
			}
			public double getProductExpensive() {
			return this.productExpensive;
			}
			public void setProductExpensive(double productExpensive) {
			this.productExpensive = productExpensive;
			}
	
			public double getTotalExpensive() {
			return this.getProductExpensive()+this.getServiceExpense();
			}
	
			public String toString(){
			return this.customer.toString()+"\ndate of vist: "+this.date+"\nService Expense "+this.getServiceExpense()
			       +"\nProduct Expenses = "+this.getProductExpensive() +"\nTotal = "+this.getTotalExpensive();
			}
			
		
		
		
		
	}

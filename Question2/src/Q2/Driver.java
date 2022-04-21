	package Q2;
	import java.util.*;
	import java.util.Date;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	public class Driver {
	
		public static void main(String[] args) 
		{
			// define vairables 
			Scanner input= new Scanner(System.in);
			String name,memberType="";
			boolean isMem;
			int numberOfProducts, numberOfServices;
			double priceOfProduct,priceOfService;
			Date data=null;
			Customer C;
			Visit v;
			
			String date;
			
			//-------------------------
			//welcome message 
			System.out.println("Welcome to out Program \n ---------------");
			
			System.out.println("Enter the name ");
			name= input.nextLine();
			System.out.println("Are you a member ? if yes(enter true) , no (enter false)");
			isMem=input.nextBoolean();
			// if the customer is member  enter your type
			if(isMem) 
			{
				System.out.println("Enter the member type ");
				memberType=input.next();
			}
			
			/*
			// define object from Customer class
			Customer cus = new Customer(name);
			*/
			// ask user to enter the visit date
			System.out.println("Enter the visit date ");
			date=input.next();
			try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		    data=sdf.parse(date);
			}
			catch(Exception e)
			{
				System.out.println("The exception is "+e);
			}
			
			// ask user to enter the number of services
			System.out.println("Enter the number of services ");
			numberOfServices=input.nextInt();
			
			//ask user to enter the number of products 
			System.out.println("Enter the number of products ");
			numberOfProducts=input.nextInt();
			
			// ask user to enter the price of one service
			// because  the price for all services is same 
			System.out.println("Enter the price of service ");
			priceOfService=input.nextDouble();
			
			// ask user to enter the price of one service
			// because  the price for all prodcuts is same 
			System.out.println("Enter the price of service ");
			priceOfProduct=input.nextDouble();
			
			// intansiate objects
			// instansiate Customer
			 C = new Customer();
			 C.SetMember(isMem);
			 if(isMem!=false) { C.setMemberType(memberType);}
	       // instansiate visit
			 v = new Visit(name,data);
		   // calculate the price 
		   switch(memberType) 
		   {
		      case  "Premium": 
		      {
		    	 // calculate the service expenses
		    	 double Discountrate= DiscountRate.getServiceDiscountRate("Premium");
		    	 double DiscountAmount=priceOfService*Discountrate;
		    	 double priceAfterDiscount=priceOfService-DiscountAmount;
		    	 double totalServiceExp=priceAfterDiscount*numberOfServices;
		    	 v.setServiceExpense(totalServiceExp);
		    	 
		    	 
		    	 // calculate product expenses
		    	 Discountrate= DiscountRate.getProductDiscountRate("Premium");
		    	 DiscountAmount=priceOfProduct*Discountrate;
		    	 priceAfterDiscount=priceOfProduct-DiscountAmount;
		    	 double totalProductExp= priceAfterDiscount*numberOfProducts;
		    	 v.setProductExpensive(totalProductExp);
		    	 break;
		    	 
		      }
		      
		      case  "Gold": 
		      {
		    	 // calculate the service expenses
		    	 double Discountrate= DiscountRate.getServiceDiscountRate("Gold");
		    	 double DiscountAmount=priceOfService*Discountrate;
		    	 double priceAfterDiscount=priceOfService-DiscountAmount;
		    	 double totalServiceExp=priceAfterDiscount*numberOfServices;
		    	 v.setServiceExpense(totalServiceExp);
		    	 
		    	 
		    	 // calculate product expenses
		    	 Discountrate= DiscountRate.getProductDiscountRate("Gold");
		    	 DiscountAmount=priceOfProduct*Discountrate;
		    	 priceAfterDiscount=priceOfProduct-DiscountAmount;
		    	 double totalProductExp= priceAfterDiscount*numberOfProducts;
		    	 v.setProductExpensive(totalProductExp);
		    	 break;
		      }
		      
		      case  "Silver": 
		      {
		    	 // calculate the service expenses
		    	 double Discountrate= DiscountRate.getServiceDiscountRate("Silver");
		    	 double DiscountAmount=priceOfService*Discountrate;
		    	 double priceAfterDiscount=priceOfService-DiscountAmount;
		    	 double totalServiceExp=priceAfterDiscount*numberOfServices;
		    	 v.setServiceExpense(totalServiceExp);
		    	 
		    	 
		    	 // calculate product expenses
		    	 Discountrate= DiscountRate.getProductDiscountRate("Silver");
		    	 DiscountAmount=priceOfProduct*Discountrate;
		    	 priceAfterDiscount=priceOfProduct-DiscountAmount;
		    	 double totalProductExp= priceAfterDiscount*numberOfProducts;
		    	 v.setProductExpensive(totalProductExp);
		    	 break;
		      }
		      
		      default :
		      {
		    	// calculate the service expenses
			    double totalServiceExp=priceOfService*numberOfServices;
			    v.setServiceExpense(totalServiceExp);
			    
			    // calculate product expenses
			    double Discountrate= DiscountRate.getProductDiscountRate("");
		    	double DiscountAmount=priceOfProduct*Discountrate;
		    	double priceAfterDiscount=priceOfProduct-DiscountAmount;
		    	double totalProductExp= priceAfterDiscount*numberOfProducts;
		        v.setProductExpensive(totalProductExp);
		    	  
		      }
		      
		   }
		      // output the result;
		       String line=v.toString();
		       System.out.println(line);
		       System.out.println("--------------------------------\nThank you for using our program");
		      
		   
		}
	
	}

package test;

import java.util.*;// to use the Random class
import java.util.regex.*;
public class Genrate {

	public static void main(String[] args) {



		//define the array 
		
		//Using the link http://www.gutenberg.org/cache/epub/19033/pg19033.txt. 
		 String [][][] book = { 
				                     {
				 
				                               {"Alice was beginning to get very tired of sitting by her sister on the\n",
				                             	"bank, and of having nothing to do. Once or twice she had peeped into the\n",
				                                "book her sister was reading, but it had no pictures or conversations in\n",
				                                "it, \"and what is the use of a book,\" thought Alice, \"without pictures or\r\n",
				                       	        "conversations?\"\n"},
				                       
				                               {"So she was considering in her own mind (as well as she could, for the\n",
				                       	        "day made her feel very sleepy and stupid), whether the pleasure of\n",
				                       	        "making a daisy-chain would be worth the trouble of getting up and\n",
				                       	        "picking the daisies, when suddenly a White Rabbit with pink eyes ran\n",
				                       	        "close by her.\"\n"},
				                       
				                              {"There was nothing so very remarkable in that, nor did Alice think it so\n",
				                               "very much out of the way to hear the Rabbit say to itself, \"Oh dear! Oh\n",
				                       	       "dear! I shall be too late!\" But when the Rabbit actually took a watch\n",
				                       	       "out of its waistcoat-pocket and looked at it and then hurried on, Alice\n",
				                           	   "started to her feet, for it flashed across her mind that she had never\n",
				                       	       "before seen a rabbit with either a waistcoat-pocket, or a watch to take\n",
				                       	       "out of it, and, burning with curiosity, she ran across the field after\n",
				                       	       "it and was just in time to see it pop down a large rabbit-hole, under\n",
				                       	       "the hedge. In another moment, down went Alice after it!"}
		                               },
				                       
				                       { 
				                       		 {"\"What a curious feeling!\" said Alice. \"I must be shutting up like a\n",
				                       		      "telescope!\"\n"},
				                       			 
				                       	     {"And so it was indeed! She was now only ten inches high, and her face\n",
				                       	      "brightened up at the thought that she was now the right size for going\n",
				                       	         "through the little door into that lovely garden."},
				                       	 
				                       	        {"After awhile, finding that nothing more happened, she decided on going\n",
				                       	         "into the garden at once; but, alas for poor Alice! When she got to the\n",
				                       	          "door, she found she had forgotten the little golden key, and when she\n",
				                       	          "went back to the table for it, she found she could not possibly reach\n",
				                       	          "it: she could see it quite plainly through the glass and she tried her\n",
				                       	          "best to climb up one of the legs of the table, but it was too slippery,\n",
				                       	          "and when she had tired herself out with trying, the poor little thing\n",
				                       	           "sat down and cried.\n"},
				                       	        
				                       	        {"Come, there's no use in crying like that!\" said Alice to herself rather\n",
				                       	         "sharply. \"I advise you to leave off this minute!\" She generally gave\n",
				                       	         "herself very good advice (though she very seldom followed it), and\n",
				                       	 	     "sometimes she scolded herself so severely as to bring tears into her\n",
				                       	         "eyes.\n"},
				                       	        
				                       	       {"Soon her eye fell on a little glass box that was lying under the table:\n",
				                       	        "she opened it and found in it a very small cake, on which the words \"EAT\n",
				                       	        "ME\" were beautifully marked in currants. \"Well, I'll eat it,\" said\n",
				                       	        "Alice, \"and if it makes me grow larger, I can reach the key; and if it\n",
				                       	        "makes me grow smaller, I can creep under the door: so either way I'll\n",
				                       	        "get into the garden, and I don't care which happens!\"\n"},
				                       	       
				                       	       {"She ate a little bit and said anxiously to herself, \"Which way? Which\n",
				                       	        "way?\" holding her hand on the top of her head to feel which way she was\n",
				                       	        "growing; and she was quite surprised to find that she remained the same\n",
				                       	       "size. So she set to work and very soon finished off the cake."}
				                               },
				                       
				                       {
				                    	      {"The King and Queen of Hearts were seated on their throne when they\n",
				                    	        "arrived, with a great crowd assembled about them--all sorts of little\n",
				                    	      	"birds and beasts, as well as the whole pack of cards: the Knave was\n",
				                    	      	"standing before them, in chains, with a soldier on each side to guard\n",
				                    	      	"him; and near the King was the White Rabbit, with a trumpet in one hand\n",
				                    	      	 "and a scroll of parchment in the other. In the very middle of the court\n",
				                    	      	 "was a table, with a large dish of tarts upon it. \"I wish they'd get the\n",
				                    	      	 "trial done,\" Alice thought, \"and hand 'round the refreshments!\"\n"},
				                    	      
				                    	      {"The judge, by the way, was the King and he wore his crown over his great\r\n",
				                    	      	"wig. \"That's the jury-box,\" thought Alice; \"and those twelve creatures\r\n",
				                    	      	"(some were animals and some were birds) I suppose they are the jurors.\"\n"},
				                    	      
				                    	      {"Just then the White Rabbit cried out \"Silence in the court!\"\n"},
				                    	      
				                    	      {"\"Herald, read the accusation!\" said the King."}
				                       }
                                	};
	
		 // define the vairables
	     String candidatePassword="";
	     int lengthCounter=0,upperCounter=0,lowerCounter=0,finalPassword=0,specialCharacter=0,counterNewLine=0,counterSingle=0;
       
	
		 //Welcome Message
		 System.out.println("Welcome to gernate password programe");
	    do 
	    {
		 // get the candidate password 
		    candidatePassword=CreatePassword(book); 		
		    counterNewLine=Integer.parseInt(candidatePassword.substring(candidatePassword.length()-1));
		 // get the candidate password 
	     // check if the password contains same words
		 candidatePassword=isSame(candidatePassword,book);
		 // check the length of password between 8 and 16
		 boolean flag=false;
		 
		 do 
		 {
		  if(candidatePassword.length()<8 || candidatePassword.length()>16)
		  {
			  
			
			
			  candidatePassword=CreatePassword(book);
			 counterNewLine=Integer.parseInt(candidatePassword.substring(candidatePassword.length()-1));
			  candidatePassword=isSame(candidatePassword,book);
			 flag=true;
		  
		  }
		 
		  
		  else if( isAllpresentUpper(candidatePassword)==false) 
		  {
			 
			  upperCounter++;
			 candidatePassword=CreatePassword(book);
			 
			 counterNewLine=Integer.parseInt(candidatePassword.substring(candidatePassword.length()-1));		  
			  candidatePassword=isSame(candidatePassword,book);
			  flag=true;
		  
		  }
		  
		  else if(isAllpresentLower(candidatePassword)==false) 
		  {
			  lowerCounter++;
              candidatePassword=CreatePassword(book);
              counterNewLine=Integer.parseInt(candidatePassword.substring(candidatePassword.length()-1));
			  candidatePassword=isSame(candidatePassword,book);
              flag=true;
		  }
		  
		  else if (isAllpresentSpecial(candidatePassword)!=1) 
		  {
			  specialCharacter++;
			  candidatePassword=CreatePassword(book);
			  counterNewLine=Integer.parseInt(candidatePassword.substring(candidatePassword.length()-1));
			  candidatePassword=isSame(candidatePassword,book);
              flag=true;
		  
		  }
		  
		  
		  else {flag=false;}
		  
		 }while(flag);
		
	
		 System.out.println(String.format("%-30s", "Password = " + candidatePassword) + String.format("%-15s", "NewLine = "+counterNewLine ) + String.format("%-15s", "Single = " + counterSingle) + String.format("%-15s", "Equal = " +0 ) + String.format("%-15s", "Length = " + lengthCounter) + String.format("%-15s", "Upper = " + upperCounter) + String.format("%-15s", "Lower = " +  lowerCounter) + String.format("%-15s", "Special = " + specialCharacter));
			 finalPassword++;
			 lengthCounter=0;
			 lowerCounter=0;
			 specialCharacter=0;
			 upperCounter=0;		 
	    }while(finalPassword<10000 &&  lowerCounter==0);
	    
	    System.out.println();
		System.out.println(String.format("%-30s","Total Password genrated = "+finalPassword ));
		System.out.println(String.format("%-30s","Thank you for using our problem "));
		 
		 
	}
	
	
	
	
	public static String CreatePassword(String book[][][]) 
	{
		int countN=0;
		int countC=0;
		 String[]words=CreateWords(book);
		 int size=words.length;
		 int counterCandidatePassword=0;
		 String candidatePassword="";
		 for(int i=0;i<size;i++) 
		 {
			      // if we have 3 words terminate the loop 
			      if(counterCandidatePassword==3) {break;}
			      // check if the word length in equal to 2 or less or contain \n
				  if((words[i].length()<=2) ||(words[i].contains("\n")))
					 {
				         if((words[i].contains("\n"))){countN++;}
				         else {countC++;}
					   // if true select another generate another line
						 String[]newwords=CreateWords(book);
						 size=newwords.length;
				         words=newwords;
				         i=0;
					 }
				 // if not contain add to the vairable that save the candidate password
		       	candidatePassword+=words[i]+" ";
		        counterCandidatePassword+=1;
				
		  }
		 
		
		 
		 return candidatePassword+countN;
		
	}
	

	public static String[] CreateWords (String[][][] b) 
	{
		Random Rand= new Random();
		// get the page Number 
		  int PageNumber=Rand.nextInt(b.length);
		// get the paragraph number
		  int ParagraphNumber=Rand.nextInt(b[PageNumber].length);
		//get the line number
		  int LineNumber=Rand.nextInt(b[PageNumber][ParagraphNumber].length);
		// get the line from the book array   
		  String line =b[PageNumber][ParagraphNumber][LineNumber];
		// get words
		  String[]newArry=line.split(" ");
		  return newArry;
	 }
	
	public static String isSame(String a,String book[][][])
	{
	     int sameCounter=0;
		 String []Passwd=a.split(" ");
		 int size=Passwd.length;
		 String returnPasswd="";
		 int  counterPasswd=0;
		
		 for(int counter=0;counter<size;counter++) 
		 {
			 String compareValue=Passwd[counter];
			 
			 for(int innerCounter=counter+1;innerCounter<size;innerCounter++) 
			 {
				 if(compareValue.compareTo(Passwd[innerCounter])==0) 
				 {
					 
					 // comeback to step2
					 String [] newCandidate=CreateWords(book);
					 size=newCandidate.length;
					 Passwd=newCandidate;
					 counter=0;
					 compareValue=Passwd[counter];
					 innerCounter=counter+1; 
					 sameCounter++;
				 }
				 
				 
		     }
			 returnPasswd+= compareValue;
			 counterPasswd+=1;
			 if( counterPasswd==3) {break;}
		 }
		 
		 return returnPasswd;
	}
	
	public static boolean isAllpresentUpper(String a) 
	{
	    boolean value;
		String regex="^.*[A-Z].*";
		Pattern p = Pattern.compile(regex);
		Matcher m=p.matcher(a);
		if(m.matches()) 
		{
			value =true;
		}
		else{value= false;}
		return value;
	}
	
	
	public static boolean isAllpresentLower(String a) 
	{
	    boolean value;
		String regex="^.*[a-z].*";
		Pattern p = Pattern.compile(regex);
		Matcher m=p.matcher(a);
		if(m.matches()) 
		{
			value =true;
		}
		else {value=false;}
		return value;
	}
	
	public static int isAllpresentSpecial(String a) 
	{
	    int value=0;
	    int z=0;
	    String regex="^.*[@$!%*#?&+_-].*";
		Pattern p = Pattern.compile(regex);
		String [] special= a.split(" ");
		while(z<special.length)
		{
		 Matcher m=p.matcher(special[z]);
		 if(m.matches()) 
		 	value++;
		z++;
	  }
	 return value;
	}
	
}



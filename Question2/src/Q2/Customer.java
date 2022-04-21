package Q2;
//--------------------------------------------------------------------
//Assignment (1)
//Written by: (Maher Deeb 209-5376)
//For Application Development 2 (Mobile) - Winter 2022
//--------------------------------------------------------------------
public class Customer 
{
	protected  String name;
	private boolean  member=false;
	private String memberType;
	
	public Customer() {};
	
	public Customer(String name) 
	{
		this.name=name;
	}
	
	public String getName() 
	{
		return this.name;
	}
	
	public boolean isMember() 
	{
		return this.member;
	}
	
    public void SetMember(boolean member) 
    {
    	this.member=member;
    }
    
    public String getMemberType() 
    {
    	return this.memberType;
    }
    
    public void setMemberType(String memberType) 
    {
    	this.memberType=memberType;
    }
    
    public String toString()
    {
    	return "--------------------\nname "+this.getName()+"\nis member "+this.isMember()+"\nmember type "+this.getMemberType();
    }
		
		

}

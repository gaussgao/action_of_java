package Demo2;



public class Demo1Action   {


	public String execute()throws Exception
	{
		
		System.out.println("Welcome to action world.");
		
		return "success";
	}
	private String name;
	

	   
	   
	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
}

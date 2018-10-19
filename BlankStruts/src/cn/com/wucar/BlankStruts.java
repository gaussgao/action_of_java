package cn.com.wucar;


public class BlankStruts {
	private String name;
	
	private String passwd;
	
	public String execute() throws Exception 
	{
	  
	  
	  if (getName().length()%2 == 0)
		  return "success";
	  else
		  return "error";
	}
   
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
   
   
   public String getPasswd() {
	      return passwd;
	   }

	   public void setPasswd(String passwd) {
	      this.passwd = passwd;
	   }
}

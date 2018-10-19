package Demo2;

public class Dem2Action {
	private String name;
	    public String execute() {
	        System.out.println("执行action");
	        return "success";
	    }
	    public String getName() {
	        return name;
	     }

	     public void setName(String name) {
	        this.name = name;
	     }
}

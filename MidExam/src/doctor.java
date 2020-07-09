
public class doctor extends schedule{
	//Attributes
	private String name;
	private String spec;
	private String date;
	private String time;
	private String day;

	//Constructor
	public doctor(String name,String spec,String date,String time,String day){
	this.name=name;
	this.spec=spec;
	this.date=date;
	this.time=time;
	this.day=day;
	}
	
	//Setter Methods
	public void setname(String name){
		this.name=name;
	}
	public void setspecialization(String spec){
		this.spec=spec;
	}
	public void setdate(String date){
		this.date=date;
	}
	public void settime(String time){
		this.time=time;
	}
	public void setday(String day){
		this.day=day;
	}
	
	//Getter Methods
	public String getname(){
		return name;
	}
	public String getspec(){
		return spec;
	}
	public String getdate(){
		return date;
	}
	public String gettime(){
		return date;
	}
	public String getday(){
		return day;
	}
}
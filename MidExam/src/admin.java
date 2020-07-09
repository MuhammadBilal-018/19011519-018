import java.util.*;
public class admin {

	public static void main(String[] args) {
		System.out.println("\t\t\t\tWELLCOME TO  SYSYTEM\t\t\t\t\t");
		Storage L=new Storage();
		Scanner sc= new Scanner(System.in);
		int x=0;
		
		while(x==0){
		System.out.println("\n\nPress 1 to Login as Admin:\nPress 2 to Login as Patient:");
		String input=sc.nextLine();
		int menu=1;
		
		switch(input){
			
			case "1":
			
			int setpassword = 12345;
		    System.out.println("\n\nEnter Password to Login:");
			int getpassword=sc.nextInt();
			if(setpassword==getpassword){
				
			do{
			System.out.println("\n\nPress 1 to Enter A Doctor in Schedule!:\nPress 2 to exist!");
		
			String input1=sc.nextLine();
			switch(input1){
	
			case "1":
			L.addDoctorList();
		
			break;
			case "2":
			menu=3;
		
		}
	}while(menu==1);
}
			else{
				System.out.println("\n\nYour Password is incorrect:Re-Enter Password!");
				}
			break;
			
			case "2":
			System.out.println("\n\nEnter Name of a Doctor you want to search:");
			String name=sc.nextLine();
			L.searchdoctor(name);
			
			}
		}

	}

}

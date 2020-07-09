import java.util.*;
import java.util.Scanner;
public class Storage extends schedule{

	//Hashmaps to store Doctor schedule List
	HashMap<String,ArrayList<doctor>> doctorList=new HashMap<String,ArrayList<doctor>>();
	Scanner sc= new Scanner(System.in);
	
	
	public void addDoctorMap(String s,ArrayList<doctor> c){
		doctorList.put(s,c);
		}
	//Method to add candidate in ArrayList
		public void addDoctorList(){
		
		String input2;;
		System.out.println("\nEnter Doctor Name");
		String name=sc.nextLine();
		
		ArrayList <doctor> doctorSchedule=new ArrayList<doctor>();
		System.out.println("\nEnter Specialization of candidate:");
		String spec=sc.nextLine();
		System.out.println("\nEnter Today's Date:");
		String date=sc.nextLine();
		System.out.println("\nEnter Time:");
		String time=sc.nextLine();
		System.out.println("\nEnter Day:");
		String day=sc.nextLine();
		doctorSchedule.add(new doctor(name,spec,date,time,day));
		
		addDoctorMap(name,doctorSchedule);
		}
	
			//Method to Iterate Candidates arraylist against a specfic key from hashmap
		public void searchdoctor(String s){
		Set<String> setOfKeySet = doctorList.keySet();
 
        for(String key : setOfKeySet) {
			if(key.equals(s)){
            System.out.println("\nDoctor Name: "  + key );
 
            for(doctor doctorname : doctorList.get(key)) {
				System.out.println("\t\t\t\t"+"Specialization\t\t"  +  "Date\t\t"+"Time\t\t"+"Day\t");
                System.out.println("\t\t\t\t" + doctorname.getspec()+"\t\t"+doctorname.getdate()+"\t"+doctorname.gettime()+"\t"+doctorname.getday());
				}

			}
			else{
				System.out.println("\nSORRY!!!!!NO Doctor register of this name!");
			}
		}

	}

}

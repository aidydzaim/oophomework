
// application team in UTP
public class Main
{
    // application code
	public static void main(String[] args) {
	  
        Student aidyd = new Student();
        Name name = new Name();
        name.setFName("Aidyd");
        name.setMName("Learns to");
        name.setLName("Rok");
        aidyd.setName(name);

        Student anis = new Student();
        name = new Name();
        name.fname = "Anis";
        name.mname = "Aqilah";
        name.lname = "Zulkifli";
        anis.setName(name);
        
        
        Student imran = new Student();
        name = new Name();
        name.setFName("Syed");
        name.setLName("Imran");
        imran.setName(name);

        // creating a batch object
        Studentbatch sb2023 = new Studentbatch();
        sb2023.add(aidyd);
        sb2023.add(anis, 0);       
        
        // declare a method that allows for the following:
        boolean isIn = sb2023.find("Adlin");
        
        

        Teacher cikguminah = new Teacher();
        name = new Name();
        name.setFName("Aidyd");
        aidyd.setName(name);
        
        for (int i=0; i<5; i++) 
            aidyd.setMark(100, i);
        
        // calculate and print the avg
        float avg = 0;
        avg = aidyd.calcAvg();
        System.out.println("Avg = " + avg);
        
        // calculate the min marks for aidyd
        System.out.println("Min = " + aidyd.calcMin());        
	}
}
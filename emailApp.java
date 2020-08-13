
//creating email account for new hires
import java.util.Scanner;
// import java.lang.Math;
// import java.util.*;
import java.util.Random;

public class emailApp{
public static void main(String[]args){
  Email test= new Email();
  // test.start();
  // test.passGenerator(8);
  // test.Email("Rebecca", "Dufresne");
  // test.newEmail("Rebecca", "Dufresne");
  
}//dont touch
}//dont touch
class Email{
private String email= "New.Hire@email.com";
private String password;
private String department= "HR";
private int Mailcapacity;
private int passlength= 10;
Random rand= new Random();
Scanner scanner= new Scanner(System.in);


//Generate email
public void Email(){

}
public void Email(String firstname, String lastname){
  this.email = firstname+"."+lastname +"."+ department + "@company.com";

  System.out.println("Email:"+email);
  System.out.println("Password: ");
  passGenerator(8);
  capacity(2);
}

public static void sort(int[] Arr){
        int low=Arr[0];
        int[] newArr= new int[Arr.length];
        for(int i=0; i< Arr.length; i++){
           newArr[i]+= Arr[i];
           System.out.println(newArr);

        }
//define alternate email adress
public void newEmail(String firstname, String lastname){
  int num= rand.nextInt(9);
  this.email= (firstname + lastname + num+ "." + department + "@company.com");
  System.out.println(email);
}

public void capacity(int cap){
  this.Mailcapacity= cap;
}

//User department
public void Department(String dep){
  if(dep== "1"){
    dep= "Sales";
    this.department= dep;
  }
  else if (dep == "2"){
    dep= "development";
    this.department= dep;
  }
  else if(dep== "3"){
    dep= "accounting";
    this.department= dep;
  }
  else{
    System.out.println("");
  }
}

//Generte random password
public String passGenerator(int length){
  int num; //random
  String[] random= {"a","b","d","G","O","W","r",
                    "s","j","1","6","9","5","@","$","%"}; //store String to use
  String[] newpass= new String[length]; //new array for new password using stored string
   //call random function
  for (int i= 0; i<= length-1; i++){
    // index 5 is greater than length 5, take away last index to make it equal to length
    num= rand.nextInt(random.length); //randomize array index based on the length
    newpass[i]= random[num]; //copy into new array
  }
  for (String password: newpass) //show array
     System.out.print(password);
  return password;
}

//User set new password
public void NewPassword(String pass){
  //if statement
  this.password= pass;
  System.out.println(password);
}

// password
public void setPassword(){
  //call scanner
  String pass1;
  System.out.println("\n");
   //What and how
  System.out.println("Password");
  pass1= scanner.next();
  System.out.println("\n");
  System.out.println("New Email");
  NewPassword(pass1);
}

  //Starting window
  public void start(){
    String name1; //first name
    String name2; //lastame
    String cancel; //exit
    String dep1; //department

    System.out.println("Welcome, your current email is: " + email +" \ncurrent password:  "+ password);
    System.out.println("Let's change the information: Warning, everything is case sensative");
    System.out.println("Enter First name");
    name1= scanner.next();
    System.out.println("Enter Last name");
    name2= scanner.next();
    System.out.println("Enter Department");
    System.out.println("1: Sales"+" \n 2: Development"+ "\n 3: Accounting");
    dep1= scanner.next();
    System.out.println("To cancel press 0");
    cancel= scanner.next();
    while(cancel != "0"){
      Email(name1, name2);
      Department(dep1);
      // setPassword
      if (cancel == "0"){
        break;
      }
    }
  }
}//dont touch

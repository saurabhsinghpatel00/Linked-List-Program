import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/**This class holds passenger details**/
class Passenger {

   private String userId;
   private double fare;
  
   public Passenger(String userId) {
       super();
       this.userId = userId;
   }
   
   public String getUserId() {
       return userId;
   }
   
   public void setUserId(String userId) {
       this.userId = userId;
   }
  
   public double getFare() {
       return fare;
   }
  
   public void setFare(double fare) {
       this.fare = fare;
   }
  
  
}





/**This class keeps track of passengers getting in and out of bus**/
public class PassengerMain {

   public static void main(String[] args) {
       //Get user input using scanner

       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int noOfStops=sc.nextInt();
       //List of passengers
       ArrayList<Passenger> passengerList=new ArrayList<Passenger>();
       int passengersIN=0;
       int passengersOUT=0;
       double fare=0;
       double twentyFivePercentPass=Math.ceil((0.25*n));
       double fiftyPercentPass=Math.ceil((0.5*n));
       boolean foundPassenger=false;
       //Loop until no of stops
       for(int i=0;i<=noOfStops;i++)
       {
           String line=sc.nextLine();
           //Split using comma
           String[] passengers=line.split(" ");
           for(int k=0;k<passengers.length;k++)
           {
               //Trim passId
               String passId=passengers[k].replace("+", "").replace("-", "");
               if(passengers[k].startsWith("+"))
               {
                   for(Passenger pass:passengerList)
                   {
                       if(passId.equalsIgnoreCase(pass.getUserId()))
                           foundPassenger=true;
                   }

                   if(!foundPassenger)
                   {
                       passengerList.add(new Passenger(passId));
                       passengersIN++;
                   }
               }
               else
               {
                   Iterator<Passenger> iter
                   = passengerList.iterator();
                   while(iter.hasNext())
                   {
                       Passenger pass=iter.next();
                       if(passId.equalsIgnoreCase(pass.getUserId()))
                       {
                           iter.remove();
                           passengersOUT++;
                       }
                   }

               }
           }
           //Set fare
           if(passengerList.size()<=twentyFivePercentPass)
               fare=n+(n*0.6);
           else if(passengerList.size()>twentyFivePercentPass && passengerList.size()<=fiftyPercentPass)
               fare=n+(n*0.3);
           else if(passengerList.size()>fiftyPercentPass)
               fare=n;
           for(int j=0;j<passengerList.size();j++)
           {
               passengerList.get(j).setFare(fare);
           }
       }
       String queryInput=sc.nextLine();

       if(queryInput.equalsIgnoreCase("1"))
       {
           System.out.println(passengersIN+" passengers got on the bus and "+passengersOUT+" passengers got out of the bus");
       }

       sc.close();
   }
}
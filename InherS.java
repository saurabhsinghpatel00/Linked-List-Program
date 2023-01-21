 import java.io.*;
 import java.util.*;   

 //created HockeyTeam interface 
 interface HockeyTeam {   

 //declared the methods  
 public int calculateHockeyScore();  
 public int findHighestGoalByIndividualInHockey();   
 }  

 //created FootballTeam interface
  interface FootballTeam {   

 //declared the methods  
 public int calculateFootballScore();  
 public int findHighestGoalByIndividualInFootball();   
 }   

 //inheriting both interfaces and implementing the methods 
 class Sport implements HockeyTeam, FootballTeam {    

 //declared the hockeyPlayers[], footballPlayers[] array  

 private int[] hockeyPlayers=new int[11];  
 private int[] footballPlayers=new int[11];     

 //created the constructor with hockeyPlayers[], footballPlayers[] array  
 public Sport( int[] hockeyPlayers, int[] footballPlayers )   
 {

          //initailized the arrays     

          this.hockeyPlayers=hockeyPlayers;     
          this.footballPlayers =footballPlayers;         

          }      

//implementing the method calculateHockeyScore which returns totalscore of    //hockeyteam   
public int calculateHockeyScore()   
{      

 //code block for calculating total score      
 int totalscore=0;       
 for(int i=0; i<11;i++)       
  {            
  totalscore = totalscore + hockeyPlayers[i];      
     }		                 

  return totalscore;   
   }    

   //implemented the method findHighestGoalByIndividualInHockeyteam   

   public int findHighestGoalByIndividualInHockey()   
   {       

   //code block for finding highest goal by individual     
    int totalscore=0;       
    int highestgoal=0;       

    for(int i=0; i<11;i++)     
       {            
            if( hockeyPlayers[i] > highestgoal)     
                  {     
                            highestgoal = hockeyPlayers[i];     
                   } 
        }	 	              
    return highestgoal;   
      }     

       //implementing the method calculateFootballScore which returns totalscore of    //footballteam   

       public int calculateFootballScore()  
        {     
          int totalscore=0;     
            for(int i=0; i<11;i++)    
                {        
                    totalscore = totalscore + footballPlayers[i];  
                           }		           
                                  return totalscore;  
                                    }  

    //implemented the method findHighestGoalByIndividualInFootballteam  
     public int findHighestGoalByIndividualInFootball()  
      {     
         int highestgoal=0;       
         for(int i=0; i<11;i++)        
         {                
          if( footballPlayers[i] > highestgoal)      
               {             
                 highestgoal = footballPlayers[i];           
                 }         
            }	 	                  

            return highestgoal;   

              }  
                 }   

class InherS {   

 public static void main( String args[] )  
   {                    

   //created the empty arrays 	
   int[] hockeyPlayers=new int[11]; 	
   int[] footballPlayers=new int[11]; 	          

   //following code block to read inputs from user side 	

   Scanner s=new Scanner(System.in);           

   for(int i=0; i<11;i++)      
       {             

       hockeyPlayers[i] = s.nextInt();          

       }	           

    for(int i=0; i<11;i++)      
        {             

        footballPlayers[i] = s.nextInt();       
        }	                        

     //creating Sport object with two integer arrays         

     Sport sp=new Sport( hockeyPlayers, footballPlayers);                   

    //getting the results from the methods of the Sport class         
    int totaScoreInHockey = sp.calculateHockeyScore();         
    int highestGoalInHockey = sp.findHighestGoalByIndividualInHockey();           
    int totaScoreInFootball = sp.calculateFootballScore();         
    int highestGoalInFootball = sp.findHighestGoalByIndividualInFootball();           

    System.out.println(""); //for empty newline          

    //Displays overall score of the hockey team         
    System.out.println(totaScoreInHockey);          

    //Displays overall score of the football team         
    System.out.println(totaScoreInFootball);          

    //Displays the goal scored by the highest goal scorer in hockey team         
    System.out.println(highestGoalInHockey);          

    //Displays the goal scored by the highest goal scorer in football team         
    System.out.println(highestGoalInFootball);     
  
  }  
}

 import java.util.*;  
 public class HashS {  	
 public static void main(String[] args) 
  { 		

  //Scanner to read from stdin 		

  Scanner in = new Scanner(System.in); 		

  //ArrayList where each index i will contain hashset of player names so that no duplicates will be there (index starts from 0) 		
  ArrayList<HashSet<String>> lst = new ArrayList<HashSet<String>>(); 	
  
  //Read the input  		
  int teams = Integer.parseInt(in.nextLine().trim()); 		
  String line  = in.nextLine().trim(); 		
  int x = Integer.parseInt(in.nextLine().trim()); 		
  int y = Integer.parseInt(in.nextLine().trim()); 

  //Format the names of players belonging to different teams and store them in list  		
  String[] allTeams = line.split("#"); 	

  //Process each team 		
  for(int i=0;i<allTeams.length;i++) { 			

  //Format the player names of ith team  			
  String[] allPlayers = allTeams[i].trim().split(" "); 			

  //Add it to the new hashset to remove duplicates  			
  HashSet<String> players = new HashSet<String>(); 		
  	for(String s : allPlayers) { 		
    		players.add(s); 	
		} 		

	//add this hashset to the ith location in list  			
    lst.add(players); 		
    } 		 		

    //if no teams are there just return  		

    if(lst.size()==0) { 			

    in.close(); 			

    return ; 	

    	} 		 		

        //Lets find out players who are in all matches 		
        HashSet<String> res = new HashSet<String>(lst.get(0)); 		

        for(HashSet<String> set : lst) { 			

        //find out the intersection of all teams and keep it in the res 			
        res.retainAll(set); 	

        	} 		 		

    //print the res 		

         String ans1=""; 	
    	for(String s : res)
         { 	
        		ans1=ans1+s+" "; 

         } 		

     System.out.print(ans1.trim()+", "); 		 		

     //Players who have played match y and not x 		

     String ans2 = ""; 		

     //y-1 because x and y are 1 based indexing , get the names of yth team players and check who all are not there in xth match and print  		
     for(String s : lst.get(y-1)) { 			
        if(!lst.get(x-1).contains(s)) 				
            ans2=ans2+s+" "; 		} 		
        System.out.println(ans2.trim()); 		
        in.close(); 	
    }  
} 

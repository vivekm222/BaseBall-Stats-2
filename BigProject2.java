//Class:CS163
//Name:Vivek Muppala
//Date:29Th july 2019
//Teacher:Kris Brown
import java.io.*;
import java.util.*;
public class BigProject2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub

        File file = new File("input.txt");
        Scanner scan = null;
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        //Used arrayLists to store data from the file and then passing that data to constructors...
        List<String> TeamName =Arrays.asList(scan.nextLine().split(" "));
        List<String> AtBats = Arrays.asList(scan.nextLine().split(" "));
	      List<String> Run = Arrays.asList(scan.nextLine().split(" "));
	      List<String> Hit = Arrays.asList(scan.nextLine().split(" "));
	      List<String> BasesTwo = Arrays.asList(scan.nextLine().split(" "));
	      List<String> BasesThree = Arrays.asList(scan.nextLine().split(" "));
	      List<String> numHomeRuns = Arrays.asList(scan.nextLine().split(" "));

	      double maximum = 0;
	       
        //create array of objects now..
        Team team[] = new Team[TeamName.size()];
        for (int i = 0; i<TeamName.size();i++) {
          team[i] =new Team(TeamName.get(i),
            Double.parseDouble(AtBats.get(i)),
            Double.parseDouble(Run.get(i)),
            Double.parseDouble(Hit.get(i)),
            Double.parseDouble(BasesTwo.get(i)),
            Double.parseDouble(BasesThree.get(i)),
            Double.parseDouble(numHomeRuns.get(i))
          );
        }

	       //Basically printing the Table headers in this print statement below
	       System.out.printf("Team Name \t   At Bats \tRuns \tHits \tSingleBaseHits \tnumTwoBaseHits \tnumThreeBaseHits \tNumHomeRunHits \tTotalnumBases \tBattingAverages\n");
	       
	       //Using a for loop to print the arrays
	       for (int i = 0; i < team.length; i++) {
	       System.out.printf(team[i].getTeamName() + "\t\t" + (int)team[i].getAtBats() + "\t" + (int)team[i].getRun() + "\t\t" + (int)team[i].getHit() + "\t\t\t " + (int)team[i].getSingleBase() + "\t\t\t" + (int)team[i].getBasesTwo() + "\t\t\t\t  " + (int)team[i].getBasesThree() + "\t\t\t\t  " + (int)team[i].getNumHomeRuns()+ "\t\t\t" + (int)team[i].getTotalNumBases() + "\t\t\t" + "0." +(int)team[i].getBattingAverages() + "\n");
	       }
	       
	       // I am comparing between the best teams for a particular statistic    
	       maximum = team[0].getTotalNumBases();
	       int BiggestIndex = 0;
	         for (int i = 1; i < team.length; i++) {
	        	 if (team[i].getTotalNumBases() > maximum) {
	        		 maximum = team[i].getTotalNumBases();
	                BiggestIndex = i;
	        	 }       	 
	         }
	         System.out.println("\n" + "The highest scored in the bases category is with " + team[BiggestIndex].getTeamName() + " with " + (int)maximum + " bases.");
	         
	         double maximum2 = team[0].getBattingAverages();
	         int BiggestIndexone = 0;
	           for (int i = 1; i < team.length; i++) {
	          	 if (team[i].getBattingAverages() > maximum2) {
	          		 maximum2 = team[i].getBattingAverages();
	                   BiggestIndexone = i;
	          	 }
	           }
	           System.out.println("The highest average is " +team[BiggestIndexone].getTeamName() + " with a " +(int)maximum2 + " batting average.");
	         
	           double maximum3 = team[0].getNumHomeRuns();
	           int BiggestIndex2 = 0;
	             for (int i = 1; i < team.length; i++) {
	            	 if (team[i].getNumHomeRuns() > maximum3) {
	            		 maximum3 = team[i].getNumHomeRuns();
	                     BiggestIndex2 = i;
	            	 }
	             }
	             System.out.println("The highest amount of homeruns was scored" + team[BiggestIndex2].getTeamName() + " with a total of " + (int)maximum3 + " home runs.");
	        
	  }     
	}
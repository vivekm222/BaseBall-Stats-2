
public class Team {

	String teamName;
	  double atBats, run, hit, basesTwo, basesThree, numHomeRuns, singleBase, totalNumBases, battingAverages, maximum;
	  public Team(String teamName,
	              double atBats,
	              double run,
	              double hit,
	              double basesTwo,
	              double basesThree,
	              double numHomeRuns) {
	    this.teamName = teamName;
	    this.atBats = atBats;
	    this.run = run;
	    this.hit = hit;
	    this.basesTwo = basesTwo;
	    this.basesThree = basesThree;
	    this.numHomeRuns = numHomeRuns;
	    this.maximum = 0;
	    evaluate();
	  }
	  
	  public void evaluate() {
	    this.singleBase = findSingleBase();
	    this.totalNumBases = TotalNumBases();
	    this.battingAverages = BattingAverages();
	  }

	  public double findSingleBase () {
		  double a;
	    a = (this.hit - this.basesTwo - this.basesThree - this.numHomeRuns);
		  return a;
		}
	  
	  public double TotalNumBases () {
	    double f;
	    f = (this.singleBase + (this.basesTwo * 40) + (this.basesThree * 50) + (this.numHomeRuns * 60));
	    return f;
		       
		}

	  public double BattingAverages () {
		  double b;
		  b = ((this.hit / this.atBats) * 1000);
		  return b;
		}

	  public String getTeamName() {
	    return this.teamName;
	  }

	  public double getAtBats() {
	    return this.atBats;
	  }

	  public double getRun() {
	    return this.run;
	  }

	  public double getHit() {
	    return this.hit;
	  }

	  public double getBasesTwo() {
	    return this.basesTwo;
	  }

	  public double getBasesThree() {
	    return this.basesThree;
	  }

	  public double getNumHomeRuns() {
	    return this.numHomeRuns;
	  }

	  public double getSingleBase() {
	    return this.singleBase;
	  }

	  public double getTotalNumBases() {
	    return this.totalNumBases;
	  }

	  public double getBattingAverages() {
	    return this.battingAverages;
	  }

	  public double getMaximum() {
	    return this.maximum;

	  }
	}

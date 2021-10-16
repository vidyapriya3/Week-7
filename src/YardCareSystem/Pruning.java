package YardCareSystem;

public class Pruning extends YardCare {

	
	double pruningArea;
	  double weeklyFee; 
	  double highestFee = 0;
	  int highestPruneNo = 0;
	  int pruneCount = 0;

	  public Pruning() {
	  }

	  public double PruningFee(double area) {
	    if (area < 500) {
	      weeklyFee = 30;
	    }
	    if (900 > area && area >= 500) {
	      weeklyFee = 50;
	    }
	    if (1500 > area && area >= 900) {
	      weeklyFee = 65;
	    }
	    if (area >= 1500) {
	      weeklyFee = 185;
	    }

	    pruneCount++;
	    if(weeklyFee > highestFee){
	      highestFee = weeklyFee;
	      highestPruneNo = pruneCount;
	    }

	    return weeklyFee;
	  }

	  public int pruneNumber(double fee) {
	    return highestPruneNo;
	  }
	}

package YardCareSystem;

public class LawnMowing extends YardCare {

	double lawnArea;
	  double weeklyFee; 
	  double highestFee = 0;
	  int highestLawnNo = 0;
	  int lawnCount = 0;

	  public LawnMowing() {
	  }

	  public double lawnMowingFee(double area) {
	    if (area < 500) {
	      weeklyFee = 40;
	    }
	    if (900 > area && area >= 500) {
	      weeklyFee = 60;
	    }
	    if (1500 > area && area >= 900) {
	      weeklyFee = 75;
	    }
	    if (area >= 1500) {
	      weeklyFee = 100;
	    }

	    lawnCount++;
	    if(weeklyFee > highestFee){
	      highestFee = weeklyFee;
	      highestLawnNo = lawnCount;
	    }

	    return weeklyFee;
	  }

	  public int lawnNumber(double fee) {
	    return highestLawnNo;
	  }
	}


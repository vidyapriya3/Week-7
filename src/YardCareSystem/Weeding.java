package YardCareSystem;

public class Weeding extends YardCare{

	double weedingArea;
	  double weeklyFee; 
	  double highestFee = 0;
	  int highestWeedingNo = 0;
	  int weedingCount = 0;

	  public Weeding() {
	  }

	  public double weedingFee(double area) {
	    if (area < 500) {
	      weeklyFee = 45;
	    }
	    if (900 > area && area >= 500) {
	      weeklyFee = 70;
	    }
	    if (1500 > area && area >= 900) {
	      weeklyFee = 95;
	    }
	    if (area >= 1500) {
	      weeklyFee = 130;
	    }

	    weedingCount++;
	    if(weeklyFee > highestFee){
	      highestFee = weeklyFee;
	      highestWeedingNo = weedingCount;
	    }

	    return weeklyFee;
	  }

	  public int lawnNumber(double fee) {
	    return highestWeedingNo;
	  }
	}

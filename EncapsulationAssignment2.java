// MovieTicket.Java
class MovieTicket {
    //Implement your code here 
    private int movieId;
	private int noOfSeats;
	private double costPerTicket;
	
	public MovieTicket(int movieId, int noOfSeats) {
		this.movieId= movieId;
		this.noOfSeats = noOfSeats;
	}
 public double calculateTotalAmount() {
        // Decide cost per ticket based on movieId
        if (movieId == 111) {
            costPerTicket = 7.0;
        } else if (movieId == 112) {
            costPerTicket = 8.0;
        } else if (movieId == 113) {
            costPerTicket = 8.5;
        } else {
            costPerTicket = 0.0;
        }
        if (costPerTicket == 0.0 || noOfSeats <= 0) {
            return 0.0;
        }

        // Calculate total
        double total = costPerTicket * noOfSeats;

        // Apply 2% discount
        total = total * (1 + (2.0 / 100));

        // Round to 2 decimals
        return Math.round(total);
    }
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public double getCostPerTicket() {
		return costPerTicket;
	}
	public void setCostPerTicket(double costPerTicket) {
		this.costPerTicket = costPerTicket;
	}
}

//Tester.java
class Tester {
    public static void main(String[] args) {

        MovieTicket movieTicket = new MovieTicket(112, 3);
        double amount = movieTicket.calculateTotalAmount();
        if (amount==0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + amount);
    }
}

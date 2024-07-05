import java.util.Arrays;

public class BasketballTeam extends SportsTeam {
	
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;

	public BasketballTeam() {
		super();
		
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
	}
	
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		super(teamName, teamMascot, headCoach);
		
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
		
	}
	
	public double fieldGoalPercentage() {
		return (double) fieldGoals / fieldGoalsAttempted;
	}
	
	public double freeThrowPercentage() {
		return (double) freeThrows / freeThrowsAttempted;
	}
	
	
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
		this.wins = wins;
		this.losses = losses;
		this.fieldGoals = fieldGoals;
		this.fieldGoalsAttempted = fieldGoalsAttempted;
		this.freeThrows = freeThrows;
		this.freeThrowsAttempted = freeThrowsAttempted;
	}
	
	@Override
	public double[] getStats() {
		
		double[] stats = {getWinPercentage(), fieldGoalPercentage(), freeThrowPercentage()};
		
		return stats;
	}

	@Override
	public String toString() {
		return "BasketballTeam [fieldGoals=" + fieldGoals + ", fieldGoalsAttempted=" + fieldGoalsAttempted
				+ ", freeThrows=" + freeThrows + ", freeThrowsAttempted=" + freeThrowsAttempted + ", teamName="
				+ teamName + ", teamMascot=" + teamMascot + ", headCoach=" + headCoach + ", wins=" + wins + ", losses="
				+ losses + ", getStats()=" + Arrays.toString(getStats()) + "]";
	}
	
	

	
	
}

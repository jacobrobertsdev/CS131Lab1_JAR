import java.security.SecureRandom;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	
	private boolean active;
	private String intelligenceType;
	
	
	public NonPlayerCharacter() {
		super();
		
		setActive(false);
		setIntelligenceType("AVERAGE");
	}
	
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
		super(id, personality);
		
		setActive(active);
		setIntelligenceType(intelligenceType);
	}
	
	
    public String reportStructure(){
	
    	StringBuilder report = new StringBuilder(super.reportStructure());
	
		report.append("Active: " + isActive() + "\n");
		report.append("Intelligence: " + getIntelligenceType() + "\n");
		report.append("==================================\n");
		return report.toString();
		
	}
	
    public String introduce() {
    	return "Hello, my name is " + this.uniqueID;
    }
    
    public String exclaim() {
    	String[] phrases = {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
    	SecureRandom random = new SecureRandom();
    	
    	int randomIndex = random.nextInt(5);
    	
    	return phrases[randomIndex];
    	
    }
    
    
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getIntelligenceType() {
		return intelligenceType;
	}
	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}
	
	

}//end class

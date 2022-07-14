
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		String output = "";
		// Write your codes here
		output += "Chromebook [os=" + os + ", getOs()=" + getOs() + ", getDueDate()=" + getDueDate() + ", isAvailable()="
				+ getIsAvailable() + ", getAssetTag()=" + getAssetTag() + ", getDescription()=" + getDescription()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
		return output;
	}
}



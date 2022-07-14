
public class Camcorder extends Item{
private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		String output = "";
		// Write your codes here
		output += "Camcorder [opticalZoom=" + opticalZoom + ", getOpticalZoom()=" + getOpticalZoom() + ", getDueDate()="
				+ getDueDate() + ", isAvailable()=" + getIsAvailable() + ", getAssetTag()=" + getAssetTag()
				+ ", getDescription()=" + getDescription() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
		return output;
	}
}


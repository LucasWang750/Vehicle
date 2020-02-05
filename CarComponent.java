public class CarComponent{
	private String nameOfComponent;
	private boolean isWorking;
	
	public CarComponent(String nameOfComponent, boolean isWorking) {
		this.nameOfComponent = nameOfComponent;
		this.isWorking = isWorking;
	}
	public String damage() {
		isWorking = false;
		return "";
	}
	public String fix() {
		isWorking = true;
		return "The " + nameOfComponent + " has been repaired and is now working";
	}
	
	public String action1() {
		return "";
	}
	
	public String action2() {
		return "";
	}
	@Override
	public String toString() {
		if(isWorking) {
			return "The " + nameOfComponent + " is working";
		}else {
			return "The " + nameOfComponent + " is not working"; 
		}
	}
		
	public String getNameOfComponent() {
		return nameOfComponent;
	}


	public void setNameOfComponent(String nameOfComponent) {
		this.nameOfComponent = nameOfComponent;
	}


	public boolean getIsWorking() {
		return isWorking;
	}


	public void setIsWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}
}
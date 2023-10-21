package entity;

public class Apple {
	float applePrice;
	String appleName;
	public float getApplePrice() {
		return applePrice;
	}
	public void setApplePrice(float applePrice) {
		this.applePrice = applePrice;
	}
	public String getAppleName() {
		return appleName;
	}
	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}
	public String toString() {
		return "Apple [applePrice=" + applePrice + ", appleName=" + appleName + "]";
	}
}
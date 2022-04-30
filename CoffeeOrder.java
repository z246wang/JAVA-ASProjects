package lab3;

public class CoffeeOrder {

	
	private String coffeeType;
	private String cupSize;

	//Default constructor set the attributes to default values
	public CoffeeOrder() {
		this.coffeeType = "AmericanRegular";
		this.cupSize = "S";
	}

	public CoffeeOrder(String coffeeType, String cupSize) {
		this.coffeeType = coffeeType;
		this.cupSize = cupSize;
	}
	
	public CoffeeOrder(CoffeeOrder otherOrder) {
		this.coffeeType = otherOrder.getCoffeeType();
		this.cupSize = otherOrder.getCupSize();
		if(!(this.coffeeType.equals("Latte") || this.coffeeType.equals("AmericanDark") || this.coffeeType.equals("AmericanRegular")
			|| this.coffeeType.equals("Espresso") || this.coffeeType.equals("IceCoffee"))) {
		throw new IllegalArgumentException();
	    } else if(!(this.cupSize.equals("S") || this.cupSize.equals("M") || this.cupSize.equals("L") 
	    		|| this.cupSize.equals("XL"))) {
	    throw new IllegalArgumentException();
	    }
	}

	public void setCoffeeType(String newCoffeeType) {
		this.coffeeType = newCoffeeType;
		if(!(this.coffeeType.equals("Latte") || this.coffeeType.equals("AmericanDark") || this.coffeeType.equals("AmericanRegular")
			|| this.coffeeType.equals("Espresso") || this.coffeeType.equals("IceCoffee"))) {
			throw new IllegalArgumentException();
		}
	}

	public void setCupSize(String newCupSize) {
		this.cupSize = newCupSize;
		if(!(this.cupSize.equals("S") || this.cupSize.equals("M") || this.cupSize.equals("L") || this.cupSize.equals("XL"))) {
		    throw new IllegalArgumentException();
		    }
	}

	public String getCoffeeType() {
		return coffeeType;
	}
	public String getCupSize() {
		return cupSize;
	}
	
	public int coffeeOrderTime() {
		double x = 0.0;
		double y = 0.0;
		
		if(this.coffeeType == "AmericanDark") {
			x = 9.0;
		} else if(this.coffeeType == "AmericanRegular") {
			x = 5.0;
		} else if(this.coffeeType == "Espresso") {
			x = 8.0;
		} else if(this.coffeeType == "Latte") {
			x = 6.0;
		} else if(this.coffeeType == "IceCoffee") {
			x = 3.0;
		}
		
		if(this.cupSize == "S") {
			y = 2.0;
		}else if(this.cupSize == "M") {
			y = 2.45;
		}else if(this.cupSize == "L") {
			y = 4.5;
		}else if(this.cupSize == "XL") {
			y = 6.0;
		}
		
		int PrepareTime = (int)Math.floor(1.5 + x + 1.5 * y);
		return PrepareTime;
	}
	
	@Override
	public String toString() {
		return "Coffee Order with Coffee type is " + coffeeType + " and cup size is " + cupSize + "";
	}
}

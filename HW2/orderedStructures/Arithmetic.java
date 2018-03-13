package orderedStructures;

import interfaces.Combinable;
import orderedStructures.Progression;

public class Arithmetic extends Progression implements Combinable {
	private double commonDifference; 

	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}

	

	@Override
	public double nextValue() {
		if(!usedMethod)
			throw new IllegalStateException("");
		else{current = current + commonDifference; 
		return current;}
	}
	public String toString(){
		String f=String.valueOf((int)super.firstValue());
		String cd=String.valueOf((int)commonDifference);
		return "Arith("+f+", "+cd+")";
	}

	@Override
	public double getTerm(int n){

		double value=super.firstValue()+commonDifference*(n-1);
		return value;
	}

	public boolean equals(Object o){
		Arithmetic a=(Arithmetic)o;

		return (this.commonDifference==(a.commonDifference)&&
				this.firstValue()==a.firstValue());


	}

	@Override
	public Progression add(Progression other) {
		Arithmetic r=new Arithmetic(this.firstValue()+other.firstValue(),this.commonDifference+(other.nextValue()-other.current));
		return r;
	}

	@Override
	public Progression substract(Progression other) {
		Arithmetic r=new Arithmetic(this.firstValue()-other.firstValue(),this.commonDifference-(other.nextValue()-other.current));
		return r;

	}



















}

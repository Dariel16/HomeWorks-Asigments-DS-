import java.util.Scanner;

public class ArrayList<E> {

	private E[] array;
	private int size;

	public ArrayList(){
		array=(E[]) new Object[5]; ;
		size=0;
	}

	
	public static boolean isNumeric(String s) {  
	    return s != null && s.matches("\\d+");  
	} 
	
	
	
	public void add(E e){
		array[size]=e;
		size++;
	}

	
	
	public void remove(E e){
		for(int i=0;i<array.length;i++){

			if(e.equals(array[i])){

				for(int pos=i+1; pos<=size ; pos++){
					array[pos-1] = array[pos];		
				}					
				size--; 
			}
		}		
	}

	
	
	public void printSize(){
		String finalSize=String.valueOf(size);
		System.out.println("\""+finalSize+"\"");
	}
	
	public void printArray(){
		System.out.print("[");
		for(int i=0;i<array.length;i++){
			
			if(array[i]!= null){
			System.out.print(array[i]+" ");
			}
		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter N : ");
		
			
		String n= in.next();
		while(!isNumeric(n)){
		System.out.println("Wrong input,enter a number");
			n= in.next();
		}
		int turns=Integer.parseInt(n);	
		Object ic = new ArrayList() ;

		for(int rpt=1;rpt<=turns;rpt++){
			
			System.out.println("Instruction : ");
			String instruction=in.next();
			while(!isNumeric(instruction)){
				System.out.println("Wrong input,enter a number to the instruction");
				instruction= in.next();
				}
			int i=Integer.parseInt(instruction);

			if(i==1){
				System.out.println("Enter the number to add: ");
				Object x=in.next();
				((ArrayList) ic).add(x);
				((ArrayList) ic).printArray();
				
			}

			else if(i==2){
				System.out.println("Enter the remove num: ");
				Object r=in.next();
				((ArrayList) ic).remove(r);
				((ArrayList) ic).printArray();
			}
			else if(i==3){
				((ArrayList) ic).printSize();
				((ArrayList) ic).printArray();
			}	
			else{
				System.out.println("Return :Wrong Input  ");
				rpt--;
			}
			System.out.println();
		}
	}

}


public class Term {
	 // Instance Variables
    private int coefficient;
    private int exponent;


    // Constructors

    //Full Constructor
    public Term(int coef, int exp){

        this.setAll(coef, exp);
    }

    //Default Constructor: Sets Term value to "X"
    public Term(){

        this.setAll(1, 1);
    }

    //Copy Constructor
    public Term(Term other){

        if(other != null){

            this.setCoef(other.getCoef());
            this.setExp(other.getExp());
        } else{
            System.out.println("Error: Term to be copied has one or more null instance variables");
        }
    }
    
    // Constructor based on String input.
    public Term(String term){
    	int tempCoef;
    	int tempExp;
    	if(term.isEmpty()!=true) {	
    		
    		
    		
    		term = term.toLowerCase();
    		String[] split = term.split("x");
    		if(split.length ==0) {
    			this.setCoef(1);
    			this.setExp(1);
    		}else if (!split[0].isEmpty()) {
    			
    			if (split[0].equals("-")) {
    				this.setCoef(-1);
    				
    			}else if(split[0].equals("+")) {
    				this.setCoef(1);
    			}else {
    				tempCoef = Integer.parseInt(split[0]);
    				this.setCoef(tempCoef);
    			}
    			
    		} else {
    			this.setCoef(1);
    		}
    		
    		if(split.length ==2) {   			
    			
    			tempExp = Integer.parseInt(split[1].substring(1,split[1].length()));
    			this.setExp(tempExp);
    			
    		} else if (term.contains("x")){
    			tempExp = 1;
    			this.setExp(tempExp);
    		} else {
    			this.setExp(0);
    		}
    		
    		
    		
    		
    		/*
    		int tempCoef = Integer.parseInt(term.substring(0,term.indexOf('x')));
    		this.setCoef(tempCoef);

    		int tempExp = Integer.parseInt(term.substring((term.indexOf('x')+2), term.length()));
    		this.setExp(tempExp);
        	*/

    	}else System.out.println("Tried to add an empty term");
    }

    //Set and Get methods

    public void setCoef(int coef){
        this.coefficient = coef;
    }

    public void setExp(int exp){
        this.exponent = exp;
    }

    public void setAll(int coef, int exp){
        this.setCoef(coef);
        this.setExp(exp);
    }

    public int getCoef(){
        return this.coefficient;
    }

    public int getExp(){
        return this.exponent;
    }
    
    public boolean equals(Term otherTerm) {
    	
    	if(this.coefficient == otherTerm.getCoef() && this.exponent == otherTerm.getExp()) {
    		return true;
    	} else {
    		return false;
    	}
    }

    public String toString(){
        String tempString = "NULL";

        if (this.coefficient == 0){
            tempString = "0";
        } else if(this.exponent == 0){
            tempString = Integer.toString(this.coefficient);
        } else if (this.coefficient == 1 && this.exponent == 1){
            tempString = "x";
        } else if(this.coefficient ==1 ){
            tempString = "x^" + Integer.toString(this.exponent);
        } else if (this.exponent ==1 && this.coefficient != -1){
            tempString = Integer.toString(this.coefficient) + "x";
        } else if(this.coefficient == -1 && this.exponent != 0 && this.exponent != 1){
        	tempString = "-x^" + Integer.toString(this.exponent);
        } else if(this.coefficient == -1 && this.exponent == 1) {
        	tempString = "-x";
        } else {
            tempString = Integer.toString(this.coefficient) +"x^"+Integer.toString(this.exponent);
        }

        return tempString;
    }



}

import java.util.ArrayList;

public class Polynomial {
	
	private ArrayList<Term> poly;

    public Polynomial(){
        this.poly = new ArrayList<Term>(5);


    }

    public void addTerm(Term term){
        this.poly.add(term);
        System.out.println(this.poly.size());

        /*
        if(this.poly.size()==0){
            this.poly.add(term);

        } else {
            for (int i = 0;i < this.poly.size();i++) {
                System.out.println("Entering While loop");

                if (term.getExp() == poly.get(i).getExp()) {
                    poly.get(i).setCoef(term.getCoef() + poly.get(i).getCoef());
                    break;
                }

                if (i == this.poly.size()){
                    this.poly.add(term);
                }
            }

        }
        */

    }

    public void removeDuplicates(){

        for (int i = 0; i<this.poly.size(); i++){
        	if (this.poly.get(i).getCoef()==0) {
        		this.poly.remove(i);
        	}
            for(int j = i+1; j<this.poly.size();j++){

                if(this.poly.get(i).getExp()== this.poly.get(j).getExp()){

                    this.poly.get(i).setCoef(this.poly.get(i).getCoef()+this.poly.get(j).getCoef());
                    this.poly.remove(j);

                }

            }
        }

    }

    public String toString(){

        String tempString = "";
        //this.poly.trimToSize();

        this.removeDuplicates();
        tempString += this.poly.get(0).toString();

        for(int i = 1;i<this.poly.size();i++){
            if(this.poly.get(i).getCoef() < 0){
                tempString +=  this.poly.get(i).toString();
            } else {
                tempString += "+"+this.poly.get(i).toString();
            }
        }
        return tempString;
    }

}

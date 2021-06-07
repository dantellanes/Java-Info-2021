package ejerciciosComplementarios1.ejercicio2;



public class Calculadora {
    int num1;
    int num2;
    public Calculadora(int a, int b){
        this.num1= a;
        this.num2 = b;
    }

    public String suma(){
        return "la Suma de "+this.num1+"+" +this.num2+ "= "+(this.num1+this.num2);
    }
    public String resta(){
        return "la resta de "+this.num1+"+" +this.num2+ "= "+(this.num1-this.num2);
    }
    public String division(){
        return "la division de "+this.num1+"+" +this.num2+ "= "+(this.num1/this.num2);
    }
    public String multiplicacion(){
        return "la multiplicacion de "+this.num1+"+" +this.num2+ "= "+(this.num1*this.num2);
    }
    
    

}

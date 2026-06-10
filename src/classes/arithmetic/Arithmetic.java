package classes.arithmetic;

public class Arithmetic {
    int operator1;
    int operator2;

    // empty constructor
    public Arithmetic() {}

    // constructor
    public Arithmetic(int op1, int op2) {
        this.operator1 = op1;
        this.operator2 = op2;
    }

    // metodos get de los operadores
    public int getOperator1() {
        return operator1;
    }

    public int getOperator2() {
        return operator2;
    }

    // metodos set de los operadores
    public void setOperator1(int operator1) {
        this.operator1 = operator1;
    }

    public void setOperator2(int operator2) {
        this.operator2 = operator2;
    }

    public void addition() {
        System.out.println("Resultado de la suma es: " + (this.operator1 + this.operator2));
    }

    public void subtraction() {
        System.out.println("Resultado de la resta es: " + (this.operator1 - this.operator2));
    }
}

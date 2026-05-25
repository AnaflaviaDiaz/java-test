package operators;

// x | y | x&&y

public class OperadorAND {
    static void main() {
        System.out.println("***Operador AND***");
        boolean a = true, b = false;
        
        // AND 
        var result = a && b; // => false
        System.out.println("result = " + result);
    }
}

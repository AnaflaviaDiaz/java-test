package advanced_topics.variable_arguments;

public class AbstractClass {
    static void main() {
        FiguraGeometrica figura = new Rectangulo();
        figura.dibujar();

        figura = new Circulo();
        figura.dibujar();
    }
}

//clase  abstracta
abstract class FiguraGeometrica { // no  sepuede  instanciar
    public abstract  void dibujar();
}

//clases hijas
class Rectangulo extends FiguraGeometrica {
    @Override
    public void dibujar() {
        System.out.println("rectangulo");
    }
}
class Circulo extends FiguraGeometrica {
    @Override
    public void dibujar() {
        System.out.println("Circulo");
    }
}
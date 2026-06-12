package advanced_topics.variable_arguments;

public interface Translator {
//    public y abstract
    void translate();

//    metodo con implementacion por default
    default void initTranslation() {
        System.out.println("Iniciando traductor");
    }
}

class English implements Translator {
    @Override
    public void translate() {
        System.out.println("A inglés");
    }
}
class French implements Translator {
    @Override
    public void translate() {
        System.out.println("A frances");
    }

    @Override
    public void initTranslation() {
        System.out.println("iniciando traductor en frances");
    }
}

class TranslatorTest {
    static void main() {
        Translator english = new English();
        english.translate();
        english.initTranslation();

        Translator french = new French();
        french.translate();
        french.initTranslation();
    }
}
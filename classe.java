public class classe {
    public static void main(String[] args) {
        Animal meuGato = new Pombo();
        Animal meuCachorro = new Lobo();

        meuGato.emitirSom();
        meuCachorro.emitirSom();
    }
}

class Animal {
    String nome;

    public void emitirSom() {
        System.out.println("O animal faz um som.");
    }
}

class Pombo extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O Pombo faz: Pru Pru!");
    }
}

class Lobo extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O Lobo faz: Auuuuu!");
    }
}

package animal2;

/**
 *
 * @author polar
 */
public class Pardal extends Animal {
    
    public Pardal(double peso, int qtdePatas, String especie) {
        super(peso, qtdePatas, especie);
    }

    @Override
    public String locomover() {
        return "Pardal voando";
    }

    @Override
    public String emitirSom() {
        return "Pardal piando";
    }
    
}

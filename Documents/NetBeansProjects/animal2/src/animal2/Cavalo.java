package animal2;

/**
 *
 * @author polar
 */
public class Cavalo extends Animal {
    
    public Cavalo(double peso, int qtdePatas, String especie) {
        super(peso, qtdePatas, especie);
    }

    @Override
    public String locomover() {
        return "Cavalo trotando";
    }

    @Override
    public String emitirSom() {
        return "Cavalo bufando";
    }
    
}

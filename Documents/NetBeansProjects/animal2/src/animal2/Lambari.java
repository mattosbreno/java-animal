package animal2;

/**
 *
 * @author polar
 */
public class Lambari extends Animal {
    
    public Lambari(double peso, int qtdePatas, String especie) {
        super(peso, qtdePatas, especie);
    }

    @Override
    public String locomover() {
        return "Lambari nadando";
    }

    @Override
    public String emitirSom() {
        return "Lambari roncando";
    }
    
}

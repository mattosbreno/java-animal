package animal2;

/**
 *
 * @author polar
 */
public class Abelha extends Animal {
    
    public Abelha(double peso, int qtdePatas, String especie) {
        super(peso, qtdePatas, especie);
    }

    @Override
    public String locomover() {
        return "Abelha voando";
    }

    @Override
    public String emitirSom() {
        return "Abelha zumbindo";
    }
    
}

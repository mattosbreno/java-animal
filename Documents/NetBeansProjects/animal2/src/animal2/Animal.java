package animal2;

/**
 *
 * @author polar
 */
public class Animal {
    double peso;
    int qtdePatas;
    String especie;

    public Animal(double peso, int qtdePatas, String especie) {
        this.peso = peso;
        this.qtdePatas = qtdePatas;
        this.especie = especie;
    }
    
    public String locomover() {
        return "Animal se locomovendo";
    }
    
    public String emitirSom() {
        return "Animal emitindo som";
    }
}

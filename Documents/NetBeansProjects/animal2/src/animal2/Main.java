package animal2;
/**
 *
 * @author polar
 */
public class Main {
    public static void main(String[] args) {
        Cavalo c = new Cavalo (1500, 4, "Equino");
        Pardal p = new Pardal (0.2,2,"Ave");
        Lambari l =new Lambari (1, 0, "Peixe");
        Abelha a = new Abelha (0.01, 4, "Inseto");
        
        System.out.println(c.emitirSom());
        System.out.println(p.emitirSom());
        System.out.println(l.emitirSom());
        System.out.println(a.emitirSom());

        System.out.println(c.locomover());
        System.out.println(p.locomover());
        System.out.println(l.locomover());
        System.out.println(a.locomover());
    }
    
}

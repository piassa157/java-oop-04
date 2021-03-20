
package oppjava;

/**
 *
 * @author Piassa
 */
public class OppJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pencil p1 = new Pencil();
        p1.color = "Blue";
        p1.tip = 0.5f;
        p1.cover();
        p1.scribble();
        p1.status();
        
        
        Pencil p2 = new Pencil();
        p1.model = "Bic";
        p1.color = "Black";
        p1.tip = 0.5f;
        p1.uncap();
        p1.status();
        p1.scribble();
    }
    
}

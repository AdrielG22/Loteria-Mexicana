import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LoteriaMexicana {

   
    private List<String> cartas;

    
    public LoteriaMexicana() {
        cartas = new ArrayList<>();
        inicializarCartas();
    }

    
    private void inicializarCartas() {
        String[] nombresCartas = {
            "El Gallo", "El Diablo", "La Dama", "El Catrín", "El Paraguas", 
            "La Sirena", "La Escalera", "La Botella", "El Barril", "El Árbol",
            "El Melón", "El Valiente", "El Gorrito", "La Muerte", "La Pera", 
            "La Bandera", "El Bandolón", "El Violoncello", "La Garza", "El Pájaro", 
            "La Mano", "La Bota", "La Luna", "El Cotorro", "El Borracho", 
            "El Negrito", "El Corazón", "La Sandía", "El Tambor", "El Camarón",
            "Las Jaras", "El Músico", "La Araña", "El Soldado", "La Estrella",
            "El Cazo", "El Mundo", "El Apache", "El Nopal", "El Alacrán", 
            "La Rosa", "La Calavera", "La Campana", "El Cantarito", "El Venado",
            "El Sol", "La Corona", "La Chalupa", "El Pino", "El Pescado", 
            "La Palma", "La Maceta", "El Arpa", "La Rana"
        };
        Collections.addAll(cartas, nombresCartas);
    }

   
    public void imprimirCartas() {
        System.out.println("Cartas agregadas:");
        for (String carta : cartas) {
            System.out.println("- " + carta);
        }
    }

    
    public void jugar() {
        List<String> cartasMezcladas = new ArrayList<>(cartas);
        Collections.shuffle(cartasMezcladas);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Las Cartas estan mezcladas. Presiona Enter para sacar una carta, o escribe 'salir' para fianlizar.");

        while (!cartasMezcladas.isEmpty()) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("salir")) {
                System.out.println("Juego terminado.");
                break;
            }
            System.out.println("Carta: " + cartasMezcladas.remove(0));
        }

        if (cartasMezcladas.isEmpty()) {
            System.out.println("No quedan más cartas.");
        }

        scanner.close();
    }

    
    public static void main(String[] args) {
        LoteriaMexicana loteria = new LoteriaMexicana();

        
        loteria.imprimirCartas();

       
        
        loteria.jugar();
    }
}

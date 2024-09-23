import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    private String ruta;

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void mostarArchivo() {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea = br.readLine();
            int numero = Integer.parseInt(linea);
            System.out.println("El número leído es: " + numero);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("El contenido del archivo no es un número válido.");
        }
    }


}

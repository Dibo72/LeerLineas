import java.io.BufferedReader;
import java.io.FileReader;
public class LeerLineas {
    public static void main(String[] args) {
        try(BufferedReader lector = new BufferedReader(new FileReader("frases.txt"))){
            String linea;
            while((linea = lector.readLine()) != null){
                System.out.println(linea);
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
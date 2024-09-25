import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        String caminhoArquivo = "C:\\Users\\aneli\\OneDrive\\Documentos\\Cursos\\Java\\Contagem-de-votos\\Votos.txt";

        BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo));

        String linhas;
        while ((linhas = br.readLine()) != null) {
            System.out.println(linhas);
        }

        br.close();
    }
}

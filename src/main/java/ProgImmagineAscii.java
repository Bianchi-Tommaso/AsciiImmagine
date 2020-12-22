import java.io.IOException;

public class ProgImmagineAscii 
{
    public static void main(String[] args) throws IOException 
    {
        String Immagine = "colore.jpg";
        String Risultato = "Test.txt";
        
        Converti Conversione = new Converti();
        
        Conversione.Crea_File_Scrittura(Risultato);
        Conversione.Lettura_Immagine(Immagine);
    }
}

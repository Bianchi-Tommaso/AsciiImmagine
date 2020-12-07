
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.imageio.ImageIO;

public class Converti 
{
    double PesoR = 0.2989;
    double PesoG = 0.5870;
    double PesoB = 0.1140;
    double Grigio;
    BufferedImage immagine;
    PrintWriter Scrittura;
    FileWriter ScritturaFile;
    
    public void Crea_File_Scrittura(String Nome_File) throws IOException
    {
        Scrittura = new PrintWriter(ScritturaFile = new FileWriter(Nome_File));
    }
    
    public void Lettura_Immagine(String Percorso) throws IOException
    {
        int i = 0;
        int j = 0;
        
        immagine = ImageIO.read(new File(Percorso));
        
        for(i = 0; i < immagine.getHeight(); i++)
        {
            for(j = 0; j < immagine.getWidth(); j++)
            {
                Color Colore = new Color(immagine.getRGB(j, i));
                Grigio = ((Colore.getRed() * PesoR) + (Colore.getBlue() * PesoB) + (Colore.getGreen() * PesoG));
                Stampa(Carattere(Grigio));
            }
        }
    }
    
    public String Carattere(double Grigio)
    {
        String Carattere = "";
        
        if (Grigio > 230)
    {
        Carattere = " ";
    }
    else if (Grigio > 200)
    {
        Carattere = ".";
    }
    else if (Grigio > 180)
    {
        Carattere = "*";
    }
    else if (Grigio > 160)
    {
        Carattere = ":";
    }
    else if (Grigio > 130)
    {
        Carattere = "o";
    }
    else if (Grigio > 100)
    {
        Carattere = "&";
    }
    else if (Grigio > 70)
    {
        Carattere = "8";
    }
    else if (Grigio > 50)
    {
        Carattere = "#";
    }
    else
    {
        Carattere = "@";
    }

    return Carattere;
    }
    
    public void Stampa(String Carattere) throws IOException
    {
        Scrittura.print(Carattere);
    }
}

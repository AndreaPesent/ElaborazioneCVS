import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Elaborazione
{
    public void Lettura()
    {
        String next;
        double media=0;
        double percentuale=0;
        double sommaPercent=0;
        String regione="";
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\pesenti.21136\\Desktop\\Grado-diffusione-del-PC-nelle-imprese-con-meno-di-10-addetti.csv")))
        {
            next=".";
            while((next= br.readLine())!=null)
            {
                String[]dati=next.split(";");
                regione=dati[1];
                percentuale=Double.parseDouble(dati[2]);
                sommaPercent+=percentuale;
            }

        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
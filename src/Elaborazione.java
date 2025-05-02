import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Elaborazione
{
    public void Modifica()
    {
        ArrayList<Dati> lista = new ArrayList<Dati>();
        String next;
        double media=0;
        double percentuale=0;
        double sommaPercent=0;
        String regione="";
        int anno=0;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\pesenti.21136\\Desktop\\Grado-diffusione-del-PC-nelle-imprese-con-meno-di-10-addetti.csv")))
        {
            next=".";
            while((next= br.readLine())!=null)
            {
                String[]campi=next.split(";");
                regione=campi[1];
                anno=Integer.parseInt(campi[0]);
                percentuale=Double.parseDouble(campi[2]);
                sommaPercent+=percentuale;
                lista.add(new Dati(anno, regione, percentuale));
                for (int i=0;i<lista.size();i++)
                {
                    if(next.equals(regione))
                    {

                    }
                }
            }
            
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}

//media percentuale ogni regione

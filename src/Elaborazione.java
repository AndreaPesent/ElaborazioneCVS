import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Elaborazione
{
    public static void Modifica() throws IOException
    {
        String next;
        double media=0;
        double percentuale=0;
        double sommaPercent=0;
        String regione="";
        int anno=0;
        boolean PrimaRiga=true;
        String[]campi;
        List<Dati>lista=new ArrayList<>();
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\PC\\Desktop\\Risultati.csv"));
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\PC\\Desktop\\Grado-diffusione-del-PC-nelle-imprese-con-meno-di-10-addetti (1).csv")))
        {
            next=".";
            while((next= br.readLine())!=null)
            {
                if(PrimaRiga)
                {
                    PrimaRiga=false;
                    continue;
                }
                campi=next.split(";");
                regione= campi[1];
                anno=Integer.parseInt(campi[0]);
                percentuale=Double.parseDouble(campi[2]);
                lista.add(new Dati(anno,regione,percentuale));
            }
            lista.sort(Comparator.comparing(r -> r.getRegione()));
            String confronto="Abruzzo";
            int cont=1;
            for(int i=0;i<lista.size();i++)
            {
                Dati d=lista.get(i);
                String stringa = d.toString();
                String[]array=stringa.split(",");
                if(array[1].equals(confronto))
                {
                    cont++;
                    sommaPercent+=Double.parseDouble(array[2]);
                }
                else
                {
                    media=sommaPercent/cont;
                    Aggiungi(confronto, media, bw);
                    confronto=array[1];
                    cont=1;
                    sommaPercent=0;
                    cont++;
                    sommaPercent+=Double.parseDouble(array[2]);
                }
            }
            bw.close();
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
    public static void Aggiungi(String confronto, double media, BufferedWriter bw) throws IOException
    {
        bw.write(confronto +", " + media + "\n");
    }
}
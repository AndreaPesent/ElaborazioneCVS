public class Dati
{
    private int anno;
    private String regione;
    private double percentuale;
    public Dati(int anno, String regione, Double percentuale)
    {
        this.anno=anno;
        this.percentuale=percentuale;
        this.regione=regione;
    }
    public int getAnno()
    {
        return anno;
    }
    public String getRegione()
    {
        return regione;
    }
    public double getPercentuale()
    {
        return percentuale;
    }
    public void setAnno(int anno)
    {
        this.anno = anno;
    }
    public void setRegione(String regione)
    {
        this.regione = regione;
    }
    public void setPercentuale(double percentuale)
    {
        this.percentuale = percentuale;
    }
    public String toString()
    {
        return anno + ", " + regione + ", " + percentuale;
    }
}

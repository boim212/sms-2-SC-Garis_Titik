package PBOKelas;
public class Garis 
{
    private Titik awal;
    private Titik akhir;

    public Garis(Titik awal, Titik akhir) {
    }

    public Titik getAwal() {
        return awal;
    }

    public void setAwal(Titik awal) {
        this.awal = awal;
    }

    public Titik getAkhir() {
        return akhir;
    }

    public void setAkhir(Titik akhir) {
        this.akhir = akhir;
    }
    
    public String getInfo(){
        return "Titik awal : "+getAwal() +"\n"+
               "Titik Akhir: "+getAkhir();
    }
    public double getPanjangGaris(){
        double panjang =0;
        panjang = Math.sqrt( (akhir.getX() - awal.getX() ) * (akhir.getX() - awal.getX()) +
                           ( (akhir.getY() - awal.getY() ) * (akhir.getY() - awal.getY()) ) );
        return panjang;
        //x = 5 y= 5
        //x = 10 y=5
    }
    
    
}

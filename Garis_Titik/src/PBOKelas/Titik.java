package PBOKelas;
public class Titik 
{
    private int x = 0;
    private int y = 0;
    private double jarak = 0;
    
    public Titik(){
    }
    public Titik(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public String getInfo(){ //beres
        return ("Titik{"+getX() +","+ getY() + "}" );
    }
    
    public double getjarakPusat(){
        jarak = Math.sqrt( ((this.x - x) * (this.x - x)) + 
                           ((this.y - y) * (this.y -y)));
        return jarak;
        
    }
    public double getJarakTitikLain(Titik lainnya){
        double jarak = 0;
        jarak = Math.sqrt( ((lainnya.x - this.x) * (lainnya.y - this.y)) +
                           ((lainnya.y - this.y) * (lainnya.y - this.y)) );
        return jarak;
    }
}

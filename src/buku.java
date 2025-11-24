
public class buku {
   
    private final String judul;
    private final String pengarang;
    
    public buku (String judul, String pengarang){
        this.judul = judul;
        this.pengarang = pengarang;
    }
    public String getjudul() {
        return judul;
    }
    public String getpengarang(){
        return pengarang;
    }
    public  String tampil(){
        return "judul : "+ judul + ", pengarang: " + pengarang;
        
    }
}

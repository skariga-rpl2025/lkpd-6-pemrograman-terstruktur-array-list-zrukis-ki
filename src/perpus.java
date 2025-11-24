
import java.util.ArrayList;

 
public class perpus {
    private ArrayList <buku> koleksibuku = new ArrayList<>();
    public int jumblahbuku() {
        return koleksibuku.size();
        
    }
    public void tambahbuku (String judul, String pengarang) {
        koleksibuku.add(new buku (judul, pengarang));
}
public void gantibuku(int index, String judul, String pengarang) {
koleksibuku.set(index, new buku(judul, pengarang));  
}
public void gantibuku (int index, buku baru){
    koleksibuku.set(index, baru);
}


public void hapusbuku (int index) {
koleksibuku.remove(index);
}

public buku lihatbuku (int index) {
return koleksibuku.get(index);
}

public buku caribuku (String judul) {
for (buku buku : koleksibuku) {
if (buku.getjudul().contains(judul)) {
return buku;
}
}
return null;
}

public int cariIndexbuku (buku buku) {
for (int i=0; i < koleksibuku.size(); i++) {
if (koleksibuku.get(i).equals(buku)) {
return i;
}
}
return -1;
}
}

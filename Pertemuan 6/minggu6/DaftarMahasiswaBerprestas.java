<<<<<<< HEAD
package minggu6;

public class DaftarMahasiswaBerprestas {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if (idx<listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("----------------------------------------");
        }
    }
    void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j<listMhs.length-i; j++){
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa tmp = listMhs[j];
                    listMhs [j] =listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            // Tukar elemen pada indeks i dengan elemen pada indeks idxMin
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }    
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa tmp = listMhs[i];
            int j = i; 
            while (j > 0 && listMhs[j - 1].ipk < tmp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = tmp;
        }
    }
    
=======
package minggu6;

public class DaftarMahasiswaBerprestas {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if (idx<listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("----------------------------------------");
        }
    }
    void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j<listMhs.length-i; j++){
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa tmp = listMhs[j];
                    listMhs [j] =listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            // Tukar elemen pada indeks i dengan elemen pada indeks idxMin
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }    
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa tmp = listMhs[i];
            int j = i; 
            while (j > 0 && listMhs[j - 1].ipk > tmp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = tmp;
        }
    }
>>>>>>> 1ac25a5220374041c1782ceb3386bc8fbd518f6a
}
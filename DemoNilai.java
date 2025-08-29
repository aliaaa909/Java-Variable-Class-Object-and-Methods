public class DemoNilai {
    public static void main(String[] args){
        System.out.println("==== Nilai Mahasiswa ====");
        
        Nilai nilaiMahasiswa = new Nilai();
        
        nilaiMahasiswa.NIM = "410631170006";
        nilaiMahasiswa.nama = "Alia Hamzah";
        nilaiMahasiswa.nilaiAbsen = 100;
        nilaiMahasiswa.nilaiTugas = 88;
        nilaiMahasiswa.nilaiUTS = 80;
        nilaiMahasiswa.nilaiUAS = 87;
        
        nilaiMahasiswa.nilai();
        nilaiMahasiswa.CetakNilai();
    }
}

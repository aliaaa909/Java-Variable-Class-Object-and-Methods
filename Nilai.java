public class Nilai{
    String NIM;
    String nama; 
    double nilaiAbsen, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

    
    void nilai(){
       nilaiAkhir = (nilaiAbsen * 0.1) + (nilaiTugas *0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }
    
    void CetakNilai(){
        System.out.println("NIM                 = " + NIM);
        System.out.println("Nama                = "+ nama);
        System.out.println("Nilai Absen (10%)   = "+ nilaiAbsen);
        System.out.println("Nilai Tugas (20%)   = "+ nilaiTugas);
        System.out.println("Nilai UTS (30%)     = " + nilaiUTS);  
        System.out.println("Nilai UAS (40%)     = " + nilaiUAS);
        System.out.println("Nilai Akhir         = " + nilaiAkhir);
        
}
}

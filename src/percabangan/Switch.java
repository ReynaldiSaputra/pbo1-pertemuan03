package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs c : \"Terimakasih pak\"");
                System.out.println("Dosen : \"Selamat ea !!\"");
                break;
            case 'B':
                System.out.println("Mhs   : \"Kenapa ulun kada dapat A, Pak?\"");
                System.out.println("Dosen : \"!@#$%\"");
                break;
            case 'C':
                System.out.println("Mhs   : \"Ulun turun pul Pak ai, tugas pul jua\"");
                System.out.println("Dosen : \"Tapi bisa lah menjawab ujian?\"");
                System.out.println("Mhs   : \"He\"");
                break;
            default:
                System.out.println("Mhs   : \"Ulun turun pul Pak ai, tugas pul jua\"");
                System.out.println("Dosen : \"Bujur jua kah?\"");
                System.out.println("Dosen : \"*memeriksa berkas\"");
                System.out.println("Dosen : \"*menceleng\"");
                System.out.println("Mhs   : \"RUN====\"");
                break;
        }
    }
}

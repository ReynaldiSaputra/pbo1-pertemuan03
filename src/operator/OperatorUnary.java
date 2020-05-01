package operator;

import org.w3c.dom.ls.LSOutput;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;                    //i tadinya 0 ditambahkan 1 hinggah i=1
        System.out.println(i);  //betulkan i nilainya 1
        i++;                    //karena i tadinya sudah bernilai 1 maka sekarang ditambahkan lagi 1 menjadi 2
        System.out.println(i);  //nah iya nich nilainya 2
        i=i+1;                   //iya udah lihat i++ sama dengan i = i+1
        System.out.println(i);

        i+=3; //yasip berlaku juga buat aritmatika yg lain
        System.out.println(i);

        i+=3;
        System.out.println(i);

        i*=3;
        System.out.println(i);

        i*=3;
        System.out.println(i);


    }
}

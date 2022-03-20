import java.util.Scanner;//klavyeden veri almak için 
public class Main {
    public static void main(String[] args) {
        List tercihNo = new List();
        int veri,secim,sayac,son;
        Node e;
        Node etail;


        do {
            System.out.println(" 1-5 arası komutu giriniz:");
			Scanner oku = new Scanner(System.in);//kullanıcıdan değer almak için kütüphane çağrılır1
            
			secim = oku.nextInt();

            switch(secim){
                case 1:
                    System.out.println("Liste Başına eknecek tercih numarası giriniz= ");
                    Scanner deger = new Scanner(System.in);//kullanıcıdan değer almak için kütüphane çağrılır
                    veri = deger.nextInt();// veri alınır
                    e = new Node(veri);//node çevrilir
				    tercihNo.listHeadAdd(e);//liste eklenir
                    tercihNo.listPrint();//yazdırma
                    break;

                case 2:
                System.out.println("Liste Sonuna eknecek tercih numarası giriniz= ");
                Scanner deger2 = new Scanner(System.in);//kullanıcıdan değer almak için kütüphane çağrılır
                veri = deger2.nextInt();// veri alınır
                etail = new Node(veri);//node çevrilir
                tercihNo.listTailAdd(etail);//liste eklenir
                tercihNo.listPrint();//yazdırma
                break;
                case 3:
                System.out.println("Listede aranacak eleman giriniz=");
                Scanner deger3= new Scanner(System.in);
                veri = deger3.nextInt();// veri alınır
                int sonuc=tercihNo.listSearch(veri);
                if(sonuc==-1)
                System.out.println("Aradığınız eleman bulunamamıştır!!!!");
                else 
                System.out.println("Listede aranan eleman "+sonuc+".sıradadır");
                break;

                
                    
                case 4:

                default:
				    System.out.println("Geçersiz işlem");
				break;
            }
        } while (secim!=5);
    }
}

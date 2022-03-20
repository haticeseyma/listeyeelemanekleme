public class List {
 

    Node head;//head adında bir node
    Node tail;//tail adında bir node

    // listenin YAPILANDIRICI sınıfıdır. 
    public List()
    {
        head = null;
        tail = null;
    }
//Liste başına eleman ekleme 
    void listHeadAdd(Node yeni){
        if(tail==null){
         head=yeni;  
        tail=yeni;
    }
        else
            yeni.next=head;
            head=yeni;
                   
    }
//Liste sonuna eleman ekleme 
    void listTailAdd(Node yeni){
        if(head==null){
            tail=yeni;
            head=yeni;
        }
        else
            tail.next=yeni;
            tail = yeni;
        
    }
    int listSearch( int deger)//Listte aranan elemanın kaçıncı sırada olduğunu gösterir
    {
     int sayac=1;
     Node tmp;
     tmp  = head; 
     while(tmp!=null) // tmp boş değilse
    {

    if ( tmp.data==deger)
       return sayac;//sayaç değerini gönder döngüyü
       tmp = tmp.next;//bir sonraki düğüme geç
       sayac++;
    }
           return -1; //deger bulunamadı
       }
    void listHeadDelete(){

    }
    
        
   
    void listTailDelete(){

    }

    void listPrint(){
        System.out.println("------TERCİH LİSTESİ------");
		Node tmp;
		tmp = head;
		while(tmp!=null)
		{
            System.out.print(tmp.data);
            System.out.print("-->");
			tmp = tmp.next;
		}
		System.out.println(" ");
		System.out.println("-----------------------");

    }
}

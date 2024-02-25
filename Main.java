public class Main {
    public static void main(String[]args){

        Books book1= new Books("Atsushi Ohkubo", "Fire Force", 65000, 12345678);
        Books book2 = new Books("Yuuya Takahashi", "MonsTABOO", 125000, 16709573);
        Books book3 = new Books("Andrea Hirata", "Laskar Pelangi", 85000, 12032622);

       
        double totalPrice = book1.getPrice()+book2.getPrice()+book3.getPrice();
        System.out.println("Name    : Angga Agustian");
        System.out.println("NIM     : 20220040114 ");
        System.out.println("==========|BILL|==========");
        System.out.println("Order : Books ");
        System.out.println(book1.title+":"+book1.price);
        System.out.println(book2.title+":"+book2.price);
        System.out.println(book3.title+":"+book3.price);
        System.out.println("Total Rp."+ totalPrice);
        System.out.println("========|THANK YOU|========");
    }

}

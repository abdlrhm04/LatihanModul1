public class Kota <E>{
    private E element;

    public Kota(E Kota){
        element = Kota;
    }

    public E getElement(){
        return element;
    }

    public static void main(String[] args){
        Kota<Integer> jumlahKota = new Kota<Integer>(9);
        Kota<String> namaKota = new Kota<String>("Malang");
        System.out.println("JUmalah Kota di Jawa Timur  :"+ jumlahKota.getElement()+"kota");
        System.out.println("Salahsatu Kota di Jawa Timur    :"+namaKota.getElement());
    }
}

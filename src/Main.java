import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        File file = new File(".\\src\\goods_in_the_store.csv");
        ArrayList<Store> arrayList = Store.input(file);
        for(Store s : arrayList){
            System.out.println(s);
        }
    }
}
package HWRefactor;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        LinkedList<Laptop> storageLaptops = new LinkedList<>(Arrays
                .asList(new Laptop("Laptop1", 16, 128, "windows", "pink"),
                        new Laptop("Laptop2", 32, 256, "ubuntu", "black"),
                        new Laptop("Laptop3", 8, 128, "windows", "black"),
                        new Laptop("Laptop4", 16, 256, "ubuntu", "silver"),
                        new Laptop("Laptop5", 32, 256, "Mac", "black")));
        LaptopFilter filter1 = new LaptopFilter(storageLaptops);

        Map<Integer, Integer> ourCriteria = filter1.getCriteria();

        filter1.filter(ourCriteria);




    }

}


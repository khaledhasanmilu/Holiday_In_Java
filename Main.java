
public class Main {
    

    public static void main(String[] args) {
        Holiday s2 = new Holiday("Independence Day", 4, "July");
       Holiday [] arr = new Holiday[3];
       arr[0]=new Holiday("Victory day",16,"December");
        arr[1]=new Holiday("Ashura",3,"June");
        arr[2]=new Holiday("Mother language day",21,"February");
       double n = s2.avgDate(arr);
       System.out.println(n);
    }
}

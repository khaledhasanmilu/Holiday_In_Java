public class Holiday {
    private String name;
    private int day;
    private String month;
     public double avgDate(Holiday[] s) {
        double sum = 0;
        for (Holiday holiday : s) {
            sum+=holiday.day;
        }
        sum /=s.length;
        return sum;
    }

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean isSameMonth(Holiday holiday) {
        if (holiday.month == this.month) {
            return true;
        } else {
            return false;
        }
    }
   
}

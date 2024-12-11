public class Main {
    public static void main(String[] args) {
        HealthRecord student1 = new HealthRecord(120);
        HealthRecord student2 = new HealthRecord(75);
        HealthRecord student3 = new HealthRecord(-180);
        HealthRecord student4 = new HealthRecord(140);
        HealthRecord student5 = new HealthRecord(123);
        student1.displayDetails(); // 120
        student2.displayDetails(); // 55
        student3.displayDetails();
        student4.displayDetails();
        student5.displayDetails();// 180 is not permitted, so it is replaced by default value
        HealthRecord.displayClassDetails(); // tallest = 120, shortest = 55
    }
}
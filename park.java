public class Park {
    private String name;
    private String location;

    public Park(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public class Attraction {
        private String attractionName;
        private String workingHours;
        private double cost;

        public Attraction(String attractionName, String workingHours, double cost) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Name: " + attractionName);
            System.out.println("Hours: " + workingHours);
            System.out.println("Cost: " + cost + " Руб");
            System.out.println("-------------------------------");
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Парк Кислого", "Парк");
        Attraction rollerCoaster = park.new Attraction("Американские горки", "10:00 - 18:00 PM", 20.0);
        Attraction ferrisWheel = park.new Attraction("Колесо обозрения", "9:00 AM - 17:00 PM", 10.0);
        Attraction carousel = park.new Attraction("Карусель", "8:00 PM - 20:00 AM", 5.0);

        rollerCoaster.printInfo();
        ferrisWheel.printInfo();
        carousel.printInfo();
    }
}

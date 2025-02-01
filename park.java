public class Park {
    private String name;
    private String location;

    public Park(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public class Attraction {
        private String attractionName;
        private String workHours;
        private double cost;

        public Attraction(String attractionName, String workHours, double cost) {
            this.attractionName = attractionName;
            this.workHours = workHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Name: " + attractionName);
            System.out.println("Hours: " + workHours);
            System.out.println("Cost: " + cost + " Р\n");

        }
    }

    public static void main(String[] args) {
        Park park = new Park("Парк Кислого", "Парк");
        Attraction rollerCoaster = park.new Attraction("Американские горки", "10:00 - 18:00", 200);
        Attraction ferrisWheel = park.new Attraction("Колесо обозрения", "9:00 - 17:00", 120);
        Attraction carting = park.new Attraction("Картинг", "8:00 - 20:00", 320);

        rollerCoaster.printInfo();
        ferrisWheel.printInfo();
        carting.printInfo();
    }
}

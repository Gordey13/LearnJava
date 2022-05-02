package task.task1001;/*
Построим новый жилой комплекс JavaRush Towers
*/

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    public Skyscraper(){
        System.out.println("Небоскреб построен!");
    }

    public Skyscraper(int tower){
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + tower);
    }

    public Skyscraper(String skyline){
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + skyline);
    }


    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}
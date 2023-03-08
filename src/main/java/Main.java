import ru.netology.holidayplanning.services.PlanningService;

public class Main {
    public static void main(String[] args) {
        PlanningService service = new PlanningService();


        service.calculate(100_000, 60_000, 150_000);
    }

}

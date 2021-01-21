public class MainV1 {
    public static void main(String[] args){
        BonusMilesService service = new BonusMilesService();

        int price = 10_000;
        int miles = service.calculate(10_000);

        System.out.println(miles);

    }

}

public class MainV1 {
    public static void main(String[] args){
        BonusMilesService service = new BonusMilesService();
        int ticket = 2150_70;
        int mile = 20_00;
        int price = 10_000;

        int miles = service.calculate(10_000, 2150_70, 20_00);

        System.out.println(miles);

    }

}

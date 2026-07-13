public class Main {

    public static void main(String[] args) {

        System.out.println("Professional Outfit:");
        createOutfit(new ProfessionalFactory());

        System.out.println();

        System.out.println("Casual Outfit:");
        createOutfit(new CasualFactory());

        System.out.println();

        System.out.println("Party Outfit:");
        createOutfit(new PartyFactory());
    }

    public static void createOutfit(GarmentFactory factory) {

        Top top = factory.createTop();
        Pants pants = factory.createPants();
        Shoes shoes = factory.createShoes();

        top.display();
        pants.display();
        shoes.display();
    }
}

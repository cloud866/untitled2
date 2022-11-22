public class Main {
    public static void main(String[] args) {
        String light1 = "red";
        String light2 = "yellow";
        String light3 = "green";

        action(light);
    }

    public static void action(String light) {
        switch (light) {
            case "red":
                System.out.println("ostanovit'sa");
                break;
            case "yellow":
                System.out.println("podojdt'");
                break;
            case "green":
                System.out.println("ehat'");
            default:
                System.out.println("light dont found");

        }
    }
}
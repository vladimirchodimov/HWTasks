public class apartaments {
    public static void main(String[] args) {

        int apartment = 0;
        String rooms = null;
        String orientation;

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 10; j++) {

                apartment = (i * 100) + j;

                if (j >= 1 && j <= 5) {
                    orientation = "west";
                } else {
                    orientation = "east";
                }
                if (j == 5 || j == 10) {
                    rooms = "four room";
                } else ;
                if (j == 2 || j == 4 || j == 6 || j == 8) {
                    rooms = "two room";
                } else ;
                if (j == 1 || j == 3 || j == 7 || j == 9) {
                    rooms = "three room";
                } else ;

                System.out.println("Floor : " + i + " , " + "Apartment number : " + apartment + " , " +
                        "Rooms : " + rooms + ", Orientation : " + orientation);
            }
        }
    }
}

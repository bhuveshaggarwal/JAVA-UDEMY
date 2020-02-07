public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean result = false;
        if (hourOfDay < 0 || hourOfDay > 23){
            System.out.println(result);
            return false;
        }
        else if (hourOfDay >= 8 && hourOfDay <= 22){
            System.out.println(result);
            result = false;
        }

        else if (hourOfDay >= 1 || hourOfDay <=7 || hourOfDay >=23) {
            if (barking == true) {
                System.out.println("Dog is Barking");
                result = true;
            } else {
                System.out.println(result);
                result = false;
            }
        }
        return result;
    }

}
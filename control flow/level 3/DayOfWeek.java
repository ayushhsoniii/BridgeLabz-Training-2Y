public class DayOfWeek {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek m d y  (m=1..12, d=1..31, y=year)");
            return;
        }

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Sakamoto's algorithm for Gregorian calendar:
        // returns 0 = Sunday, 1 = Monday, ..., 6 = Saturday
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        int yy = y - (m < 3 ? 1 : 0);
        int dow = (yy + yy / 4 - yy / 100 + yy / 400 + t[m - 1] + d) % 7;

        System.out.println(dow);
    }
}


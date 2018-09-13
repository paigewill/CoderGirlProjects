import static java.lang.System.out;

public class Temperatures {
    public static int average(int[] temps) {
        int total = 0;
        for (int i = 0; i < temps.length; i++) {
            total = (temps[i] + total);
        }
        int average = (total / temps.length);
        return average;
    }
    public static int totalAverage(int[][] temps) {
        int total = 0;
        for (int i = 0; i < temps.length; i++) {
            for (int j = 0; j < temps[0].length; j++) {
                total = (temps[i][j] + total);
            }
        }
        int average = (total / (temps[0].length * temps.length));
        return average;
    }
    public static void print(int[] temps) {
        for (int i = 0; i < temps.length; i++)
        {
            out.print(temps[i]);
            if (i != 6) {
                out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        int temps[][] = new int [4][7];
        temps[0][0] = 68;
        temps[0][1] = 70;
        temps[0][2] = 76;
        temps[0][3] = 70;
        temps[0][4] = 68;
        temps[0][5] = 71;
        temps[0][6] = 75;
        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;
        temps[2][0] = 73;
        temps[2][1] = 72;
        temps[2][2] = 81;
        temps[2][3] = 78;
        temps[2][4] = 76;
        temps[2][5] = 73;
        temps[2][6] = 77;
        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;
        int[] sunday = {temps[0][0], temps[1][0], temps[2][0], temps[3][0]};
        int[] monday = {temps[0][1], temps[1][1], temps[2][1], temps[3][1]};
        int[] tuesday = {temps[0][2], temps[1][2], temps[2][2], temps[3][2]};
        int[] wednesday = {temps[0][3], temps[1][3], temps[2][3], temps[3][3]};
        int[] thursday = {temps[0][4], temps[1][4], temps[2][4], temps[3][4]};
        int[] friday = {temps[0][5], temps[1][5], temps[2][5], temps[3][5]};
        int[] saturday = {temps[0][6], temps[1][6], temps[2][6], temps[3][6]};
        int[] sevenAM = {temps[0][0], temps[0][1], temps[0][2], temps[0][3], temps[0][4], temps[0][5], temps[0][6]};
        int[] threePM = {temps[1][0], temps[1][1], temps[1][2], temps[1][3], temps[1][4], temps[1][5], temps[1][6]};
        int[] sevenPM = {temps[2][0], temps[2][1], temps[2][2], temps[2][3], temps[2][4], temps[2][5], temps[2][6]};
        int[] threeAM = {temps[3][0], temps[3][1], temps[3][2], temps[3][3], temps[3][4], temps[3][5], temps[3][6]};

        out.println("Temperature Calculator");
        out.println("");
        out.println("The data provided are:");
        out.println("");
        out.println("7 AM: ");
        print(sevenAM);
        out.println("");
        out.println("3 PM: ");
        print(threePM);
        out.println("");
        out.println("7 PM: ");
        print(sevenPM);
        out.println("");
        out.println("3 AM: ");
        print(threeAM);
        out.println("");
        out.println("");
        out.println("Based on that data, the following are the average temperatures for the week.");
        out.println("");
        out.println("Sun: " + average(sunday));
        out.println("Mon: " + average(monday));
        out.println("Tue: " + average(tuesday));
        out.println("Wed: " + average(wednesday));
        out.println("Thu: " + average(thursday));
        out.println("Fri: " + average(friday));
        out.println("Sat: " + average(saturday));
        out.println("");
        out.println("The final average temperature for the week was: ");
        out.println("");
        out.println("Overall: " + totalAverage(temps));
    }
}

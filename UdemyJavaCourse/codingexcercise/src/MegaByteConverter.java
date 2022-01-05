public class MegaByteConverter {
    public static void printMegaBytesKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int getMegaByte = kiloBytes / 1024;
            int getByte = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + getMegaByte
                    + " MB and " + getByte + " KB");
        }
    }
}

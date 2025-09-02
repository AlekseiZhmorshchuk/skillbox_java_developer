public class Reverse {
    public void replacingTheOrder(String[] str) {
        for (int i = 0; i < str.length / 2; i++) {
            String temp = str[i];
            str[i] = str[str.length - 1 - i];
            str[str.length - 1 - i] = temp;
        }
    }
}

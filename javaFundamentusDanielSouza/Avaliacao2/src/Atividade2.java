public class Atividade2 {
    public static void main(String[] args) {

        System.out.println(inverter("Hello World"));

    }

    public static String inverter(String palavra){
        char[] chars = palavra.toCharArray();
        int i = 0;
        int j = chars.length-1;

        while( i < j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}

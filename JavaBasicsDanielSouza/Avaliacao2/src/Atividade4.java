
public class Atividade4 {

    public static void main(String[] args) {
        String palindromo = "Socorram-me, subi no ônibus em Marrocos";
        System.out.println(verificarPalindromo(palindromo));
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
    public static String formatar(String palavra){
        return palavra.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
    }

    public static boolean verificarPalindromo(String palavra){
        String f = formatar(palavra);

        int i = 0;
        int j = f.length() - 1;

        while (i < j) {
            if (f.charAt(i) != f.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}

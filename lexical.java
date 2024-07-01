public class Tpp{
public static void main(String[] args) {
        System.out.println("Entrez une chaîne : ");
        Scanner scanner = new Scanner(System.in);
        String tc = scanner.nextLine();

        if (isValid(tc)) {
            System.out.println("La chaîne est valide.");
        } else {
            System.out.println("La chaîne est invalide.");
        }
    }

    private static boolean isValid(String input) {
        char[] chars = input.toCharArray();
        int length = chars.length;
        int tc = 0;

        if (tc < length && chars[tc] == 'a') {
            tc++;
            while (tc < length && chars[tc] == 'a') {
                tc++;
            }
        } else {
            return false;
        }

        if (tc < length && chars[tc] == 'd') {
            tc++;
        } else {
            return false;
        }

        while (tc < length && chars[tc] == 'b') {
            tc++;
        }

        if (tc < length && chars[tc] == 'c') {
            tc++;
            while (tc < length && chars[tc] == 'c') {
                tc++;
            }
        } else {
            return false;
        }

        return tc == length;
    }
    }

public class Main {

    public static void main(String[] args) {
        String[][] testCases = {
                {"FirstWord", "SecondWord", "THIRDWORD"},
                {"HELLO", "WORLD"},
                {"esTo", "ES", "una", "PRUEBA"},
                {"TEST"},
                {"pROBANDO", "EXAMPLE"}
        };

        for (String[] testCase : testCases) {
            String result = concatenateAndConvertToLowercase(testCase);
            System.out.println(result);
        }
    }

    public static String concatenateAndConvertToLowercase(String[] array) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                builder.append(" ");  // Añadir espacio entre palabras, pero no antes de la primera palabra.
            }
            builder.append(array[i].toLowerCase());
        }

        return builder.toString();
    }
}

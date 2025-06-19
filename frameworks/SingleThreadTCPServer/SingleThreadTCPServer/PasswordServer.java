
import java.io.PrintWriter;




public PasswordServer extends SingleThreadTCPServer{

    @Override
    public void handleMessage(String message, PrintWriter out) {
        // Separar los argumentos
        String[] args = message.split(" ");
        if (args.length != 3) {
            out.println("ERROR: Se esperan exactamente 3 argumentos.");
            return;
        }


        String letras = args[0];
        String numeros = args[1];
        String especiales = args[2];

        // Validación básica
        if (numeros.isEmpty() || especiales.isEmpty()) {
            out.println("ERROR: Debe incluir al menos un número y un carácter especial.");
            return;
        }

        // Generar contraseña y enviarla
        String password = generarPassword(letras, numeros, especiales);
        out.println("Password generada: " + password);





      private String generarPassword(String letras, String numeros, String especiales) {
        Random rand = new Random();
        StringBuilder password = new StringBuilder();

        // Agregar 1 carácter especial
        password.append(especiales.charAt(rand.nextInt(especiales.length())));

        // Agregar al menos 1 número
        password.append(numeros.charAt(rand.nextInt(numeros.length())));

        // Agregar letras para completar (6 caracteres)
        String todos = letras + letras.toUpperCase();
        for (int i = 0; i < 6; i++) {
            password.append(todos.charAt(rand.nextInt(todos.length())));
        }

        // Mezclar los caracteres
        List<Character> chars = password.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        Collections.shuffle(chars);

        StringBuilder result = new StringBuilder();
        chars.forEach(result::append);
        return result.toString();
    }





    
}
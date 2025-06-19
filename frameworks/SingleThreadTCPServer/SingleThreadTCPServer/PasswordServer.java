
import java.io.PrintWriter;




public PasswordServer extends SingleThreadTCPServer{

    @Override
    public void handleMessage(String message, PrintWriter out) {
    
        String[] args = message.split(" ");
        if (args.length != 3) {
            out.println("ERROR: Se esperan exactamente 3 argumentos.");
            return;
        }


        String letras = args[0];
        String numeros = args[1];
        String especiales = args[2];

   
        if (numeros.isEmpty() || especiales.isEmpty()) {
            out.println("ERROR: Debe incluir al menos un número y un carácter especial.");
            return;
        }

    
        String password = generarPassword(letras, numeros, especiales);
        out.println("Password generada: " + password);





      private String generarPassword(String letras, String numeros, String especiales) {
        Random rand = new Random();
        StringBuilder password = new StringBuilder();

        //  especial
        password.append(especiales.charAt(rand.nextInt(especiales.length())));

        // al menos 1 número
        password.append(numeros.charAt(rand.nextInt(numeros.length())));

        //letras para completar
        String todos = letras + letras.toUpperCase();
        for (int i = 0; i < 6; i++) {
            password.append(todos.charAt(rand.nextInt(todos.length())));
        }

     
        List<Character> chars = password.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        Collections.shuffle(chars);

        StringBuilder result = new StringBuilder();
        chars.forEach(result::append);
        return result.toString();
    }





    
}

public RepeatServer extends SingleThreadTCPServer{



    @Override
    public void handleMessage(String inputLine, PrintWriter out) {
        String[] args = inputLine.trim().split(" ");

        if (args.length < 2) {
            out.println("Error: Debe especificar al menos 2 argumentos.");
            return;
        }

        String texto = args[0];
        String cantidadStr = args[1];

        if (texto == null || texto.isEmpty()) {
            out.println("Error: El texto a repetir no puede estar vacío.");
            return;
        }

        int cantidad;
        try {
            cantidad = Integer.parseInt(cantidadStr);
            if (cantidad <= 0) {
                out.println("Error: La cantidad debe ser mayor a 0.");
                return;
            }
        } catch (NumberFormatException e) {
            out.println("Error: El segundo argumento debe ser un número entero.");
            return;
        }

        String delimitador = " ";
        if (args.length >= 3) {
            delimitador = args[2];
        }

        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < cantidad; i++) {
            resultado.append(texto);
            if (i < cantidad - 1) {
                resultado.append(delimitador);
            }

        out.println(resultado.toString());
    }



}



















}
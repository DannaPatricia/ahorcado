package practicahorcado;

import java.util.Scanner;

public class PracticAhorcado {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        seleccionarOpcion();
    }

    public static void seleccionarOpcion() {
        int opcion;
        do {
            pintarMenu();
            opcion = sc.nextInt();
        } while (!comprobarOpcion(opcion));
        if (opcion == 1) {
            iniciarPartidaNormal();
        } else if (opcion == 2) {
            iniciarDosJugadores();
        } else if (opcion == 3) {
            System.out.println("Esperamos verte pronto");
        }
    }

    public static void pintarMenu() {
        System.out.println("AHORCADO DAW");
        System.out.println("-----------------------------------------------------");
        System.out.println("Elige el modo de juego: ");
        System.out.println("1. Partida normal.");
        System.out.println("2. El mejor de tres (para dos).");
        System.out.println("3. Pulse 3 para salir.");
        System.out.println("_____________________________________________________");
    }

    public static void pintarHorca(int fallos) {
        if (fallos == 0) {
            System.out.println("||                               =====             ||");
            System.out.println("||                              |     ||           ||");
            System.out.println("||                                    ||           ||");
            System.out.println("||                                    ||           ||");
            System.out.println("||                                    ||           ||");
            System.out.println("||                               -----||---        ||");
            System.out.println("||                             /      ||  /        ||");
            System.out.println("||                             ----------          ||");
        } else if (fallos == 1) {
            System.out.println("||                               =====             ||");
            System.out.println("||                              |     ||           ||");
            System.out.println("||                              0     ||           ||");
            System.out.println("||                                    ||           ||");
            System.out.println("||                                    ||           ||");
            System.out.println("||                               -----||---        ||");
            System.out.println("||                             /      ||  /        ||");
            System.out.println("||                             ----------          ||");
        } else if (fallos == 2) {
            System.out.println("||                               =====             ||");
            System.out.println("||                              |     ||           ||");
            System.out.println("||                              0     ||           ||");
            System.out.println("||                              |     ||           ||");
            System.out.println("||                                    ||           ||");
            System.out.println("||                               -----||---        ||");
            System.out.println("||                             /      ||  /        ||");
            System.out.println("||                             ----------          ||");
        } else if (fallos == 3) {
            System.out.println("||                               =====             ||");
            System.out.println("||                              |     ||           ||");
            System.out.println("||                              0     ||           ||");
            System.out.println("||                             /|     ||           ||");
            System.out.println("||                                    ||           ||");
            System.out.println("||                               -----||---        ||");
            System.out.println("||                             /      ||  /        ||");
            System.out.println("||                             ----------          ||");
        } else if (fallos == 4) {
            System.out.println("||                               =====             ||");
            System.out.println("||                              |     ||           ||");
            System.out.println("||                              0/    ||           ||");
            System.out.println("||                             /|     ||           ||");
            System.out.println("||                                    ||           ||");
            System.out.println("||                               -----||---        ||");
            System.out.println("||                             /      ||  /        ||");
            System.out.println("||                             ----------          ||");
        } else if (fallos == 5) {
            System.out.println("||                               =====             ||");
            System.out.println("||                              |     ||           ||");
            System.out.println("||                              0/    ||           ||");
            System.out.println("||                             /|     ||           ||");
            System.out.println("||                             /      ||           ||");
            System.out.println("||                               -----||---        ||");
            System.out.println("||                             /      ||  /        ||");
            System.out.println("||                             ----------          ||");
        } else if (fallos == 6) {
            System.out.println("||                               =====             ||");
            System.out.println("||                              |     ||           ||");
            System.out.println("||                              0/    ||           ||");
            System.out.println("||                             /|     ||           ||");
            System.out.println("||                             / |    ||           ||");
            System.out.println("||                               -----||---        ||");
            System.out.println("||                             /      ||  /        ||");
            System.out.println("||                             ----------          ||");
        }
    }

    public static boolean comprobarOpcion(int opcionIntroducida) {
        boolean resultado = false;
        if (opcionIntroducida == 1) {
            System.out.println("Has seleccionado la partida normal");
            System.out.println("-----------------------------------------------------");
            resultado = true;
        } else if (opcionIntroducida == 2) {
            System.out.println("Has seleccionado la partida al mejor de 3 (Para dos)");
            System.out.println("-----------------------------------------------------");
            resultado = true;
        } else if (opcionIntroducida == 3) {
            System.out.println("GRACIAS POR JUGAR");
            System.out.println("-----------------------------------------------------");
            resultado = true;
        } else {
            System.out.println("Opcion Invalida, intentelo de nuevo");
            System.out.println("-----------------------------------------------------");
        }
        return resultado;
    }

    public static String[] crearArray() {
        String array[] = {"ALMOHADA", "ARMARIO", "ARBUSTO", "TRACTOR", "CUADERNO", "JIRAFA", "RINOCERONTE", "CARACOL",
            "ARBOLEDA", "LECHUGA", "TORTUGA", "TORMENTA", "MOMIA", "CAJONERA", "ALFOMBRA"};
        return array;
    }

    public static char[] encriptarPalabra(String palabra) {
        char arrayEcriptada[] = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            arrayEcriptada[i] = '*';
        }
        return arrayEcriptada;
    }

    public static String generarPalabrAleatorioa(String[] array) {
        int posicion = (int) (Math.random() * (14 + 0));
        String palabra = array[posicion];
        return palabra;
    }

    public static char validarLetra() {
        String letra = "";
        do {
            System.out.print("Introduce una letra: ");
            letra = sc.next();
            if (letra.length() > 1) {
                System.out.println("No puede ingresar más de una letra");
            } else if (letra.equals("") || letra.equals(" ")) {
                System.out.println("Debe introducir una letra");
                letra = sc.next();
            }
        } while (letra.length() > 1);
        letra = letra.toUpperCase();
        char caracterIntroducido = letra.charAt(0);
        return caracterIntroducido;
    }

    public static boolean comprobarSustituirLetra(String palabra, char[] encriptada, char caracter) {
        boolean letraAcertada = false;
        boolean valido = false;
        char arrayPalabra[] = palabra.toCharArray();
        for (int j = 0; j < arrayPalabra.length; j++) {
            if (Character.compare(caracter, arrayPalabra[j]) == 0) {
                letraAcertada = true;
            } else {
                letraAcertada = false;
            }
            if (letraAcertada == true) {
                encriptada[j] = caracter;
                valido = true;
            }
        }
        return valido;
    }
//METODO COMPARA STRING ALEATORIO CON EL ENCRIPTADO DURANTE EL JUEGO

    public static boolean completarPalabra(String palabra, String encriptada) {
        boolean ganar = false;
        if (palabra.equals(encriptada)) {
            ganar = true;
        }
        return ganar;
    }
//METODO COMPARA STRING ALEATORIO CON EL INTRODUCIDO DURANTE EL JUEGO

    public static boolean resolverPalabra(char caracter, String palabra) {
        boolean ganar = false;
        System.out.println("¿Conoces la palabra?");
        System.out.println("Inténta adivinarla");
        String palabraResolver = sc.next();
        if (palabraResolver.equalsIgnoreCase(palabra)) {
            ganar = true;
        } else {
            ganar = false;
        }
        return ganar;
    }

    public static void ganarPartida(String palabra) {
        System.out.println("_____________________________________________________");
        System.out.println("ENHORABUENA, has ganado");
        System.out.println("¡LA PALABRA ERA!: " + palabra);
        System.out.println("¿Quieres jugar otra vez?");
        System.out.println("Selecciona modo de juego");
        System.out.println("_____________________________________________________");
        System.out.println();
        seleccionarOpcion();
    }

    public static void perderPartida(String palabra) {
        System.out.println("_____________________________________________________");
        System.out.println("HAS PERDIDO");
        System.out.println("¡LA PALABRA ERA! " + palabra);
        System.out.println("¿Quieres intentarlo otra vez?");
        System.out.println("Selecciona modo de juego");
        System.out.println("_____________________________________________________");
        System.out.println();
        seleccionarOpcion();
    }

    public static void iniciarPartidaNormal() {
        System.out.println("BIENVENIDO AL MODO CLÁSICO");
        System.out.println("- Se ha generado una palabra aleatoria");
        System.out.println("- Tienes 6 intentos para adivinarla");
        System.out.println("- En caso de saber la palabra, pulsa 1 para RESOLVER");
        System.out.println("_____________________________________________________");
        comenzarJuego();
    }
//INICIAR JUEGO DE DOS

    public static void iniciarDosJugadores() {
        System.out.println("BIENVENIDO AL MODO DE DOS JUGADORES");
        System.out.println("- Se ha generado una palabra aleatoria");
        System.out.println("- Aquel jugador que acierte dos palabras gana");
        System.out.println("- Teneis 6 intentos para adivinar cada palabra");
        System.out.println("- En caso de saber la palabra, pulsa 1 para RESOLVER");
        System.out.println("_____________________________________________________");
        int victoriaJugador1 = 0;
        int victoriaJugador2 = 0;
        int contador = 0;
        do {
            System.out.println("");
            System.out.println("ES EL TURNO DEL JUGADOR 1");
            System.out.println("");
            boolean ganar1 = comenzarJuegoDos();
            if (ganar1 == true) {
                System.out.println("¡ENHORABUENA, HAS GANADO!");
                System.out.println("Jugador 1 ha obtenido 1 punto más");
                victoriaJugador1++;
                System.out.println("Jugador 1 tiene " + victoriaJugador1 + " punto/puntos");
            } else if (ganar1 == false) {
                System.out.println("¡ES UNA LÁSTIMA!");
                System.out.println("Jugador 1 tiene " + victoriaJugador1 + "punto/puntos");
            }
            System.out.println("_____________________________________________________");
            System.out.println("ES EL TURNO DEL JUGADOR 2");
            System.out.println("");
            boolean ganar2 = comenzarJuegoDos();
            if (ganar2 == true) {
                System.out.println("¡ENHORABUENA, HAS GANADO!");
                System.out.println("Jugador 2 ha obtenido 1 punto más");
                victoriaJugador2++;
                System.out.println("Jugador 2 tiene " + victoriaJugador2 + " punto/puntos");
            } else if (ganar2 == false) {
                System.out.println("¡ES UNA LÁSTIMA!");
                System.out.println("Jugador 2 tiene " + victoriaJugador2 + " punto/puntos");
            }
            contador++;
            System.out.println("_____________________________________________________");
        } while (contador != 3);
//		COMPARA VICTORIAS
        if (victoriaJugador1 > victoriaJugador2) {
            System.out.println("¡ENHORABUENA JUGADOR 1 HAS GANADO!");
        } else if (victoriaJugador2 > victoriaJugador1) {
            System.out.println("¡ENHORABUENA JUGADOR 2 HAS GANADO!");
        } else if (victoriaJugador1 == victoriaJugador2) {
            System.out.println("¡HABEIS EMPATADO!");
        }
        System.out.println("Jugador 1 tiene " + victoriaJugador1 + " punto/puntos");
        System.out.println("Jugador 2 tiene " + victoriaJugador2 + " punto/puntos");
        System.out.println("¿Quieren volver a jugar?");
        seleccionarOpcion();
    }
//METODO MANEJA LA EJECUCION DEL JUEGO PARA DOS-------------------------------------------------------------------------------

    public static boolean comenzarJuegoDos() {
        int fallos = 0;
        int contador = 0;
        boolean ganar = false;
        boolean detener = false;
        boolean repetida = false;
        String letrasIntroducidas = "";
        String laPalabra = generarPalabrAleatorioa(crearArray());
        System.out.println("");
        char[] encriptada = encriptarPalabra(laPalabra);
        System.out.println("");
        pintarHorca(fallos);
        System.out.println("");
        do {
            System.out.print("Palabra oculta: ");
            System.out.println(encriptada);
            char caracter = validarLetra();
            System.out.println("_____________________________________________________");
            contador++;
//			LLAMA AL METODO PARA ADIVINAR LA PALABRA
            if (caracter == '1') {
                boolean palabraResolver = resolverPalabra(caracter, laPalabra);
                if (palabraResolver == true) {
                    ganar = true;
                    detener = true;
                    break;
                } else if (palabraResolver == false) {
                    System.out.println("Has fallado, tienes dos intentos menos");
                    fallos = fallos + 1;
                }
            }
//			ALMACENA INTRODUCIDAS
            if (letrasIntroducidas.contains(String.valueOf(caracter))) {
                repetida = true;
            } else {
                letrasIntroducidas += caracter + " ";
                repetida = false;
            }
//			SUSTITUIR
            boolean letraValida = comprobarSustituirLetra(laPalabra, encriptada, caracter);
            if (letraValida == false) {
                if (repetida == false) {
                    fallos++;
                }
            }
//			SI SE COMPLETA LA PALABRA EL JUEGO SE DETIENE
            String palabraEncriptada = String.valueOf(encriptada);
            boolean completar = completarPalabra(laPalabra, palabraEncriptada);
            if (completar == true) {
                ganar = true;
                detener = true;
                break;
            }
            pintarHorca(fallos);
            if (contador >= 2 && contador != 6) {
                System.out.println();
                System.out.println("1. Para OPCIÓN RESOLVER");
            }
            System.out.println("");
            if (repetida == true) {
                System.out.println("YA HAS INTRODUCIDO ESTA LETRA");
            }
            if (letraValida == false) {
                System.out.println("Caracter NO ENCONTRADO");
            } else if (letraValida == true) {
                System.out.println("Caracter ENCONTRADO");
            }
            System.out.println("Has fallado: " + fallos + " vez/veces");
            System.out.print("Has introducido las letras: ");
            System.out.println(letrasIntroducidas);
            System.out.println("");
            if (fallos == 6) {
                ganar = false;
                detener = true;
                System.out.println("HAS PERDIDO");
                System.out.println("¡LA PALABRA ERA! " + laPalabra);
            }

        } while (detener == false);
        return ganar;
    }
//-------------------------------------------------------------------------------------------------------------------------------------------
//	METODO JUGAR PARTIDA NORMAL

    public static void comenzarJuego() {
        int fallos = 0;
        int contador = 0;
        boolean ganar = false;
        boolean detener = false;
        boolean repetida = false;
        String letrasIntroducidas = "";
        String laPalabra = generarPalabrAleatorioa(crearArray());
        System.out.println("");
        char[] encriptada = encriptarPalabra(laPalabra);
        System.out.println("");
        pintarHorca(fallos);
        System.out.println("");
        do {
            System.out.print("Palabra oculta: ");
            System.out.println(encriptada);
            char caracter = validarLetra();
            System.out.println("_____________________________________________________");
            contador++;
            if (caracter == '1') {
                boolean palabraResolver = resolverPalabra(caracter, laPalabra);
                if (palabraResolver == true) {
                    ganar = true;
                    detener = true;
                    break;
                } else if (palabraResolver == false) {
                    System.out.println("Has fallado, tienes dos intentos menos");
                    fallos = fallos + 1;
                }
            }
            if (letrasIntroducidas.contains(String.valueOf(caracter))) {
                repetida = true;
            } else {
                letrasIntroducidas += caracter + " ";
                repetida = false;

            }
            boolean letraValida = comprobarSustituirLetra(laPalabra, encriptada, caracter);
            if (letraValida == false) {
                if (repetida == false) {
                    fallos++;
                }
            }
            String palabraEncriptada = String.valueOf(encriptada);
            boolean completar = completarPalabra(laPalabra, palabraEncriptada);
            if (completar == true) {
                ganar = true;
                detener = true;
                break;
            }
            pintarHorca(fallos);
            if (contador >= 2 && contador != 6) {
                System.out.println();
                System.out.println("1. Para OPCIÓN RESOLVER");
            }
            System.out.println("");
            if (repetida == true) {
                System.out.println("YA HAS INTRODUCIDO ESTA LETRA");
            }
            if (letraValida == false) {
                System.out.println("Caracter NO ENCONTRADO");
            } else if (letraValida == true) {
                System.out.println("Caracter ENCONTRADO");
            }
            System.out.println("Has fallado: " + fallos + " vez/veces");
            System.out.print("Has introducido las letras: ");
            System.out.println(letrasIntroducidas);
            System.out.println("");
            if (fallos == 6) {
                ganar = false;
                detener = true;

            }

        } while (detener == false);
        if (ganar == true) {
            ganarPartida(laPalabra);
        } else if (ganar == false) {
            perderPartida(laPalabra);

        }
    }
}

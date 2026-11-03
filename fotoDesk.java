import java.util.Scanner;

public class fotoDesk {

    static Scanner sc = new Scanner(System.in);

    // Declaracion de variables (inicializadas porque Java lo exige antes de usarlas)
        

    static String Pedirnombre(){
        String Nombre;
        System.out.println("Escriba su nombre: ");
        Nombre = sc.nextLine();
        return Nombre;
    }

    static String pedirTelefono(){
        String Telefono;
        System.out.println("Ingrese el Numero del cliente:");
        Telefono = sc.nextLine();
        return Telefono;
    }
    static void mostrarPaquetes(){
        System.out.println("-- Paquetes fotograficos --");
        System.out.println("1. 15 años");
        System.out.println("2. Boda");
        System.out.println("3. Fotografia empresarial para negocios");
        System.out.println("4. Fotografia de pruductos");
        System.out.println("Ingrese una de las opciones: ");

    }
    



    public static void main(String[] args) {        
        int opcion = 0, opcion2 = 0, opcion3 = 0, opcion4 = 0;
        String Nombre = "", Telefono = "", paquete = "", Dia = "", Mes = "", year = "", Horario = "", Hora = "", Extra = "";
        double servicioExtra = 0, precio = 0, subtotal = 0, precioIVA = 0, Total = 0;
        do {
            // Menu principal:
            //Mostrar menu principal
            System.out.println("=====================================");
            System.out.println("              FotoDesk");
            System.out.println("=====================================");
            System.out.println(" ");
            System.out.println("1. Registros del dato del cliente");
            System.out.println("2. Seleccion de servicio (paquete,fecha y horario)");
            System.out.println("3. Selecion de extras");
            System.out.println("4. Registrar servicios");
            System.out.println("5. Salir");
            System.out.println("Seleccione alguna de las opciones: ");
            opcion = sc.nextInt();
            sc.nextLine();

            // Segun opcion el aparatado al que se ingresara:
            switch (opcion) {
                case 1:
                    //Pedir Nombre (listo)
                    Nombre = Pedirnombre();
                    //Pedir Telefono (listo)
                    Telefono = pedirTelefono();
                    break;

                case 2:
                    do {
                        // Seleccion de opcion paquetes fotograficos:
                        //Mostrar paquetes
                        mostrarPaquetes();
                        
                        opcion2 = sc.nextInt();
                        sc.nextLine();
                        // Asignacion de paquete segun la eleccion
                        switch (opcion2) {
                            case 1:
                                paquete = "15 años";
                                precio = 2000;
                                break;
                            case 2:
                                paquete = "Boda";
                                precio = 5000;
                                break;
                            case 3:
                                paquete = "Fotografia empresarial para negocios";
                                precio = 500;
                                break;
                            case 4:
                                paquete = "Fotografia de productos";
                                precio = 250;
                                break;
                            default:
                                System.out.println("Opcion no valida, ingrese un valor valido");
                        }
                    } while (!(opcion2 > 0 && opcion2 < 5));

                    // Peticion de hora, mes, dia y año al conseguir el paquete:
                    //Pedir fecha del evento (todo lo de abajo)
                    System.out.println("Ingrese el dia del evento: ");
                    Dia = sc.nextLine();
                    System.out.println("Ingrese el mes: ");
                    Mes = sc.nextLine();
                    System.out.println("Ingrese el año del evento: ");
                    year = sc.nextLine();
                    System.out.println("Ingrese la hora del evento: ");
                    Hora = sc.nextLine();

                    // Eleccion de mañana o tarde
                    do {
                        //Mañana_o_Tarde (todo si se puede)
                        System.out.println("Elija si sera en la mañana o en la tarde");
                        System.out.println("1. Mañana");
                        System.out.println("2. Tarde");
                        System.out.println("Ingrese la opcion:");
                        opcion3 = sc.nextInt();
                        sc.nextLine();
                        switch (opcion3) {
                            case 1:
                                Horario = "a.m";
                                break;
                            case 2:
                                Horario = "p.m";
                                break;
                            default:
                                System.out.println("Opcion no valida.");
                        }
                    } while (!(opcion3 > 0 && opcion3 < 3));
                    break;

                case 3:
                    // Servicio extra de dron (todo lo de aqui del dron)
                    System.out.println("Desea añadir el servicio extra de dron?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    opcion4 = sc.nextInt();
                    sc.nextLine();

                    // Establecer precio en caso de que se quiera (hacer funcion todo el if)
                    if (opcion4 > 1 && opcion4 < 3) {
                        if (opcion4 == 1) {
                            servicioExtra = 300;
                        } else {
                            servicioExtra = 0;
                        }
                    }
                    // Ver si es o no checando el precio (mismo caso del de arriba el if completo)
                    if (servicioExtra > 0) {
                        Extra = "SI";
                    } else {
                        Extra = "NO";
                    }
                    break;

                case 4:
                    // Calculo del total (Hacer calculo funcion)
                    subtotal = precio;
                    precioIVA = (precio + servicioExtra) * .16;
                    Total = precioIVA + subtotal;
                    // Generacion del ticket
                    System.out.println("=====================================");
                    System.out.println("        REGISTRO DE SERVICIO");
                    System.out.println("=====================================");
                    //(Imprimir datos del cliente)
                    System.out.println("- Datos del cliente -");
                    System.out.println("Nombre completo: " + Nombre);
                    System.out.println("Numero de contacto: " + Telefono);
                    System.out.println(" ");
                    //(Imprimir fecha del servicio)
                    System.out.println("- Fecha del servicio -");
                    System.out.println(Dia + "/" + Mes + "/" + year);
                    System.out.println(Hora + " " + Horario);
                    System.out.println(" ");

                    System.out.println("- Servicios -");
                    System.out.println(paquete);
                    System.out.println(" ");

                    System.out.println("¿Desea agregar servicio extra Fotografia con Dron?");
                    System.out.println(Extra);
                    System.out.println(" ");
                    //(Imprimir precios)
                    System.out.println("Servicio - $" + precio);
                    System.out.println("Extra - $" + servicioExtra);
                    System.out.println("IVA - 16%");
                    System.out.println(" ");
                    System.out.println("-------------------");
                    System.out.println("Subtotal: $" + subtotal);
                    System.out.println("Total: $" + Total);
                    System.out.println("=====================================");
                    break;

                default:
                    // Si es 5 mandar otro mensaje y si no es una de las opciones entonces "opcion no valida"
                    //(Validar opcion todo el if)
                    if (opcion == 5) {
                        System.out.println("Gracias por utilizar el programa");
                    } else {
                        System.out.println("Opcion no valida");
                    }
            }

        } while (opcion != 5);
    }
}
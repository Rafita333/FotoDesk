import java.util.Scanner;

public class fotoDesk {

    static Scanner sc = new Scanner(System.in);

    static void mostrarMenu() {
        System.out.println("=====================================");
        System.out.println("              FotoDesk");
        System.out.println("=====================================");
        System.out.println(" ");
        System.out.println("1. Registros del dato del cliente");
        System.out.println("2. Seleccion de servicio (paquete,fecha y horario)");
        System.out.println("3. Seleccion de extras");
        System.out.println("4. Registrar servicios");
        System.out.println("5. Salir");
        System.out.println("Seleccione alguna de las opciones: ");
    }

    static String Pedirnombre() {
        System.out.print("Escriba su nombre: ");
        return sc.nextLine();
    }

    static String pedirTelefono() {
        System.out.print("Ingrese el Numero del cliente: ");
        return sc.nextLine();
    }

    static void mostrarPaquetes() {
        System.out.println("-- Paquetes fotograficos --");
        System.out.println("1. 15 años");
        System.out.println("2. Boda");
        System.out.println("3. Fotografia empresarial para negocios");
        System.out.println("4. Fotografia de productos");
        System.out.println("Ingrese una de las opciones: ");
    }

    static String pedirDia() {
        System.out.print("Ingrese el día del evento: ");
        return sc.nextLine();
    }

    static String pedirMes() {
        System.out.print("Ingrese el mes del evento: ");
        return sc.nextLine();
    }

    static String pedirYear() {
        System.out.print("Ingrese el año del evento: ");
        return sc.nextLine();
    }

    static String pedirHora() {
        System.out.print("Ingrese la hora del evento: ");
        return sc.nextLine();
    }

    public static void main(String[] args) {
        int opcion = 0, opcion2 = 0, opcion3 = 0, opcion4 = 0;
        String Nombre = "", Telefono = "", paquete = "", Dia = "", Mes = "", year = "",
               Horario = "", Hora = "", Extra = "";
        double servicioExtra = 0, precio = 0, subtotal = 0, precioIVA = 0, Total = 0;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    Nombre = Pedirnombre();
                    Telefono = pedirTelefono();
                    break;

                case 2:
                    do {
                        mostrarPaquetes();
                        opcion2 = sc.nextInt();
                        sc.nextLine();

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

                    Dia = pedirDia();
                    Mes = pedirMes();
                    year = pedirYear();
                    Hora = pedirHora();

                    do {
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
                    System.out.println("Desea añadir el servicio extra de dron?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    opcion4 = sc.nextInt();
                    sc.nextLine();

                    if (opcion4 == 1) {
                        servicioExtra = 300;
                        Extra = "SI";
                    } else if (opcion4 == 2) {
                        servicioExtra = 0;
                        Extra = "NO";
                    } else {
                        System.out.println("Opcion no valida");
                    }
                    break;

                case 4:
                    subtotal  = precio + servicioExtra;
                    precioIVA = subtotal * 0.16;
                    Total     = subtotal + precioIVA;

                    System.out.println("=====================================");
                    System.out.println("        REGISTRO DE SERVICIO");
                    System.out.println("=====================================");
                    System.out.println("- Datos del cliente -");
                    System.out.println("Nombre completo: " + Nombre);
                    System.out.println("Numero de contacto: " + Telefono);
                    System.out.println(" ");
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
                    if (opcion == 5) {
                        System.out.println("Gracias por utilizar el programa");
                    } else {
                        System.out.println("Opcion no valida");
                    }
            }

        } while (opcion != 5);

        sc.close();
    }
}
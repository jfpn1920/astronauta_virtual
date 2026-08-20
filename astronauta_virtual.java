import java.util.Scanner;
public class astronauta_virtual {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombres = new String[10];
        String[] edades = new String[10];
        String[] nacionalidades = new String[10];
        String[] especialidades = new String[10];
        String[] misiones = new String[10];
        String[] destinos = new String[10];
        String[] naves = new String[10];
        String[] fechasLanzamiento = new String[10];
        String[] duraciones = new String[10];
        String[] experiencias = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //------------------------------------------//
        //--|menu_principal_de_astronauta_virtual|--//
        //------------------------------------------//
        do {
            System.out.println("menu principal de astronauta virtual");
            System.out.println("1) Registrar astronauta");
            System.out.println("2) Editar astronauta");
            System.out.println("3) Listar astronautas");
            System.out.println("4) Buscar astronauta");
            System.out.println("5) Eliminar astronauta");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //--------------------------//
                //--|registrar_astronauta|--//
                //--------------------------//
                case 1:
                    if (total >= nombres.length) {
                        System.out.println("No hay espacio para registrar mas astronautas.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de astronauta");
                    System.out.println("id del astronauta: " + id);
                    System.out.print("nombre del astronauta: ");
                    nombres[total] = entrada.nextLine();
                    System.out.print("edad: ");
                    edades[total] = entrada.nextLine();
                    System.out.print("nacionalidad: ");
                    nacionalidades[total] = entrada.nextLine();
                    System.out.print("especialidad: ");
                    especialidades[total] = entrada.nextLine();
                    System.out.print("mision: ");
                    misiones[total] = entrada.nextLine();
                    System.out.print("destino: ");
                    destinos[total] = entrada.nextLine();
                    System.out.print("nave espacial: ");
                    naves[total] = entrada.nextLine();
                    System.out.print("fecha de lanzamiento: ");
                    fechasLanzamiento[total] = entrada.nextLine();
                    System.out.print("duracion de la mision: ");
                    duraciones[total] = entrada.nextLine();
                    System.out.print("experiencia: ");
                    experiencias[total] = entrada.nextLine();
                    System.out.print("estado: ");
                    estados[total] = entrada.nextLine();
                    total++;
                    System.out.println("Astronauta registrado correctamente.");
                    break;
                //-----------------------//
                //--|editar_astronauta|--//
                //-----------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen astronautas registrados.");
                        break;
                    }
                    System.out.println("datos de los astronautas");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Edad: " + edades[i] + " | Nacionalidad: " + nacionalidades[i] + " | Especialidad: " + especialidades[i] + " | Mision: " + misiones[i] + " | Destino: " + destinos[i] + " | Nave: " + naves[i] + " | Lanzamiento: " + fechasLanzamiento[i] + " | Duracion: " + duraciones[i] + " | Experiencia: " + experiencias[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del astronauta a editar: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("editar astronauta");
                        System.out.print("nuevo nombre: ");
                        nombres[posicion] = entrada.nextLine();
                        System.out.print("nueva edad: ");
                        edades[posicion] = entrada.nextLine();
                        System.out.print("nueva nacionalidad: ");
                        nacionalidades[posicion] = entrada.nextLine();
                        System.out.print("nueva especialidad: ");
                        especialidades[posicion] = entrada.nextLine();
                        System.out.print("nueva mision: ");
                        misiones[posicion] = entrada.nextLine();
                        System.out.print("nuevo destino: ");
                        destinos[posicion] = entrada.nextLine();
                        System.out.print("nueva nave espacial: ");
                        naves[posicion] = entrada.nextLine();
                        System.out.print("nueva fecha de lanzamiento: ");
                        fechasLanzamiento[posicion] = entrada.nextLine();
                        System.out.print("nueva duracion de la mision: ");
                        duraciones[posicion] = entrada.nextLine();
                        System.out.print("nueva experiencia: ");
                        experiencias[posicion] = entrada.nextLine();
                        System.out.print("nuevo estado: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Astronauta actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------//
                //--|listar_astronautas|--//
                //------------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen astronautas registrados.");
                    } else {
                        System.out.println("lista de astronautas");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Edad: " + edades[i] + " | Nacionalidad: " + nacionalidades[i] + " | Especialidad: " + especialidades[i] + " | Mision: " + misiones[i] + " | Destino: " + destinos[i] + " | Nave: " + naves[i] + " | Lanzamiento: " + fechasLanzamiento[i] + " | Duracion: " + duraciones[i] + " | Experiencia: " + experiencias[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //-----------------------//
                //--|buscar_astronauta|--//
                //-----------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen astronautas registrados.");
                        break;
                    }
                    System.out.println("busqueda de astronauta");
                    System.out.print("ingresa el ID para buscar: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("datos del astronauta encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Nombre: " + nombres[posicion] + " | Edad: " + edades[posicion] + " | Nacionalidad: " + nacionalidades[posicion] + " | Especialidad: " + especialidades[posicion] + " | Mision: " + misiones[posicion] + " | Destino: " + destinos[posicion] + " | Nave: " + naves[posicion] + " | Lanzamiento: " + fechasLanzamiento[posicion] + " | Duracion: " + duraciones[posicion] + " | Experiencia: " + experiencias[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-------------------------//
                //--|eliminar_astronauta|--//
                //-------------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen astronautas registrados.");
                        break;
                    }
                    System.out.println("datos de los astronautas");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Edad: " + edades[i] + " | Nacionalidad: " + nacionalidades[i] + " | Especialidad: " + especialidades[i] + " | Mision: " + misiones[i] + " | Destino: " + destinos[i] + " | Nave: " + naves[i] + " | Lanzamiento: " + fechasLanzamiento[i] + " | Duracion: " + duraciones[i] + " | Experiencia: " + experiencias[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del astronauta a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            nombres[i] = nombres[i + 1];
                            edades[i] = edades[i + 1];
                            nacionalidades[i] = nacionalidades[i + 1];
                            especialidades[i] = especialidades[i + 1];
                            misiones[i] = misiones[i + 1];
                            destinos[i] = destinos[i + 1];
                            naves[i] = naves[i + 1];
                            fechasLanzamiento[i] = fechasLanzamiento[i + 1];
                            duraciones[i] = duraciones[i + 1];
                            experiencias[i] = experiencias[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Astronauta eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen astronautas registrados.");
                        break;
                    }
                    int entrenamiento = 0;
                    int misionProgramada = 0;
                    int enMision = 0;
                    int misionCompletada = 0;
                    int retirados = 0;
                    int otrosEstados = 0;
                    for (int i = 0; i < total; i++) {
                        if (estados[i].equalsIgnoreCase("En entrenamiento")) {
                            entrenamiento++;
                        } else if (estados[i].equalsIgnoreCase("Mision programada")) {
                            misionProgramada++;
                        } else if (estados[i].equalsIgnoreCase("En mision")) {
                            enMision++;
                        } else if (estados[i].equalsIgnoreCase("Mision completada")) {
                            misionCompletada++;
                        } else if (estados[i].equalsIgnoreCase("Retirado")) {
                            retirados++;
                        } else {
                            otrosEstados++;
                        }
                    }
                    String especialidadMayor = especialidades[0];
                    int cantidadEspecialidadMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadEspecialidad = 0;
                        for (int j = 0; j < total; j++) {
                            if (especialidades[i].equalsIgnoreCase(especialidades[j])) {
                                cantidadEspecialidad++;
                            }
                        }
                        if (cantidadEspecialidad > cantidadEspecialidadMayor) {
                            cantidadEspecialidadMayor = cantidadEspecialidad;
                            especialidadMayor = especialidades[i];
                        }
                    }
                    String misionMayor = misiones[0];
                    int cantidadMisionMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadMision = 0;
                        for (int j = 0; j < total; j++) {
                            if (misiones[i].equalsIgnoreCase(misiones[j])) {
                                cantidadMision++;
                            }
                        }
                        if (cantidadMision > cantidadMisionMayor) {
                            cantidadMisionMayor = cantidadMision;
                            misionMayor = misiones[i];
                        }
                    }
                    String destinoMayor = destinos[0];
                    int cantidadDestinoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadDestino = 0;
                        for (int j = 0; j < total; j++) {
                            if (destinos[i].equalsIgnoreCase(destinos[j])) {
                                cantidadDestino++;
                            }
                        }
                        if (cantidadDestino > cantidadDestinoMayor) {
                            cantidadDestinoMayor = cantidadDestino;
                            destinoMayor = destinos[i];
                        }
                    }
                    String naveMayor = naves[0];
                    int cantidadNaveMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadNave = 0;
                        for (int j = 0; j < total; j++) {
                            if (naves[i].equalsIgnoreCase(naves[j])) {
                                cantidadNave++;
                            }
                        }
                        if (cantidadNave > cantidadNaveMayor) {
                            cantidadNaveMayor = cantidadNave;
                            naveMayor = naves[i];
                        }
                    }
                    String nacionalidadMayor = nacionalidades[0];
                    int cantidadNacionalidadMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadNacionalidad = 0;
                        for (int j = 0; j < total; j++) {
                            if (nacionalidades[i].equalsIgnoreCase(nacionalidades[j])) {
                                cantidadNacionalidad++;
                            }
                        }
                        if (cantidadNacionalidad > cantidadNacionalidadMayor) {
                            cantidadNacionalidadMayor = cantidadNacionalidad;
                            nacionalidadMayor = nacionalidades[i];
                        }
                    }
                    String estadoMayor = estados[0];
                    int cantidadEstadoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadEstado = 0;
                        for (int j = 0; j < total; j++) {
                            if (estados[i].equalsIgnoreCase(estados[j])) {
                                cantidadEstado++;
                            }
                        }
                        if (cantidadEstado > cantidadEstadoMayor) {
                            cantidadEstadoMayor = cantidadEstado;
                            estadoMayor = estados[i];
                        }
                    }
                    System.out.println("resumen de astronauta virtual");
                    System.out.println("Astronautas registrados: " + total);
                    System.out.println("Especialidad mas frecuente: " + especialidadMayor);
                    System.out.println("Mision mas utilizada: " + misionMayor);
                    System.out.println("Destino mas frecuente: " + destinoMayor);
                    System.out.println("Nave espacial mas utilizada: " + naveMayor);
                    System.out.println("Nacionalidad mas frecuente: " + nacionalidadMayor);
                    System.out.println("Estado mas frecuente: " + estadoMayor);
                    System.out.println("En entrenamiento: " + entrenamiento);
                    System.out.println("Mision programada: " + misionProgramada);
                    System.out.println("En mision: " + enMision);
                    System.out.println("Mision completada: " + misionCompletada);
                    System.out.println("Retirados: " + retirados);
                    System.out.println("Otros estados: " + otrosEstados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Astronauta Virtual.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2_tiffannyvarela;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tiffa
 */
public class Laboratorio2_TiffannyVarela {

    /**
     * @param args the command line arguments
     */
    static Scanner r = new Scanner(System.in);
    static int opc, opc2;
    static boolean respu = false;
    static ArrayList<Casas> lista = new ArrayList();
    static String usuario[] = {"leobanegas", "99"};

    public static void main(String[] args) {
        // TODO code application logic here
        String usuario, contra;
        char resp = 's';

        while (resp == 's' || resp == 'S') {
            switch (menu(opc)) {

                case 3:
                    System.out.println("Ingrese su usuario: ");
                    usuario = r.next();
                    System.out.println("Ingrese su contrasena: ");
                    contra = r.next();
                    respu = validacion(usuario, contra);
                    if (respu) {
                        System.out.println("Entrada del sistema");
                    } else {
                        System.out.println("Usuario incorrecto");
                    }
                    if (respu) {
                        switch (menu(opc)) {
                            case 1:
                                switch (menu2(opc2)) {
                                    case 1:
                                        int num_casa = 0,
                                         num_bloque,
                                         compra = 0,
                                         pisos,
                                         banos,
                                         cuartos;
                                        String color,
                                         revis,
                                         nom_dueno,
                                         nom_ing,
                                         estado;
                                        double ancho,
                                         largo;
                                        System.out.println("Ingrese numero de casa: ");
                                        num_casa = r.nextInt();
                                        /*if ((revis= Integer.toString(num_casa)).matches("^[0-9]+$")==false) {
                                            System.out.println("Debe de ingresar solo numeros");
                                            System.out.println("Ingrese numero de casa: ");
                                        num_casa = r.nextInt();
                                        }*/
                                        System.out.println("Ingrese numero de bloque: ");
                                        num_bloque = r.nextInt();
                                        System.out.println("Ingrese color de la casa: ");
                                        color = r.next();
                                        System.out.println("Ingrese ancho de la casa: ");
                                        ancho = r.nextDouble();
                                        System.out.println("Ingrese largo de la casa: ");
                                        largo = r.nextDouble();
                                        System.out.println("Ingrese estado de compra [1. Comprada, 2. En venta]: ");
                                        compra = r.nextInt();
                                        while (compra < 1 || compra > 2) {
                                            System.out.println("Estado invalida");
                                            compra = r.nextInt();
                                        }
                                        System.out.println("Ingrese numero de pisos: ");
                                        pisos = r.nextInt();
                                        System.out.println("Ingrese numero de banos: ");
                                        banos = r.nextInt();
                                        System.out.println("Ingrese numero de cuartos: ");
                                        cuartos = r.nextInt();
                                        if (compra == 1) {
                                            System.out.println("Ingrese nombre del dueno: ");
                                            nom_dueno = r.next();
                                        } else {
                                            nom_dueno = "sin dueno";
                                        }
                                        System.out.println("Ingrese el estado [1.Lista, 2.Construccion, 3.Construccion en espera, 4.Espera de demolicion]: ");
                                        estado = r.next();
                                        while (Integer.parseInt(estado) < 0 || Integer.parseInt(estado) > lista.size()) {
                                            System.out.println("Estado invalida");
                                            estado = r.next();
                                        }
                                        if (estado.equals("1")) {
                                            estado = "Lista";
                                        }
                                        if (estado.equals("2")) {
                                            estado = "Construccion";
                                        }
                                        if (estado.equals("3")) {
                                            estado = "Construccion en espera";
                                        }
                                        if (estado.equals("4")) {
                                            estado = "Espera de demolicion";
                                        }
                                        System.out.println("Ingrese el nombre del ingeniero a cargo: ");
                                        nom_ing = r.next();
                                        lista.add(new Casas(num_casa, num_bloque, color, ancho, largo, compra, pisos, banos, cuartos, nom_dueno, estado, nom_ing));
                                        break;

                                    case 2:
                                        String s = "";

                                        System.out.println("Listas");
                                        for (int i = 0; i < lista.size(); i++) {
                                            if (((Casas) lista.get(i)).getEstado().equals("Lista")) {
                                                s += lista.indexOf(i + " = " + lista + "\n");
                                            }
                                        }
                                        System.out.println("Construccion");
                                        for (int i = 0; i < lista.size(); i++) {
                                            if (((Casas) lista.get(i)).getEstado().equals("Construccion")) {
                                                s += lista.indexOf(i + " = " + lista + "\n");
                                            }
                                        }
                                        System.out.println("Construccion en espera");

                                        for (int i = 0; i < lista.size(); i++) {
                                            if (((Casas) lista.get(i)).getEstado().equals("Construccion en espera")) {
                                                s += lista.indexOf(i + " = " + lista + "\n");
                                            }
                                        }
                                        System.out.println("Espera de demolicion");
                                        for (int i = 0; i < lista.size(); i++) {
                                            if (((Casas) lista.get(i)).getEstado().equals("Espera de demolicion")) {
                                                s += lista.indexOf(i + " = " + lista + "\n");
                                            }
                                        }
                                        /*  for (int i = 0; i <lista.size(); i++) {
          System.out.println(lista.get(i));
            System.out.println(lista.indexOf(lista.get(i))+" = "+lista.get(i));
        }*/
                                        break;

                                    case 3:
                                        int p,
                                         numc = 0,
                                         numb = 0,
                                         comp = 0,
                                         piso = 0,
                                         bano = 0,
                                         cuarto = 0;
                                        double anch = 0,
                                         larg = 0;
                                        String colr = null,
                                         nomd = null,
                                         nombrein = null;

                                        System.out.println("Ingrese la posicion a modificar: ");
                                        p = r.nextInt();
                                        while (p < 0 || p > lista.size()) {
                                            System.out.println("Posicion invalida");
                                            System.out.println("Posicion a eliminar[1.Si, 2.No]: ");
                                            p = r.nextInt();
                                        }
                                        System.out.println("Que desea modificar: 1.Numero de casa\n 2.Numero de bloque\n 3.Color\n 4.Ancho\n 5.Largo\n 6.Estado de compra\n 7.Numero de pisos\n 8.Numero de banos\n 9.Numero de cuartos\n 10.Nombre del dueno\n 11.Nombre del ingeniero a cargo\n");
                                        int opc3 = r.nextInt();
                                        switch (opc3) {
                                            case 1:
                                                System.out.println("Ingrese numero de casa: ");
                                                numc = r.nextInt();
                                                ((Casas) lista.get(p)).setNum_casa(numc);
                                                break;
                                            case 2:
                                                System.out.println("Ingrese numero de bloque: ");
                                                numb = r.nextInt();
                                                ((Casas) lista.get(p)).setNum_bloque(numb);
                                                break;
                                            case 3:
                                                System.out.println("Ingrese color de la casa: ");
                                                colr = r.next();
                                                ((Casas) lista.get(p)).setColor(colr);
                                                break;
                                            case 4:
                                                System.out.println("Ingrese ancho de la casa: ");
                                                anch = r.nextDouble();
                                                ((Casas) lista.get(p)).setAncho(anch);
                                                break;
                                            case 5:
                                                System.out.println("Ingrese largo de la casa: ");
                                                larg = r.nextDouble();
                                                ((Casas) lista.get(p)).setLargo(larg);
                                                break;
                                            case 6:
                                                System.out.println("Ingrese estado de compra [1. Comprada, 2. En venta]: ");
                                                comp = r.nextInt();
                                                ((Casas) lista.get(p)).setCompra(comp);
                                                break;
                                            case 7:
                                                System.out.println("Ingrese numero de pisos: ");
                                                piso = r.nextInt();
                                                ((Casas) lista.get(p)).setPisos(piso);
                                                break;
                                            case 8:
                                                System.out.println("Ingrese numero de banos: ");
                                                bano = r.nextInt();
                                                ((Casas) lista.get(p)).setBanos(bano);
                                                break;
                                            case 9:
                                                System.out.println("Ingrese numero de cuartos: ");
                                                cuarto = r.nextInt();
                                                ((Casas) lista.get(p)).setCuartos(cuarto);
                                                break;
                                            case 10:
                                                if (comp == 1) {
                                                    System.out.println("Ingrese nombre del dueno: ");
                                                    nomd = r.next();
                                                } else {
                                                    nomd = "sin dueno";
                                                }
                                                ((Casas) lista.get(p)).setNom_dueno(nomd);
                                                break;
                                            case 11:
                                                System.out.println("Ingrese el nombre del ingeniero a cargo: ");
                                                nombrein = r.next();
                                                ((Casas) lista.get(p)).setNom_ing(nombrein);
                                                break;

                                            default:
                                                System.out.println("Opcion no valida");
                                                break;
                                        }

                                        break;

                                    case 4:
                                        int pos;
                                        System.out.println("Posicion a eliminar[1.Si, 2.No]: ");
                                        pos = r.nextInt();
                                        while (pos < 0 || pos > lista.size()) {
                                            System.out.println("Posicion invalida");
                                            System.out.println("Posicion a eliminar[1.Si, 2.No]: ");
                                            pos = r.nextInt();
                                        }
                                        if (pos == 1) {
                                            lista.remove(pos);
                                        } else {
                                            System.out.println("No se borro registro");

                                        }
                                        break;

                                }
                                break;

                            case 2:
                                int posicion,
                                 modificar, cont_cons=0, cont_dem=0;
                                System.out.println("Ingrese la posicion de la casa que desea modificas su manejo");
                                posicion = r.nextInt();
                                while (posicion < 0 || posicion > lista.size()) {
                                    System.out.println("Posicion invalida");
                                    System.out.println("Ingrese la posicion de la casa que desea modificas su manejo");
                                    posicion = r.nextInt();
                                }

                                for (int i = 0; i < lista.size(); i++) {
                                    if (((Casas) lista.get(i)).getEstado().equals("Construccion")) {
                                        cont_cons++;
                                    }
                                }
                                
                                for (int i = 0; i < lista.size(); i++) {
                                    if (((Casas) lista.get(i)).getEstado().equals("Espera de demolicion")) {
                                        cont_dem++;
                                    }
                                }
                                
                                if (cont_cons>5){
                                    if (((Casas) lista.get(posicion)).getEstado().equals("Construccion en espera")) {
                                    System.out.println("Ingrese 1.Construccion, 2.No modificar");
                                    modificar = r.nextInt();
                                    if (modificar == 1) {
                                        ((Casas) lista.get(posicion)).setEstado("Construccion");
                                    }
                                }
                                }
                                
                                if (cont_dem>3){
                                    if (((Casas) lista.get(posicion)).getEstado().equals("Lista")) {
                                    System.out.println("Ingrese 1.Cambiar a Espera de demolicion, 2.No modificar");
                                    modificar = r.nextInt();
                                    if (modificar == 1) {
                                        ((Casas) lista.get(posicion)).setEstado("Espera de demolicion");
                                    }
                                }
                                }
                                
                                if (((Casas) lista.get(posicion)).getEstado().equals("Construccion")) {
                                    System.out.println("Ingrese 1.Construccion en espera, 2.Lista, 3.No modificar");
                                    modificar = r.nextInt();
                                    if (modificar == 1) {
                                        ((Casas) lista.get(posicion)).setEstado("Construccion en espera");
                                    }

                                    if (modificar == 2) {
                                        ((Casas) lista.get(posicion)).setEstado("Lista");
                                    }
                                }
                                if (((Casas) lista.get(posicion)).getEstado().equals("Espera de demolicion")) {
                                    System.out.println("Ingrese 1.Demoler 2.No modificar");
                                    modificar = r.nextInt();
                                    if (modificar == 1) {
                                        lista.remove(posicion);
                                    }
                                }

                                break;
                        }

                    } else {
                        System.out.println("Debe ingresar al sistema primero");
                    }
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion no valida o no ha inicado sesion");
                    break;
            }

            System.out.println("Volver? [s/n]: ");
            resp = r.next().charAt(0);
        }
    }

    public static int menu(int opc) {
        System.out.println("Menu\n Usuario:leobanegas\n Contrasena:99\n 1.Registro de Casas\n 2.Manejo de Estados\n 3.Log In\n 4.Salir\n\nPD:Pide usuario y contrasena cada vuelta");
        return opc = r.nextInt();
    }

    public static int menu2(int opc2) {
        System.out.println("Menu\n 1.Crear Casas\n 2.Listas Casas\n 3.Modificar Casas\n 4.Borrar Casas");
        return opc2 = r.nextInt();
    }

    public static boolean validacion(String usua, String contra) {//valida el login
        if (usua.equals(usuario[0]) && contra.equals(usuario[1])) {
            return true;
        } else {
            return false;
        }
    }
}

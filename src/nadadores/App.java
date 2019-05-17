package nadadores;

import java.util.Scanner;

public class App {

    Scanner in;

    public App() {
        in = new Scanner(System.in, "iso-8859-1");
    }

    private void menuInsertarNadador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void menuListadoTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void menuListadoPorEdad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void menuCantidadNadadoresPorClub() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void menuEliminarNadador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void menuModificarNadador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // ----------------------- MENÚS ------------------------------------------
    private void menuListados() {
        int opcion;
        do {
            System.out.print(""
                    + "1.- Todos los nadadores, por orden alfabético\n"
                    + "2.- Nadadores en rango de edad, por orden alfabético\n"
                    + "0.- Salir\n"
                    + "  -->");
            opcion = Integer.parseInt(in.nextLine());
            switch (opcion) {
                case 1:
                    menuListadoTodos();
                    break;
                case 2:
                    menuListadoPorEdad();
                    break;
            }
        } while (opcion != 0);

    }

    public void run() {
        int opcion;
        do {
            System.out.print(""
                    + "1.- Insertar Nadador\n"
                    + "2.- Listados\n"
                    + "3.- Cantidad de nadadores por club\n"
                    + "4.- Eliminar nadador\n"
                    + "5.- Modificar nadador\n"
                    + "0.- Salir\n"
                    + "  -->");
            opcion = Integer.parseInt(in.nextLine());
            switch (opcion) {
                case 1:
                    menuInsertarNadador();
                    break;
                case 2:
                    menuListados();
                    break;
                case 3:
                    menuCantidadNadadoresPorClub();
                    break;
                case 4:
                    menuEliminarNadador();
                    break;
                case 5:
                    menuModificarNadador();
                    break;
            }
        } while (opcion != 0);

    }

    public static void main(String[] args) {
        new App().run();
    }

}

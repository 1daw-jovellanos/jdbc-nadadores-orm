package nadadores;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    Scanner in;
    OrmNadadores ormNadadores;


    private void menuInsertarNadador() {
        System.out.print("Dime el nombre: ");
        String nombre = in.nextLine();
        System.out.print("Dime la edad: ");
        int edad = Integer.parseInt(in.nextLine());
        System.out.print("Dime el club: ");
        String club = in.nextLine();
        Nadador nadador = new Nadador(nombre, edad, club);
        try {
        ormNadadores.guardarNadador(nadador);
        } catch (NatacionDatosException ex) {
            System.out.println("No se pudo insertar el nadador. Revise los datos");
            ex.printStackTrace();
        }
        
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
        
        in = new Scanner(System.in, "iso-8859-1");
        try {
            ormNadadores = new OrmNadadores();
        } catch (NatacionDatosException ex) {
            System.out.println("No se pudo cargar el Driver. La aplicación termina.");
            return;
        }
        
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

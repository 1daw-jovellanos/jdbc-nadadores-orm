
package nadadores;

import java.sql.*;
import java.util.*;

public class OrmNadadores {
    
    private static final String URL ="jdbc:h2:tcp://localhost/./natacion";
    private static final String USER = "appnatacion";
    private static final String PASS = "1234";
    
    public OrmNadadores() throws NatacionDatosException {
        try {
        Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException ex) {
            throw new NatacionDatosException("No pude cargar el Driver");
        }
    }
    
    
    public void guardarNadador(Nadador nadador) throws NatacionDatosException {
        try ( Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            String sql = "INSERT INTO .... bla bla bla VALUES(?. ?,')";
            
        } catch (SQLException ex) {

        }
    }
    
    // Listado de todos los nadadores
    public List<Nadador> obtenerTodos() throws NatacionDatosException {
        return  null;
    }
    
    public List<Nadador> obtenerTodosPorEdad(int edadMinima, int edadMaxima) throws NatacionDatosException {
        return  null;
    }
    
    public Map<String, Integer> obtenerCantidadNadadoresPorClub() throws NatacionDatosException {
        return null;
    }
    
    public void eliminarNadador(int numeroDorsal) throws NatacionDatosException {
        
    }
    
    // para update
    
    public Nadador obtenerNadador(int numeroDorsal) throws NatacionDatosException {
        return null;
    }
    
    public void modificarNadador(Nadador nadador) throws NatacionDatosException {
        
    }
}

package parte3;

import com.programandoenjava.parte3.Libro;
import com.programandoenjava.parte3.Persona;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PersonaTest {
    private Persona persona;
    private Libro libro;
    private Libro libro2;

    @BeforeEach
    public void setUp() {
        persona = new Persona("Juan", 30);
        libro = new Libro("El Quijote", "Cervantes", 1605);
        libro2 = new Libro("En busca del tiempo perdido", "Marcel Proust", 1913);
    }

    @Test
    public void crearPersona() {
        assertEquals("Juan", persona.getNombre());
        assertEquals(30, persona.getEdad());
    }

    @Test
    public void obtenerIdPersona() {
        assertEquals(1, persona.getId());
    }

    @Test
    public void tomarPrestadoLibroExistente() {
        persona.tomarPrestado(libro);
        assertEquals(1, persona.getLibrosPrestados().size());
        assertEquals(libro, persona.buscarLibroPorId(libro.getId()));
    }

    @Test
    public void tomarPrestadoDosLibros() {
        persona.tomarPrestado(libro);
        persona.tomarPrestado(libro2);
        assertEquals(2, persona.getLibrosPrestados().size());
        assertEquals(libro, persona.buscarLibroPorId(libro.getId()));
        assertEquals(libro2, persona.buscarLibroPorId(libro2.getId()));
    }

    @Test
    public void tomarPrestadoMismoLibroDosVeces() {
        persona.tomarPrestado(libro);
        persona.tomarPrestado(libro);
        assertEquals(2, persona.getLibrosPrestados().size());
        assertEquals(libro, persona.buscarLibroPorId(libro.getId()));
        assertEquals(libro, persona.buscarLibroPorId(libro.getId()));
    }

    @Test
    public void tomarPrestadoLibroInexistente() {
        persona.tomarPrestado(libro);
        assertEquals(1, persona.getLibrosPrestados().size());
        assertEquals(libro, persona.buscarLibroPorId(libro.getId()));
                persona.tomarPrestado(libro2);
        assertEquals(2, persona.getLibrosPrestados().size());
        assertEquals(libro, persona.buscarLibroPorId(libro.getId()));
        assertEquals(libro2, persona.buscarLibroPorId(libro2.getId()));
    }


    @Test
    public void devolverLibroExistente() {
        persona.tomarPrestado(libro);
        assertEquals(libro, persona.buscarLibroPorId(libro.getId()));
        assertEquals(libro, persona.buscarLibroPorId(libro.getId()));
        persona.devolver(libro);
        assertEquals(0, persona.getLibrosPrestados().size());
    }

    @Test
    public void devolverLibroInexistente() {
        int cantidadLibrosPrestados = persona.getLibrosPrestados().size();
        persona.devolver(libro2);
        assertEquals(cantidadLibrosPrestados, persona.getLibrosPrestados().size());
    }
    
    @Test
    public void buscarLibroPorId() {
        persona.tomarPrestado(libro);
        persona.tomarPrestado(libro2);
        assertEquals(libro, persona.buscarLibroPorId(libro.getId()));
        assertEquals(libro2, persona.buscarLibroPorId(libro2.getId()));
    }
    
    @Test
    public void buscarLibroPorIdInexistente() {
        persona.tomarPrestado(libro);
        persona.tomarPrestado(libro2);
        assertNull(persona.buscarLibroPorId(3));
    }
}

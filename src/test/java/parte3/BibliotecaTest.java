package parte3;

import com.programandoenjava.parte3.Biblioteca;
import com.programandoenjava.parte3.Libro;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BibliotecaTest {
    private Biblioteca biblioteca;
    private Libro libro;

    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca();
        libro = new Libro("C++: Compiler", "Eduard", 2017);
    }
    
    @Test
    public void agregarLibro() {
        biblioteca.agregarLibro(libro);
        assertEquals(1, biblioteca.getLibros().size());
    }
    
    @Test
    public void buscarLibroExistente() {
        biblioteca.agregarLibro(libro);
        assertEquals(libro, biblioteca.buscarLibro(libro.getId()));
    }
    
    @Test
    public void buscarLibroNoExistente() {
        assertNull(biblioteca.buscarLibro(libro.getId()));
    }
    
}

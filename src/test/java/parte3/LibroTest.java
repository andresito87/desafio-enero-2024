package parte3;

import com.programandoenjava.parte3.Libro;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibroTest {
    private static Libro libro;
    private static Libro libro2;

    @BeforeAll
    public static void setUp() {
        libro = new Libro("Effective Java", "Joshua Bloch", 2017);
        libro2 = new Libro("JavaScript - The Definitive Guide", "David Flanagan", 2020);
    }
    
    @Test
    public void getId() {
        assertEquals(24, libro.getId());
    }
    
    @Test
    public void getTitulo() {
        assertEquals("JavaScript - The Definitive Guide", libro2.getTitulo());
    }
    
    @Test
    public void setTitulo() {
        libro.setTitulo("Java Efectivo");
        assertEquals("Java Efectivo", libro.getTitulo());
    }
    
    @Test
    public void getAutor(){
        assertEquals("David Flanagan", libro2.getAutor());
    }
    
    @Test
    public void setAutor() {
        libro.setAutor("Joshua J. Bloch");
        assertEquals("Joshua J. Bloch", libro.getAutor());
    }
    
    @Test
    public void getAnioPublicacion() {
        assertEquals(2020, libro2.getAnioPublicacion());
    }
    
    @Test
    public void setAnioPublicacion() {
        libro.setAnioPublicacion(2018);
        assertEquals(2018, libro.getAnioPublicacion());
    }
    
    @Test
    public void getIdSegundoLibro() {
        assertEquals(25, libro2.getId());
    }
}

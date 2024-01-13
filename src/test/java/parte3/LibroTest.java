package parte3;

import com.programandoenjava.parte3.Libro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibroTest {
    private Libro libro;

    @BeforeEach
    public void setUp() {
        libro = new Libro("Effective Java", "Joshua Bloch", 2017);
    }
    
    @Test
    public void getId() {
        assertEquals(Libro.contadorIds, libro.getId());
    }
    
    @Test
    public void getTitulo() {
        assertEquals("Effective Java", libro.getTitulo());
    }
    
    @Test
    public void setTitulo() {
        libro.setTitulo("Java Efectivo");
        assertEquals("Java Efectivo", libro.getTitulo());
    }
    
    @Test
    public void getAutor(){
        assertEquals("Joshua Bloch", libro.getAutor());
    }
    
    @Test
    public void setAutor() {
        libro.setAutor("Joshua J. Bloch");
        assertEquals("Joshua J. Bloch", libro.getAutor());
    }
    
    @Test
    public void getAnioPublicacion() {
        assertEquals(2017, libro.getAnioPublicacion());
    }
    
    @Test
    public void setAnioPublicacion() {
        libro.setAnioPublicacion(2018);
        assertEquals(2018, libro.getAnioPublicacion());
    }

    @Test
    public void getIdSegundoLibro() {
        Libro libro2 = new Libro("JavaScript - The Definitive Guide", "David Flanagan", 2020);
        assertEquals(Libro.contadorIds, libro2.getId());
    }
    
}

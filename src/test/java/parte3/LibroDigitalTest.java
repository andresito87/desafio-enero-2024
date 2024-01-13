package parte3;

import com.programandoenjava.parte3.Libro;
import com.programandoenjava.parte3.LibroDigital;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibroDigitalTest {
    private LibroDigital libroDigital;
    @BeforeEach
    public void setUp() {
        libroDigital = new LibroDigital("Effective Java", "Joshua Bloch", 2017, "https://www.amazon.com/Effective-Java-Joshua-Bloch/dp/0134685997");
    }
    @Test
    public void crearLibroDigital() {
        assertEquals("Effective Java", libroDigital.getTitulo());
        assertEquals("Joshua Bloch", libroDigital.getAutor());
        assertEquals(2017, libroDigital.getAnioPublicacion());
        assertEquals("https://www.amazon.com/Effective-Java-Joshua-Bloch/dp/0134685997", libroDigital.getUrl());
    }
    
    @Test
    public void getUrl() {
        assertEquals("https://www.amazon.com/Effective-Java-Joshua-Bloch/dp/0134685997", libroDigital.getUrl());
    }
    
    @Test
    public void setUrl() {
        libroDigital.setUrl("https://www.iberlibro.com/servlet/BookDetailsPL?bi=31712313249");
        assertEquals("https://www.iberlibro.com/servlet/BookDetailsPL?bi=31712313249", libroDigital.getUrl());
    }
    
    @Test
    public void getId() {
        assertEquals(Libro.contadorIds, libroDigital.getId());
    }
    
    @Test
    public void getTitulo() {
        assertEquals("Effective Java", libroDigital.getTitulo());
    }
    
    @Test
    public void setTitulo() {
        libroDigital.setTitulo("Java Efectivo");
        assertEquals("Java Efectivo", libroDigital.getTitulo());
    }
    
    @Test
    public void getAutor(){
        assertEquals("Joshua Bloch", libroDigital.getAutor());
    }
    
    @Test
    public void setAutor() {
        libroDigital.setAutor("Joshua J. Bloch");
        assertEquals("Joshua J. Bloch", libroDigital.getAutor());
    }
    
    @Test
    public void getAnioPublicacion() {
        assertEquals(2017, libroDigital.getAnioPublicacion());
    }
    
    @Test
    public void setAnioPublicacion() {
        libroDigital.setAnioPublicacion(2018);
        assertEquals(2018, libroDigital.getAnioPublicacion());
    }
}

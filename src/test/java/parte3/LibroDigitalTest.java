package parte3;

import com.programandoenjava.parte3.LibroDigital;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibroDigitalTest {
    LibroDigital libroDigital;
    @Test
    public void crearLibroDigital() {
        libroDigital = new LibroDigital("Effective Java", "Joshua Bloch", 2017, "https://www.amazon.com/Effective-Java-Joshua-Bloch/dp/0134685997");
        assertEquals("Effective Java", libroDigital.getTitulo());
        assertEquals("Joshua Bloch", libroDigital.getAutor());
        assertEquals(2017, libroDigital.getAnioPublicacion());
        assertEquals("https://www.amazon.com/Effective-Java-Joshua-Bloch/dp/0134685997", libroDigital.getUrl());
    }
    
    @Test
    public void getUrl() {
        libroDigital = new LibroDigital("Effective Java", "Joshua Bloch", 2017, "https://www.amazon.com/Effective-Java-Joshua-Bloch/dp/0134685997");
        assertEquals("https://www.amazon.com/Effective-Java-Joshua-Bloch/dp/0134685997", libroDigital.getUrl());
    }
}

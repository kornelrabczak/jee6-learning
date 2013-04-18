package javaeeapp;

import java.util.HashMap;
import java.util.Map;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 *
 * @author nikom
 */
@RunWith(JUnit4.class)
public class BookEjbTest {
    
    private static EJBContainer container;
    
    private static Context ctx;
    
    @BeforeClass
    public static void initContainer() throws Exception {
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("org.glassfish.ejb.embedded.glassfish.installation.root", "./src/test/glassfish");
        container = EJBContainer.createEJBContainer(properties);
        ctx = container.getContext();
    }
    
    @AfterClass
    public static void closeContainer() throws Exception {
        container.close();
    }
    
    @Test
    public void createBook() throws Exception {

    }
}

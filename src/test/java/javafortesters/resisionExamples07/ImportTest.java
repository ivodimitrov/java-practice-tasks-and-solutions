package javafortesters.resisionExamples07;

import javafortesters.classesExamples01.AClassWithMethods;
import javafortesters.classesExamples01.AnEmptyClass;
import javafortesters.domainentities.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImportTest {

    @org.junit.Test
    public void nonImportTest() {

        assertEquals("3 = 2 + 1", 3, 2 + 1);
    }

    @Test
    public void importClassNameTest() {

        User user = new User();
        // no assert needed for docs
    }

    @Test
    public void importClassWithWildCard() {

        AClassWithMethods aClassWithMethods = new AClassWithMethods();
        AnEmptyClass anEmptyClass = new AnEmptyClass();
        // no assert needed for docs
    }

    @Test
    public void nonStaticImport() {

        Assert.assertEquals(5, 3 + 2);
        assertEquals(6, 3 + 3);
    }
}

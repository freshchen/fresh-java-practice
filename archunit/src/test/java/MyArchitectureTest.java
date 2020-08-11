import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.junit.jupiter.api.Test;

/**
 * @author darcy
 * @since 2020/07/06
 **/
public class MyArchitectureTest {

    @Test
    public void some_architecture_rule() {
        ClassFileImporter classFileImporter = new ClassFileImporter();
        JavaClasses importedClasses = classFileImporter.importPackages("com.freshchen");
        // service只能被controller活着service调用
        ArchRuleDefinition.classes()
                .that()
                .resideInAPackage("..service..")
                .should()
                .onlyBeAccessed()
                .byAnyPackage("..controller..", "..service..")
                .check(importedClasses);

    }
}

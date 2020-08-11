import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;

/**
 * @author darcy
 * @since 2020/07/06
 **/
@AnalyzeClasses(packages = "com.freshchen")
public class Demo1 {

    @ArchTest
    public void service(JavaClasses javaClasses) {
        ArchRuleDefinition.classes()
                .that().resideInAPackage("..service..")
                .should().onlyBeAccessed().byAnyPackage("..controller..", "..service..")
                .check(javaClasses);
    }
}

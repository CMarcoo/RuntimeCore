package top.cmarco.runtimecore.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The `@SpigotVersion` annotation is used to specify the required Spigot version for a specific element
 * in your code, such as a class or method. This annotation allows you to document the compatibility of
 * your code with a particular Spigot version.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
public @interface SpigotVersion {

    /**
     * The `version` field is a string that represents the minimum required Spigot version for the annotated element.
     *
     * <p>For example, if you want to specify that a method is compatible with Spigot version 1.20.2 (or later),
     * you can use the `@SpigotVersion` annotation as follows:
     *
     * <pre>{@code
     * {@literal @}SpigotVersion(version = "1.20.2")
     * public void myMethod() {
     *     // Implementation for 1.20.2 and later
     * }
     * }</pre>
     *
     * You can use the `version` field to communicate the version compatibility of classes, methods,
     * constructors, or fields within your code.
     *
     * @return A notnull string representing the minimum required Spigot version.
     */
    String version();
}

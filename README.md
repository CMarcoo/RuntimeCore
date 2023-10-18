# RuntimePlugin Interface

## Overview

The **RuntimeCore** API provides a simple and open-source way to interact with Spigot (Minecraft) server software without being constrained by the GPL license.
This software uses BSD 3 license, which grants us developers much more freedom in development and business.

**Support:** Java 8 and above 

**Server Version:** Spigot\Paper 1.8.8 and above

**License:** BSD 3-Clause "New" or "Revised" License

### Example: Java Main Class

```java
import top.cmarco.runtimecore.RuntimePlugin;
import top.cmarco.runtimecore.annotations.SpigotVersion;

/**
 * Hello world!
 */
@SpigotVersion(version = "1.20.2") // optional here
public final class App implements RuntimePlugin { 
    // Main class must be a child of Runtimelugin

    @Override
    public void onEnable() { // called on enable phase
        System.out.println("Hello World SPIGOT server!");
    }

    @Override
    public void onDisable() { // called on disable phase
        System.out.println("Going to sleep!");
    }
}
```

### Example: Maven POM.xml

```xml
  <dependencies>
    <dependency>
      <groupId>top.cmarco</groupId>
      <artifactId>RuntimeCore</artifactId>
      <version>1.0.0</version>
      <scope>provided</scope>
    </dependency>
  </dependencies>
```
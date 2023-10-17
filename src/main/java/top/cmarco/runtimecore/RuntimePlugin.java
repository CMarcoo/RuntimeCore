package top.cmarco.runtimecore;

/**
 * The `RuntimePlugin` interface should be implemented by the main class of a Minecraft plugin
 * to handle the initialization and cleanup of the plugin.
 */
public interface RuntimePlugin {

     /**
      * This method is called when the plugin is enabled, typically during the plugin's loading process.
      * Implement this method to set up any resources, configurations, or start any necessary processes
      * for your Minecraft plugin. You can also register event listeners, commands, and other plugin features here.
      *
      * <p>Example usage:
      * <pre>{@code
      * public class MyPlugin implements RuntimePlugin {
      *     {@literal @}Override
      *     public void onEnable() {
      *         // Initialize the plugin here
      *         // Register event listeners and commands
      *     }
      * }
      * }</pre>
      */
     void onEnable();

     /**
      * This method is called when the plugin is disabled or unloaded. It is essential to implement this
      * method to release any resources, save data, or shut down any running processes specific to your
      * plugin. This is the place to clean up anything that was set up in the `onEnable` method.
      *
      * <p>Example usage:
      * <pre>{@code
      * public class MyPlugin implements RuntimePlugin {
      *     {@literal @}Override
      *     public void onEnable() {
      *         // Initialize the plugin here
      *     }
      *
      *     {@literal @}Override
      *     public void onDisable() {
      *         // Clean up and release resources
      *     }
      * }
      * }</pre>
      */
     void onDisable();
}

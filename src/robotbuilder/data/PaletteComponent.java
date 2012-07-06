/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package robotbuilder.data;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author brad
 * @author Alex Henning
 */
public class PaletteComponent {
    private String name; //  the name of the palette component
    // the metadata for the component (type, etc.)
    private HashMap<String, String> metaData = new HashMap<String, String>(); 
    // set of properties for the component
    private HashMap<String, Property> properties = new HashMap<String, Property>();
    
    public PaletteComponent(String name) {
        this.name = name;
    }
    
    public void addProperty(String propName, Property property) {
        System.out.println(property);
        properties.put(propName, property);
    }
    
    public Map<String, Property> getProperties() {
        return properties;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    public void print() {
        System.out.println("Component: " + name);
        for (String key: properties.keySet()) {
            String k = (String) key;
            System.out.println("\t\t" + k + ": " + properties.get(k));
        }
    }
}

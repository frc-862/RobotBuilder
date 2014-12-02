#header()

package ${package};
    
${helper.getImports($robot, "RobotMap")}
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
#@autogenerated_code("declarations", "    ")
#parse("${exporter-path}RobotMap-declarations.java")
#end

    public static void init() {
#@autogenerated_code("constructors", "        ")
#parse("${exporter-path}RobotMap-constructors.java")
#end
    }
}
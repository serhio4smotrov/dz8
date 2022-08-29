import Beepers.Beeper;
import Engines.Engine;
import Landings.Landing;
import WindowsTinting.WindowTinting;

public abstract class Car {
    Beeper beeper;
    Engine engine;
    WindowTinting windowTinting;
    Landing landing;
    public Car(Beeper beeper,Engine engine,WindowTinting windowTinting,Landing landing){
        this.beeper = beeper;
        this.engine = engine;
        this.windowTinting = windowTinting;
        this.landing = landing;
    }
}

package Cars;

import Beepers.Beeper;
import Engines.Engine;
import Landings.Landing;
import WindowsTinting.WindowTinting;

public abstract class Car {
    public Beeper beeper;
    public Engine engine;
    public WindowTinting windowTinting;
    public Landing landing;
    public Car(Beeper beeper,Engine engine,WindowTinting windowTinting,Landing landing){
        this.beeper = beeper;
        this.engine = engine;
        this.windowTinting = windowTinting;
        this.landing = landing;
    }
}

package Cars;

import Beepers.Beeper;
import Cars.Car;
import Engines.Engine;
import Landings.Landing;
import WindowsTinting.WindowTinting;

public class Kamaz extends Car {
    public Kamaz(Beeper beeper, Engine engine, WindowTinting windowTinting, Landing landing) {
        super(beeper, engine, windowTinting,landing);
    }
}

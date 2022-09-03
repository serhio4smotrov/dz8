package Cars;

import Beepers.Beeper;
import Cars.Car;
import Engines.Engine;
import Landings.Landing;
import WindowsTinting.WindowTinting;

public class Moskvich extends Car {
    public Moskvich(Beeper beeper, Engine engine, WindowTinting windowTinting, Landing landing) {
        super(beeper, engine, windowTinting,landing);
    }
}

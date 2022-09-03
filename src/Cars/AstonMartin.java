package Cars;

import Beepers.Beeper;
import Cars.Car;
import Engines.Engine;
import Landings.Landing;
import WindowsTinting.WindowTinting;

public class AstonMartin extends Car {
    public AstonMartin(Beeper beeper, Engine engine, WindowTinting windowTinting, Landing landing) {
        super(beeper, engine, windowTinting,landing);
    }
}

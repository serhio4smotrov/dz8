import Beepers.Beeper;
import Beepers.Dudelka;
import Beepers.Groove;
import Beepers.Horn;
import Engines.Engine;
import Engines.EngineV12;
import Engines.EngineV6;
import Engines.PowerEng;
import Landings.HighLanding;
import Landings.LowLanding;
import WindowsTinting.ToningLite;
import WindowsTinting.ToningMiddle;
import WindowsTinting.ToningUltra;
import WindowsTinting.WindowTinting;

public class Main {
    public static void main(String[] args) {
        LowLanding lowLanding = new LowLanding();
        HighLanding highLanding = new HighLanding();
        Engine engineV6 = new EngineV6();
        Beeper groove = new Groove();
        Dudelka dudelka = new Dudelka();
        Horn horn = new Horn();
        EngineV12 engineV12 = new EngineV12();
        Engine powerEng = new PowerEng();
        ToningLite toningLite = new ToningLite();
        ToningMiddle toningMiddle = new ToningMiddle();
        WindowTinting toningUltra = new ToningUltra();
        AstonMartin astonMartin = new AstonMartin(horn,engineV12,toningLite,lowLanding);
        System.out.println(astonMartin.beeper.makeSound()+'\n'+astonMartin.engine.getSpeed()+'\n'+astonMartin.windowTinting.luminosty()+'\n'+astonMartin.landing.LandingHeight());
        Moskvich moskvich = new Moskvich(dudelka,powerEng,toningMiddle,highLanding);
        System.out.println(moskvich.beeper.makeSound()+'\n'+moskvich.engine.getSpeed()+'\n'+moskvich.windowTinting.luminosty()+'\n'+moskvich.landing.LandingHeight());
        Supra supra = new Supra(groove,engineV6,toningUltra,lowLanding);
        System.out.println(supra.beeper.makeSound()+'\n'+supra.engine.getSpeed()+'\n'+supra.windowTinting.luminosty()+'\n'+supra.landing.LandingHeight());
        Kamaz kamaz = new Kamaz(dudelka,powerEng,toningMiddle,highLanding);
        System.out.println(kamaz.beeper.makeSound()+'\n'+kamaz.engine.getSpeed()+'\n'+kamaz.windowTinting.luminosty()+'\n'+kamaz.landing.LandingHeight());
    }
}

package WindowsTinting;

import WindowsTinting.WindowTinting;

public class ToningMiddle implements WindowTinting {
    @Override
    public String luminosty() {
        return "слепит только навстречу солнцу";
    }
}

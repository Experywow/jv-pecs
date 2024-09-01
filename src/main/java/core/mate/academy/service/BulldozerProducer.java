package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < AMOUNT_OF_MODELS; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
}

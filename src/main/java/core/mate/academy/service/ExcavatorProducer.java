package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < AMOUNT_OF_MODELS; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }
}

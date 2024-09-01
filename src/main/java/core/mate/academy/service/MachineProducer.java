package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer<T extends Machine> {
    /**
     * In your implementations - create 2-3 models, add them to the list and return
     * @return - the list of models
     */
    int AMOUNT_OF_MODELS = 3;
    List<? extends T> get();
}

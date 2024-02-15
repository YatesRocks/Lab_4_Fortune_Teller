package lab.four.controller;

import lab.four.model.FortuneModel;
import lab.four.observer.IFortuneController;

public class FortuneController implements IFortuneController {
    private final FortuneModel fortuneModel;

    public FortuneController(FortuneModel model) {
        this.fortuneModel = model;
    }

    public String readFortune() {
        return fortuneModel.next();
    }
}

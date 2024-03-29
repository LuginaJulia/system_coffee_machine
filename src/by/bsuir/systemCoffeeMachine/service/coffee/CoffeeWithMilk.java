package by.bsuir.systemCoffeeMachine.service.coffee;

import java.io.Serializable;
import java.util.Objects;

import by.bsuir.systemCoffeeMachine.annotation.CoffeeInfo;
import by.bsuir.systemCoffeeMachine.annotation.FieldInfo;

@CoffeeInfo(name = "Кофе с молоком")
public class CoffeeWithMilk extends Espresso implements Serializable, Cloneable {
    @FieldInfo(name = "", isRepresented = false)
    private static final int DEFAULT_MILK_VOLUME = 110;

    @FieldInfo(name = "Объем молока", isRepresented = true)
    private int milkVolume;

    public CoffeeWithMilk() {
        milkVolume = DEFAULT_MILK_VOLUME;
    }

    public int getMilkVolume() {
        return this.milkVolume;
    }

    public void setMilkVolume(int newVolume) {
        if (newVolume > 0) {
            this.milkVolume = newVolume;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (! super.equals(obj)) {
            return false;
        }
        CoffeeWithMilk coffee = (CoffeeWithMilk)obj;
        if (milkVolume != coffee.getMilkVolume()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), milkVolume);
    }
}

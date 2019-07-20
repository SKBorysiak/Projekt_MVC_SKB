package pl.sda.mvc.model;

import lombok.Data;

@Data
public class GiantModel {
    private Health health;
    private Fatigue fatigue;
    private Nourishment nourishment;

    public GiantModel(Health health, Fatigue fatigue, Nourishment nourishment) {
        this.health = health;
        this.fatigue = fatigue;
        this.nourishment = nourishment;
    }

    @Override
    public String toString() {
        return "GiantModel{" +
                "health=" + health +
                ", fatigue=" + fatigue +
                ", nourishment=" + nourishment +
                '}';
    }
}

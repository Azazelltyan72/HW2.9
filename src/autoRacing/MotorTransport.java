package autoRacing;

import java.util.*;

public abstract class MotorTransport {
    private final String brand;
    private final String model;
    private Set<Driver<?>> drivers;
    private Set<Sponsor> sponsors;
    private Set<Mechanic<?>> mechanics;
    private double engineCapacity;


    public abstract void startMoving();
    public abstract void finishMoving();

    public MotorTransport(String brand, String model, double engineCapacity) {
        sponsors = new HashSet<>();
        drivers = new HashSet<>();
        mechanics = new HashSet<>();
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
    }

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanics(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsors(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        if (engineCapacity > 0) {
            this.engineCapacity = engineCapacity;
        } else {
            this.engineCapacity = 60;
        }
    }

    public abstract boolean service();

    public abstract void repair();

}

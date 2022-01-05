package superexample.codingslice;

import java.util.HashSet;
import java.util.Set;

final class HeavenlyBody {
    private final String name;
    private final double orbintalPeried;
    private final Set<HeavenlyBody> satelliate;

    public HeavenlyBody(String name, double orbintalPeried) {
        this.name = name;
        this.orbintalPeried = orbintalPeried;
        this.satelliate = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbintalPeried() {
        return orbintalPeried;
    }

    public boolean addMoon(HeavenlyBody moon){
        return this.satelliate.add(moon);
    }

    public Set<HeavenlyBody> getSatelliate(){
        return new HashSet<>(this.satelliate);
    }
    
}

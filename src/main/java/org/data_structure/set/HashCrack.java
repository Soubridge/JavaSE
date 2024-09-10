package org.data_structure.set;

import java.util.Objects;

public class HashCrack {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCrack hashCrack = (HashCrack) o;
        return Objects.equals(name, hashCrack.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public HashCrack(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

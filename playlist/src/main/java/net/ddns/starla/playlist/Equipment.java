package net.ddns.starla.playlist;

public enum Equipment {
    AB_WHEEL("Ab Wheel"),
    ANKLE_WEIGHTS("Ankle Weights"),
    BARBELL("Barbell"),
    BENCH("Bench"),
    BIKE("Bike"),
    BOX("Box"),
    CABLE_ATTACHMENT("Cable Attachment"),
    CABLE_MACHINE("Cable Machine"),
    CROSSBAR("Crossbar"),
    DIP_DEVICE("Dip Device"),
    DUMBBELLS("Dumbbells"),
    ELLIPTICAL("Elliptical"),
    EZ_BAR("EZ Bar"),
    FOAM_ROLLER("Foam Roller"),
    GHD_MACHINE("GHD Machine"),
    JUMP_ROPE("Jump Rope"),
    KETTLEBELL("Kettlebell"),
    LEG_MACHINE("Leg Machine"),
    MAT("Mat"),
    MEDICINE_BALL("Medicine Ball"),
    NO_EQUIPMENT("No Equipment"),
    PAD("Pad"),
    PARALLETTE("Parallette"),
    PULLUP_BAR("Pull-up Bar"),
    RESISTANCE_BAND("Resistance Band"),
    RINGS("Rings"),
    ROMAN_CHAIR("Roman Chair"),
    ROPE("Rope"),
    ROW_MACHINE("Row Machine"),
    SQUAT_RACK("Squat Rack"),
    SUSPENSION_STRAP("Suspension Strap"),
    SWISS_BALL("Swiss Ball"),
    WEIGHT_CLAMPS("Weight Clamps"),
    WEIGHT_PLATES("Weight Plates");

    private String name;

    Equipment(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

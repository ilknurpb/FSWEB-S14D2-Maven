package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(250, PaintColor.WHITE);

        Carpet carpet = new Carpet(300, 200, PaintColor.RED);

        Bed bed = new Bed("Modern", 2, 60, 1, 1);

        Lamp lamp = new Lamp(LampType.NEON, true, 5);

        Wardrobe wardrobe = new Wardrobe(200, 250, 85.5);

        Bedroom bedroom = new Bedroom(
                "My Bedroom",
                wall1,
                wall2,
                wall3,
                wall4,
                ceiling,
                carpet,
                bed,
                lamp,
                wardrobe
        );


        System.out.println(bedroom.getName());

        System.out.println(bedroom.getCeiling().getHeight());

        System.out.println(bedroom.getCarpet().getColor());


        bedroom.getBed().make();

        bedroom.getLamp().turnOn();

        bedroom.getWardrobe().add();
    }
}
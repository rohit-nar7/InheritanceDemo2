package ProgramVehicles.model;

import ProgramVehicles.model.VehWorld;

 class ProVehWorld {
    public static void main(String[] args) {
        VehWorld vehWorld1 = new VehWorld(3);
        vehWorld1.generateVehicleForVehWorld();
        vehWorld1.printW();
        vehWorld1.after2000();
        vehWorld1.maxSpeed();
        vehWorld1.minPrice();
    }
}

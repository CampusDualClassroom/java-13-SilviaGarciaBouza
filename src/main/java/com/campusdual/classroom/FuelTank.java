package com.campusdual.classroom;

public class FuelTank {

  private int actualFuel = 10;

  public void setActualFuel(int actualFuel) {
    if (actualFuel >= 0){
      this.actualFuel = actualFuel;
  }
  }

  public void showDetails() {
    System.out.println("La capacidad actual es de " + this.actualFuel + " litros.");
  }

  public int getActualFuel() {
    return this.actualFuel;
  }
}

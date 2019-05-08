public class Car {
  double distance;//KM
  int speed;//KM/H
  public Car(double distance, int speed){
    this.distance = distance;
    this.speed = speed;
  }

  public double meeting(Car obj){
    if(this.speed < 0){
      double totalSpeed = Math.abs(this.speed) + obj.speed;
      double totalDist =  Math.abs(this.distance - obj.distance);
      System.out.println(totalDist);
      double timeh = totalDist / totalSpeed;
      double km =Math.abs(timeh* obj.speed);
      if(this.speed<0){
        return this.distance - km;
      } else {
        return km + this.distance;
      }
    } else if (obj.speed < 0) {
      double totalSpeed = Math.abs(this.speed) + obj.speed;
      double totalDist = Math.abs(obj.distance - this.distance);
      double timeh = totalDist / totalSpeed;
      double km =Math.abs(timeh* obj.speed);
      if(km>10){
        System.out.println("Autod ei saa kokku sellel lõigul.");
        return 0;
      }
      return km - this.distance;
      } else {
      double totalDist =  Math.abs(this.distance - obj.distance);
      double totalSpeed = Math.abs(this.speed - obj.speed);
      double timeh = totalDist / totalSpeed;
      double km = obj.distance + (timeh*obj.speed);
      return km;
    }
    //return 0;
  }
}


// 10 000 19.45 m/s
// 0,075077

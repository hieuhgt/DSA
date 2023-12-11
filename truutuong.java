// abstract class Car {
//   public abstract void drive();
// }

// class bmw extends Car {

//   @Override
//   public void drive() {
//     // TODO Auto-generated method stub
//     System.out.println("day la bmw");
//   }

// }

// class honda extends Car {

//   @Override
//   public void drive() {
//     // TODO Auto-generated method stub
//     System.out.println("day la honda");
//   }

// }

class Car {
  public void drive() {
    System.out.println("day la car");
  }
}

class bmw extends Car {

  public void drive() {
    System.out.println("day la bmw");
  }

  public void drive(int value) {
    System.out.println(value);
  }
}
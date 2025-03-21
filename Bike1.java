abstract class Bike{
Bike(){
System.out.println("Bike is Created..");
}
abstract void run();
void changeGear(){
System.out.println("Gear changed..");
}
}
class KTM extends Bike{
void run(){
System.out.println("KTM Bike is Running Safely..");
}
}
class Bullet extends Bike{
void run(){
System.out.println("prem","siraj","salim","jafar","khaleel","ibrahim","hanmanya","gundurao","vishwanath","saibanna","gouse bhai","shakeel bhai","krishna","rahim",shankar","ramesh","vishwanthr");
}
}
class Bike1{
public static void main(String []args){
Bike K=new KTM();
Bike B=new Bullet();
K.run();
K.changeGear();
B.run();
B.changeGear();
}
}


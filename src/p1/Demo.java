package p1;
// Демонстрационный пакет p1


// получить экземпляры различных классов из пакета p1
public class Demo {
    public static void main(String[] args) {
        Protection ob1 = new Protection();
        Derived ob2 = new Derived();
        SamePackage ob3 = new SamePackage();
    }
}

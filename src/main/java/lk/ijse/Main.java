package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.embed.FullName;
import lk.ijse.entity.Student;
import lk.ijse.entity.Vehicle;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        //open transaction
        Transaction transaction = session.beginTransaction();

        //Student
        Student student = new Student(1,new FullName("chamith","Dilhara"),"Galle");

        //save
        //session.save(student);

        //delete
        //session.delete(student);

        //get
        Student student1 = session.get(Student.class, 1);
        System.out.println(student1.toString());
        //commit
        transaction.commit();
        //Vehicle
        Session session1 = FactoryConfiguration.getInstance().getSession();
        Transaction transaction1 = session1.beginTransaction();
        Vehicle vehicle = new Vehicle(1,"lorry","izuzu",2007);
        //save
        session1.save(vehicle);

        //update
        //session1.update(vehicle);

        //delete
        //session1.delete(vehicle);

        //get
        Vehicle vehicle1 = session1.get(Vehicle.class, 1);
        System.out.println(vehicle1.getBrand());
        transaction1.commit();
        session1.close();
    }
}

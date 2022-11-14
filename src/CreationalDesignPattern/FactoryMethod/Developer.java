package CreationalDesignPattern.FactoryMethod;

public class Developer implements Employee {

    String id;
    String name;
    Employee reportsTo;

    public Developer(String id, String name, Employee reportsTo) {
        this.id = id;
        this.name = name;
        this.reportsTo = reportsTo;
    }

    public String getEmployeeDetails() {
        return (
                "Id: " + this.id + ", " +
                "Name: " + this.name + ", " +
                "ReportsTo: {" + this.reportsTo.getEmployeeDetails() + "}"
        );
    }

}

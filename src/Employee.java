import java.util.Date;

public class Employee extends Customer {

    private int salary;
    private int workingHours;
    private int rank;
    public static final int MANAGER = 2;
    public static final int REGULAR_WORKER = 1;
    public static final int BOARD_MEMBER = 3;


    public Employee( String userName, String password, String firstName, String lastName,int rank) {
        super(userName,password,firstName,lastName,false,0,0,null,new ShoppingCart());
        this.rank = rank;
    }

    public int getSalary() {
        return salary;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public int getRank() {
        return rank;
    }
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }


    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        String regular = "regular worker";
        String manager = "manager";
        String boardMember = "board member";
        String printedText = "";
        String fullName = this.firstName+" "+this.lastName;

        if (this.rank == REGULAR_WORKER) {
            printedText = fullName + " (" + regular + ")" + "!";
        } else if (this.rank == MANAGER) {
            printedText = fullName + " (" + manager + ")" + "!";
        } else if(this.rank==BOARD_MEMBER){
            printedText = fullName + " (" + boardMember + ")" + "!";
        }
        return printedText;
    }
}

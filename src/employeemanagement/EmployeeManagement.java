package employeemanagement;
import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        ArrayList<Officer> officerList = new ArrayList<>();
        int choose;
        do {
            Scanner input = new Scanner(System.in);
            showMenu();
            System.out.println("Enter Choose Of You: ");
            choose = Integer.parseInt(input.nextLine());
            switch (choose){
                case 1:
                    int n;
                    System.out.println("Enter Number Employee Need Add");
                    n = Integer.parseInt(input.nextLine());
                    for (int i=0;i<n;i++){
                        Employee E = new Employee();
                        E.inputEmployee();

                        employeeList.add(E);
                    }
                    break;
                case 2:
                    System.out.println("Enter ID Employee Need Delete: ");
                    String inputName = input.nextLine();
                    int count =0;
                    for(Employee employee : employeeList){
                        if(employeeList.contains(inputName)){
                            employeeList.remove(inputName);
                            count++;
                        }
                    }
                    if(count ==0){
                        System.out.println("Not Found Name Employee");
                    }

                    break;
                case 3:
                    System.out.println("Enter Name Need Found: ");
                    String NameFake = input.nextLine();
                    int dem =0;
                    for(Employee employee : employeeList){
                        if(employee.getName().equalsIgnoreCase(NameFake)){
                            employee.showInfo();
                            dem++;
                        }
                    }
                    if(dem==0){
                        System.out.println("Not Found Name ");
                    }
                    break;
                case 4:
                    int m;
                    System.out.println("Enter Number Officer Need Add");
                    m = Integer.parseInt(input.nextLine());
                    for(int i=0;i<m;i++){
                        Officer O = new Officer();
                            O.inputInfo();

                            officerList.add(O);
                    }
                    break;
                case 5:
                    for(int i=0;i<officerList.size();i++){
                        officerList.get(i).showInfo();
                    }
                    break;
                case 6:
                    for(int i=0;i<employeeList.size();i++){
                        employeeList.get(i).showInfo();
                    }
                    break;
                case 7:
                    System.out.println("GoodBye ~~~");
                    break;
                default:
                    System.err.println("Enter Again");
            }

        }while (choose != 7);

    }
    static void showMenu(){
        System.out.println("1.Th??m th??ng tin Employeee");
        System.out.println("2.X??a th??ng tin Employeee theo ID");
        System.out.println("3.T??m ki???m theo h??? t??n c???a Employee");
        System.out.println("4.Nh???p v??o th??ng tin d??nh cho Offcier");
        System.out.println("5.Hi???n th??? t???t c??? c??c Officer");
        System.out.println("6.Hi???n th??? th??ng tin t???t c??? Employee");
        System.out.println("7.Tho??t ~~~");
    }
}

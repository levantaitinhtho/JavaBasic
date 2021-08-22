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
        System.out.println("1.Thêm thông tin Employeee");
        System.out.println("2.Xóa thông tin Employeee theo ID");
        System.out.println("3.Tìm kiếm theo họ tên của Employee");
        System.out.println("4.Nhập vào thông tin dành cho Offcier");
        System.out.println("5.Hiển thị tất cả các Officer");
        System.out.println("6.Hiển thị thông tin tất cả Employee");
        System.out.println("7.Thoát ~~~");
    }
}

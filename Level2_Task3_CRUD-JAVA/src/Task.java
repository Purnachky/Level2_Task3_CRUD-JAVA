import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class Task{
    public int taskNo ;
    public String taskName;
    public String taskDetails;
Task(int taskNo, String taskName, String taskDetails){
    this.taskNo = taskNo;
    this.taskName = taskName;
    this.taskDetails = taskDetails;
}

public int getTaskNo(){
    return taskNo;
}
public String getTaskName(){
    return taskName;
}
public String getTaskDetails(){
    return taskDetails;
}
public String toString(){
    return taskNo+" "+taskName+" "+taskDetails;
}
}
class C_R_U_D{
    public static void main(String[] args) {
        List<Task> data = new ArrayList<Task>();
        Scanner scan = new Scanner(System.in);
        Scanner sScan = new Scanner(System.in);
        int choice;
        do{
System.out.println("Enter your choice: ");
System.out.println("1.Create");
            System.out.println("2.Read");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            choice = scan.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter task number: ");
                    int taskNo = scan.nextInt();
                    System.out.print("Enter task name: ");
                    String taskName = sScan.nextLine();
                    System.out.print("Enter task details: ");
                    String taskDetails = sScan.nextLine();

                    data.add(new Task(taskNo,taskName,taskDetails));
                    break;
                case 2:
                    //System.out.println(data);
                    Iterator<Task> i = data.iterator();
                    while(i.hasNext()){
                      Task t = i.next();
                      System.out.println(t);
                    }
                    System.out.println(" ");
                    break;
                case 3:
                    boolean search = false;
                    System.out.println("Enter number to Update: ");
                    taskNo = scan.nextInt();
                    System.out.println(" ");
                    ListIterator<Task> li = data.listIterator();
                    //i = data.iterator();
                    while(li.hasNext()){
                        Task t = li.next();
                        if(t.getTaskNo() == taskNo){
                            System.out.println("Enter new Name: ");
                                    taskName = sScan.nextLine();
                            System.out.println("Enter new task description: ");
                            taskDetails = sScan.nextLine();
                            li.set(new Task(taskNo,taskName,taskDetails));
                            search = true;
                        }else{
                            System.out.println("Data is updated Successfully.");
                        }
                    }

                    break;
                case 4:
                     search = false;
                    System.out.println("Enter Number to Delete: ");
                     taskNo = scan.nextInt();
                    System.out.println(" ");
                    i = data.iterator();
                    while(i.hasNext()){
                        Task t = i.next();
                        if(t.getTaskNo() == taskNo){
                            i.remove();
                            search = true;
                        }else{
                            System.out.println("Data is deleted Successfully.");
                        }
                    }
                    break;
            }
        }while(choice!=0);
    }
}
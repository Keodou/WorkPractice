package workpractice;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee();
        Management management=new Management();
        Documentation documentation=new Documentation();
        Workers worker=new Workers();
        Goods goods=new Goods();
        
        System.out.println("Коммерческая организация");
        management.managementOut();
        
        System.out.println();
        
        System.out.println("Сотрудник по доп. работам");
        employee.employeeOut();
        
        System.out.println();
        
        System.out.println("Разовый рабочий");
        worker.workerOut();
        
        System.out.println();
        
        System.out.println("Документация");
        documentation.documentationOut();
        
        System.out.println();
        
        System.out.println("Работа");
        goods.goodsOut();
    }
}
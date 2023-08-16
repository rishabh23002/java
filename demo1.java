class employee {
    private int data;
    private int data_2;
    public employee()
    {
        data =10;
        data_2 =12;

    }
    public employee(int n,int n2)
    {
        this.data = n;
        this.data_2 = n2;
    }
    public employee(employee e4)
    {
        this.data = e4.data;
        this.data_2 = e4.data_2;
    }
    public int get_employee_data()
    {
        
    }

}

public class demo1 {
    public static void main(String[] args) {
        employee e= new employee();
        employee e2 = new employee(10,12);
        employee e3 = new employee(e2);
        System.out.println(e3.);
    }
    
}

public abstract class Account {
    protected int id;
    protected String name;
    protected DataSource myData;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void performOperation(DataSource _myData) {
        this.myData = _myData;
        myData.execute();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

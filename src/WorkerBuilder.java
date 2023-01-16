public class WorkerBuilder {
    private static WorkerBuilder instance;
    Worker obj;

    private WorkerBuilder() {

    }

    public static WorkerBuilder getInstance() {
        if (instance == null)
            instance = new WorkerBuilder();
        instance.obj = new Worker();

        return instance;
    }

    public WorkerBuilder setName(String name) {
        obj.name = name;
        return this;
    }



    public WorkerBuilder salary(int salary) {
        obj.salary = salary;
        return this;
    }
    public WorkerBuilder passportId(long passportId){
        obj.passportId = passportId;
        return this;
    }
    public WorkerBuilder phoneNumber(int phoneNumber) {
        obj.phoneNumber = phoneNumber;
        return this;
    }
    public WorkerBuilder pabinet(byte cabinet) {
        obj.cabinet = cabinet;
        return this;
    }
    public WorkerBuilder vacation(boolean vacation) {
        obj.isInVacation = vacation;
        return this;
    }


    public Worker build(){
        return obj;
    }

    @Override
    public String toString() {
        return "WorkerBuilder{" +
                "obj=" + obj +
                '}';
    }
}

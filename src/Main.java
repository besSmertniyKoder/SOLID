public class Main {
    public static void main(String[] args) {
        Worker worker = WorkerBuilder.getInstance().salary(334).setName("vasiliy").vacation(true).build();
        System.out.println(worker);


    }
}

class Worker {
    String name;
    String lastName;
    float salary;
    long passportId;
    int phoneNumber;
    byte cabinet;

    Passport passport;
    boolean isInVacation;
    float dateOfBirth;

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", passportId=" + passportId +
                ", phoneNumber=" + phoneNumber +
                ", cabinet=" + cabinet +
                ", isInVacation=" + isInVacation +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public long getPassportId() {
        return passportId;
    }

    public void setPassportId(long passportId) {
        this.passportId = passportId;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public byte getCabinet() {
        return cabinet;
    }

    public void setCabinet(byte cabinet) {
        this.cabinet = cabinet;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public boolean isInVacation() {
        return isInVacation;
    }

    public void setInVacation(boolean inVacation) {
        isInVacation = inVacation;
    }

    public float getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(float dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}




// 1. Множество конструкторов
// 2. Невозможность перегрузки
// Придумать как сделать гибкое создание Worker (т.е любые комбинации при создании полей)
// Билдер для пасспорта
// Создать работягу с пасспортом


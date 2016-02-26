package design_patterns._02_behavioral._01_chain_of_responsibility._02_example;

public class Employee {
    private int id;
    private String login;
    private String password;

    public Employee(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public int hashCode() {
        int result = id + ((login == null) ? 0 : login.hashCode());
        result = 31 * result + ((password != null) ? 0 : password.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee employee = (Employee) obj;

        if (id != employee.id) return false;
        if (login != null ? !login.equals(employee.login) : employee.login != null) return false;
        return !(password != null ? !password.equals(employee.password) : employee.password != null);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

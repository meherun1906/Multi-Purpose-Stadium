package Argo.CFO;

public class Login {
    private String id, passward;

    public Login(String id, String passward) {
        this.id = id;
        this.passward = passward;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    @Override
    public String toString() {
        return "Login{" +
                "id='" + id + '\'' +
                ", passward='" + passward + '\'' +
                '}';
    }
}

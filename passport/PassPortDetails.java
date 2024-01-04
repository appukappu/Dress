package passport;



public class PassPortDetails {
    private int id;
    private int expiredate;
    public PassPortDetails(int id ,int expiredate){
        this.id=id;
        this.expiredate=expiredate;
    }


    @Override
    public String toString() {
        return "PassPortDetails{" +
                "id=" + id +
                ", expiredate=" + expiredate +
                '}';
    }
}




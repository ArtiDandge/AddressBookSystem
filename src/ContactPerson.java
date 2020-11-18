public class ContactPerson {
    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phone_number;
    private String email;

    ContactPerson(String first_name, String last_name, String address, String city, String state, int zip, long phone_number, String email){
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone_number = phone_number;
        this.email = email;
    }

    ContactPerson(){
        this("","","","","",0,0,"");
    }

    public String toString(){

        return "Person Details: \tFirst name:"+this.first_name+ " \tLast name:"+ this.last_name+" \t Address:"+ this.address+" \tCity:"+this.city+" \tState:"
                +this.state+" \tZip:"+this.zip+" \tPhone Number:"+this.phone_number+" \tEmail:"+this.email;
    }
}
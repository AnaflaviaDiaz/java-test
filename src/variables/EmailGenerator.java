package variables;

public class EmailGenerator {
    static void main() {
        var username = "Anaflavia Diaz Martel";
        var parsedUsername = username.replaceAll(" ", ".").toLowerCase();
        System.out.println("Parsed username: " + parsedUsername);

        var enterpriseName = "Global Mentoring";
        var domainExtension = ".com.es";
        var domainEmail = "@"+ enterpriseName.toLowerCase().replaceAll(" ", "") + domainExtension ;
        System.out.println("Domain email: " + domainEmail);

        var finalEmail = parsedUsername+domainEmail;
        System.out.println("Your email is: " + finalEmail);
    }
}

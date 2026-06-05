public class Website {

    public static void main(String[] args) {

        String currentPage = "Home";

        if(currentPage.equals("Home")) {
            currentPage = "About";
        }

        if(currentPage.equals("About")) {
            currentPage = "Contact";
        }

        if(currentPage.equals("Contact")) {
            System.out.println("Contact page is reachable");
        } else {
            System.out.println("Contact page is not reachable");
        }
    }
}
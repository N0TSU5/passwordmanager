package passwordmanagement;

public class Main {
    public static void main(String args[]) {

        Manager manager = new Manager();
        ListRetriever retriever = new ListRetriever(manager);
        ListModifier modifier = new ListModifier(manager);

        modifier.addPassword("netflix", "based!@$%&");
        modifier.addPassword("google", "wrau43whri!@$%&haiuwfh");
        modifier.addPassword("android", "3546!@$%&");
        modifier.addPassword("slack", "su!@$%&rru23");

        System.out.print(retriever.listServices());
        System.out.println(retriever.getForService("netflix"));

        modifier.updatePassword("slack", "vd!@$%66&");
        System.out.print(retriever.sortServices(false));
    }
}

// !@$%&
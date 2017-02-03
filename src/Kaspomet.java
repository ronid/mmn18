import static java.lang.System.out;


public class Kaspomet {
    private RedBlackBST accountsTree = null;


    public void processLine(String line) {
        String[] paramerts = line.split(" ");
        String indicator = paramerts[0];

        if (indicator == "+") {
            String clientFirstName = paramerts[1];
            String clientLastName = paramerts[2];
            Integer clientID = Integer.parseInt(paramerts[3]);
            String accountID = paramerts[4];
            Integer balance = Integer.parseInt(paramerts[5]);
            newClient(clientFirstName, clientLastName, clientID, accountID, balance);
        }

    }

    public void updateBalance(String clientFirstName, String clientLastName, String accountID, Integer balance) {

    }

    public void newClient(String clientFirstName, String clientLastName, Integer clientID, String accountID, Integer balance) {
        if (accountsTree == null) {
            accountsTree = new RedBlackBST(clientFirstName, clientLastName, clientID, accountID, balance);
        } else {
            accountsTree.insert(clientFirstName, clientLastName, clientID, accountID, balance);
        }
    }

    public void removeClient(String accountID) {
        if (accountsTree == null) {
            throw new Exception();
        } else {
            accountsTree.
        }

    }

    public static void main(String[] args) {

    }
}

/* Class Node */
class AccountNode {
    AccountNode left, right;
    String clientFirstName;
    String clientLastName;
    Integer element;
    String accountID;
    Integer balance;
    Integer color;
    Integer max;

    /* Constructor */
    public AccountNode(String clientFirstName, String clientLastName, Integer clientID, String accountID, Integer balance) {
        this(clientFirstName,clientLastName, clientID, accountID, balance, null, null);
    }

    /* Constructor */
    public AccountNode(String firstName, String lastName, Integer cID, String ID, Integer accountBalance, AccountNode lt, AccountNode rt) {
        left = lt;
        right = rt;
        clientFirstName = firstName;
        clientLastName = lastName;
        element = cID;
        accountID = ID;
        balance = accountBalance;
        color = 1;
        max = balance;
        if((left.max != null) && (left.max > max)){
            max = left.max;
        }
        if ((right.max != null) && (right.max > max)){
            max = right.max;
        }
    }
}

public class CustomerModel {
    public int mCustomerID, mPhone;
    public String mName, mAddress;

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(mCustomerID).append(",");
        sb.append("\"").append(mName).append("\"").append(",");
        sb.append("\"").append(mAddress).append("\"").append(",");
        sb.append(mPhone).append(")");
        return sb.toString();
    }
}

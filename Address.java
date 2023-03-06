public class Address {
    private String firstLine;
    private String secLine;
    private String thirdLine;

    public Address(String firstLine, String secLine, String thirdLine) {
        this.firstLine = firstLine;
        this.secLine = secLine;
        this.thirdLine = thirdLine;
    }

    public Address(){
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getSecLine() {
        return secLine;
    }

    public void setSecLine(String secLine) {
        this.secLine = secLine;
    }

    public String getThirdLine() {
        return thirdLine;
    }

    public void setThirdLine(String thirdLine) {
        this.thirdLine = thirdLine;
    }
}


package stokdeneme;


public class stok {
    private String userName;
    private int iban;
    private String marka;
    private String model;
    private int fiyat;
    private int miktar;
    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }
    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }
    public stok(String userName, String marka, String model, int iban, int fiyat, int miktar) {
        this.userName = userName;
        this.marka = marka;
        this.model = model;
        this.iban = iban;
        this.fiyat = fiyat;
        this.miktar = miktar;
    }
}

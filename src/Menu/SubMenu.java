package Menu;

public class SubMenu extends MenuPenjualan{
    String IdP;
    String NamaP;
    String Alamat;

    public void namapanjang(){
        System.out.println("============================");
        System.out.println("Akhmad Haibi");
    }
    public void AlamatP(){
        System.out.println("Jln.Mangunang");
    }
    //gatter & setter
    public String getIdP() {
        return IdP;
    }

    public void setIdP(String idP) {
        IdP = idP;
    }

    public String getNamaP() {
        return NamaP;
    }

    public void setNamaP(String namaP) {
        NamaP = namaP;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    @Override
    public void tampil_pegawai() {
        super.tampil_pegawai();
    }

    @Override
    public void tampil_jual() {
        super.tampil_jual();
    }
}


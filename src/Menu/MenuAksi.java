package Menu;

public class MenuAksi {
    public  static  void main(String[]args) {
        MenuPenjualan menu1 = new MenuPenjualan("980","sikat","10000","1","10000");
        MenuPenjualan menu2 = new MenuPenjualan("Mangunang","009","Akhmad Habibi");
        MenuPenjualan menu3 = new MenuPenjualan("981","sikat kawat","12.000","2","24.000");
        MenuPenjualan menu4 = new MenuPenjualan("Mangunang","009","Akhmad Habibi");
        MenuPenjualan menu5 = new MenuPenjualan("982","sikat gigi","7.000","2","14.000");
        MenuPenjualan menu6 = new MenuPenjualan("Mangunang","009","Akhmad Habibi");
        SubMenu Sub = new SubMenu();

        //penampilan data
        menu1.tampil_jual();
        menu2.tampil_pegawai();
        menu3.tampil_jual();
        menu4.tampil_pegawai();
        menu5.tampil_jual();
        menu6.tampil_pegawai();
        Sub.namapanjang();
        Sub.AlamatP();
    }
}

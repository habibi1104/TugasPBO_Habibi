package Menu;

public class MenuPenjualan {
        //membuat atribut
        private String id;
        private String namabarang;
        private String Alamat;
        private String hargajual;
        private String idpenjual;
        private String nama;
        private String jumlahbeli;
        private String totalharga;

        //Method
        public void PenjualanBarang() {
            System.out.println("Barang di jual oleh pegawai");
        }
        public void pegawaiMenjualBarang() {
        }
        public void tampil_pegawai(){
            System.out.println("Id Pegawai : "+idpenjual);
            System.out.println("Nama Pegawai :"+nama);
            System.out.println("Alamat Pegawai :"+Alamat);
            System.out.println("============================");
        }
        public void tampil_jual(){
            System.out.println("id Barang : "+id);
            System.out.println("Nama Barang : "+namabarang);
            System.out.println("Harga Jual : "+hargajual);
            System.out.println("Jumlah Beli : "+jumlahbeli);
            System.out.println("Total Harga :"+totalharga);
            System.out.println("============================");
        }
//constuktur

        public MenuPenjualan() {
        }

        public MenuPenjualan(String id, String namabarang, String hargajual, String jumlahbeli, String totalharga) {
            this.id = id;
            this.namabarang = namabarang;
            this.hargajual = hargajual;
            this.jumlahbeli = jumlahbeli;
            this.totalharga = totalharga;
        }

        public MenuPenjualan(String Alamat, String idpenjual, String nama) {
            this.Alamat = Alamat;
            this.idpenjual = idpenjual;
            this.nama = nama;
        }
        //gatter & setter
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNamabarang() {
            return namabarang;
        }

        public void setNamabarang(String namabarang) {
            this.namabarang = namabarang;
        }

        public String getHargabeli() {
            return Alamat;
        }

        public void setHargabeli(String hargabeli) {
            this.Alamat = hargabeli;
        }

        public String getHargajual() {
            return hargajual;
        }

        public void setHargajual(String hargajual) {
            this.hargajual = hargajual;
        }

        public String getIdpenjual() {
            return idpenjual;
        }

        public void setIdpenjual(String idpenjual) {
            this.idpenjual = idpenjual;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getJumlahbeli() {
            return jumlahbeli;
        }

        public void setJumlahbeli(String jumlahbeli) {
            this.jumlahbeli = jumlahbeli;
        }

        public String getTotalharga() {
            return totalharga;
        }

        public void setTotalharga(String totalharga) {
            this.totalharga = totalharga;
        }
    }
    

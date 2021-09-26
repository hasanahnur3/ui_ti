package apap.tutorial.pergipergi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BaseController {

    @GetMapping("/")
    private String home(){
        return "home";
    }

    @GetMapping("/listbarang")
    public String listBarang(Model model) {
        List<String> listNamaBarang = new ArrayList<>();
        listNamaBarang.add("Galaxy Z");
        listNamaBarang.add("Galaxy A");
        listNamaBarang.add("Galaxy M");
        listNamaBarang.add("iPhone X");
        listNamaBarang.add("iPhone 11");
        listNamaBarang.add("iPhone 13");
        listNamaBarang.add("VivoBook");
        listNamaBarang.add("ChromeBook");
        listNamaBarang.add("ZenBook");
        listNamaBarang.add("Yoga");
        listNamaBarang.add("Idepad");
        List<String> listMerkBarang = new ArrayList<>();
        listMerkBarang.add("Samsung");
        listMerkBarang.add("Samsung");
        listMerkBarang.add("Samsung");
        listMerkBarang.add("Apple");
        listMerkBarang.add("Apple");
        listMerkBarang.add("Apple");
        listMerkBarang.add("Asus");
        listMerkBarang.add("Asus");
        listMerkBarang.add("Asus");
        listMerkBarang.add("Lenovo");
        listMerkBarang.add("Lenovo");
        List<String> listTipeBarang = new ArrayList<>();
        listTipeBarang.add("Handphone");
        listTipeBarang.add("Handphone");
        listTipeBarang.add("Handphone");
        listTipeBarang.add("Handphone");
        listTipeBarang.add("Handphone");
        listTipeBarang.add("Handphone");
        listTipeBarang.add("Laptop");
        listTipeBarang.add("Laptop");
        listTipeBarang.add("Laptop");
        listTipeBarang.add("Laptop");
        listTipeBarang.add("Laptop");
        List<Integer> listStok = new ArrayList<>();
        listStok.add(20);
        listStok.add(10);
        listStok.add(30);
        listStok.add(12);
        listStok.add(15);
        listStok.add(4);
        listStok.add(6);
        listStok.add(3);
        listStok.add(6);
        listStok.add(9);
        listStok.add(39);
        model.addAttribute("listNamaBarang", listNamaBarang);
        model.addAttribute("listMerkBarang", listMerkBarang);
        model.addAttribute("listTipeBarang", listTipeBarang);
        model.addAttribute("listStok", listStok);
        List<Integer> listAngka = new ArrayList<>();
        for(int i=0; i<listNamaBarang.size(); i++){
            listAngka.add(i);
        }
        model.addAttribute("listAngka", listAngka);
        return "list-barang";
    }

    @GetMapping("/listpembelian")
    public String listPembelian(Model model) {
        List<String> listNoInvoice = Arrays.asList("One", "Two", "Three");
        List<String> listTotalHarga = Arrays.asList("900.000", "300.000", "150.000", "1.000.000", "1.300.000",
                "900.000", "300.000", "150.000", "1.000.000", "1.300.000");
        List<String> listNamaPembeli = Arrays.asList("Papa Apap", "Papa Apap", "Papa Apap", "Tante Apap", "Om Apap",
                "Papa Apap", "Mama Apap", "Kakak Apap", "Tante Apap", "Om Apap");
        List<String> listTanggal = Arrays.asList("2021-03-24 16:48:05", "2021-03-24 16:48:05.591",
                "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591",
                "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591",
                "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591");
        List<String> listJumlah = Arrays.asList("5", "4", "2", "5", "4", "2", "4", "2");
        List<Integer> listAngka = new ArrayList<>();
        model.addAttribute("listNoInvoice", listNoInvoice);
        model.addAttribute("listTotalHarga", listTotalHarga);
        model.addAttribute("listNamaPembeli", listNamaPembeli);
        model.addAttribute("listTanggal", listTanggal);
        model.addAttribute("listJumlah", listJumlah);
        for(int i=0; i<listNoInvoice.size(); i++){
            listAngka.add(i);
        }
        model.addAttribute("listAngka", listAngka);
        return "list-pembelian";
    }

    @GetMapping("/listmember")
    public String listMember(Model model) {
        List<String> listNama = Arrays.asList("Papa Apap", "Mama Apap", "Kakak Apap", "Tante Apap", "Om Apap",
                "Sepupu Apap", "Adik Apap", "Ayah Apap", "Ibu Apap", "Kakek Apap");
        List<String> listJk = Arrays.asList("Laki-Laki", "Perempuan", "Laki-Laki", "Perempuan", "Laki-Laki",
                "Laki-Laki", "Perempuan", "Laki-Laki", "Perempuan", "Laki-Laki");
        List<String> listTanggalPendaftaran = Arrays.asList("2021-03-24 16:48:05", "2021-03-24 16:48:05.591",
                "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591",
                "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591",
                "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591");
        List<String> listTanggal = Arrays.asList("2021-03-24 16:48:05", "2021-03-24 16:48:05.591",
                "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591",
                "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591",
                "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591");
        return "list-member";
    }

    @GetMapping("/tambahbarang")
    public String tambahBarang(Model model) {
        return "tambah-barang";
    }

    @GetMapping("/message")
    public String message(Model model){
        return "message";
    }

    @GetMapping("/detailbarang")
    public String detailBarang(Model model){
        List<String> data = new ArrayList<>();
        data.add("Yoga");
        data.add("Lenovo");
        data.add("Laptop");
        data.add("99");
        data.add("Achieved with precision-stamped, all-aluminum construction, Yogas offer both design and substance.");
        data.add("2021-03-24");
        model.addAttribute("data", data);
        return "detail-barang";
    }

    @GetMapping("/ubahbarang")
    public String ubahBarang(){
        return "ubah-barang";
    }

    @GetMapping("/detailpembelian")
    public String detailPembelian(Model model){
        List<String> data = new ArrayList<>();
        data.add("One");
        data.add("900.000");
        data.add("Papa APAP");
        data.add("2021-03-24 16:48:05");

        List<String> barang = new ArrayList<>();
        barang.add("Yoga");
        barang.add("Lenovo");
        barang.add("450.000");

        List<String> barang2 = new ArrayList<>();
        barang2.add("Zenbook");
        barang2.add("Asus");
        barang2.add("450.000");

        model.addAttribute("data", data);
        model.addAttribute("barang", barang);
        model.addAttribute("barang2", barang2);

        return "detail-pembelian";
    }

    @GetMapping("/tambahpembelian")
    public String tambahPembelian(){
        return "tambah-pembelian";
    }

    @GetMapping("/tambahmember")
    public String tambahMember(){
        return "tambah-member";
    }

    @GetMapping("/search-member-pembayaran")
    public String searchMemberPembayaran(Model model){
        List<String> listNoInvoice = Arrays.asList("One", "Two", "Three");
        List<String> listTotalHarga = Arrays.asList("900.000", "300.000", "150.000", "1.000.000", "1.300.000",
                "900.000", "300.000", "150.000", "1.000.000", "1.300.000");
        List<String> listNamaPembeli = Arrays.asList("Papa Apap", "Papa Apap", "Papa Apap", "Tante Apap", "Om Apap",
                "Papa Apap", "Mama Apap", "Kakak Apap", "Tante Apap", "Om Apap");
        List<String> listTanggal = Arrays.asList("2021-03-24 16:48:05", "2021-03-24 16:48:05.591",
                "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591",
                "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591",
                "2021-03-24 16:48:05.591", "2021-03-24 16:48:05.591");
        List<String> listJumlah = Arrays.asList("5", "4", "2", "5", "4", "2", "4", "2");
        List<Integer> listAngka = new ArrayList<>();
        model.addAttribute("listNoInvoice", listNoInvoice);
        model.addAttribute("listTotalHarga", listTotalHarga);
        model.addAttribute("listNamaPembeli", listNamaPembeli);
        model.addAttribute("listTanggal", listTanggal);
        model.addAttribute("listJumlah", listJumlah);
        for(int i=0; i<listNoInvoice.size(); i++){
            listAngka.add(i);
        }
        model.addAttribute("listAngka", listAngka);


        return "search-member-tipe";
    }

    @GetMapping("/search-stok-tipe")
    public String searchStokTipe(Model model){
        List<String> listNamaBarang = new ArrayList<>();
        listNamaBarang.add("Galaxy Z");
        listNamaBarang.add("Galaxy A");
        listNamaBarang.add("Galaxy M");

        List<String> listMerkBarang = new ArrayList<>();
        listMerkBarang.add("Samsung");
        listMerkBarang.add("Samsung");
        listMerkBarang.add("Samsung");

        List<String> listTipeBarang = new ArrayList<>();
        listTipeBarang.add("Handphone");
        listTipeBarang.add("Handphone");
        listTipeBarang.add("Handphone");

        List<Integer> listStok = new ArrayList<>();
        listStok.add(20);
        listStok.add(10);
        listStok.add(30);

        model.addAttribute("listNamaBarang", listNamaBarang);
        model.addAttribute("listMerkBarang", listMerkBarang);
        model.addAttribute("listTipeBarang", listTipeBarang);
        model.addAttribute("listStok", listStok);
        List<Integer> listAngka = new ArrayList<>();
        for(int i=0; i<listNamaBarang.size(); i++){
            listAngka.add(i);
        }
        model.addAttribute("listAngka", listAngka);
        return "search-stok-tipe";
    }

}

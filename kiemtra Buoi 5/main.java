import java.util.Scanner;

public class Main {
    private static QuanLyPhongHoc quanLyPhongHoc;
    private static Scanner scanner;

    public static void main(String[] args) {
        quanLyPhongHoc = new QuanLyPhongHoc();
        scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println(" in danh sách ");
            System.out.println("1. Them phong hoc vao danh sach");
            System.out.println("2. Tim kiem phong theo ma phong");
            System.out.println("3. In toan bo danh sach phong hoc");
            System.out.println("4. In danh sach phong hoc dat chuan");
            System.out.println("5. Sap xep danh sach phong hoc tang dan theo cot day nha");
            System.out.println("6. Sap xep danh sach phong hoc giam dan theo cot dien tich");
            System.out.println("7. Sap xep danh sach phong hoc tang dan theo cot bong den");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            System.out.println("----------------------------------------------------------------------------------------");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    themPhongHoc();
                    break;
                case 2:
                    timPhongHocTheoMaPhong();
                    break;
                case 3:
                    inDanhSachPhongHoc();
                    break;
                case 4:
                    inDanhSachPhongHocDatChuan();
                    break;
                case 5:
                    sapXepTheoDayNha();
                    break;
                case 6:
                    sapXepTheoDienTichGiamDan();
                    break;
                case 7:
                    sapXepTheoSoBongDenTangDan();
                    break;
                case 0:
                    System.out.println("Ket thuc");
                    break;
                default:
                    System.out.println("Lua chon sai vui long lua cho lai.");
                    break;
            }
        } while (choice != 0);
    }

    private static void themPhongHoc() {
        scanner.nextLine();
        System.out.print("nhap ma phong: ");
        String maPhong = scanner.nextLine();

        System.out.print("Nhap day nha: ");
        String dayNha = scanner.nextLine();

        System.out.print("Nhap dien tich: ");
        double dienTich = scanner.nextDouble();

        System.out.print("Nhap so bong den: ");
        int soBongDen = scanner.nextInt();

        System.out.println(" Loại phòng học ");
        System.out.println("1. Phong ly thuyet");
        System.out.println("2. Phong may tinh");
        System.out.println("3. Phong thi nghiem");
        System.out.print("lua chon cua ban: ");
        int typeChoice = scanner.nextInt();

        switch (typeChoice) {
            case 1:
                System.out.print("Co may chieu (true/false): ");
                boolean mayChieu = scanner.nextBoolean();
                PhongLyThuyet phongLyThuyet = new PhongLyThuyet(maPhong, dayNha, dienTich, soBongDen, coMayChieu);
                quanLyPhongHoc.themPhongHoc(phongLyThuyet);
                break;
            case 2:
                System.out.print("nhap so may tinh: ");
                int soMayTinh = scanner.nextInt();
                PhongMayTinh phongMayTinh = new PhongMayTinh(maPhong, dayNha, dienTich, soBongDen, soMayTinh);
                quanLyPhongHoc.themPhongHoc(phongMayTinh);
                break;
            case 3:
                scanner.nextLine();
                System.out.print("Nhap chuyen nganh: ");
                String chuyenNganh = scanner.nextLine();

                System.out.print("Nhap sua chua: ");
                int sucChua = scanner.nextInt();

                System.out.print("Co bon rua (true/false): ");
                boolean bonRua = scanner.nextBoolean();
                PhongThiNghiem phongThiNghiem = new PhongThiNghiem(maPhong, dayNha, dienTich, soBongDen,
                        bonRua);
                quanLyPhongHoc.themPhongHoc(phongThiNghiem);
                break;
            default:
                System.out.println("Lua chon khong hop le.");
                break;
        }
    }

    private static void timPhongHocTheoMaPhong() {
        scanner.nextLine(); 
        System.out.print("Nhap ma phong can tim: ");
        String maPhong = scanner.nextLine();
        PhongHoc phongHoc = quanLyPhongHoc.timPhongHoc(maPhong);
        if (phongHoc != null) {
            System.out.println("Phong hoc can tim la:");
            System.out.println(phongHoc);
        } else {
            System.out.println("Khong tim thay phong hoc tuong ung voi ma phong " + maPhong);
        }
    }

    private static void inDanhSachPhongHoc() {
        System.out.println("Danh sach phong hoc la:");
        quanLyPhongHoc.inDanhSachPhongHoc();
    }

    private static void inDanhSachPhongHocDatChuan() {
        System.out.println("Danh sach phong hoc khong dat chuan:");
        quanLyPhongHoc.inDanhSachPhongHocDatChuan();
    }

    private static void sapXepTheoDayNha() {
        quanLyPhongHoc.sapXepTheoDayNha();
        System.out.println("Danh sach sau khi sap xep tang dan theo cot day nha:");
        quanLyPhongHoc.inDanhSachPhongHoc();
    }

    private static void sapXepTheoDienTichGiamDan() {
        quanLyPhongHoc.sapXepTheoDienTichGiamDan();
        System.out.println("Danh sach giam dan theo dien tich:");
        quanLyPhongHoc.inDanhSachPhongHoc();
    }

    private static void sapXepTheoSoBongDenTangDan() {
        quanLyPhongHoc.sapXepTheoSoBongDenTangDan();
        System.out.println("danh sach phong hoc sap xep theo thu tu tang dan so bong den:");
        quanLyPhongHoc.inDanhSachPhongHoc();
    }
}
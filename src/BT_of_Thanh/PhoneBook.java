package BT_of_Thanh;

import java.util.*;

public class PhoneBook {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<PhoneNumber> phoneNumberList = new ArrayList<>();
        while (true) {
            System.out.println("---------------MENU---------------");
            System.out.println("1: Thêm 1 số điện thoại");
            System.out.println("2: Tìm 1 số điện thoại theo mã vùng");
            System.out.println("3: Liệt kê các số điện thoại");
            System.out.println("4:Tính tổng số điện thoại theo vùng");
            System.out.println("5 Tìm kiếm theo có đuôi là");
            System.out.println("6: Sắp xếp số điện thoại");
            System.out.println("7: Kết thúc");
            System.out.println("Mời nhập lựa chọn:");
            int chon = Integer.parseInt(s.nextLine());
            while (chon > 7 || chon < 1) {
                System.out.println("Lựa chọn không đúng, xin mời nhập lại");
                chon = Integer.parseInt(s.nextLine());
            }
            switch (chon) {
                case 7 -> {
                    System.out.println("Kết Thúc!!!");
                    return;
                }
                case 1 -> {
                    System.out.print("Mời nhập số điện thoại:");
                    String[] sdt = s.nextLine().split("-");
                    if (sdt.length == 2) {
                        PhoneNumber p = new PhoneNumber(sdt[0], sdt[1]);
                        phoneNumberList.add(p);
                    } else {
                        IntPhoneNumber p = new IntPhoneNumber(sdt[0], sdt[1], sdt[2]);
                        phoneNumberList.add(p);
                    }
                    System.out.println("Đã thêm số điện thoại!");
                }
                case 2 -> {
                    System.out.print("Mời nhập mã vùng:");
                    String id = s.nextLine();
                    String query = id.substring(1);
                    for (PhoneNumber phoneNumber : phoneNumberList) {
                        if (phoneNumber instanceof IntPhoneNumber) {
                            if (phoneNumber.getId().equalsIgnoreCase(query)) {
                                System.out.println(phoneNumber);
                            }
                        } else {
                            if (phoneNumber.getId().substring(1).equalsIgnoreCase(query)) {
                                System.out.println(phoneNumber);
                            }
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Chọn kiểu liệt kê: ");
                    String query1 = s.nextLine();
                    if (query1.equalsIgnoreCase("trong nuoc")) {
                        for (PhoneNumber phoneNumber : phoneNumberList) {
                            if (phoneNumber instanceof PhoneNumber) {
                                System.out.println(phoneNumber);
                            }
                        }
                    }
                    if (query1.equalsIgnoreCase("ngoai nuoc")) {
                        for (PhoneNumber phoneNumber : phoneNumberList) {
                            if (phoneNumber instanceof IntPhoneNumber) {
                                System.out.println(phoneNumber);
                            }
                        }
                    }
                    if (query1.equalsIgnoreCase("ca hai")) {
                        for (PhoneNumber phoneNumber : phoneNumberList) {
                            System.out.println(phoneNumber);
                        }
                    }
                }
                case 4 -> {
                    System.out.print("Mời nhập mã vùng cần thống kê: ");
                    String idarea = s.nextLine();
                    List<PhoneNumber> l = new ArrayList<>();
                    for (PhoneNumber phoneNumber : phoneNumberList) {
                        if (phoneNumber instanceof IntPhoneNumber) {
                            if (phoneNumber.getId().equalsIgnoreCase(idarea.substring(1))) {
                                l.add(phoneNumber);
                            }
                        } else {
                            if (phoneNumber.getId().equalsIgnoreCase(idarea)) {
                                l.add(phoneNumber);
                            }
                        }
                    }
                    System.out.println(l.size());
                }
                case 6 -> {
                    phoneNumberList.sort(Comparator.naturalOrder());
                    System.out.println("Đã sắp xếp danh sách!");
                }
            }
        }


    }
}

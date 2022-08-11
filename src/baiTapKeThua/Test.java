package baiTapKeThua;

public class Test {
    public static void main(String[] args) {
        Book b1 = new ProgrammingBook("B1", "Java Overview", 100, "TG1", "Java", "None");
        Book b2 = new ProgrammingBook("B2", "Java Spring", 150, "TG2", "Java", "Spring");
        Book b3 = new FictionBook("B3", "Yeu em rat nhieu", 50, "TG3", "Sen");
        Book b4 = new FictionBook("B4", "Suot doi ben em", 154, "TG4", "Sen");
        Book b5 = new FictionBook("B5", "cuộc chiến giữa các vì sao", 500, "TG5", "Viễn tưởng");
        Book b6 = new FictionBook("B6", "Nơi tình yêu bắt đầu", 190, "TG6", "Tình cảm lãn mạn");
        Book b7 = new FictionBook("B7", "Thế giới ngầm", 250, "TG7", "Viễn tưởng");
        Book b8 = new ProgrammingBook("B8", "Bí mật rừng xanh", 189, "TG8", "Tiếng Việt", "None");
        Book b9 = new ProgrammingBook("B9", "Tôi là ai", 90, "TG9", "English", "Spring");
        Book b10 = new ProgrammingBook("B10", "Bí mật Codegym", 10, "TG10", "Java", "None");

        Book listBook[] = {b1, b2, b3, b4,b5,b6,b7,b8,b9,b10};

        // tinh tong tien cua tat cac cuon sach
        int sum = 0;
        for (Book b : listBook
        ) {
            sum += b.getPrice();
        }
        System.out.println(sum);



        int count = 0;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] instanceof ProgrammingBook) {
                ProgrammingBook p = (ProgrammingBook) listBook[i];
                String language = p.getLanguage();
                if (language == "Java") {
                    count++;
                }
            }
        }
        System.out.println(count);


        int count2 =0;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] instanceof FictionBook) {
               FictionBook p = (FictionBook) listBook[i];
                String category = p.getCategory();
                if ( category == "Viễn tưởng") {
                    count2++;
                }
            }
        }
        System.out.println(" sách viễn tưởng: "+count2);

        int count3 = 0;
        for (Book b : listBook
        ) {
            if (b.getPrice()<100) {
                count3++;
            }
        }
        System.out.println(" giá sách dưới 100$: "+count3);
    }
}

package 作业.酒店管理系统;

import java.util.Scanner;

/**
 * Created by 15173 on 2020/3/7.
 */
public class Test {

    public static void main(String[] args) {

        Hotel h1 = new Hotel();

        System.out.println("欢迎使用酒店管理系统,请认真阅读以下使用说明");
        while (true){
            System.out.println("请输入对应的功能编号:[1]表示查看房间列表.[2]表示订房.[3]表示退房.[0]退出系统");
            Scanner in = new Scanner(System.in);
            int i = in.nextInt();
            if (i == 1) {
                h1.printRooms();
            } else if (i == 2) {
                System.out.println("请输入房间编号:");
                int roomNo = in.nextInt();
                h1.order(roomNo);
                System.out.println("订房成功");
            } else if (i == 3) {
                System.out.println("请输入房间编号:");
                int roomNo = in.nextInt();
                h1.exit(roomNo);
                System.out.println("退房成功");
            } else if (i == 0) {
                return;
            } else {
                System.out.println("请输入正确的数字编号");
            }}

    }
}


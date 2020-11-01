package 作业.酒店管理系统;

/**
 * Created by 15173 on 2020/3/7.
 * 酒店对象，有二维数组，模拟大厦
 */
public class Hotel {
    private Room[][] rooms;

    //盖楼通过构造方法
    public Hotel(){
        //一共有几层,每层的房间编号是什么,每个房间的类型是什么
        //可以先写死,一共三层,一层单人间,二层双人间,三层豪华间
        rooms = new Room[3][10];

        for(int i = 0;i<rooms.length;i++)
            for(int j = 0;j<rooms[i].length;j++) {
                if (i == 0) {
                    rooms[i][j] = new Room(true, (i + 1) * 100 + (j+1), "单人间");
                } else if (i == 1) {
                    rooms[i][j] = new Room(true, (i + 1) * 100 + (j+1), "双人间");
                } else if (i == 2) {
                    rooms[i][j] = new Room(true, (i + 1) *   100 + (j+1), "豪华间");
                }
            }
    }

    //在酒店提供打印房间列表的方法
    public void printRooms(){
        for(int i = 0; i<rooms.length;i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j] + "   ");
            }
            System.out.println();
        }
    }

    /**
     * 订房方法
     * @param roomNo 传递房间编号
     */
    public void order(int roomNo){  //207
        //假设房间编号207(下标是rooms[1][6])
        //rooms[roomNo/100 - 1][roomNo&100-1]
        //通过房间编号演算出房间下标
        //Room roomOrder = rooms[roomNo/100-1][roomNo%100-1];
        //roomOrder.setFlag(false);

        //我自己的方法
        for(int i = 0; i<rooms.length;i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j].getId() == roomNo && rooms[i][j].isFlag()) {
                    rooms[i][j].setFlag(false);
                    System.out.println("客户订房成功,房间编号是:" + rooms[i][j].getId());
                    break;
                }
            }
        }
    }

    /**
     * 退房方法
     * @param roomNo 房间编号
     */
    public void exit(int roomNo){
        Room roomExit = rooms[roomNo/100-1][roomNo%100-1];
        roomExit.setFlag(true);

    }
}

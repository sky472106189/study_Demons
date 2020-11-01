package 作业.酒店管理系统;

/**
 * Created by 15173 on 2020/3/7.
 * 酒店房间
 */
public class Room{
    private boolean flag;//true为空,flase为非空
    private int id;     //房间编号
    private String roomtype;//房间类型

    public Room(boolean flag, int id, String roomtype) {
        this.flag = flag;
        this.id = id;
        this.roomtype = roomtype;
    }

    //setter and getter
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    @Override
    public String toString() {
        return "[房间号:"+id+",房间类型:"+roomtype+",房间状态:"+(flag?"空闲]":"占用]");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Room)) return false;
        if (this == o) return true;
        Room r1 = (Room) o;
        if (this.id == r1.getId())
            return true;
            return false;

    }


    //测试程序
//    public static void main(String[] args) {
//        Room room1 = new Room(true,101,"单人间");
//        Room room2 = new Room(true,101,"单人间");
//        System.out.println(room1);
//        if (room1.equals(room2)){
//            System.out.println("房间冲突");
//        }
//
//    }
}


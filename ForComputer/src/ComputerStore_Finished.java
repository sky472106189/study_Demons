import java.util.*;

/**
 * 只考虑了电脑类型的扩展，比如加入一体机、服务器等，只需修改枚举，增加相应的实体类即可。
 * 没有考虑更多的扩展性，比如万一以后需要取最新的电脑；比如一个仓库不仅能放电脑，还能放别的东西。
 */
public class ComputerStore_Finished {

    public static void main(String[] args) throws InterruptedException {
        Stock s = new Stock();

        AbstractComputer note3 = new Note();
        s.storeComputer(note3);
        Thread.sleep(1000);
        AbstractComputer pc1 = new Pc();
        s.storeComputer(pc1);
        Thread.sleep(1000);
        AbstractComputer pc2 = new Pc();
        s.storeComputer(pc2);
        Thread.sleep(1000);
        AbstractComputer note1 = new Note();
        s.storeComputer(note1);
        Thread.sleep(1000);
        AbstractComputer pc3 = new Pc();
        s.storeComputer(pc3);
        Thread.sleep(1000);
        AbstractComputer note2 = new Note();
        s.storeComputer(note2);

        System.out.println(s.getComputer());
        System.out.println(s.getComputer());
        System.out.println(s.getComputer());
        System.out.println(s.getComputer());
        System.out.println(s.getComputer());
        System.out.println(s.getComputer());

//        System.out.println(s.getComputer(ComputerType.PC));
//        System.out.println(s.getComputer(ComputerType.NOTE));
//        System.out.println(s.getComputer(ComputerType.PC));
//        System.out.println(s.getComputer(ComputerType.NOTE));
//        System.out.println(s.getComputer(ComputerType.NOTE));
//        System.out.println(s.getComputer(ComputerType.PC));
    }

    /**
     * 定义仓库
     */
    static class Stock {
        /**
         * 定义货架，每个种类对应一个货架
         */
        private Map<ComputerType, Queue<AbstractComputer>> map = new HashMap<>(4);

        /**
         * 初始化，为每一个种类新建一个货架
         */
        Stock() {
            ComputerType[] types = ComputerType.values(); //枚举.values()  方法获取所有的枚举
            for(ComputerType type:types) {
                Queue<AbstractComputer> list = new LinkedList<>();
                map.put(type, list);  //将枚举出来的type作为K,并且分配一个LinkedList为V
            }
        }

        /**
         * 电脑入库
         * @param computer 存入的电脑对象
         */
        void storeComputer(AbstractComputer computer) {
            //设置入库时间
            computer.setInComeTime();
            //获取电脑类型
            ComputerType type = computer.getType();
            //存放到对应的货架
            Queue<AbstractComputer> list = map.get(type); //返回该K所映射的V,V对应的就是LinkedList. 比如type是PC,那么V就是type的链表.
                                                          //如果type是Note,那么V就是Note的链表
            list.add(computer);//LinkedList选择好对应的K后,再开始加入对称的computer
        }

        /**
         * 取出电脑，不指定类型
         * @return 返回电脑对象
         */
        AbstractComputer getComputer() {
            //最老的电脑
            AbstractComputer computer = null;
            //最老的电脑所在货架
            Queue<AbstractComputer> currentList = null;
            //遍历所有货架
            for(Queue<AbstractComputer> list:map.values()) {  //让链表去遍历所有的V,包括PC和Note
                //初始化
                if(computer == null) {
                    computer = list.peek();
                    currentList = list;
                } else {
                    //比较，得出仓库中最老的电脑及其所在货架
                    if(computer.getInComeTime().compareTo(list.peek().getInComeTime())>0) {
                        computer = list.peek();
                        currentList = list;
                    }
                }
            }
            //取出货架上的电脑
            if(currentList != null) {
                return currentList.poll();
            } else {
                return null;
            }
        }

        /**
         * 取出电脑，指定类型
         * @param type 电脑的类型
         * @return 返回电脑对象
         */
        AbstractComputer getComputer(ComputerType type) {
            //找到对应类型的货架
            Queue<AbstractComputer> list = map.get(type);
            //取出最老的电脑
            return list.poll();
        }
    }

    /**
     * 枚举电脑的类型
     */
    enum ComputerType {
        /**
         * 台式机
         */
        PC,
        /**
         * 笔记本
         */
        NOTE
    }

    /**
     * 定义电脑的抽象类，包含一些基本的属性及方法
     */
    static abstract class AbstractComputer {
        /**
         * 入库时间
         */
        private Date inComeTime;
        /**
         * 电脑类型
         */
        private ComputerType type;

        ComputerType getType() {
            return this.type;
        }
        Date getInComeTime() {
            return this.inComeTime;
        }

        void setInComeTime() {
            this.inComeTime = new Date();
        }

        @Override
        public String toString() {
            String format = "type：%s，date：%s";
            return String.format(format, this.type.toString(), this.inComeTime.toString());
        }
    }

    /**
     * 定义台式机
     */
    static class Pc extends AbstractComputer {
        Pc() {
            super.type = ComputerType.PC;
        }
    }

    /**
     * 定义笔记本
     */
    static class Note extends AbstractComputer {
        Note() {
            super.inComeTime = new Date();
            super.type = ComputerType.NOTE;
        }
    }
}

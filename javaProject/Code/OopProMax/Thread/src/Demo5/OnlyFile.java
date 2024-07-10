package Demo5;

public class OnlyFile {
    public static int READNUM = 0;
    public static int WRITENUM = 0;

    public  void read() {
        String name = Thread.currentThread().getName();

            try {
                OnlyFile.READNUM++;
                if (OnlyFile.READNUM > 3){
                    //人数超了

                    this.notifyAll();
                    this.wait();
                }else {
                    System.out.println(name+ "正在读文件，目前人数："+ OnlyFile.READNUM);
                    Thread.sleep(5000);//假设五秒后读完了
                    OnlyFile.READNUM--;
                    this.notifyAll();
                    this.wait();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }



    }

    public void write() {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            try {
                OnlyFile.WRITENUM++;
                if(OnlyFile.READNUM == 0&& OnlyFile.WRITENUM==1){
                    System.out.println(name+ "正在写文件，目前系统中的写者数量和读者数量是："+OnlyFile.WRITENUM + " "+ OnlyFile.READNUM);
                    Thread.sleep(3000);

                    OnlyFile.WRITENUM--;
                    this.notifyAll();
                    this.wait();
                }else {
                    OnlyFile.READNUM = 0;
                    System.out.println("读者全部退出文件");
                    this.notifyAll();
                    this.wait();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }


    }
}

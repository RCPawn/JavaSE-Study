package puzzlegame.com.rcpawn.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //加载图片的时候，会根据二维数组中的数据进行加载
    int[][] data = new int[4][4];
    //记录空白方块在二维数组中的位置
    int x;
    int y;
    // 定义一个变量
    String Path = "..\\puzzlegame\\image\\animal\\animal2\\";
    // 存储正确的数据
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0},
    };
    // 统计步数
    int step = 0;
    //创建选项下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem girlItem = new JMenuItem("美女");
    JMenuItem animalItem = new JMenuItem("动物");
    JMenuItem sportItem = new JMenuItem("运动");

    JMenuItem accountItem = new JMenuItem("公众号");

    // 初始化游戏窗口
    public GameJFrame() {
        //初始化界面
        initJFrame();
        //初始化菜单
        initJMenuBar();
        // 初始化数据
        initDate();
        //初始化图片
        initImage();

        //让界面显示出来，建议写在最后
        this.setVisible(true);
    }

    // 初始化数据
    private void initDate() {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }

    }

    // 初始化图片
    private void initImage() {
        // 清空原本已经出现的所有图片
        this.getContentPane().removeAll();

        if (Victory()) {
            JLabel winJLabel = new JLabel(new ImageIcon("..\\puzzlegame\\image\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        JLabel stepCount = new JLabel("步数：" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        // 图片先加载在上 后加载在下
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = data[i][j];
                //创建一个JLabel的对象（管理容器）
                JLabel jLabel = new JLabel(new ImageIcon(Path + num + ".jpg"));
                //指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                // 给图片添加边框
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //把管理容器添加到界面中
                this.getContentPane().add(jLabel);
            }
        }

        // 添加背景图片
        JLabel background = new JLabel(new ImageIcon("..\\puzzlegame\\image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        // 把背景图片添加到界面当中
        this.getContentPane().add(background);

        // 刷新界面
        this.getContentPane().repaint();
    }

    // 初始化菜单
    private void initJMenuBar() {
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的两个选项的对象 （功能  关于我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        JMenu resetImageItem = new JMenu("更换图片");

        //将每一个选项下面的条目添加爱到选项当中
        functionJMenu.add(resetImageItem);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        resetImageItem.add(girlItem);
        resetImageItem.add(animalItem);
        resetImageItem.add(sportItem);

        aboutJMenu.add(accountItem);

        // 给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        girlItem.addActionListener(this);
        animalItem.addActionListener(this);
        sportItem.addActionListener(this);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    // 初始化界面
    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603, 680);
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消隐藏容器中默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
        //给整个界面添加键盘监听事件
        this.addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {}

    // 按下不松 查看全图
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(Path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);

            // 添加背景图片
            JLabel background = new JLabel(new ImageIcon("..\\puzzlegame\\image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            // 把背景图片添加到界面当中
            this.getContentPane().add(background);

            // 刷新界面
            this.getContentPane().repaint();
        }
    }

    // 移动以及作弊码
    @Override
    public void keyReleased(KeyEvent e) {
        // 判断游戏是否胜利
        if (Victory()) {
            return;
        }

        int code = e.getKeyCode();

        if (code == 37) {
            System.out.println("向左移动");
            if (y == 3) {
                return;
            }

            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
            initImage();
        } else if (code == 38) {
            System.out.println("向上移动");
            if (x == 3) {
                return;
            }

            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
            initImage();


        } else if (code == 39) {
            System.out.println("向右移动");
            if (y == 0) {
                return;
            }

            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
            initImage();
        } else if (code == 40) {
            System.out.println("向下移动");
            if (x == 0) {
                return;
            }

            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0},
            };
            initImage();
        }
    }

    // 判断游戏是否胜利
    public boolean Victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // 单击事件实现
    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取当前被点击的条目对象
        Object obj = e.getSource();
        // 判断
        if (obj == replayItem) {
            System.out.println("重新游戏");

            // 再次打乱图片
            initDate();

            // 计步器清零
            step = 0;

            // 重新加载图片
            initImage();

        } else if (obj == reLoginItem) {
            System.out.println("重新登陆");

            // 关闭当前界面
            this.setVisible(false);

            // 打开登陆界面
            new LoginJFrame();

        } else if (obj == closeItem) {
            System.out.println("关闭游戏");
            System.exit(0);

        } else if (obj == accountItem) {
            System.out.println("公众号");

            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("..\\puzzlegame\\image\\about.png"));
            jLabel.setBounds(0, 0, 258, 258);
            // 把图片添加到弹框当中
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(344, 344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);

        } else if (obj == girlItem) {
            System.out.println("美女");

            String[] imagePath1 = {
                    "..\\puzzlegame\\image\\girl\\girl1\\",
                    "..\\puzzlegame\\image\\girl\\girl4\\",
                    "..\\puzzlegame\\image\\girl\\girl7\\",
                    "..\\puzzlegame\\image\\girl\\girl8\\",
            };

            Path = randomPath(imagePath1);
            // 再次打乱图片
            initDate();

            // 计步器清零
            step = 0;

            // 重新加载图片
            initImage();

        } else if (obj == animalItem) {
            System.out.println("动物");

            String[] imagePath2 = {
                    "..\\puzzlegame\\image\\animal\\animal1\\",
                    "..\\puzzlegame\\image\\animal\\animal2\\",
                    "..\\puzzlegame\\image\\animal\\animal4\\",
                    "..\\puzzlegame\\image\\animal\\animal7\\",
                    "..\\puzzlegame\\image\\animal\\animal8\\",
            };
            Path = randomPath(imagePath2);
            // 再次打乱图片
            initDate();

            // 计步器清零
            step = 0;

            // 重新加载图片
            initImage();

        } else if (obj == sportItem) {
            System.out.println("运动");

            String[] imagePath3 = {
                    "..\\puzzlegame\\image\\sport\\sport5\\",
                    "..\\puzzlegame\\image\\sport\\sport2\\",
                    "..\\puzzlegame\\image\\sport\\sport7\\",
                    "..\\puzzlegame\\image\\sport\\sport8\\",
                    "..\\puzzlegame\\image\\sport\\sport9\\",
                    "..\\puzzlegame\\image\\sport\\sport10\\",
            };
            Path = randomPath(imagePath3);
            // 再次打乱图片
            initDate();

            // 计步器清零
            step = 0;

            // 重新加载图片
            initImage();

        }
    }

    // 生成一个图片的随机路径
    public String randomPath(String[] imagePath) {
        String path;
        Random r = new Random();
        int index = r.nextInt(imagePath.length);
        path = imagePath[index];
        return path;
    }
}
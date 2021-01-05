import java.util.*;

import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

class Main {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("How many items? For the love of god, just enter a number, I'm dying here: ");
    int totalItems = (userInput.nextInt() - 1);
    String[] name = new String[5];
    double[] price = new double[5];
    int[] quantity = new int[5];
    double[] revenue = new double[5];
    for (int i = 0; i <= totalItems; i++) {
      System.out.println("Enter the item name in singular terms (i.e. \"orange\" instead of \"oranges\") :");
      System.out.println("Use underscores for spaces (i.e \"samsung_microwave\"");
      String itemName = userInput.next();
      name[i] = itemName;
      // add confirmation output to user
      System.out.println("Enter the item price:");
      double itemPrice = userInput.nextDouble();
      price[i] = itemPrice;
      // add confirmation output to user
    }
    System.out.println("BUT WAIT! THERE'S MORE!");
    for (int j = 0; j <= totalItems; j++) {
      System.out.println("How many " + name[j] + "s would you like to purchase?");
      int itemQuantity = userInput.nextInt();
      quantity[j] = itemQuantity;
      // add confirmation output to user
    }
 
    System.out.println("Now calculating totals...");
    wait(1000);
    System.out.println("Loading com.miui.calculator...");
    wait(500);
    System.out.println("MIUI LOADED!");
    wait(2000);
    System.out.println(
        "什么他妈的你他妈的刚才说我，你这小婊子？我会让你知道我毕业了我班的顶部的海豹突击队，我已经参与了许多秘密袭击的基地组织，和我有超过300证实杀死。我在训练的大猩猩战，我在整个美国军队的最高狙击手。你是我什么都不是，但只是一个目标。我会消灭你他妈的精度喜欢哪一个从未见过在这个地球上，记住我的话他妈的。你以为你可以逃脱说狗屎我在互联网上？再想想，笨蛋。在我们发言，我联系我的秘密横跨美国间谍网络和IP被追踪作为现在让您风暴，蛆更好的准备。这抹了你打电话");
    wait(500);
    System.out.println(
        "动态网自由门天安门天安门法轮功李洪志Free Tibet 六四天安门事件The Tiananmen Square protests of 1989 天安门大屠杀The Tiananmen Square Massacre 反右派斗争The Anti-Rightist Struggle 大跃进政策The Great Leap Forward 文化大革命The Great Proletarian Cultural Revolution 人权Human Rights 民运Democratization 自由Freedom 独立Independence 多党制Multi-party system 台湾台湾Taiwan Formosa 中华民国Republic of China 西藏土伯特唐古特Tibet 达赖喇嘛Dalai Lama 法轮功Falun Dafa 新疆维吾尔自治区The Xinjiang Uyghur Autonomous Region 诺贝尔和平奖Nobel Peace Prize 刘暁波Liu Xiaobo 民主言论思想反共反革命抗议运动骚乱暴乱骚扰扰乱抗暴平反维权示威游行李洪志法轮大法大法弟子强制断种强制堕胎民族净化人体实验肃清胡耀邦赵紫阳魏京生王丹还政于民和平演变激流中国北京之春大纪元时报评论共产党 独裁 专制 压制 统一 监视 镇压 迫害 侵略 掠夺 破坏 拷问 屠杀 活摘器官 诱拐 买卖人口 游进 走私 毒品 卖淫 春画 赌博 六合彩 天安门 天安门 法轮功 李洪志 Winnie the Pooh 刘晓波动态网自由门");
    wait(2000);
    System.out.println("SYSTEM_HALT");
    wait(1000);
    System.out.println("The CCP is now after you. Have fun!");
    for (int k = 0; k <= totalItems; k++) {
      double customerCost = price[k] * quantity[k];
      revenue[k] = customerCost;
    }
    System.out.println("Now to output the items.");
    for (int m = 0; m <= totalItems; m++) {
      System.out.println(
          "You are buying: " + quantity[m] + " " + name[m] + "s at $" + price[m] + " each for $" + revenue[m] + ".");
    }
    double sum = 0;
    for (int p = 0; p <= totalItems; p++) {

      sum = revenue[p] + sum;
    }
    System.out.println("Your grand total is $" + sum);
    wait(500);
    System.out.println("We'd have you enter your credit card info, but our programmers suck and broke too many things  while attempting to implement it, so we just removed it and executed them.");
    wait(1000);
    System.out.println("Thank you for shopping on TaoBao!");
    userInput.close();
  }

  // add calls for wait method
  public static void wait(int ms) {
    try {
      Thread.sleep(ms);
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }
}
package com.neuede.test2;

import java.util.*;

public class WolferKill {
    public static void main(String[] args) {
        /**
         *  狼人杀发牌器
         *
         *  游戏人数  12~18范围之内
         *
         *
         *
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入游戏人数：");
        int player = scanner.nextInt();
        if (player>18 || player<12){
            System.out.println("不符合游戏人数");
        }else{
            /**
             *  符合游戏人数后  进行发牌
             *
             *  定义3个牌堆   用ArrayList
             *  1 发牌的列表
             *  2 发完牌的列表
             *  3 底牌列表 ：
             *        1.底牌可以没有狼人，如果有，最多只能有一个狼人；
             * 	      2.底牌不能有盗贼；
             *
             * */
            List<String> all = new ArrayList<>();
            List<String> play = new ArrayList<>();
            List<String> bottom = new ArrayList<>();
            init(all);
            pai(all,player);
            // 盗贼一定在游戏的牌中  总牌中移除盗贼 放入游戏牌中
            all.remove("盗贼");
            play.add("盗贼");
            dipai(all,bottom);
            //放完底牌后 将剩余的牌加入游戏牌中
            play.addAll(all);
            // 将游戏牌 打乱顺序 (洗牌)
            Collections.shuffle(play);           //打乱排序
            System.out.println("手牌:"+play);
            System.out.println("底牌:"+bottom);

        }
    }
    //初始化游戏最少人数为12人
    public static void init(List<String> list){
         //添加4个狼人
        for (int i = 0;i<=4;i++){
            list.add("狼人");
        }
        //添加4个村民
        for (int i = 0;i<=4;i++){
            list.add("村民");
        }
        list.add("预言家");
        list.add("女巫");
        list.add("丘比特");
        list.add("守护");
        list.add("猎人");
        list.add("村长");
        list.add("盗贼");
    }
    //根据不同的游戏人数，初始化不同的牌
    public static void pai(List<String> list,int player){
        if(player>12)
            list.add("村民");
        if(player>13)
            list.add("替罪羊");
        if(player>14)
            list.add("狼人");
        if(player>15)
            list.add("村民");
        if(player>16)
            list.add("村民");
        if(player>17)
            list.add("吹笛者");
    }
    //从总的牌堆中碎随机拿三张作为底牌
    public static void dipai(List<String> list,List<String> bottom){
        //狼人在底牌中应该小于等于一
        while(bottom.size()<3){
            //取list的随机下表
            Random random = new Random();
            int index = random.nextInt(list.size());
            if (bottom.contains("狼人") && list.get(index).equals("狼人"))
                  continue;
            else
                bottom.add(list.remove(index));
        }
    }
}

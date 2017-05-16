public class BowlingGame {

    public int getBowlingScore(String bowlingCode) {
        currentScore = firstRound();// 这两次得分  
        beforeScore = currentScore + beforeScore;// 加上上一轮的分数  
  
        while (flag == 2) {  
            this.getAdd();  
            if (flag == 0) {// 下一轮不是全中  
                // 本轮的得分=beforeScore+currentScore  
                beforeScore = currentScore + beforeScore;  
                System.out.println("这是第" + (++count) + "轮，总的分数为：" + beforeScore);  
                    count++;  
                    if(count>=11)  
                        return -1;  
                return getScore();  
            }if(flag==1){  
                count++;  
                continue;//跳出循环。继续执行  
            }  
            count++;//下一轮为全中的话  
            if(count>10){  
                return -1;  
            }  
            return  getScore();  
              
        }  
  
        while (flag == 1) {  
            this.getAdd1();  
            count++;  
            if(count>10)  
                return -1;  
            if(flag==2){//全中，那么就跳出循环  
                return getScore();  
            }  
            int s = secondRound(currentScore);//下一轮的第二次投  
            currentScore = s + currentScore;// 第二次加上第一次  
            beforeScore = currentScore + beforeScore;// 加上上一轮  
                if (flag == 0) {//下一轮不是补中  
                System.out.println("这是第" + count + "轮，总的分数为：" + beforeScore);  
                count++;  
                if(count>=11)  
                    return -1;  
                return getScore();  
            }  
        }  
  
        System.out.println("这是第" + count + "轮，总的分数为：" + beforeScore);  
            count++;  
            if(count>10)  
                return -1;  
        return getScore();  
        return 0;
    }
}

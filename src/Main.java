public class Main {
    public static void main(String[] args) {
        int basicScore = 1000;
        int addMoney = 1100;
        int totalScore = basicScore + addMoney;
        int bonusUp = 100;
        int totalBonus = (addMoney / bonusUp);
        int finalScore = totalScore;
        if (addMoney >= 1000) {
            finalScore = totalScore + totalBonus;
        } else {
            totalBonus = 0;
        }
        System.out.println(totalBonus);
        System.out.println(finalScore);

    }
}

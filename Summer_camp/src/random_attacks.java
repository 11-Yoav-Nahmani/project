import java.util.*;

public class random_attacks {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner n = new Scanner(System.in);
        boolean warStop = false;
        int attackCounter = 0, weaponCodes = 0, numberOfAttacks = 0, randomProtector;

        System.out.println("הקלד את סוג הנשק שהאויב משתמש בו נגדינו");
        weaponCodes = n.nextInt();
        while (weaponCodes != -999) {
            switch (weaponCodes) {
                case 1 -> {
                    System.out.println("טילי אפרסק! עם כמה אנחנו מתמודדים פה?");
                    numberOfAttacks = n.nextInt();
                    attackCounter += numberOfAttacks * 20;
                }
                case 2 -> {
                    System.out.println("מלוני רעם! עם כמה אנחנו מתמודדים פה?");
                    numberOfAttacks = n.nextInt();
                    attackCounter += numberOfAttacks * 10;
                }
                case 3 -> {
                    System.out.println("תפוחים מנוילנים! עם כמה אנחנו מתמודדים פה?");
                    numberOfAttacks = n.nextInt();
                    attackCounter += numberOfAttacks;
                }
                case 10 -> {
                    System.out.println("עצרו את המתקפה! זה לא הוגן!! המלחמה נעצרת פה!");
                    weaponCodes = -999;
                    warStop = true;
                }
                default -> System.out.println("כנראה שהיית שגיאה כלשהי? נסה להקליד קודים לסוגי מתקפות מ1 עד 3");
            }
            System.out.println("האם המתקפה נגמרה? אם כן הקלד -999 ואם לא הקלד מחדש ");
            weaponCodes = n.nextInt();
        }

        randomProtector = r.nextInt(attackCounter);

        if (!warStop) {
            if (randomProtector > attackCounter / 2) {
                System.out.println("רוב התחמושת לא פגעה ומדינת בילי לא תוכרע בקלות!");
            } else {
                System.out.println("מדינת בילי נכבשה ובילי הולך לשנות את החוקה!");
            }
        } else {
            System.out.println("המפלגה למען מסכנים התערבה! המלחמה נגמרת! ובילי שומר את חוקיו");
        }

    }
}
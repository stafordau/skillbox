package pr2_13;

public class AgeComparator {
    public static void main(String[] args) {
        int vasyaAge = 29;
        int katyaAge = 14;
        int mashaAge = 36;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasyaAge <= katyaAge && vasyaAge <= mashaAge) {
            min = vasyaAge;
        }

        if (katyaAge <= mashaAge && katyaAge <= vasyaAge) {
            min = katyaAge;
        }

        if (mashaAge <= katyaAge && mashaAge <= vasyaAge) {
            min = mashaAge;
        }

        if ((vasyaAge <= mashaAge && vasyaAge >= katyaAge) || (vasyaAge >= mashaAge && vasyaAge <= katyaAge)){
            middle = vasyaAge;
        }

        if ((katyaAge <= vasyaAge && katyaAge >= mashaAge) || (katyaAge >= vasyaAge && katyaAge <= mashaAge)){
            middle = katyaAge;
        }

        if ((mashaAge <= katyaAge && mashaAge >= vasyaAge) || (mashaAge >= katyaAge && mashaAge <= vasyaAge)){
            middle = mashaAge;
        }

        if (vasyaAge >= katyaAge && vasyaAge >= mashaAge) {
            max = vasyaAge;
        }

        if (katyaAge >= mashaAge && katyaAge >= vasyaAge) {
            max = katyaAge;
        }

        if (mashaAge >= katyaAge && mashaAge >= vasyaAge) {
            max = mashaAge;
        }
        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);
    }
}

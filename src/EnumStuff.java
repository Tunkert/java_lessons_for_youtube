public class EnumStuff {
    public enum WeekDays {
        Monday(0),
        Tuesday(1),
        Wednesday(2),
        Thursday(3),
        Friday(4),
        Saturday(5),
        Sunday(6);
        private int value;
        private void WeekDay (int value) {
            this.value = value;
        }

        WeekDays(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    public static void main(String[] args) {
        // enums are a "special class", you can print them as integers or as normal
        System.out.println(WeekDays.Wednesday);
        System.out.println(WeekDays.Wednesday.getValue());
    }
}

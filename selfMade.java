class NPCBase { //2 класса одного типа NPC, второй основан на первом и имеет альт. атаку, можно настраивать здоровье, оружие и скорость.
	private double health;
	private double speed;
	private String cmbClass;
	private String wpn;

	NPCBase() {
                health = speed = 0.0;
                cmbClass = "Неизвестный NPC";
        }

        NPCBase(double h, double s, String c) {
                health = h;
                speed = s;
                cmbClass = c;
       	}

        NPCBase(NPCBase ob) {
                health = ob.health;
                speed = ob.speed;
                cmbClass = ob.cmbClass;
        }

        void showNPCInfo() {
		System.out.println("Информация по NPC:");
		System.out.println("Класс: " + cmbClass);
                System.out.println("Здоровье: " + health);
		System.out.println("Скорость: " + speed;
        }
        void setHealth(double h) {
                health = h;
        }
	void setSpeed(double s) {
		speed = s;
	}
}

class MetroPoliceNPC extends NPCBase {
	String wpn;
	MetroPoliceNPC() {
		super()
		wpn = "Без оружия"
	}
	MetroPoliceNPC(String w, double h, double s) {
                super(h, s, "Метрокоп");
                wpn = w;
        }
	MetroPoliceNPC(MetroPoliceNPC ob) {
                super(ob);
                wpn = ob.wpn;
        }
	void showWpn() {
                System.out.println("Оружие: " + wpn);
        }
}

class CombineEliteNPC extends MetroPoliceNPC {
        private String AltAttack;

        CombineEliteNPC (String a, String w, double h, double s) {
                super(w, h, s, "Элитный Солдат");
                AltAttack = a;
        }
	void showAltAttack() {
                System.out.println("Альт. Атака: " + AltAttack);
        }
}

class selfMade {
        public static void main(String[] args) {
	MetroPoliceNPC mp1 = new MetroPoliceNPC();
	MetroPoliceNPC mp2 = new MetroPoliceNPC("Дубинка", 120.0, 40.0);
	CombineEliteNPC elite1 = new CombineEliteNPC("Есть", "AR2", 300.0, 60.0);
	}
}

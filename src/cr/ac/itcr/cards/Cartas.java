package cr.ac.itcr.cards;

public class Cartas {

    enum Type {

        Hechizo, Esbirro, Secreto;

        private static final Type[] types = Type.values();
        public static Type getType(int i){

            return Type.types[i];
        }
    }

    enum Action {

        Damage, Freeze, Heal, SupremePower, StealCard, Poison, EasyMoney, Oracle;

        private static final Action[] actions = Action.values();
        public static Action getAction(int i){

            return Action.actions[i];
        }
    }

    private final Type type;
    private final Action action;


    public Cartas(final Type type, final Action action){


        this.action = action;
        this.type = type;
    }

    public Action getAction(){

        return this.action;
    }

    public Type getType(){

        return this.type;
    }

    public String toString(){

        return type + " " + action;
    }



}

package Prack04;

public enum Aplace {
        альпенштока(" на острие альпенштока, образовавшейся в склоне пирамидальной горы,"),
        пещер(" были в пещере, "),
        сосулек(" среди исполинских ледяных сосулек, свешивавшихся с потолка грота "),
        Luna("на Луну "),
        grot(" сосульчатого грота и"),
        raketa(" в ракету"),
        в_тоннеле(" в тоннеле  с ледяным дном."),
        way(" в стороне от дорожки "),
        Ice(" на льду ");
        private String place;
        private Aplace(String place) {
            this.place = place;
        }

        @Override
        public String toString() {
            return place;
        }
}

public class Animal {
        private Boolean vegetarian;
        private String eats;
        private int noOfLegs;

        public Animal(Boolean vegetarian, String eats, int noOfLegs) {
            this.vegetarian = vegetarian;
            this.eats = eats;
            this.noOfLegs = noOfLegs;
        }

        public Animal() {
        }

        public Boolean getVegetarian() {
            return vegetarian;
        }

        public void setVegetarian(Boolean vegetarian) {
            this.vegetarian = vegetarian;
        }

        public String getEats() {
            return eats;
        }

        public void setEats(String eats) {
            this.eats = eats;
        }

        public int getNoOfLegs() {
            return noOfLegs;
        }

        public void setNoOfLegs(int noOfLegs) {
            this.noOfLegs = noOfLegs;
        }
    }



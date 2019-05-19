package TomaszTrzpisPizzaMenu;

    public enum Product {
        MOZZARELLA ("mozzarella", 1.5),
        CHEESE ("ser", 1.5),
        HAM ("szynka", 2.0),
        MASHROOMS ("pieczarki", 1.5),
        BECON ("boczek", 2.0),
        OLIVES ("oliwki", 2.0),
        PINEAPPLE ("ananas", 2.5),
        CHICKEN ("kurczak", 2.5),
        ONION ("cebula", 1.5),
        SALAMI ("salami", 2.0),
        FETA ("feta", 2.0),
        TOMATOSOUCE ("sos pomidorowy", 0.0);

        private final String name;
        private final double price;
        Product (String aName, double aPrice) {
            this.name = aName;
            this.price = aPrice;
        }

        @Override
        public String toString() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }


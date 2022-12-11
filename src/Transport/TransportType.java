package Transport;

    public enum TransportType {
        CAR("Легковой автомобиль"),
        BUS("Автобус"),
        TRUCK("Грузовик");

        String transportType;

        TransportType(String transportType) {
            this.transportType = transportType;
        }

        @Override
        public String toString() {
            return " " + transportType;
        }
}

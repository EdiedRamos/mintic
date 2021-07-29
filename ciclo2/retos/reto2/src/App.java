class PrecioTotal {
    // atributos
    protected Double totalElectrodomesticos = 0.0;
    protected Double totalTelevisores = 0.0;
    protected Double totalLavadoras = 0.0;
    protected Electrodomestico listaElectrodomesticos[];

    // constructor
    public PrecioTotal(Electrodomestico l_electrodomesticos[]) {
        listaElectrodomesticos = l_electrodomesticos;
    }

    // métodos
    private void calcular() {
        for (int i = 0; i < listaElectrodomesticos.length; i++) {
            switch (listaElectrodomesticos[i].tipo()) {
                case 1:
                    totalElectrodomesticos += listaElectrodomesticos[i].calcularPrecio();
                    break;
                case 2:
                    totalLavadoras += listaElectrodomesticos[i].calcularPrecio();
                    break;
                case 3:
                    totalTelevisores += listaElectrodomesticos[i].calcularPrecio();
                    break;
            }
        }
        totalElectrodomesticos += totalLavadoras + totalTelevisores;
    }

    public void mostrarTotales() {
        calcular();
        System.out.println("La suma del precio de los electrodomésticos es de " + totalElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de " + totalLavadoras);
        System.out.print("La suma del precio de las televisiones es de " + totalTelevisores);
    }
}

class Electrodomestico {
    // atributos
    protected Double PRECIO_BASE = 100.0;
    protected char CONSUMO_W = 'F';
    protected Integer peso = 5;
    protected char consumoW = CONSUMO_W;
    protected Double precioBase = PRECIO_BASE;

    // constructor
    public Electrodomestico() {}

    public Electrodomestico(Double precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(Double precioBase, Integer peso, char consumoW) {
        this.peso = peso;
        this.precioBase = precioBase;
        comprobarConsumo(consumoW);
    }

    private void comprobarConsumo(char consumoW) {
        String opt = "ABCDEF";
        if (!opt.contains(String.valueOf(consumoW))) {
            this.consumoW = CONSUMO_W;
        } else {
            this.consumoW = consumoW;
        }
    }
    
    // métodos
    public int tipo() {
        return 1;
    }

    public Double calcularPrecio() {
        Double adicion = 0.0;
        // adición de acuerco al consumo electrico
        switch (consumoW) {
            case 'A':
                adicion += 100.0;
                break;
            case 'B':
                adicion += 80.0;
                break;
            case 'C':
                adicion += 60.0;
                break;
            case 'D':
                adicion += 50.0;
                break;
            case 'E':
                adicion += 30.0;
                break;
            case 'F':
                adicion += 10.0;
                break;
        }
        // adición de acuerdo al peso
        if (peso > -1 && peso <= 19) {
            adicion += 10.0;
        } else if (peso > 19 && peso <= 49) {
            adicion += 50.0;
        } else if (peso > 49 && peso < 80) {
            adicion += 80.0;
        } else if (peso > 79) {
            adicion += 100.0;
        }
        return precioBase + adicion;
    }
}

class Lavadora extends Electrodomestico {
    // atributos - campos de clase
    protected final Integer CARGA_BASE = 5;
    protected Integer carga = CARGA_BASE;

    // constructor

    public Lavadora(Double precioBase, Integer peso) {
        super(precioBase, peso);
    }

    public Lavadora(Double precioBase, Integer peso, char consumoW, Integer carga) {
        super(precioBase, peso, consumoW);
        this.carga = carga;
    }

    // métodos
    public int tipo() {
        return 2;
    }

    public Double calcularPrecio() {
        Double adicion = 0.0;
        if (carga > 30) {
            adicion += 50.0;
        }
        return super.calcularPrecio() + adicion;
    }
}

class Television extends Electrodomestico {
    // atributos
    protected Integer PULGADAS_BASE = 20;
    protected Integer pulgadas = PULGADAS_BASE;
    protected Boolean sintonizadorTDT = false;

    // constructor
    public Television(Double precioBase, Integer peso) {
        super(precioBase, peso);
    }

    public Television(Double precioBase, Integer peso, char consumoW, Integer pulgadas, Boolean sintonizadorTDT) {
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // métodos
    public int tipo() {
        return 3;
    }

    public Double calcularPrecio() {
        Double adicion = 0.0;
        if (sintonizadorTDT) {
            adicion += 50.0;
        }
        if (pulgadas > 40) {
            adicion += precioBase * 0.30;
        }
        return super.calcularPrecio() + adicion;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // primer prueba
        Electrodomestico electrodomesticos[] = new Electrodomestico[5];
        electrodomesticos[0] = new Electrodomestico(200.0, 60, 'C');
        electrodomesticos[1] = new Lavadora(150.0, 30);
        electrodomesticos[2] = new Television(500.0, 80, 'E', 42, false);
        electrodomesticos[3] = new Electrodomestico();
        electrodomesticos[4] = new Electrodomestico(600.0, 20, 'D');
        PrecioTotal solucion1 = new PrecioTotal(electrodomesticos);
        solucion1.mostrarTotales();
        System.out.println();
        // segunda prueba
        Electrodomestico electrodomesticos2[] = new Electrodomestico[10];
        electrodomesticos2[0] = new Electrodomestico(200.0, 60, 'C');
        electrodomesticos2[1] = new Lavadora(150.0, 30);
        electrodomesticos2[2] = new Television(500.0, 80, 'E', 42, false);
        electrodomesticos2[3] = new Electrodomestico();
        electrodomesticos2[4] = new Electrodomestico(600.0, 20, 'D');
        electrodomesticos2[5] = new Lavadora(300.0, 40, 'Z', 40);
        electrodomesticos2[6] = new Television(250.0, 70);
        electrodomesticos2[7] = new Lavadora(400.0, 100, 'A', 15);
        electrodomesticos2[8] = new Television(200.0, 60, 'C', 30, true);
        electrodomesticos2[9] = new Electrodomestico(50.0, 10);
        PrecioTotal solucion2 = new PrecioTotal(electrodomesticos2);
        solucion2.mostrarTotales();
    }
}

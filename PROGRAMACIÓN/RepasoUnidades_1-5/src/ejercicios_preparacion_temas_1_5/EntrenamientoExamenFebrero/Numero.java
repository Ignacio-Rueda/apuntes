package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;



/**
 *
 * @author Ignacio Rueda
 */
public class Numero {

    private final int numero;
    public static final int RANGO_MINIMO = 0;
    public static final int RANGO_MAXIMO = 99;

    //ARRAY IDIOMAS:
    private static String[][] ARRAY_NUMEROS_CASTELLANO = {
        {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"},
        {"diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"},
        {"veinte", "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco", "veintiséis", "veintisiete", "veintiocho", "veintinueve"},
        {"treinta"},
        {"cuarenta"},
        {"cincuenta"},
        {"sesenta"},
        {"setenta"},
        {"ochenta"},
        {"noventa"}
    };

    private static String[][] ARRAY_NUMEROS_INGLES = {
        {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"},
        {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"},
        {"twenty", "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine"},
        {"thirty"},
        {"forty"},
        {"fifty"},
        {"sixty"},
        {"seventy"},
        {"eighty"},
        {"ninety"}
    };
    private static String[][] ARRAY_NUMEROS_SWAHILI = {
        {"sifuri", "moja", "mbili", "tatu", "nne", "tano", "sita", "saba", "nane", "tisa"},
        {"kumi", "kumi na moja", "kumi na mbili", "kumi na tatu", "kumi na nne", "kumi na tano", "kumi na sita", "kumi na saba", "kumi na nane", "kumi na tisa"},
        {"ishirini", "ishirini na moja", "ishirini na mbili", "ishirini na tatu", "ishirini na nne", "ishirini na tano", "ishirini na sita", "ishirini na saba", "ishirini na nane", "ishirini na tisa"},
        {"thelathini"},
        {"arobaini"},
        {"hamsini"},
        {"sitini"},
        {"sabini"},
        {"themanini"},
        {"tisini"}
    };
    private static String[][] ARRAY_NUMEROS_FRANCES = {
        {"zéro", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf"},
        {"dix", "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept", "dix-huit", "dix-neuf"},
        {"vingt", "vingt et un", "vingt-deux", "vingt-trois", "vingt-quatre", "vingt-cinq", "vingt-six", "vingt-sept", "vingt-huit", "vingt-neuf"},
        {"trente"},
        {"quarante"},
        {"cinquante"},
        {"soixante"},
        {"soixante-dix"},
        {"quatre-vingts"},
        {"quatre-vingt-dix"}
    };
    private static String[][] ARRAY_NUMEROS_ALEMAN = {
        {"null", "eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun"},
        {"zehn", "elf", "zwölf", "dreizehn", "vierzehn", "fünfzehn", "sechzehn", "siebzehn", "achtzehn", "neunzehn"},
        {"zwanzig", "einundzwanzig", "zweiundzwanzig", "dreiundzwanzig", "vierundzwanzig", "fünfundzwanzig", "sechsundzwanzig", "siebenundzwanzig", "achtundzwanzig", "neunundzwanzig"},
        {"dreißig"},
        {"vierzig"},
        {"fünfzig"},
        {"sechzig"},
        {"siebzig"},
        {"achtzig"},
        {"neunzig"}
    };

    public Numero(int numero) throws IllegalArgumentException {
        if (numero < Numero.RANGO_MINIMO || numero > Numero.RANGO_MAXIMO) {
            throw new IllegalArgumentException(String.format("El número %d no está permitido%n", numero));
        }
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public String montajeNumero(String[][] idioma) {
        int unidades = numero % 10;
        int decenas = numero / 10;
        String resultado = "";
        switch (decenas) {
            case 0:
            case 1:
            case 2:
                resultado = idioma[decenas][unidades];
                break;
            default:
                resultado = unidades > 0 ? idioma[decenas][0] + " y " + idioma[0][unidades] : idioma[decenas][0];
        }
        return resultado;
    }

    public String toString() {
        return this.montajeNumero(Numero.ARRAY_NUMEROS_CASTELLANO);
    }

    public String toStringEnglish() {
        return this.montajeNumero(Numero.ARRAY_NUMEROS_INGLES);
    }

    public String toStringFrench() {
        return this.montajeNumero(Numero.ARRAY_NUMEROS_FRANCES);
    }

    public String toStringSwahili() {
        return this.montajeNumero(Numero.ARRAY_NUMEROS_SWAHILI);
    }

    public String toStringAleman() {
        return this.montajeNumero(Numero.ARRAY_NUMEROS_ALEMAN);
    }

    public String toStringLanguage(Language lang) {
        String resultado = "";
        String idioma = lang.name();
        switch (idioma) {
            case "Spanish":
                resultado = this.toString();
                break;
            case "English":
                resultado = this.toStringEnglish();
                break;
            case "French":
                resultado = this.toStringFrench();
                break;
            case "Swahili":
                resultado = this.toStringSwahili();
                break;
            case "German":
                resultado = this.toStringAleman();
                break;
        }
        return resultado;
    }

    public String toStringRomanoFacil() {
        int unidades = this.numero % 10;
        int decenas = this.numero / 10;
        StringBuilder unidadesStr = new StringBuilder();
        StringBuilder decenasStr = new StringBuilder();
        unidadesStr.append(unidades >= 5 ? "V" : "");

        switch (unidades) {
            case 0:

                unidadesStr.append(numero < 10 ? "-" : "");
                break;
            case 4:
            case 9:
                unidadesStr.append("I");
            case 3:
            case 8:
                unidadesStr.append("I");
            case 2:
            case 7:
                unidadesStr.append("I");
            case 1:
            case 6:
                unidadesStr.append("I");
        }
        decenasStr.append(decenas >= 5 ? "L" : "");
        switch (decenas) {
            case 4:
            case 9:
                decenasStr.append("X");

            case 3:
            case 8:
                decenasStr.append("X");
            case 2:
            case 7:
                decenasStr.append("X");
            case 1:
            case 6:
                decenasStr.append("X");

        }

        return decenasStr.toString() + unidadesStr.toString();
    }

    public String toStringRomano() {
        int unidades = this.numero % 10;
        int decenas = this.numero / 10;
        StringBuilder unidadesStr = new StringBuilder();
        StringBuilder decenasStr = new StringBuilder();
        unidadesStr.append(unidades >= 4 && unidades < 9 ? "V" : "");

        switch (unidades) {
            case 0:
                unidadesStr.append(numero < 10 ? "-" : "");
                break;
            case 9:
                unidadesStr.append("IX");
                break;
            case 4:
                unidadesStr.append("I").reverse();
                break;
            case 3:
            case 8:
                unidadesStr.append("I");
            case 2:
            case 7:
                unidadesStr.append("I");
            case 1:
            case 6:
                unidadesStr.append("I");

        }
        decenasStr.append(decenas >= 4 && decenas < 9 ? "L" : "");
        switch (decenas) {
            case 4:
                decenasStr.append("X").reverse();
                break;
            case 9:
                decenasStr.append("XC");
                break;
            case 3:
            case 8:
                decenasStr.append("X");
            case 2:
            case 7:
                decenasStr.append("X");
            case 1:
            case 6:
                decenasStr.append("X");

        }

        return decenasStr.toString() + unidadesStr.toString();
    }

    public String toStringBinary() {
        return Integer.toBinaryString(this.numero);
    }

    //-----
    public static void main(String[] args) {
        Numero miNumero = null;
        StringBuilder resultado = new StringBuilder();
        for (int n = 0; n < 100; n++) {
            miNumero = new Numero(n);
            resultado.append(String.format("%5d%25s%25s%25s%25s%25s%28s%25s%22s%n",
                   n,
                    miNumero.toStringBinary(),
                    miNumero.toStringRomanoFacil(),
                    miNumero.toStringRomano(),
                    miNumero.toStringLanguage(Language.Spanish),
                    miNumero.toStringLanguage(Language.English),
                    miNumero.toStringLanguage(Language.French),
                        miNumero.toStringLanguage(Language.Swahili),
                        miNumero.toStringLanguage(Language.German)
            )
            );

        }
//Número (int) - Número en binario - Número romano "fácil" - Número romano - Número español - Número inglés - Número francés - Número - swahili - Número alemán
        System.out.printf("%s%25s%25s%25s%25s%25s%25s%25s%25s%n",
                "Número (int)","Número en binario","Número romano \"fácil\"","Número romano","Número español","Número inglés","Número francés","Número swahili","Número alemán");
        System.out.println(resultado);

    }

}
//Podría ponerse en otro fichero e importarlo:
//import ejercicios_preparacion_temas_1_5.EjerciciosUnidad_5ArraysFormateoExpresionesRegulares.Language;

enum Language{

Spanish,English,Swahili,French,German;


}

package br.univali.kob.model;

import java.io.IOException;
import java.util.Scanner;

/** Representa controle de escrita e leitura no console.
 */
public final class Console {
    /**
     * Arquivo para leitura diretamente do console (System.in).
     */
    private final static Scanner in = new Scanner(System.in);

    /**
     * Lê uma linha do console.
     *
     * @param caption Texto que identifica o que está sendo solicitado (rótulo)
     * @return uma string com a linha lida
     */
    private static String readLine(String caption) {
        System.out.printf("%s ", caption);
        return in.nextLine();
    }

    /**
     * Lê o primeiro char do console.
     *
     * @param caption Texto que identifica o que está sendo solicitado (rótulo)
     * @return um caracter com a linha lida
     */
    public static Character readCharacter(String caption) {
        System.out.printf("%s ", caption);
        return in.next().charAt(0);
    }

    /**
     * Lê uma string do console.
     *
     * @param caption Texto que identifica o que está sendo solicitado (rótulo)
     * @return uma string com a linha lida
     */
    public static String readlnString(String caption) {
        return readLine(caption);
    }

    /**
     * Aguarda até que um ENTER seja teclado no console.
     */
    public static void waitEnter() {
        readLine("\n\npressione [ENTER] para continuar\n");
    }

    /**
     * Faz uma pergunta tipo s/n e retorna a resposta.
     *
     * @param question o texto com a pergunta a ser feita
     * @return true se a resposta for sim, false caso contrário
     */
    public static boolean ask(String question) {
        return readlnString("\n" + question + "\n").toLowerCase().equals("s");
    }

    /**
     * Faz uma pergunta tipo s/n e retorna a resposta.
     *
     * @param question o texto com a pergunta a ser feita
     * @return true se a resposta for sim, false caso contrário
     */
    public static boolean askChar(String question) {
        return String.valueOf(readCharacter("\n" + question + "\n")).toLowerCase().equals("s");
    }

    /**
     * Limpa o console da aplicacacao
     * @throws IOException
     * @throws InterruptedException
     */
    public static void clear() throws IOException, InterruptedException {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            Runtime.getRuntime().exec("clear");
        }
    }
}
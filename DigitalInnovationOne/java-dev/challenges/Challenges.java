package challenges;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Challenges
{
    public static void main (String[] args)
    {
        System.out.printf("Challenges i did to Java Develover courses of Digital Innovation One.");
    }
}

class Addtion
{
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();

        int soma = a+b;

        System.out.println("X = " + soma);
        leitor.close();
    }
}

class Multiplication
{
    public static void main(String[] args)
    {
	    Scanner sc = new Scanner(System.in);
		int A, B, PROD;

		A = sc.nextInt();
		B = sc.nextInt();

		PROD = A*B; //implemente o código que representa a multiplicação.

		System.out.println("PROD = " + PROD);

		sc.close();
	}
}

class Payroll
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int hours = Integer.parseInt(st.nextToken());

        //escreva o seu código

        st = new StringTokenizer(br.readLine());
        double payPerHour = Double.parseDouble(st.nextToken());
        double salary = hours * payPerHour;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);
    }
}

class QtdeNumerosPositivos
{
    public static void main(String[] args) throws IOException
    {
        String linha;
        // Double n;
        int Pos;
        // int i;

        Pos=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // for (int index = 0; br.lines().count(); index++)
        while(br.ready())
        {
            linha = br.readLine();
            // n = Double.parseDouble(linha);
            if (Double.parseDouble(linha) > 0) Pos++;
        }
        System.out.println("" + Pos + " valores positivos");
    }
}

class ShownOnlyEven
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for (int index = 1; index <= num; index++)
        {
            if (index%2 == 0) System.out.printf("%d %n", index);
        }
    }
}

class NumberAnalysis
{
    public static void main(String[] args) throws IOException
    {
        Scanner leitor = new Scanner(System.in);
        //declare suas variaveis corretamente
        int evenCount = 0;
        int oddCount = 0;
        int posCount = 0;
        int negCount = 0;
        int num;

        //continue a solução
        // for (String str: leitor.nextLine().split(" "))
        while (leitor.hasNext())
        {
            num = leitor.nextInt();
            if (num%2 == 0) evenCount++;
            if (num%2 != 0) oddCount++;
            if (num > 0) posCount++;
            if (num < 0) negCount++;
        }
        //insira suas variaveis corretamente
        System.out.println(evenCount + " par(es)");
        System.out.println(oddCount + " impar(es)");
        System.out.println(posCount + " positivo(s)");
        System.out.println(negCount + " negativo(s)");
        leitor.close();
    }
}

class MoneyNotesCount
{
    public static void main(String[] args) throws IOException
    {
        Scanner leitor = new Scanner(System.in);

        //continue a solucao de acordo com as notas do enunciado
        int notasInseridas = leitor.nextInt();
        int atual = notasInseridas;
        int notas100 = atual / 100;
        atual -= notas100 * 100;
        int notas50 = atual / 50;
        atual -=  notas50 * 50;
        int notas20 = atual / 20;
        atual -=  notas20 * 20;
        int notas10 = atual / 10;
        atual -= notas10 * 10;
        int notas5 = atual / 5;
        atual -= notas5 * 5;
        int notas2 = atual / 2;
        atual -= notas2 * 2;
        int notas1 = atual;

        //continue a solucao de acordo com os exemplos de saída
        System.out.println(notasInseridas);
        System.out.println("" + notas100 + " nota(s) de R$ 100,00");
        System.out.println("" + notas50 + " nota(s) de R$ 50,00");
        System.out.println("" + notas20 + " nota(s) de R$ 20,00");
        System.out.println("" + notas10 + " nota(s) de R$ 10,00");
        System.out.println("" + notas5 + " nota(s) de R$ 5,00");
        System.out.println("" + notas2 + " nota(s) de R$ 2,00");
        System.out.println("" + notas1 + " nota(s) de R$ 1,00");
        leitor.close();
    }
}

class Desafio
{
    public static void main(String[] args) throws IOException
    {
        Scanner leitor = new Scanner(System.in);

        //declare as variaveis corretamente

        int km = leitor.nextInt();
        double litros = leitor.nextDouble();

        double media = km/litros;  //insira as variaveis de acordo com o enunciado
        System.out.println(String.format("%.3f km/l", media));
        leitor.close();
    }
}

class SortNumbersEvenThenOdd
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int index, numberOfLines = Integer.parseInt(br.readLine());
        List<Integer> numbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        while(br.ready())
        {
            numbers.add(Integer.parseInt(br.readLine()));
        }

        evenNumbers = numbers.stream().filter(value -> value % 2 == 0).collect(Collectors.toList());
        oddNumbers  = numbers.stream().filter(value -> value % 2 != 0).collect(Collectors.toList());

        Collections.sort(evenNumbers);
        Collections.sort(oddNumbers);
        Collections.reverse(oddNumbers);

        numbers.clear();
        numbers.addAll(evenNumbers);
        numbers.addAll(oddNumbers);
        for (Integer num: numbers)
        {
            System.out.printf("%d%n", num);
        }
    }
}

class SupermarketShopping
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        List<String> words = new ArrayList<>();

        while (br.ready())
        {
            line = br.readLine();

            words = Arrays.asList(line.split(" "));
            Collections.sort(words);
            words = words.stream().distinct().collect(Collectors.toList());

            for (String str: words)
            {
                System.out.printf("%s ", str);
            }
            System.out.printf("%n");
            words.clear();
        }
    }
}

class OrganizeShirts
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException
    {
        String owner, color, size;
        int index, numberOfShirts = Integer.parseInt(br.readLine());
        List<String> uniform = new ArrayList<>();

        for (index = 0; index < numberOfShirts; index++)
        {
            owner = br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            color = st.nextToken();
            size = st.nextToken();
            uniform.add(color + " " + size + " " + owner);
        }

        String arr = uniform.stream()
                .sorted(Comparator.comparing(shirt -> shirt.toString().substring(0,shirt.toString().indexOf(32)))
                                  .thenComparing(shirt -> shirt.toString().substring(shirt.toString().indexOf(32)+1, shirt.toString().indexOf(32, shirt.toString().indexOf(32)+1)), Comparator.reverseOrder())
                                  .thenComparing(shirt -> shirt.toString().substring(2)))
                .collect(Collectors.joining("\n"));

        System.out.println(arr);
    }
}

class BankQueue
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException
    {
        int index, jndex, totalClients, count = 0,
            totalCases = Integer.parseInt(br.readLine());
        List<Integer> queue = new ArrayList<>();
        List<Integer> newQueue = new ArrayList<>();

        for (index = 0; index < totalCases; index++)
        {
            totalClients = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (jndex = 0; jndex < totalClients; jndex++)
            {
                queue.add(Integer.parseInt(st.nextToken()));
            }

            newQueue = queue.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

            for (jndex = 0; jndex < totalClients; jndex++)
            {
                if (newQueue.get(jndex) != queue.get(jndex)) count++;
            }

            System.out.printf("%d%n", Math.abs(queue.size() - count));
            count = 0;
            queue.clear();
        }
    }
}

class CampGames
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> name = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        List<String> winr = new ArrayList<>();
        int index, lastIndex, count, numb, numOfStudents;
        String[] read;
        String line;

        while (!(line = br.readLine()).equals("0"))
        {
            name.clear();
            num.clear();
            numOfStudents = Integer.parseInt(line);

            for (index = 0; index < numOfStudents; index++)
            {
                read = br.readLine().split(" ");
                name.add(read[0]);
                num.add(Integer.parseInt(read[1]));
            }

            index = 0;
            lastIndex = 0;
            numb = num.get(index);
            count = 0;

            while (numOfStudents > 1)
            {
                lastIndex = index;
                count = numb % numOfStudents;

                if (numb % 2 != 0) { index += count; } else index -= count;
                if (index < 0) index = numOfStudents + lastIndex - count;
                else if (index > numOfStudents - 1) index = count + lastIndex - numOfStudents;

                numb = num.get(index);
                name.remove(index);
                num.remove(index);
                numOfStudents--;

                if (numb % 2 != 0)
                {
                    index--;
                    if (index < 0) index = numOfStudents - 1;
                } else {
                    if (index == numOfStudents) index = 0;
                }
            }
            winr.add(name.get(0));
        }
        br.close();
        winr.forEach(value -> System.out.printf("Vencedor(a): %s%n", value));
    }
}
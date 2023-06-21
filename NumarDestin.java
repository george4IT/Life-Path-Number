import java.util.Scanner;
public class NumarDestin {
//This Class is designed to return the sum of the date of birth until it's < 10.
//This method is also known as finding your Life Path Number
	public static void print(String mesaj) {
		System.out.println(mesaj);
	}
	public static int[] string2int(String s[])
	{//converting mothod for strings array into an int array
		int lista_int[] = new int [s.length];
		for(int i=0; i<s.length; i++)
			lista_int[i] = Integer.parseInt(s[i]);
		return lista_int;
	}
	public static int SumaCifrelor(int n)
	{//method for summing up the digits of a number
		int suma=0;
		while(n>0)
		{
			suma= suma+ n%10;
			n=n/10;
		}
		return suma;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		print("Welome to calculating the Life Path Number!");
print("Please enter date of birth in format dd.mm.yyyy ");
String datanasterii = sc.nextLine();
//splitting the date of birth string into substrings for day, month, year
String zi = datanasterii.substring(0, 2);
String luna = datanasterii.substring(3, 5);
String an = datanasterii.substring(6);
String data[] = {zi,luna,an};

int int_data[] = new int[3];
int_data = string2int(data);
int nrDestin=0;
for(int i : int_data)
	{
	nrDestin +=i;} //summing day+month+year
int suma=0;
suma = SumaCifrelor(nrDestin);
if(suma<10)
	print("Life Path Number = "+Integer.toString(suma));
else
{
int destin = SumaCifrelor(suma);
print("Life Path Number = "+Integer.toString(destin));
}
		//Details of what the resulting Life Path Number means.
String lpn1 = "People born with a Life Path number 1 are on a lifelong mission to exert their independence and step into their personal power. They carry a natural air of authority as a leader who likes to be the first to try something new. A strong desire for manifestation keeps them moving and improving.";
String lpn2 = "People that were born with a 2 Life Path are blessed with beautiful hearts that they use to bring beautiful relationships into their lives.\r\n"
		+ "\r\n"
		+ "From romantic and business partnerships to family and friendships, these bonds are the most valuable thing in life to a person with a Life Path 2. They thrive in being part of a team and will do everything in their power to make it a happy, easy, and successful union. ";
String lpn3 = "Charming, romantic, and full of creative energy, people who were born with a 3 Life Path number know how to embrace life.\n They are skilled communicators,enjoy an active social life and are optimistic, but forming deep bounds its difficult for them.";
String lpn4 = "Dedicated, patient, down to earth, and hard-working, people with a 4 Life Path number are a great source of stability.\n They are natural teachers and in relationship they are honest, loyal, and committed and they need the same from a partner.";
String lpn5 = "Routine is unbearable to people with a Life Path 5 so they tend to learn by living and don't allow themselves to get stuck in any situation with no interest";
String lpn6 = "Life Path 6 embrace their emotions and lead with their heart. They give off a warm and inviting energy that others want to be around. They enjoy many rich relationships"+"\n"+"With a natural ability to connect with others and offer aid and advice, 6 people do well as professional counselors, mentors, and teachers";
String lpn7 = "The 7 Life Path in Numerology is smart in a knowledgeable way, yet wise in a spiritual way. People with this Life Path number enjoy gaining knowledge, but they are also more connected to their higher self. ";
String lpn8 = "The Life Path number 8 personality is one of hard work and hard lessons. People born with this Life Path number get their worth from accomplishing great things -- the bigger the goal, the more satisfying it feels when they achieve it."
	+"\n"+"Money and material goods are important to them because they are rewards and reminders of all the effort put in. People with this Life Path direct all their energy into creating a life of success and abundance.";
String lpn9 = "Life Path number 9 people will often find themselves in a position of providing support and advice and this feels natural to them.\nThe knowledge they have gained can be incredibly valuable to others on their own journeys."
+"\n"+"A person who is born with a Life Path 9 tends to be spiritual and connects deeply with religion."
+"\n"+"But because 9 Life Path people have become so accustomed to enduring their own challenges, others may not notice when they are in need and, unfortunately, they have a very difficult time asking for help.";
String lpn[] = {lpn1, lpn2, lpn3, lpn4, lpn5 ,lpn6 ,lpn7 , lpn8, lpn9};
String source = "https://www.numerology.com/";
if(suma<10)
	{print(lpn[suma-1]);
	print("\n");
	print("From: "+source);}
else
	{print(lpn[SumaCifrelor(suma)-1]);
	print("\n");
	print("From: "+source);}
	}
}

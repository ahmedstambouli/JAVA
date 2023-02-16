package TP1;

import java.util.Iterator;

public class Client {
	
	private int code;
	private String nom;
	private String prenom;
	private Voiture tabv []; //=new Voiture[5]
	private int nbvoitures = 0;
	static private int id=100; //pour creé automatique le id 
	
	public Client(int code , String nom ,String prenom )
	{
		this.code =code;
		this.nom=nom;
		this.prenom=prenom;
		tabv=new Voiture[5];
	}
	
	public Client(String nom ,String prenom )
	{
		this.id++;
		this.code =id;
		this.nom=nom;
		this.prenom=prenom;
		tabv=new Voiture[5];
	}
	
	public void louerVoitur(Voiture v)
	{
		if (nbvoitures < tabv.length)
		{
			int i=0;
			while(tabv[i] != null)
			{
				i++;
			}
			tabv[i] = v;
			nbvoitures++;
		}
		
		
	}
	
	public boolean rendreVoiture(Voiture v)
	{
		boolean trouve =false;
		
		for(int i=0;i<tabv.length;i++)
		{
			if(tabv[i] != null)
			{
				if(tabv[i].equals(v)==true)
				{
					trouve=true;
					tabv[i]= null;
					nbvoitures--;

				}
			}
		}
		return true;
	}
	
	void affichervoiture()
	{
		System.out.println("liste des voiture loué par  "+ this.nom);
	
		for(int i=0;i<tabv.length;i++)
		{
			if(tabv[i] != null)
			{
				System.out.println(tabv[i]);
			}
		}
	}
	
	
	public  String toString()
	{
		return ("Client:"+this.code+","+this.nom+","+this.prenom+","+this.nbvoitures);
	}

}

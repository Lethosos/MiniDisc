package lethosos.minidisc.utils;

import java.util.ArrayList;
import java.util.List;

public class Label
{
	public List <Label> LABELS = new ArrayList<Label>();
	
	public String smallName;
	public String fullName;
	public String album;
	
	public Label(String small, String full, String alb)
	{
		smallName = small;
		fullName = full;
		album = alb;
		
		LABELS.add(this);
		
		return;		
	}
}

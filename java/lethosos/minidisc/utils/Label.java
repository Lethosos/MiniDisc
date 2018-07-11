package lethosos.minidisc.utils;

import java.util.ArrayList;
import java.util.List;

public class Label
{
	public static final List <Label> LABELLIST = new ArrayList<Label>();
	
	public String smallName;
	public String fullName;
	public String album;
	
	public Label(String small, String full, String alb)
	{
		smallName = small;
		fullName = full;
		album = alb;
		
		LABELLIST.add(this);
		
		return;		
	}

	public Label(Label label)
	{
		smallName = label.smallName;
		fullName = label.fullName;
		album = label.album;

		return;
	}
}

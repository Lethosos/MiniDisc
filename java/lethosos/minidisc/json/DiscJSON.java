package lethosos.minidisc.json;

import lethosos.minidisc.utils.Label;

public class DiscJSON {
	
	private static DiscJSONWriter writer;
	
	public static void build()
	{
		//writer.makeJSON(Label.LABELLIST.get(1));
		
		int end = Label.LABELLIST.size();
		int i = 0;
		do {
			writer.makeJSON(Label.LABELLIST.get(i));
			i++;
		} while (i < end);
	}
}

package lethosos.minidisc.main;

public class Ref {
	
	public static final String MOD_ID = "minidisc";
	public static final String NAME = "MiniDisc";
	public static final String VERSION = "0.1";
	public static final String ACC_VERSION ="[1.11.2]";
	
	public static final String CLIENT_PROXY = "lethosos.minidisc.proxy.ClientProxy";
	public static final String SERVER_PROXY = "lethosos.minidisc.proxy.ServerProxy";

	public static enum RecordList {
		DISC_1("seer", "record_seer", "The Seer and the Tribesmen", "Land of Fans and Music 2"), // - unofficalmspafans");
		DISC_2("alchemy", "record_alchemy", "Ultimate Alchemy", "Land of Fans and Music 4"),// - unofficalmspafans");
		DISC_3("cleoparty", "record_cleoparty", "Cleopatra's Cocktail Party", "Land of Fans and Music 4"), // - unofficalmspafans");
		DISC_4("gemoni", "record_gemoni", "Gemoni Mustard Blood", "Land of Fans and Music 4"), // - unofficalmspafans");
		DISC_5("lomax", "record_lomax", "Highland Thunder (LoMaX)", "Land of Fans and Music 4"), // - unofficalmspafans");
		DISC_6("lotak", "record_lotak", "Tragic Heights (LoTaK)", "Land of Fans and Music 4"); // - unofficalmspafans");
		
		private String registryName;
		private String resourceName;
		private String tooltip;
		private String desc;
		
		RecordList(String registryName, String resourceName, String tooltip, String desc) {
			this.registryName = registryName;
			this.resourceName = resourceName;
			this.tooltip = tooltip;
			this.desc = desc;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getResourceName() {
			return resourceName;
		}
		
		public String getTooltip() {
			return tooltip;
		}
	}
	
	public static enum BlockList {
		SCRIBER("scriber", "BlockScriber");
		
		private String unlocalizedName;
		private String registryName;
		
		BlockList(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}

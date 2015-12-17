package easymounts;

import java.io.File;

public class main extends JavaPlugin {
	
	public final Logger logger = Logger.getLogger("Minecraft");
	
	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info("[" + pdfFile.getName() + "] v."
				+ pdfFile.getVersion() + " has been Enabled");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new easymountsListener(this), this);
	}

	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " has been Disabled");
	}
}
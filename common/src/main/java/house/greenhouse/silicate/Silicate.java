package house.greenhouse.silicate;

import house.greenhouse.silicate.platform.SilicatePlatformHelper;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.ApiStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApiStatus.Internal
public class Silicate {
	public static final String MOD_ID = "silicate";
	public static final String MOD_NAME = "Silicate";
	public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

	private static SilicatePlatformHelper helper;

	public static void init() {
	}

	public static SilicatePlatformHelper getHelper() {
		return helper;
	}

	public static void setHelper(SilicatePlatformHelper helper) {
		Silicate.helper = helper;
	}
	
	public static ResourceLocation id(String name) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, name);
	}
}
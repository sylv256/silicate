package net.modgarden.silicate.api.condition;

import com.mojang.serialization.MapCodec;
import net.modgarden.silicate.api.SilicateRegistries;
import net.modgarden.silicate.api.condition.builtin.*;
import net.minecraft.core.Registry;
import org.jetbrains.annotations.ApiStatus;

import static net.modgarden.silicate.Silicate.id;

/**
 * Built-in {@link GameConditionType}s.
 */
public final class GameConditionTypes {
	public static final GameConditionType<CompoundCondition> COMPOUND = register("compound", CompoundCondition.CODEC);
	public static final GameConditionType<InvertedCondition> INVERTED = register("inverted", InvertedCondition.CODEC);
	public static final GameConditionType<RetypedCondition> RETYPED = register("retyped", RetypedCondition.CODEC);
	public static final GameConditionType<AlwaysCondition> ALWAYS = register("always", AlwaysCondition.CODEC);
	public static final GameConditionType<EntityTypeCondition> ENTITY_TYPE = register("entity_type", EntityTypeCondition.CODEC);
	public static final GameConditionType<EntityPassengerCondition> ENTITY_PASSENGER = register("entity_passenger", EntityPassengerCondition.CODEC);
	public static final GameConditionType<EntityVehicleCondition> ENTITY_VEHICLE = register("entity_vehicle", EntityVehicleCondition.CODEC);
	public static final GameConditionType<BlockStateCondition> BLOCK_STATE = register("block_state", BlockStateCondition.CODEC);
	public static final GameConditionType<Vec3Condition> VEC3 = register("vec3", Vec3Condition.CODEC);
	public static final GameConditionType<BlockEntityTypeCondition> BLOCK_ENTITY_TYPE = register("block_entity_type", BlockEntityTypeCondition.CODEC);
	public static final GameConditionType<PlayerGameTypeCondition> PLAYER_GAME_TYPE = register("player_game_type", PlayerGameTypeCondition.CODEC);

	private GameConditionTypes() {}

	@ApiStatus.Internal
	public static void registerAll() {}

	private static <T extends GameCondition<T>> GameConditionType<T> register(
			String name,
			MapCodec<T> codec
	) {
		return Registry.register(
			SilicateRegistries.GAME_CONDITION_TYPE,
			id(name),
			new GameConditionType<>(codec)
		);
	}
}

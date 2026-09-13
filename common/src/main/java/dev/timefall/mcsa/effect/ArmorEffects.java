package dev.timefall.mcsa.effect;

import dev.timefall.mcsa.registry.tag.McsaDamageTypeTags;
import net.minecraft.entity.damage.DamageSource;

public class ArmorEffects {

    /// BIG CAVEAT TO ALL NOTES IN THIS FILE:
    ///   These are the *desired* effects. They are not, necessarily,
    ///   representative of the final implementation.

    /// Ivor's Lab Armors

    ///  |-----------------------------------------------------------------------------------------------|
    ///  |                                 Ability Name: Adamantine Guard                                |
    ///  |                                 Armor Set: Adamantium Impervium                               |
    ///  |-----------------------------------------------------------------------------------------------|
    ///  | Aspect   | Description                                                                        |
    ///  |----------|------------------------------------------------------------------------------------|
    ///  | Function | Reduce incoming mêlée and projectile damage by 75% and resist knockback. During    |
    ///  |          | During the duration:                                                               |
    ///  |          |   - the wearer is slowed, only able to move at 25% speed                           |
    ///  |          |   - the armor does not take durability damage                                      |
    ///  |----------|------------------------------------------------------------------------------------|
    ///  | Duration | TBD                                                                                |
    ///  |----------|------------------------------------------------------------------------------------|
    ///  | Trigger  | Full set of armor and key press                                                    |
    ///  |----------|------------------------------------------------------------------------------------|
    ///  | Type     | Active                                                                             |
    ///  |----------|------------------------------------------------------------------------------------|
    ///  | Checks   | ○ Damage Reduction - LivingEntityMixin#mcsa$cancelArmorDurabilityDamage            |
    ///  |          | X Speed Reduction                                                                  |
    ///  |          | ○ Durability Damage Cancellation - ItemStackMixin#mcsa$cancelArmorDurabilityDamage |
    ///  |----------|------------------------------------------------------------------------------------|
    ///  | Notes    | Protection can be handled by referencing                                           |
    ///  |          | vanilla Enchantment Effects:                                                       |
    ///  |          |    - Blast Protection                                                              |
    ///  |          |    - Fire Protection                                                               |
    ///  |          |    - Projectile Protection                                                         |
    ///  |          |    - Protection                                                                    |
    ///  |          |                                                                                    |
    ///  |          | Slowness can probably be handled by vanilla Slowness V Status Effect. This should  |
    ///  |          |   provide the 75% speed reduction.                                                 |
    ///  |          |                                                                                    |
    ///  |          | Questions:                                                                         |
    ///  |          |    Should the particles from the Slowness Status Effect be hidden?                 |
    ///  |----------|------------------------------------------------------------------------------------|

    public static float getReducedDamage(DamageSource damageSource, float damageAmount) {
        if (damageSource.isIn(McsaDamageTypeTags.ADAMANTINE_GUARD_RESISTANT_TO)) {
            damageAmount *= 0.25f;
        }

        return damageAmount;
    }

    ///  |-------------------------------------------------------|
    ///  |              Ability Name: Dragon's Dread             |
    ///  |                Armor Set: Dragonsbane                 |
    ///  |-------------------------------------------------------|
    ///  | Aspect   | Description                                |
    ///  |----------|--------------------------------------------|
    ///  | Function | Active: Let out an intimidating roar       |
    ///  |          |         (use Ender Dragon Roar Sound).     |
    ///  |          |         This causes nearby hostile mobs to |
    ///  |          |         run away. Against the Ender        |
    ///  |          |         Dragon, when activated during a    |
    ///  |          |         dive/charge attack, it forces the  |
    ///  |          |         Ender Dragon to break off the dive |
    ///  |          |         and turn away.                     |
    ///  |          |                                            |
    ///  |          | Passive: User is also receives reduced     |
    ///  |          |          damage from dragon breath.        |
    ///  |----------|--------------------------------------------|
    ///  | Duration | Active: TBD                                |
    ///  |          | Passive: Infinite                          |
    ///  |----------|--------------------------------------------|
    ///  | Trigger  | Full set of armor and key press            |
    ///  |----------|--------------------------------------------|
    ///  | Type     | Active + Passive                           |
    ///  |----------|--------------------------------------------|
    ///  | Notes    |                                            |
    ///  |          |                                            |
    ///  |----------|--------------------------------------------|

    ///  |-------------------------------------------------------|
    ///  |              Ability Name: Spatial Anchor             |
    ///  |               Armor Set: Ender Defender               |
    ///  |-------------------------------------------------------|
    ///  | Aspect   | Description                                |
    ///  |----------|--------------------------------------------|
    ///  | Function | Active: Creates a temporary field around   |
    ///  |          | the wearer that prevents Endermen from     |
    ///  |          | teleporting into, out of, or within its    |
    ///  |          | radius. They can still walk and attack.    |
    ///  |          | Has a cooldown.                            |
    ///  |          |                                            |
    ///  |          | Passive: Reduces damage from Enderman      |
    ///  |          | attacks.                                   |
    ///  |----------|--------------------------------------------|
    ///  | Duration | Active: TBD                                |
    ///  |          | Passive: Infinite                          |
    ///  |----------|--------------------------------------------|
    ///  | Trigger  | Full set of armor and key press            |
    ///  |----------|--------------------------------------------|
    ///  | Type     | Active + Passive                           |
    ///  |----------|--------------------------------------------|
    ///  | Notes    |                                            |
    ///  |          |                                            |
    ///  |----------|--------------------------------------------|

    ///  |-------------------------------------------------------|
    ///  |             Ability Name: Solar Ascendance            |
    ///  |               Armor Set: Golden Goliath               |
    ///  |-------------------------------------------------------|
    ///  | Aspect   | Description                                |
    ///  |----------|--------------------------------------------|
    ///  | Function | Active: Consume sun energy to temporarily  |
    ///  |   Opt. I | increase mêlée damage and attack knockback,|
    ///  |          | with golden particles surrounding the      |
    ///  |          | wearer. Stored energy allows activation.   |
    ///  |          |                                            |
    ///  |          | Passive: Exposure to direct sunlight       |
    ///  |          | gradually fills a limited solar energy     |
    ///  |          | reserve.                                   |
    ///  |----------|--------------------------------------------|
    ///  | Function | Active: Consume sun energy to fire a beam  |
    ///  |  Opt. II | of concentrated sunlight. This beam causes |
    ///  |          | fire damage and sets the target(s) on fire |
    ///  |          | for X seconds. Stored energy allows for    |
    ///  |          | activation of the beam.                    |
    ///  |          |                                            |
    ///  |          | Passive: Exposure to direct sunlight       |
    ///  |          | gradually fills a limited solar energy     |
    ///  |          | reserve.                                   |
    ///  |----------|--------------------------------------------|
    ///  | Duration | Active: Until Used                         |
    ///  |          | Passive: Infinite                          |
    ///  |----------|--------------------------------------------|
    ///  | Trigger  | Full set of armor and key press            |
    ///  |----------|--------------------------------------------|
    ///  | Type     | Active + Passive                           |
    ///  |----------|--------------------------------------------|
    ///  | Notes    | Requires actual sunlight with direct       |
    ///  |          | exposure to the sky for charging, with a   |
    ///  |          | capped reserve and a cooldown on           |
    ///  |          | activation.                                |
    ///  |          |                                            |
    ///  |          | Removing an armor piece immediately ends   |
    ///  |          | the empowered state.                       |
    ///  |          |                                            |
    ///  |          | Charge rate, energy consumption and        |
    ///  |          | duration of stats boost is TBD. Charge     |
    ///  |          | should be slower than the rate the energy  |
    ///  |          | is used when the beam is fired.            |
    ///  |          |                                            |
    ///  |          | Will, almost certainly, need to add        |
    ///  |          | functionality to handle the solar energy   |
    ///  |          | reserve.                                   |
    ///  |----------|--------------------------------------------|

    ///  |-------------------------------------------------------|
    ///  |             Ability Name: Recoil Reservoir            |
    ///  |               Armor Set: Redstone Riot                |
    ///  |-------------------------------------------------------|
    ///  | Aspect   | Description                                |
    ///  |----------|--------------------------------------------|
    ///  | Function | Active: Discharges that reserve as a pulse |
    ///  |          |         that damages and pushes back       |
    ///  |          |         nearby enemies. The reserve        |
    ///  |          |         determines the pulse’s strength.   |
    ///  |          |         Has a cooldown.                    |
    ///  |          |                                            |
    ///  |          | Passive: Absorbs a portion of incoming     |
    ///  |          |          mêlée and projectile damage,      |
    ///  |          |          reducing health damage and        |
    ///  |          |          filling a limited charge reserve. |
    ///  |----------|--------------------------------------------|
    ///  | Duration | Active: Until Used                         |
    ///  |          | Passive: As long as no charge is held      |
    ///  |----------|--------------------------------------------|
    ///  | Trigger  | Full set of armor and key press            |
    ///  |----------|--------------------------------------------|
    ///  | Type     | Active + Passive                           |
    ///  |----------|--------------------------------------------|
    ///  | Notes    | Functionality will need to be added to     |
    ///  |          | take the damage that is received by the    |
    ///  |          | Player. Then, that damage will have the    |
    ///  |          | necessary maths to get the percentage by   |
    ///  |          | which the damage will be reduced.          |
    ///  |          |                                            |
    ///  |          | When the armor is charged, the redstone in |
    ///  |          | the armor's texture will visibly glow      |
    ///  |          | brighter than when it is not charged. This |
    ///  |          | will likely mean that several textures     |
    ///  |          | need to be made of the armor for the       |
    ///  |          | "power states" of the armor.               |
    ///  |          |                                            |
    ///  |          | Damage will be reduced until the Player    |
    ///  |          | discharges the reservoir. At that point,   |
    ///  |          | reservoir will need to take some time to   |
    ///  |          | cool down before it can be charged again.  |
    ///  |          | This will be conveyed to the player via    |
    ///  |          | a status effect marker. This will also be  |
    ///  |          | conveyed to other players via the redstone |
    ///  |          | in the armor visibly dimming.              |
    ///  |----------|--------------------------------------------|

    ///  |-------------------------------------------------------|
    ///  |           Ability Name: Sovereign Sanctuary           |
    ///  |            Armor Set: Shield of Infinity              |
    ///  |-------------------------------------------------------|
    ///  | Aspect   | Description                                |
    ///  |----------|--------------------------------------------|
    ///  | Function | Creates a stationary protective dome that  |
    ///  |          | covers X blocks around the block that the  |
    ///  |          | Player was standing on when the ability    |
    ///  |          | was activated.                             |
    ///  |          |                                            |
    ///  |          | The dome lasts X duration OR until X       |
    ///  |          | damage is absorbed by the dome. The dome   |
    ///  |          | can absorb incoming mêlée and projectile   |
    ///  |          | damage.                                    |
    ///  |          |                                            |
    ///  |          | During the duration that the dome is up    |
    ///  |          | Player who activated it is unable to move. |
    ///  |          |                                            |
    ///  |          | Its capacity slowly replenishes while the  |
    ///  |          | dome is not active. The dome cannot be     |
    ///  |          | redeployed until either:                   |
    ///  |          |   - it is fully charged or                 |
    ///  |          |   - until a certain amount of time passes  |
    ///  |----------|--------------------------------------------|
    ///  | Duration | TBD                                        |
    ///  |----------|--------------------------------------------|
    ///  | Trigger  | Full set of armor and key press            |
    ///  |----------|--------------------------------------------|
    ///  | Type     | Active                                     |
    ///  |----------|--------------------------------------------|
    ///  | Notes    | The capped damage can be based on one of   |
    ///  |          | several points:                            |
    ///  |          |   - Some kind of energy system tied to the |
    ///  |          |     armor                                  |
    ///  |          |   - The Player's amount of experience. The |
    ///  |          |     more experience the Player has, the    |
    ///  |          |     more damage the dome can absorb.       |
    ///  |          |   - The cap is simply a fixed amount. This |
    ///  |          |     would take a little bit of research    |
    ///  |          |     what would be a good amount of damage  |
    ///  |          |     to absorb.                             |
    ///  |          |                                            |
    ///  |          |  There will either:                        |
    ///  |          |    - need to be a system is able to keep   |
    ///  |          |      track of the total damage that would  |
    ///  |          |      have been caused to all Players under |
    ///  |          |      the dome.                             |
    ///  |          |    - need to create an Entity for the dome |
    ///  |          |      that has a certain amount of hit      |
    ///  |          |      points based on the aforementioned    |
    ///  |          |      factors.                              |
    ///  |----------|--------------------------------------------|

    ///  |-------------------------------------------------------|
    ///  |             Ability Name: Stellar Stalwart            |
    ///  |                Armor Set: Star Shield                 |
    ///  |-------------------------------------------------------|
    ///  | Aspect   | Description                                |
    ///  |----------|--------------------------------------------|
    ///  | Function | Slowly generates a limited number of       |
    ///  |          | orbiting, star-shaped shields. Each shield |
    ///  |          | completely blocks one incoming mêlée or    |
    ///  |          | projectile hit, then shatters.             |
    ///  |          |                                            |
    ///  |          | Shields replenish individually after not   |
    ///  |          | being hit for X time.                      |
    ///  |----------|--------------------------------------------|
    ///  | Duration | Presence: Infinite                         |
    ///  |          | Shield Regen: X Seconds                    |
    ///  |----------|--------------------------------------------|
    ///  | Trigger  | Wearing the full set of armor              |
    ///  |----------|--------------------------------------------|
    ///  | Type     | Passive                                    |
    ///  |----------|--------------------------------------------|
    ///  | Notes    | Models may need to be made for the star    |
    ///  |          | shields. However, Shulker Bullets might    |
    ///  |          | work as an existing model.                 |
    ///  |          |                                            |
    ///  |          | The star shields must be positioned in     |
    ///  |          | such a way to not obstruct the Player's    |
    ///  |          | field of view. However, they must be       |
    ///  |          | clearly present on the third-person view.  |
    ///  |          |                                            |
    ///  |          | Given that they are stars, maybe they      |
    ///  |          | should orbit in an X pattern around the    |
    ///  |          | Player with the intersection of the X      |
    ///  |          | being right above the top of the Player's  |
    ///  |          | head. That way, they are clearly visible   |
    ///  |          | third-person, but are out of the way in    |
    ///  |          | first-person.                              |
    ///  |----------|--------------------------------------------|

    ///  |-------------------------------------------------------|
    ///  |            Ability Name: Shattering Stance            |
    ///  |               Armor Set: Swordbreaker                 |
    ///  |-------------------------------------------------------|
    ///  | Aspect   | Description                                |
    ///  |----------|--------------------------------------------|
    ///  | Function | Active: Briefly braces the armor against   |
    ///  |          |         the next mêlée weapon strike.      |
    ///  |          |                                            |
    ///  |          |         Against another any Entity:        |
    ///  |          |            - The attack deals              |
    ///  |          |              significantly reduced damage  |
    ///  |          |              and briefly staggers the      |
    ///  |          |              attacker. Bosses are immune   |
    ///  |          |              to this effect.               |
    ///  |          |                                            |
    ///  |          |         Additional effect against Players: |
    ///  |          |            - The attack inflicts a large   |
    ///  |          |              durability penalty on the     |
    ///  |          |              attacking weapon, dealing an  |
    ///  |          |              additional 50% durability     |
    ///  |          |              damage to the attacking       |
    ///  |          |              weapon.                       |
    ///  |          |                                            |
    ///  |          |         Additional effect against Mobs:    |
    ///  |          |            - If the MobEntity is wielding  |
    ///  |          |              a weapon, there is a 25%      |
    ///  |          |              chance that the weapon will   |
    ///  |          |              break.                        |
    ///  |          |                                            |
    ///  |          | The stance ends after triggering or timing |
    ///  |          | out. Has an X second cooldown.             |
    ///  |          |                                            |
    ///  |          | Passive: Projectiles will deal 25% less    |
    ///  |          |          damage to the Player.             |
    ///  |----------|--------------------------------------------|
    ///  | Duration | Active: TBD                                |
    ///  |          | Passive: Infinite                          |
    ///  |----------|--------------------------------------------|
    ///  | Trigger  | Full set of armor and key press            |
    ///  |----------|--------------------------------------------|
    ///  | Type     | Active + Passive                           |
    ///  |----------|--------------------------------------------|
    ///  | Notes    |                                            |
    ///  |          |                                            |
    ///  |----------|--------------------------------------------|

}

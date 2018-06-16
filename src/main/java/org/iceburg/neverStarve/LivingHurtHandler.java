package org.iceburg.neverStarve;

import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class LivingHurtHandler {
	
	@SubscribeEvent
	public void onHurt(LivingHurtEvent event) {
		if (event.getSource() == DamageSource.STARVE){
			float amount = event.getAmount();
			event.getEntityLiving().heal(amount);
			System.out.println("Prevented " + event.getEntityLiving().getDisplayName() + " from taking starvation damage");
		}
		
	}


}
